package Jdbcd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo2 {
public static void main(String[] args) throws Exception {
 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection  con=DriverManager.getConnection("jdbc:mysql://localhost/record","root","root");
	String sql="select * from maintain";
	Statement smt=con.createStatement();
	ResultSet rs=smt.executeQuery(sql);
	while(rs.next()) {
		System.out.println(rs.getInt("eid"));
		System.out.println(rs.getString("ename"));
	}
}
}
