/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cantika
 */

public class dbConnection
{
    public static Statement stmt = null;
    public static Connection conn = null;
    
    public void connect()
    {
        try
        {
            String ConAddress  = "jdbc:mysql://localhost/tp2_dpbo";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(ConAddress, user,pass);
            stmt = (Statement) conn.createStatement();
            System.out.println("Koneksi Berhasil");
        } 
        
        catch(ClassNotFoundException | SQLException ex)
        {
            System.err.println("Koneksi Gagal" + ex.getMessage());
        }
    }
    
    public ResultSet selectQuery(String sql)
    {
        try
        {
            connect();
            stmt.executeQuery(sql);
            return stmt.getResultSet();
        }
        catch (SQLException ex)
        {
            System.err.println("Read Gagal " + ex.getMessage());
        }
        return null;
    }
    
    public int updateQuery(String sql)
    {
        try
        {
            return stmt.executeUpdate(sql);
        }
        catch (SQLException ex)
        {
            System.err.println("Update Gagal " + ex.getMessage());
        }
        return 0;
    }
    
    public Statement getStatement()
    {
        return stmt;
    }
}
