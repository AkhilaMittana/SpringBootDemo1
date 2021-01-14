package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Mydatabse4 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","root");
		Statement st=con.createStatement();
		String sql="delete from employee where eid=2";
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


