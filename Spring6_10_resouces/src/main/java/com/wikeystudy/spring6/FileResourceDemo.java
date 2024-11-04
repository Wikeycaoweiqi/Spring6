package com.wikeystudy.spring6;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

/**
 * @ Author：Wikey Cao
 * @ Date：04-11-2024
 * @ Description：
 */
public class FileResourceDemo {
    public static void loadFileResource(String path) {
        Resource resource = new FileSystemResource(path);
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        InputStream inputStream = null;
        try {
            inputStream = resource.getInputStream();
            byte[] bytes = new byte[1024];
            while (inputStream.read(bytes) != -1) {
                System.out.println(new String(bytes));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}