package db;

import java.io.*;
import java.nio.file.*;
import java.util.*;


public class UserTextFile {
 
	public class UserTextFile implements DAO<U>  {
		private List<User> user = null;
		private Path UserPath = null;
		private File UserFile = null;
		private final String TAB = "\t";
		
		public UserTextFile() {
			UsersPath = Paths.get("c:/bootcamp/java/fileiodemo/users.txt");
			UsersFile = usersPath.tofile();
			Users = this.getAll();
			
	}
		public List<Users> getAll() {
			if (users != null) {
				return users;
			}
			users = new ArrayList<>();
			if(File.exists(usersPath)) {
				try (BufferedReader in = new BufferedReader(
										new FileReader(usersFile))) {
					String[] fields = line.split(TAB);
					String lastName = field[0];
					String lastName = fields[1];
					String email = fields[2];
					String gender = fields[3];
					
					users u = new user(
							lastName, firstName, email, gender);
					users.add(u);
					
					line = in.readLine();
				}

			catch (IOExecption e) {
				System.out.println(e);
				return null;
			  }
		}else {
			System.out.println(
					usersPath.toAbsolutePath( + " doesn't exist."));
				return null;	
		}
		return null;
		
		
	    return users;
   }
	@Override
	public Users get(String lastName) {
			for(Users u : users) {
				if(u.getlastName().equals(lastname)) {
					return u;
				}
			}
			return null;
		}
	private boolean saveAll() {
		try(PrintWriter out = new PrintWriter(
							new BufferedWriter(
							new FileWriter(usersFile)))) {
			
			for(User u : users) {
				out.print(p.getLastName() + TAB);
				out.print(p.getFirstName() + TAB);
				out.print(p.getEmail() + TAB);
				out.print(p.getGender());	
			}
			return true;
			
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
	}
	@Override
	public boolean add(User u) {
		Users.add(u);
		return this.saveAll();
	}
	@Override
	public boolean delete(Users u) {
		users.remove(u);
		return this.saveAll();
		
	} 
	@Override
	public boolean update(User newUser) {
		Users oldUser = this.get(newUser.getlastName());
		int i = users.indexOf(oldUser);
		Users.remove(i);
		
		Users.add(i,newUser);
		
		return this.saveAll();
	
	}
  }
}
