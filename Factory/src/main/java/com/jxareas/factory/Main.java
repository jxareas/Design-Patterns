package com.jxareas.factory;

import com.jxareas.factory.model.Connection;
import com.jxareas.factory.model.ConnectionType;

public class Main {
    public static void main(String... args) {
        Connection mySqlConnection = ConnectionFactory.getConnection(ConnectionType.MYSQL);
        mySqlConnection.connect();
        Connection sqlServerConnection = ConnectionFactory.getConnection(ConnectionType.SQL);
        sqlServerConnection.connect();
        System.out.println(mySqlConnection);
        System.out.println(sqlServerConnection);
    }
}
