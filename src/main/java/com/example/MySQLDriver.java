package com.example;

public class MySQLDriver implements DBDriver {
    @Override
    public String getPrefix() {
        return "mysql";
    }
}