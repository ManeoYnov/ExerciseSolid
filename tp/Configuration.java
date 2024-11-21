package org.example.creational.tp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Configuration {

    private static Configuration instance;

    public Map<String, String> data;
    private Configuration() {
        data = new HashMap<>();
        data.put("Api", "value1");
        data.put("host", "value2");
        data.put("password", "value3");


    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public void setData(String key, String value) {
        data.put(key, value);
    }

    public String getData(String key) {
        return data.get(key);
    }




}
