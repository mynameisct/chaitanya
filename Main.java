package com.edubridge.smsapp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		StudentDaoInterface dao = new StudentDaoImplementation();
		
		System.out.println("Welcome to Student Management Application");
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Add Student\n" + 
						"2. Show All Student\n" +
						"3. Show Student Based on id\n" +
						"4. Update the Student\n" +
						"5. Delete the Student\n");
			
			System.out.println("Please Enter Your Choice: ");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				Student stu = new Student();
				System.out.println("Enter ID: ");
				int id = sc.nextInt();
				System.out.println("Enter Name: ");
				String name = sc.next();
				System.out.println("Enter Stipend: ");
				double stipend = sc.nextDouble();
				System.out.println("Enter Age: ");
				int age = sc.nextInt();
				stu.setId(id);
				stu.setName(name);
				stu.setStipend(stipend);
				stu.setAge(age);
				dao.createStudent(stu);
				break;
			case 2:
				dao.showAllStudent();
				break;
			case 3:
				System.out.println("Enter the ID to show details: ");
				int stuid = sc.nextInt();
				dao.showStudentBasedOnID(stuid);
			case 4:
				System.out.println("Enter id to update the details:");
				int stuid1 = sc.nextInt();
				System.out.println("Enter the new name: ");
				String name1 = sc.next();
				dao.updateStudent(stuid1, name1);
				break;
			case 5:
				System.out.println("Enter the id to delete");
				int id2 = sc.nextInt();
				dao.deleteStudent(id2);
				break;
			case 6:
				System.out.println("Thank You for using our application");
				System.exit(0);
			default:
				System.out.println("Enter Valid Choice !");
				
			}
			
			}while(true);

	}

}
