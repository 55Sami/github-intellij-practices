public class Player {
    String username;
    static int activeCount;

    Player(String username){
        this.username = username;
        activeCount++;

    }
}
