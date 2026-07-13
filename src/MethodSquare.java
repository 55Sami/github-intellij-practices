public class MethodSquare {
    public static void main(String[] args) {
        //double result = square(5);

        System.out.println(square(5));
        System.out.println(cube(3));
        String fullName =getFullName("Sami","Door");
        System.out.println(fullName);
    }
    static double square(double number) {
        return number * number;
    }

    static double cube(double number){
            return number*number*number;
    }
    static String getFullName(String firstName,String lastName){
        return firstName +" "+ lastName;
    }
}
