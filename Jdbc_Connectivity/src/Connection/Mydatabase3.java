package Connection;

import java.sql.*;

public class Mydatabase3 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","root");
		Statement st=con.createStatement();
		String sql="update employee set salary=20000";
		int effectrows=st.executeUpdate(sql);
		if(effectrows==0)
		{
			System.out.println("No rows get effected");
			}
		else {
			System.out.println("Effected rows"+effectrows);
		}
		//con.commit();
		con.close();
	}

}
