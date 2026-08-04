class Game{
    String title;   //the blank pocket on shirt where design can go
    Game(String title){           //This is the form you fill out at checkout typing what text you want.
        this.title = title;
    }
}

public class MyGameStore {

    public static void main(String[] args) {
        Game favouritegame = new Game("One Piece");
        System.out.println(favouritegame.title);

    }
}
