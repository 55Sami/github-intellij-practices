package VideoGameSystem;

public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();

        warrior.setHealth(100);
        warrior.attack();

        System.out.println("Warrior health: "+warrior.getHealth());
    }
}
