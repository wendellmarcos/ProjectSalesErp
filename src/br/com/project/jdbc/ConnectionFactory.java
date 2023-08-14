/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.project.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Wendell Marcos
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        
        try {
            
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjectSalesErp", "teste", "123");
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        
        
        
    }
    
}
