public class ProfileSystem {
    public static void main(String[] args) {
        User myUser = new User("Sami");
        System.out.println(myUser.username);
    }
}
class User{
    String username;

    User(String username){
        this.username = username;
    }
}
