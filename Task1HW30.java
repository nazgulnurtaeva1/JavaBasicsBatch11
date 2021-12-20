package com.syntax.JavaBasics.class30;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1HW30 {
    public static void main(String[] args) throws IOException {
//        Create a property file to store following configurations:
//        browser=chrome
//        url=https://facebook.com
//        username
//                password
//        Read file and extract values of browser & url

        String path="Files/Task1.properties";
        Properties properties=new Properties();
        properties.put("browser","chrome");
        properties.put("url","https://facebook.com");
        properties.put("username","NazgulNN");
        properties.put("password","naz123");

        FileOutputStream fileOutputStream=new FileOutputStream(path);

        properties.store(fileOutputStream,"Task1 HW30");

        System.out.println(properties.get("browser"));
        System.out.println(properties.get("url"));
    }
}
