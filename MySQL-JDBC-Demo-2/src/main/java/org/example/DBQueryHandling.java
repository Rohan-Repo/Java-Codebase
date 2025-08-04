package org.example;

import java.sql.*;
import java.util.Scanner;
import java.util.StringJoiner;

public class DBQueryHandling {
    Connection jdbcConn;
    Statement statement;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    StringBuilder stringBuilder;

    Scanner input;


    public DBQueryHandling() {
        jdbcConn = null;
    }

    public DBQueryHandling(Connection jdbcConn) {
        this.jdbcConn = jdbcConn;
        this.stringBuilder = new StringBuilder();
        this.input = new Scanner( System.in );
    }

    public void checkDBConnection() {
        try {

             statement = jdbcConn.createStatement();

             resultSet = statement.executeQuery( "SHOW DATABASES" );

             while ( resultSet.next() ) {
                 stringBuilder.append(resultSet.getString("Database"));
                 stringBuilder.append(" , ");
             }

             System.out.println("\n List of Databases = " + stringBuilder);

             stringBuilder.setLength( 0 );


            resultSet = statement.executeQuery( "SHOW Tables" );

            while ( resultSet.next() ) {
                stringBuilder.append(resultSet.getString(1));
                stringBuilder.append(" , ");
            }

            System.out.println(" List of Tables = " + stringBuilder);

            stringBuilder.setLength( 0 );


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void checkInventory(){
        try{
            System.out.println( "\n Check Inventory : " );
            statement = null;

            statement = jdbcConn.createStatement();

            // resultSet = statement.executeQuery( "SELECT inv.storeID, ord.quantity as orderQuantity FROM Inventory inv, Orders ord WHERE inv.storeID = ord.storeID AND inv.productID = ord.productID order by storeID");
            resultSet = statement.executeQuery( "SELECT inv.storeID, sum(ord.quantity) as orderQuantity FROM Inventory inv, Orders ord WHERE inv.storeID = ord.storeID AND inv.productID = ord.productID group by storeID");

            System.out.println( "StoreID \t orderQuantity");
            while ( resultSet.next() ){
                stringBuilder.append(Integer.toString(resultSet.getInt("storeID")));
                stringBuilder.append( " \t \t \t");
                stringBuilder.append(Integer.toString(resultSet.getInt("orderQuantity")));
                stringBuilder.append("\n");
            }

            System.out.println( stringBuilder );

            stringBuilder.setLength(0);

        }catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        }
    }

    public void checkOrderCost(){
        try{
            System.out.println( "\n Check Order Cost : " );
            statement = null;

            statement = jdbcConn.createStatement();

            resultSet = statement.executeQuery( "SELECT orderID, ord.quantity,inv.price, (ord.quantity*inv.price) AS MSRP FROM Orders ord, Inventory inv WHERE inv.storeID = ord.storeID AND inv.productID = ord.productID");

            System.out.println( "orderID \t quantity \t  price \t\tMSRP");
            while ( resultSet.next() ){
                stringBuilder.append(Integer.toString(resultSet.getInt("orderID")));
                stringBuilder.append( " \t \t \t");
                stringBuilder.append(Integer.toString(resultSet.getInt("quantity")));
                stringBuilder.append( " \t \t \t");
                stringBuilder.append(Integer.toString(resultSet.getInt("price")));
                stringBuilder.append( " \t \t \t");
                stringBuilder.append(Integer.toString(resultSet.getInt("MSRP")));
                stringBuilder.append("\n");
            }

            System.out.println( stringBuilder );

            stringBuilder.setLength(0);

        }catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        }
    }

