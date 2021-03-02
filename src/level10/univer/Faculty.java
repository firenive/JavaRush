package level10.univer;

import java.util.ArrayList;

public class Faculty {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Акакий"));
        students.add(new Student("Любослав"));
        /*students.add("Анатолий");
        students.add(new Thread());
        students.add(new Student[]{new Student("Афанасий"), new Student("Платон")});*/

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        students.forEach(student -> {
            System.out.println(((Student) student).getName());
        });
    }
}
