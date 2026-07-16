public class MathReturn {
    public static int makeDouble(int number) {
        // WRITE YOUR CODE HERE: multiply number by 2 and return it
        number = number*2;
        return number;
    }

    public static void main(String[] args) {
        int result = makeDouble(7);
        System.out.println(result); // Should print 14
    }
}
