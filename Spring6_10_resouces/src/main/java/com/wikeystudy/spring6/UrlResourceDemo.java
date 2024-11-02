package com.wikeystudy.spring6;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @ Author：Wikey Cao
 * @ Date：02-11-2024
 * @ Description：
 */
@Component
public class UrlResourceDemo {

    public static void loadUrlResource(String path) {
        try {
            Resource resource = new UrlResource(path);
            System.out.println(resource.getFilename());
            System.out.println(resource.getURI());
            System.out.println(resource.getDescription());
            System.out.println(resource.getInputStream().read());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}