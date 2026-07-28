public class TwoDArray {
    public static void main(String[] args) {


        String[][] groceries = {{"apple","orange","banana"},
                {"Eggplant","Okra","Lettuce"},
                {"Chicken","pork","Beef","fish"}};

        groceries[0][0] = "melon";   //[row] [column]
        groceries[1][2]= "potato";

        for(String[] foods : groceries){
            for(String food: foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
