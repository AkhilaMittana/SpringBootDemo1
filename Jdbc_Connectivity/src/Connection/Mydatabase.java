package Connection;

import java.sql.*;

public class Mydatabase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/demo", "root", "root");
            String sql="insert into employee values('SS',4,'Mech',25000)";
            PreparedStatement ps = con.prepareStatement(sql);
            int i = ps.executeUpdate();
            if (i > 0) System.out.println("Inserted");
            else System.out.println("Not done");
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
