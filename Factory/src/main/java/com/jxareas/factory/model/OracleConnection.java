package com.jxareas.factory.model;

public class OracleConnection implements Connection{

    private final String host;
    private final int port;
    private final String username;
    private final String password;

    @Override
    public String toString() {
        return "OracleConnection{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public OracleConnection() {
        this.host = "localhost";
        this.port = 1521;
        this.username = "admin";
        this.password = "123";
    }

    @Override
    public void connect() {
        System.out.println("Successfully connected to Oracle");
    }

    @Override
    public void disconnect() {
        System.out.println("Successfully disconnected from Oracle");
    }
}
