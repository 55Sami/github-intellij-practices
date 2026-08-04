public class OverLoadedConstructor {
    public static void main(String[] args) {

        Userr user1 = new Userr("Sami");
        Userr user2 = new Userr("Patrick","patrick.dad@gamil.com");
        Userr user3 = new Userr("Bob","bob.good@gamil.com",34);
        Userr user4 = new Userr();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
