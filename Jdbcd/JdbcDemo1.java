 package Jdbcd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/abdur","root","root");
		System.out.println(con);
		
		String sql="select * from students";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getString("sname")+"-  ");
			System.out.println(rs.getInt("smarks"));
					
		}
	}
}
