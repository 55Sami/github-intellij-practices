public class Width {
    public static void main(String[] args) {

        // WIDTH
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified number

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("04%d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%4d\n",id4);
    }
}
