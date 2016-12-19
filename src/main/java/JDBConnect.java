import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBConnect {
	public static void main(String[] argv) {
		System.out.println("-------- PostgreSQL "+ "JDBC Connection Testing ------------");
		try {
			Class.forName("org.postgresql.Driver");
		}
		catch (ClassNotFoundException e) {
			System.out.println("Where is your PostgreSQL JDBC Driver? "+ "Include in your library path!");
			e.printStackTrace();
			return;
		}
		System.out.println("PostgreSQL JDBC Driver Registered!");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Vinay","postgres","");
			PreparedStatement ps1 = connection.prepareStatement("set search_path = 'nmc'");
			ps1.execute();
		} 
		catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
			PreparedStatement ps = null;
			try {
				ps = connection.prepareStatement("select id,name from employee");
				ResultSet rs = ps.executeQuery();
				//System.err.println(""+rs.getRow());
				while(rs.next())	System.out.println("id : "+rs.getInt("id")+": "+rs.getString("name"));
				//System.out.println(" id is :  "+rs.getString("name"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		else {
			System.out.println("Failed to make connection!");
		}
	}
}
