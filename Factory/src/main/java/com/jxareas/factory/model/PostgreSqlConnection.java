package com.jxareas.factory.model;

public class PostgreSqlConnection implements Connection {
    private final String host;
    private final int port;
    private final String username;
    private final String password;


    @Override
    public String toString() {
        return "PostgreSqlConnection{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public PostgreSqlConnection() {
        this.host = "localhost";
        this.port = 5433;
        this.username = "postgres";
        this.password = "123";
    }

    @Override
    public void connect() {
        System.out.println("Successfully connected from PostgreSql");
    }

    @Override
    public void disconnect() {
        System.out.println("Successfully disconnected from PostgreSql");
    }
}
