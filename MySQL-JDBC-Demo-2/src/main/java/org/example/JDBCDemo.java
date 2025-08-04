package org.example;

import java.sql.*;

public class JDBCDemo {

    static Connection jdbcConn;
    static DBQueryHandling dbQueryHandling;

    public static void main(String[] args) {
        setupDBConnection();

        checkDBConnection();

        runDBQueries();

        cleanUpDBConnection();
    }

    private static void runDBQueries() {
        dbQueryHandling.checkInventory();
        dbQueryHandling.checkOrderCost();
        dbQueryHandling.calculateOrderCost();
        dbQueryHandling.orderCanBeFulfilled();
        dbQueryHandling.getProductDetails();

        /*dbQueryHandling.insertNewProduct();
        dbQueryHandling.updateProduct();
        dbQueryHandling.deleteProduct();*/
    }

    private static void checkDBConnection() {
        dbQueryHandling = new DBQueryHandling(jdbcConn);
        dbQueryHandling.checkDBConnection();
    }

    private static void cleanUpDBConnection() {
        try{
            jdbcConn.close();
            System.out.println( "\n Is the DB Connection Closed = " + jdbcConn.isClosed() );
        } catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        }
    }

    private static void setupDBConnection() {
        try{
// JDBC Driver Opens up the Connection to the specified Database and it stays active until you close the connection
            jdbcConn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/NameBrands",
                    "root", "root" );

            System.out.println( "\n Is the DB Connection Valid = " + jdbcConn.isValid(0) );
        }catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        }
    }
}
