package Connection;


import java.sql.*;

public class Mydatabase1 {

	
		public static void main(String[] args) throws ClassNotFoundException,SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","root");
			Statement st=con.createStatement();
			//String sql="insert into employee values("Hema",3,"civil",20000)";
			ResultSet rs= st.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4));
				}
			
			//con.commit();
			con.close();
		

	}

}
