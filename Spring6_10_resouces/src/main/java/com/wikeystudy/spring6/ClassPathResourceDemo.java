package com.wikeystudy.spring6;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @ Author：Wikey Cao
 * @ Date：02-11-2024
 * @ Description：
 */
public class ClassPathResourceDemo {
    public static void loadClassPathResource(String path) {
        Resource resource = new ClassPathResource(path);
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}