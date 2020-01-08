package com.misaya.utils;


import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.util.Properties;

public class PropertiesUtils {


    public static Properties properties = null;

    static {



        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("hbase_consumer.properties");
            properties = new Properties();
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String getPeoperty(String key){


        return properties.getProperty(key);


    }
}
