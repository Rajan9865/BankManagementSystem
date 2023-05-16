package bank.management.system;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            System.out.println("driver Loaded succesully");
//            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");    
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","root");    
            System.out.println("connection establishedd");
            s =c.createStatement(); 
           
			/*
			 * Class.forName("com.mysql.cj.jdbc.Driver");
			 * System.out.println("driver loaded"); Connection
			 * con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/company",
			 * "root", "root");
			 */
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  