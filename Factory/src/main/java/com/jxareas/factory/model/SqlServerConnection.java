package com.jxareas.factory.model;

public class SqlServerConnection implements Connection {

    private final String host;
    private final int port;
    private final String username;
    private final String password;

    @Override
    public String toString() {
        return "SqlServerConnection{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public SqlServerConnection() {
        this.host = "localhost";
        this.port = 1433;
        this.username = "root";
        this.password = "123";
    }

    @Override
    public void connect() {
        System.out.println("Successfully connected from Sql");
    }

    @Override
    public void disconnect() {
        System.out.println("Successfully disconnected from Sql");
    }
}
