public class AreaCalculator {

    public static int calculateArea(int width,int height){
        return width*height;
    }
    public static void main(String[] args) {
        int num1 =3;
        int num2 = 4;
        int area=calculateArea(num1,num2);
        System.out.println("The are of square is "+area);

    }
}
