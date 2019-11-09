package ui;

import java.util.List;

import business.Users;
import db.DAO;
import db.UserTextFile;
import util.Console;

public class UsersMangerApp {
	
	private static DAO<> userFile = new UserTextFile();
	
	public static void main(String args[]) {
		System.out.println("Welcome to the User Manager\n");
		displayMenu();
		
		String command ="";
		while(!command.equalsIgnoreCase("exit")) {
			command = Console.getString("Enter a command: ");
			switch(command) {
			case "list":
				displayAllUsers();
				break;
			case "add":
				addUser();
				break;
			case "del":
				displayUser();
				break;
			case "help":
				displayMenu();
				break;
			case "exit":
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("Invalid command. ");
				break;
			}
		}
	}
	private static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("list    - List all users.");
		System.out.println("add     - Add a users");
		System.out.println("del     - Delete a users");
		System.out.println("help    - Show this menu");
		System.out.println("exit    - Exit this application");

		}
	
	public static void displayAllUsers() {
		System.out.println("USERS LIST");
		List<Users> users = userFile.getAll();
		StringBuilder sb = new StringBuilder();
		for (Users u : users) {
			sb.append(String.padWithSpaces(
					u.getLastName()+"\t"+u.getFirstName()+"\t"+u.getEmail()+"\t"+u.getGender()));
		}				
		System.out.println(sb.toString());
	}
	public static void addUser() {
		String lastName = Console.getString("Enter last name:");
		String firstName = Console.getString("Enter first name:");
		String email = Console.getString("Enter email; ");
		String gender = Console.getString("Enter gender");
		
		Users user = new Users();
		user.setLastName(lastName);
		user.setFirstName(firstName);
		user.setEmail(email);
		user.setGender(gender);
		userFile.add(user);
		
		System.out.println(user + "has been add.\n");
	}
	public static void deleteUsers() {
		String user = Console.getString("Enter user to be delete:");
		
		Users u = userFile.get(lastName);
		if( u != null) {
			userFile.delete(u);
			System.out.println(u.getLastName()
					+ "has been delete.\n");
		}else {
			System.out.println("No user matches that last name.\n");
		}
	
	}
 
}
