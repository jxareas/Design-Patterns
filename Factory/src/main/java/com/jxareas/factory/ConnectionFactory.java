package com.jxareas.factory;

import com.jxareas.factory.model.*;

public class ConnectionFactory {

    public static Connection getConnection(ConnectionType type) {
    
       switch(type) {
            case SQL: return new SqlServerConnection();
            case MYSQL:  return  new MySqlConnection();
            case ORACLE:  return new OracleConnection();
            case POSTGRES:  return new PostgreSqlConnection();
           default: throw new IllegalArgumentException();
        }
       
    }
}
