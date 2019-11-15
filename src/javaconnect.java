
import java.awt.HeadlessException;
 import java.sql.*;
 import javax.swing.JOptionPane;
 import java.sql.ResultSet;
 import java.sql.Connection;
 import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
 
  
public class javaconnect {
    
 private static final String username = "root";
 private static final String password = "";

Connection conn;
ResultSet rs;
PreparedStatement pst;


public static Connection ConnecrDb(){

try{
    Class.forName("com.mysql.jdbc.Driver");
 Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/user",username,password);
 
 JOptionPane.showMessageDialog(null, "Connection Established");
 return conn;
}
catch (HeadlessException | ClassNotFoundException | SQLException e){
JOptionPane.showMessageDialog(null, e);
return null;
}

}
}