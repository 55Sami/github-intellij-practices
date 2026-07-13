public class Methods {
    public static void main(String[] args) {

        String name = "Sami";
        int age = 25;

        happyBirthday(name,age);
        happyBirthday(name, age);
        happyBirthday(name, age);
    }
    static void happyBirthday(String name,int age){
        System.out.println("HAPPY BIRTHDAY TO YOU");
        System.out.printf("HAPPY BIRTHDAY dear %s\n",name);
        System.out.printf("You are %d years old\n",age);
        System.out.println("HAPPY BIRTHDAY TO YOU\n");
    }
}
