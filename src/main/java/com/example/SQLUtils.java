package com.example;

import org.reflections.Reflections;

public class SQLUtils {
    public static DBDriver getDriver(String prefix) {
        Reflections reflections = new Reflections("com.example");

        for(Class<? extends DBDriver> e : reflections.getSubTypesOf(DBDriver.class)) {
            try {
                DBDriver tmp = e.newInstance();

                if(tmp.getPrefix().equalsIgnoreCase(prefix)) {
                    return tmp;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
}