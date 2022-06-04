/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectCon;

import java.sql.*;


/**
 *
 * @author THIS
 */
public class ConnectionProvider {
    
    public static Connection getCon() {
             try{
             Class.forName("com.mysql.cj.jdbc.Driver");
//             System.out.println("Driveer loaded");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
//             System.out.println("Connection established");
             return con;
            }
//            catch(ClassNotFoundException e){
//            System.out.println("Exceotion"+e.getMessage());
//            }catch(SQLException s){
//            System.out.println("sqleception"+s.getMessage());
//            }
            catch(Exception e){
               return null;
            }
    }
}
