
public class BmbdApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the movie app\n\n");
		
		Movie movie1 = new Movie();
		String title = Console.getString("Enter movie title: ");
		String rating = Console.getString("Enter rating: ");
		int year = Console.getInt("Enter year of movie: ");
		String director = Console.getString("Enter Director: ");
		
		movie1.setTitle(title);
		movie1.setRating(rating);
		movie1.setYear(year);
		movie1.setDirector(director);
		
		System.out.println(movie1.toString());
	}

}
