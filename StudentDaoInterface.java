package com.edubridge.smsapp;

public interface StudentDaoInterface {
	
	//create student
	public void createStudent(Student stu);
	//show all employee
	public void showAllStudent();
	//show employee based on id
	public void showStudentBasedOnID(int id);
	//update employee
	public void updateStudent(int id,String name);
	//delete employee
	public void deleteStudent(int id);
	
}