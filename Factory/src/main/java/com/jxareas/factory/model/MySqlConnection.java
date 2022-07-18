package com.jxareas.factory.model;

public class MySqlConnection implements Connection {

    private final String host;
    private final int port;
    private final String username;
    private final String password;

    @Override
    public String toString() {
        return "MySqlConnection{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public MySqlConnection() {
        this.host = "localhost";
        this.port = 3306;
        this.username = "root";
        this.password = "123";
    }

    @Override
    public void connect() {
        // Here you can add JDBC code
        System.out.println("Successfully connected to MySQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Successfully disconnected from MySql");
    }
}
