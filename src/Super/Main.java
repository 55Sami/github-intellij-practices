package Super;

public class Main {
    public static void main(String[] args) {
        //super= refers to the parent class (subclass <- superclass)
        //       Used in constructor and method overriding
        //        call the parent constructor to initialize attributes

        Person person1 = new Person("Harry","Potter");
        Student student1 = new Student("Tom","Riddle", 3.75);
        Employee employee1 = new Employee("John","Rai",2500);

        person1.showName();
        student1.showName();
        student1.showGPA();
        employee1.showSalary();


    }
}
