import java.util.Random;

public class Maths {
    public static void main(String[] args) {
        Random random = new Random();

        //System.out.println(Math.PI);   ***value of pi
        //System.out.println(Math.E);    *** value of exponential
        int number;
        double result;
        double result2;
        double result3;
        double result4;
        double result5;
        double result6;

        number = random.nextInt(1,6);

        result=Math.pow(number,3);    // example: 2 to the power of 3 is 8
        result2=Math.abs(-5);         // positive of whatever given
        result3=Math.sqrt(9);         //example: square root of 9 is 3
        result4= Math.round(3.67);    //rounds up the number to closest value
        result5 = Math.ceil(8.33);          //rounds up
        result6=Math.floor(3.87);       //rounds down

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
