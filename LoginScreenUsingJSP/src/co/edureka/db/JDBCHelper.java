package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import co.edureka.model.User;

public class JDBCHelper {
	Connection con;
	PreparedStatement pStmt;
	CallableStatement cStmt;

	public JDBCHelper() {
		try {
			// 1. Load the Driver !!
			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {
			System.out.println("Some Exception: " + e);
		}
	}

	public void createConnection() {
		try {
			// 2. Create Connection with DB !!
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost/edureka";

			con = DriverManager.getConnection(url, user, password);

			System.out.println(">>Connection Created");
		} catch (Exception e) {
			System.out.println("Some Exception: " + e);
		}
	}

	public int registerUser(User user) {

		int i = 0;

		try {
			String sql = "insert into user values(null, ?, ?, ?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.name);
			pStmt.setString(2, user.email);
			pStmt.setString(3, user.password);

			i = pStmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("Some Exception: " + e);
		}

		return i;
	}

	public boolean loginUser(User user) {

		boolean flag = true;

		try {
			String sql = "select * from user where email = ? and password = ?";

			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.email);
			pStmt.setString(2, user.password);

			ResultSet rs = pStmt.executeQuery();

			flag = rs.next();

		} catch (Exception e) {
			System.out.println("Some Exception: " + e);
		}

		return flag;
	}

	public void closeConnection() {
		try {
			con.close();
			System.out.println(">>Connection Closed");
		} catch (Exception e) {
			System.out.println("Some Exception: " + e);
		}
	}
}
