
public class Credit {

	private int id;
	private int movieID;
	private int actorID;
	private String role;
	
	public Credit() {
	   id = 0;
	   movieID = 0;
	   actorID = 0;
	   role = ""; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieid) {
		this.movieID = movieid;
	}

	public int getActorID() {
		return actorID;
	}

	public void setActorID(int actorid) {
		this.actorID = actorid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Credit [id=" + id + ", movieid=" + movieID + ", actorid=" + actorID + ", role=" + role + "]";
	}
	
}
