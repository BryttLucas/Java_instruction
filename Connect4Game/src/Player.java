public class Player {

    private final String name;
    private static int counter = 0;
    private int playerNumber;
   
    public Player(String name) {
        
        this.name = name;
        Player.counter++;
        this.playerNumber = counter;
    }

    public String getName() {
        return name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

}