    public void calculateOrderCost(){
        try{
            System.out.println( "\n Calculate Order Cost : " );
            statement = null;

            statement = jdbcConn.createStatement();

            resultSet = statement.executeQuery( "SELECT orderID, ord.quantity,inv.price FROM Orders ord, Inventory inv WHERE inv.storeID = ord.storeID AND inv.productID = ord.productID");

            System.out.println( "orderID \t quantity \t  price \t\tMSRP");
            while ( resultSet.next() ){
                stringBuilder.append(Integer.toString(resultSet.getInt("orderID")));
                stringBuilder.append( " \t \t \t");
                int orderQuantity = resultSet.getInt("quantity");
                stringBuilder.append(Integer.toString(orderQuantity));
                stringBuilder.append( " \t \t \t");
                int orderPrice = resultSet.getInt("price");
                stringBuilder.append(Integer.toString(orderPrice));
                stringBuilder.append( " \t \t \t");
                stringBuilder.append(Integer.toString( orderQuantity * orderPrice ));
                stringBuilder.append("\n");
            }

            System.out.println( stringBuilder );

            stringBuilder.setLength(0);

        }catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        }
    }

    public void orderCanBeFulfilled(){
        try{
            System.out.println( "\n Check if Order can be fullfilled : " );
            statement = null;

            statement = jdbcConn.createStatement();

            resultSet = statement.executeQuery( "SELECT orderID, quantity, quantityOnHand, quantity > quantityOnHand AS unfulfilled FROM Orders ord, Inventory inv WHERE inv.storeID = ord.storeID AND inv.productID = ord.productID");

            System.out.println( "orderID \t quantity \t  quantityOnHand \t\t Order can be Fullfilled");
            while ( resultSet.next() ){
                stringBuilder.append(Integer.toString(resultSet.getInt(1)));
                stringBuilder.append( " \t \t \t");
                stringBuilder.append(Integer.toString(resultSet.getInt(2)));
                stringBuilder.append( " \t \t \t");
                stringBuilder.append(Integer.toString(resultSet.getInt(3)));
                stringBuilder.append( " \t \t \t \t \t \t ");
                stringBuilder.append( Boolean.toString( resultSet.getInt(4) == 0));
                stringBuilder.append("\n");
            }

            System.out.println( stringBuilder );

            stringBuilder.setLength(0);

        }catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        }
    }

    public void insertNewProduct() {
        System.out.println( "Enter the name of the Product you want to Add : " );
        String prdName = input.nextLine();

        try {
            preparedStatement = jdbcConn.prepareStatement( "INSERT INTO Product( productName ) VALUES ( ? );" );
            preparedStatement.setString( 1, prdName );
            int insertCnt = preparedStatement.executeUpdate();
            System.out.println("No of Records Inserted = " + insertCnt);

            getProductDetails();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getProductDetails(){
        try{
            statement = null;
            statement = jdbcConn.createStatement();

            resultSet = statement.executeQuery( "SELECT * from Product" );

            System.out.println( "productID \t productName");
            while ( resultSet.next() ){
                stringBuilder.append(Integer.toString(resultSet.getInt(1)));
                stringBuilder.append( " \t \t \t");
                stringBuilder.append(resultSet.getString(2));
                stringBuilder.append("\n");
            }

            System.out.println( stringBuilder );
            stringBuilder.setLength(0);

        }catch ( SQLException sqlException ){
            sqlException.printStackTrace();
        }
    }

    public void updateProduct() {
        getProductDetails();

        System.out.println( "Enter the new Product ID to update" );
        int prdID = input.nextInt();

        System.out.println( "Enter the new Product Name" );
        String prdName = input.next();

        preparedStatement = null;
        try {
            preparedStatement = jdbcConn.prepareStatement( "UPDATE Product SET productName = ? WHERE productID = ?" );
            preparedStatement.setString( 1, prdName );
            preparedStatement.setInt( 2, prdID );
            int insertCnt = preparedStatement.executeUpdate();
            System.out.println("No of Records Updated = " + insertCnt);

            getProductDetails();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteProduct() {

        getProductDetails();

        System.out.println( "Enter the Product ID to delete" );
        int prdID = input.nextInt();

        preparedStatement = null;

        try {
            preparedStatement = jdbcConn.prepareStatement( "DELETE from Product WHERE productID = ?" );
            preparedStatement.setInt( 1, prdID );
            int insertCnt = preparedStatement.executeUpdate();
            System.out.println("No of Records Deleted = " + insertCnt);

            getProductDetails();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
