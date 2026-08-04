public class Main2 {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Buddy");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("John");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Bob");
        Friend friend6 = new Friend("Rocky");

        System.out.println(Friend.numOfFriends);    //access by its class

        Friend.showFriends();


    }

}
