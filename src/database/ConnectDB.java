/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Windows 10 Version 2
 */
public class ConnectDB {

    private final String CHUOI_KET_NOI = "jdbc:sqlserver://localhost\\DESKTOP-1UGEFK3:1433;databaseName=PetManager";
    private final String USERNAME = "sa";
    private final String PASSWORD = "1234$";

    public Connection ketNoiCSDL() {
        try {
            Connection cnn;
            // Kiểm tra thư viện JDBC đã nạp chưa
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Kết nối tới CSDL
            cnn = DriverManager.getConnection(CHUOI_KET_NOI, USERNAME, PASSWORD);
            System.out.println("KẾT NỐI THÀNH CÔNG");
            return cnn;
        } catch (ClassNotFoundException ex) {
            System.out.println("Kiểm tra thư viện kết nối JDBC!");
            return null;
        } catch (SQLException ex) {
            System.out.println("KẾT NỐI THẤT BẠI");
            System.out.println("Do: " + ex.getMessage() + "(" + ex.toString() + ")");
            return null;
        }
    }

}
