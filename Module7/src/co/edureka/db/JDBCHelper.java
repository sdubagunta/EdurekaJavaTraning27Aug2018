package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.student.Student;

public class JDBCHelper {

	Connection con;
	Statement stmt;
	PreparedStatement pstmt;

	public JDBCHelper() {

		try {

			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {
			System.out.println("Some Exception" + e);
		}
	}

	public void createConnection() {
		try {

			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost/edureka";
			System.out.println("Database connection created");
			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			System.out.println("Some Exception" + e);
		}

	}

	public void insertStudent(Student s) {

		try {
			String sql = "insert into student values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, s.student_id);
			pstmt.setString(2, s.name);
			pstmt.setString(3, s.std);
			pstmt.setInt(4, s.marks);

			int i = pstmt.executeUpdate();

			if (i > 0) {
				System.out.println(">>" + s.name + " Saved " + i);
			} else {
				System.out.println(">>Record Not Saved " + i);
			}

		} catch (Exception e) {
			System.out.println("Some Exception" + e);

		}
	}

	public void updateStudent(Student s) {
		try {

			String sql = "update Student set name = ?, class=?, Marks = ? where student_id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, s.name);
			pstmt.setString(2, s.std);
			pstmt.setInt(3, s.marks);
			pstmt.setInt(4, s.student_id);

			int i = pstmt.executeUpdate();

			// System.out.println("PreparedStatemnt: "+pStmt.toString());

			if (i > 0) {
				System.out.println(">>" + s.name + " Updated " + i);
			} else {
				System.out.println(">>Record Not Updated " + i);
			}

		} catch (Exception e) {
			System.out.println("Some Exception: " + e);
		}
	}

	public void deleteStudent(int student_id) {
		try {

			String sql = "delete from Student where student_id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, student_id);

			int i = pstmt.executeUpdate();

			if (i > 0) {
				System.out.println(">>" + student_id + " Deleted " + i);
			} else {
				System.out.println(">>Record Not Deleted " + i);
			}

		} catch (Exception e) {
			System.out.println("Some Exception: " + e);
		}
	}

	public ArrayList<Student> getEmployees() {

		ArrayList<Student> StudentList = new ArrayList<Student>();
		try {

			String sql = "select * from Employee";

			pstmt = con.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				Student s = new Student();
				s.student_id = rs.getInt(1);
				s.name = rs.getString(2);
				s.std = rs.getString(3);
				s.marks = rs.getInt(4);

				StudentList.add(s);
			}

		} catch (Exception e) {
			System.out.println("Some Exception: " + e);
		}
		return StudentList;
	}

	public void executeBatch() {
		try {

			String sql1 = "insert into student values(300,'Julie','Computers',456)";
			String sql2 = "update Student set name = 'Julie K', class='CSE', Marks = 467 where student_id = 300";
			String sql3 = "delete from Student where student_id = 100";

			stmt = con.createStatement();

			con.setAutoCommit(false); 

			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);

			stmt.executeBatch();

			con.commit(); 

			System.out.println("==Transaction Done==");

		} catch (Exception e) {

			try {
				con.rollback();
				System.out.println("==Transaction Rollbacked==");
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			System.out.println("Some Exception: " + e);
		}
	}

	public void closeConnection() {
		try {
			con.close();
			System.out.println("connection closed");
		} catch (Exception e) {
			System.out.println("Some Exception" + e);
		}
	}

}