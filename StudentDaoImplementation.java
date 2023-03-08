package com.edubridge.smsapp;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDaoImplementation implements StudentDaoInterface{
	Connection conn ; 
	//private static java.sql.Connection conn;
	
	@Override
	public void createStudent(Student stu) {
		
		conn = DBConnection.createDBConnection();
		String query = "insert into student values(?,?,?,?)";
		try {
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1,stu.getId());
			pstm.setString(2,stu.getName());
			pstm.setDouble(3,stu.getStipend());
			pstm.setInt(4,stu.getAge());
			int cnt = pstm.executeUpdate();
			if(cnt!=0)
				System.out.println("Student inserted succesfully !");
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void showAllStudent() {
		conn = DBConnection.createDBConnection();
		//conn = DriverManager.getConnection;
		String query = "select * from student";
		try {
			Statement stmt = (Statement) conn.createStatement();
			ResultSet result = ((java.sql.Statement) stmt).executeQuery(query);
			while(result.next()) {
				System.out.format("%d\t%s\t%f\t %d",
						result.getInt(1),
						result.getString(2),
						result.getDouble(3),
						result.getInt(4));
			}
			
		}catch (Exception ex){
			ex.printStackTrace();
		}
		
	}

	@Override
	public void showStudentBasedOnID(int id) {
		
		conn = DBConnection.createDBConnection();
		String query = "select * from student where id=" + id;
		try {
			
			Statement stmt = (Statement) conn.createStatement();
			ResultSet result = ((java.sql.Statement) stmt).executeQuery(query);
			while (result.next()) {
				System.out.format("%d\t%s\t%f\t%d\n",
						result.getInt(1),
						result.getString(2),
						result.getDouble(3),
						result.getInt(4));
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent(int id, String name) {
		conn = DBConnection.createDBConnection();
		String query = "update employee set name=? where id=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setString(1,name);
			pstm.setInt(2,id);
			int cnt = pstm.executeUpdate();
			if(cnt!=0)
				System.out.println("Student Details updated successfully !");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudent(int id) {
		 conn = DBConnection.createDBConnection();
		 String query = "delete from student where id=?";
		 try {
			 PreparedStatement pstm = conn.prepareStatement(query);
			 pstm.setInt(1, id);
			int cnt = pstm.executeUpdate();
			if(cnt!=0)
				System.out.println("Student Deleted Successfully !"+ id);
			 
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }
		
	}

}
            