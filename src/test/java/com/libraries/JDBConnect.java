package com.libraries;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBConnect {
	public ResultSet getData(String tableName,Integer testCaseId) {
		ResultSet rs = null;
		PreparedStatement ps1;
		Connection connection = null;
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/InstaHMS","postgres","");
			PreparedStatement ps = connection.prepareStatement("set search_path = 'nmc'");
			ps.execute();
			if (connection != null) {
				ps1 = connection.prepareStatement("select * from "+tableName+" where testCaseID =?");
				ps1.setInt(1, testCaseId);
				rs = ps1.executeQuery();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
	
	public void setResult(int cNo,String b,String r,String rem) {
		PreparedStatement ps1;
		Connection connection = null;
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/InstaHMS","postgres","");
			PreparedStatement ps = connection.prepareStatement("set search_path = 'nmc'");
			ps.execute();
			if (connection != null) {
				ps1 = connection.prepareStatement("insert into results(testcaseid,build,result,remarks) values('"+cNo+"','"+b+"','"+r+"','"+rem+"')");
				ps1.executeQuery();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	vinay
}