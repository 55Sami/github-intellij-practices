package SchoolSystem;

public class Classroom {
    String className;
    Student[] students ;

    Classroom(String className,Student[] students){
        this.className = className;
        this.students = students;
    }

    void displayInfo(){
        System.out.println(this.className);
        System.out.println("students:");

        for(Student student: students){
            System.out.println(student.displayInfo());
        }
    }
}
