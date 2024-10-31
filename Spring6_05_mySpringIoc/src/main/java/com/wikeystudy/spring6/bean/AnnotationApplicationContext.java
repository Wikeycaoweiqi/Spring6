package com.wikeystudy.spring6.bean;

import com.wikeystudy.spring6.annotation.Bean;
import com.wikeystudy.spring6.annotation.Di;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
public class AnnotationApplicationContext implements ApplicationContext {

    private static Map<Class, Object> beanMap = new HashMap<>();
    private static String rootPath;

    @Override
    public Object getBean(Class clazz) {
        return beanMap.get(clazz);
    }

    public AnnotationApplicationContext(String packagePath) throws Exception {
        try {
            String newPackagePath = packagePath.replaceAll("\\.", "\\\\");
            Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(newPackagePath);

            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());
                loadBean(new File(filePath));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        loadDi();
    }

    private void loadBean(File file) throws Exception {
        if (file.isDirectory()) {
            File[] childFiles = file.listFiles();
            if (childFiles == null || childFiles.length == 0) {
                return;
            }
            for (File childFile : childFiles) {
                if (childFile.isDirectory()) {
                    loadBean(childFile);
                } else {
                    String pathWithClass = childFile.getAbsolutePath().substring(rootPath.length() - 1);
                    if (pathWithClass.contains(".class")) {
                        String className = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
                        Class clazz = Class.forName(className);
                        if (!clazz.isInterface()) {
                            Bean annotation = (Bean) clazz.getAnnotation(Bean.class);
                            if (annotation != null) {
                                Object instance = clazz.getConstructor().newInstance();
                                if (clazz.getInterfaces().length > 0) {
                                    beanMap.put(clazz.getInterfaces()[0], instance);
                                } else {
                                    beanMap.put(clazz, instance);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void loadDi() {
        Set<Map.Entry<Class, Object>> entries = beanMap.entrySet();
        for (Map.Entry<Class, Object> entry : entries) {
            Object object = entry.getValue();
            Class clazz = object.getClass();
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field : declaredFields) {
                if (!(field.getAnnotation(Di.class) == null)) {
                    field.setAccessible(true);
                    try {
                        field.set(object, beanMap.get(field.getType()));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}