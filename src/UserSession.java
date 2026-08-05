public class UserSession {
    public static void main(String[] args) {
        Player s1 = new Player("harry");
        Player s2 = new Player("prajikta");
        Player s3 = new Player("santoshi");

        System.out.println(s1.username);

        System.out.println(Player.activeCount);

    }
}
