package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlCon{  
public static void main(String args[]){  
try{  
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded");
	Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
	System.out.println("connection established");
//here sonoo is database name, root is username and password  
 
}catch(Exception e){ System.out.println(e);}  
}  
}  