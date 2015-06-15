package main.java;

public class MySQLDriver implements DBDriver {
    @Override
    public String getPrefix() {
        return "mysql";
    }
}