package SchoolSystem;

public class Student {
    String name;
    int age;
    int id;

    Student(String name,int age,int id){
        this.name = name;
        this.age = age;
        this.id =id;
    }

    String displayInfo(){
        return this.name+ "is "+this.age+" id is "+this.id;
    }
}
