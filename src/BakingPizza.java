public class BakingPizza {
    public static void main(String[] args) {
        String pizza = bakePizza("Flat bread","mozzarella","pepperoni",12);

        System.out.println(pizza);
    }
    static String bakePizza(String bread){
        return bread+" pizza";
    }
    static String bakePizza(String bread,String cheese){
        return cheese+" " +bread+" pizza";
    }
    static String bakePizza(String bread,String cheese, String topping){
        return topping+" "+cheese+" " +bread+" pizza";
    }
    static String bakePizza(String bread,String cheese, String topping, int inches){
        return inches+" inch "+topping+" "+cheese+" " +bread+" pizza";
    }
}
