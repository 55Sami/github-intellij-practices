import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        String[] fruits ={"apple","orange","coconut","banana"};
       // fruits[0]="pineapple";      so apple which was at index 0 changed into pineapple

        //int numOfFruits=fruits.length;  length property of an array
        //System.out.println(fruits[0]);
        //System.out.println(numOfFruits);

        /*for(int i = 0; i < fruits.length ;i++)

            System.out.println(fruits[i]);*/

        Arrays.sort(fruits);  //sorts array alphabetically
        Arrays.fill(fruits,"pineapple");   //fill array of field with pineapple

        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
