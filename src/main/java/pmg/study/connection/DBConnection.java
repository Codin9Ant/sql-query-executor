package pmg.study.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String driver = "oracle.jdbc.driver.OracleDriver";
    private static final String url = "jdbc:oracle:thin:@192.168.174.129:1521:orcl";
    private static final String user = "MICL_USR";
    private static final String password = "wjdqhqhdks01";

    public static void oracleDbConnector() {
        try{
            //DB 연결 테스트
            Class.forName(driver);
            System.out.println("System LOG : jdbc driver loading success!");
            DriverManager.getConnection(url,user,password);
            System.out.println("System LOG : oracle connection success!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("[ERROR] : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
