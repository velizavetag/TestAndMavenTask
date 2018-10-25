package com.endava.javaInternship;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class AppProperties {
    private final Properties properties = new Properties();

    public Properties  loadProps(String path){
        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream(path);
            properties.load(is);
            is.close();
            return properties;
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
