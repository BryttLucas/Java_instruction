package ui;

import java.util.Arrays;

import business.Student;
import util.Console;

public class StudentSoreApp {

	public static void main(String[] args) {
		System.out.println(" Welcome to the Student Score App!");
		
		int nbr = Console.getInt("How many students?", 0, 501);
		
		Student[] students = new Student [nbr];
	
		for(int i=0; i < nbr; i++) {
			String lastName = Console.getString("Student Last Name: ");
			String firstName = Console.getString("Student first Name: ");
			int score = Console.getInt("Score  :",-1,101);
			Student s = new Student(firstName,lastName,score);
			students[i] = s;
		}
			
		System.out.println("Summary");
		Arrays.sort(students);
		for(Student s: students) {
			System.out.println(s); 
		}
		
		System.out.println("Bye");
	}

}
