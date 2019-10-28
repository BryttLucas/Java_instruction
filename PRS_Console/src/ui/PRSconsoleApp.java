package ui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Business.User;
import util.Console;

public class PRSconsoleApp {

	public static void main(String[] args) throws SQLException {

		User u1 = new User(1, "uname", "password", "fname", "lname", "555.555.5555", "asdf@mail", false, false);
		User u2 = new User(2, "help", "pword", "Fname", "Lname", "532.432.4444", "hjk@mail", false, false);
		User u3 = new User(3, "myname", "psword", "firstN", "LastN", "123.123.1234", "zxc@mail", false, false);

		List<User> users = new ArrayList();
		users.add(u1);
		users.add(u2);
		users.add(u3);

		System.out.println("PRS Console\n");
		int command = 0;
		while (command != 6) {
			command = Console.getInt(getMenu(), 0, 7);

			switch (command) {
			case 1:
				// List user
				System.out.println("List of user: ");
				for (User u : users) {
					System.out.println(u);
				}
				break;
			case 2:
				// get user
				int id = Console.getInt("User ID: ");
				// get the User that matches the id above
				User u = getUser(id, users);
				System.out.println(u);

				break;
			case 3:
				// add user
				System.out.println("Add a user: ");
				id = Console.getInt("ID");
				String un = Console.getString("Username? ");
				String pwd = Console.getString("Pwd? ");
				String fn = Console.getString("First Name? ");
				String ln = Console.getString("Last Name? ");
				String phone = Console.getString("PhoneNumber? ");
				String email = Console.getString("Email? ");
				boolean rvw = false;
				boolean adm = false;
				User user = new User(id,un, pwd, fn, ln, phone, email, rvw, adm);
			   	users.add(user);
			   	System.out.println("User add: ");

				break;
			case 4:
				// update user
				System.out.println("Update user password ");
				id = Console.getInt("Update id? ");
				u = getUser(id, users);
				System.out.println(u);
				pwd = Console.getString("new password ");
				u.setPassword(pwd);
				System.out.println("Password change ");

				break;
			case 5:
				// delete a user
				System.out.println("Delete User from list ");
				id = Console.getInt("Which id to delete ");
			    u = getUser(id, users);
				System.out.println(u);
				users.remove(id -1);
				
				break;
			case 6:
				// exit
				break;
			case 7:
				// invalid command
				System.out.println("invald Command   ");
				break;

			}
		}
		System.out.println("Goodbye ");
	}

	private static String getMenu() {
		String menu = "COMMAND MENU : \n" + "1 - User List \n" + "2 - Get User \n" + "3 - Add User \n"
				+ "4 - Update user \n" + "5 - Delete user \n" + "6 - exit \n" + "Command:   ";

		return menu;
	}

	private static User getUser(int id, List<User> users) {
		User usr = null;
		for (User u : users) {
			if (u.getId() == id) {
				usr = u;
			}
		}
		return usr;
		
	}
}
