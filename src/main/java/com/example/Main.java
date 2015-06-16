package com.example;

public class Main {
    public static void main(String[] args) {
        DBDriver d = SQLUtils.getDriver("mysql");
        System.out.print(d.getPrefix());
    }
}