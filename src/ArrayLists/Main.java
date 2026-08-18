package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        //arraylist: a resizable array that stores objects(autoboxing)
        //     arrays are fixed in size, but arraylist can change

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Coconut");

        //fruits.remove(1);
        //fruits.set(0,"Watermelon");


       System.out.println(fruits.get(3));  //to print specific one
        System.out.println(fruits.size());  //total element of arraylist

        Collections.sort(fruits);  //to sort the array list,also import the collection

        System.out.println(fruits);

        for(String fruit:fruits){    //to print all list
            System.out.println(fruit);
        }
    }
}
