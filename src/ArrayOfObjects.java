public class ArrayOfObjects {
    public static void main(String[] args) {
       /* Caar car1 = new Caar("Mustang","black");
        Caar car2 = new Caar("Corvette","white");
        Caar car3 = new Caar("Charger","Yellow");*/

        //Caar[]cars = {car1,car2,car3};

        Caar[]cars = {new Caar("Mustang","black"),
                new Caar("Corvette","white"),
                new Caar("Charger","Yellow")};  //anonymous object

        //for(int i = 0; i<cars.length; i++){
          //  cars[i].drive();

        //ENHANCED FOR LOOP

        for(Caar car: cars){
            car.color="black";
        }
        for(Caar car: cars){
            car.drive();
        }

    }
}


