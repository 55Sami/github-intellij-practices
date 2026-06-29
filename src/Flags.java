public class Flags {
    public static void main(String[] args) {

        //flags (after % sign)
        //+ = output a plus
        // , = grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus is negative, space if positive

        double price1 = 990000.34;
        double price2 = 102000.34;
        double price3 = -4.46765;

        System.out.printf("% .2f\n",price1);
        System.out.printf("% .2f\n",price2);
        System.out.printf("% .2f\n",price3);
    }
}
