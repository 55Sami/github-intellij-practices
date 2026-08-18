package SchoolSystem;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("sami",24,24565);
        Student student2 = new Student("harry",45,65748);

        Student[] students ={student1,student2};

        Classroom classroom = new Classroom("B",students);

        classroom.displayInfo();
    }
}
