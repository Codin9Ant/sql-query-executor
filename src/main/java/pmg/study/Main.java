package pmg.study;

import pmg.study.connection.DBConnection;

/**
 * made by pmg
 */
public class Main {
    public static void main (String[] args) {
        System.out.println("System LOG : Query Executor started...");
        DBConnection.oracleDbConnector();
    }
}