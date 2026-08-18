package Wrapper;

import Polymorphism.Boat;

public class Main {
    public static void main(String[] args) {

        //autoboxing
       /* Integer a = 123;
        Double b = 3.14;
        Character c = '&';
        Boolean d = true;

        //Unboxing

        int x = a;
        double  y =b;*/

        String a =Integer.toString(123);   //changing integer to string
        String b=Double.toString(3.14);
        String c = Character.toString('&');
        String d = Boolean.toString(true);

        String x =a+b+c+d;
        System.out.println(x);

        /*int e =Integer.parseInt("123");  //changing string to integer
        double f = Double.parseDouble("3.14");  //string to double
        char g = "Pizza".charAt(0);
        boolean h = Boolean.parseBoolean("true");    */

        char letter ='b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));


    }
}
