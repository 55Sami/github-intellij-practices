

public class Varargs2 {

    public static void printTags(String... tags){
        for(String tag: tags){
            System.out.println(tag);
        }
    }
    public static void main(String[] args) {
        printTags("coding","java","spring boot");
        printTags("breaktime");
    }
}
