public class NameTag {
    public static String makeNameTag(String name) {
        // WRITE YOUR CODE HERE: return "Hello, " plus the name
        return "Hello,"+name;
    }

    public static void main(String[] args) {
        String tag = makeNameTag("Sami");
        System.out.println(tag); // Should print Hello, Sami
    }
}
