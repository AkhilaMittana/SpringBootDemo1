package Connection;
import java.sql.*;

public class Mydatabase5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","root");
		//Statement st=con.createStatement();
		String sql="create table PO_item(POid int not null , quantity int(30), price double,discount int(10))";
		PreparedStatement ps=con.prepareStatement(sql);
		int i=ps.executeUpdate();
		if(i==0) System.out.println("Inserted");
		else System.out.println("Not done");
		}
		catch(Exception e) {
		System.out.println(e);
		}
		//System.out.println("Table created");
		
		
		
			//System.out.println(e.getMessage());
		
		
	}

}
