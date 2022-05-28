package j.day45_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Cydeo {
    public static void main(String[] args) {


        Student student=new Student("Emre");

        System.out.println(student);

        System.out.println("================== ");

        Student student1=new Student("Mehmet",25);

        System.out.println(student1);


        System.out.println("================== ");

        Student student2=new Student("Ismayil",25,26);

        System.out.println(student2);

        System.out.println("================== ");

        Student student3=new Student("Karina",25,26);
        Student student4=new Student("Mike",25,23);
        Student student5=new Student("Dembe",25,24);
        Student student6=new Student("Michael",25,25);

        // We have 7 students


        ArrayList<Student> students=new ArrayList(Arrays.asList(student,student1,student2,student3,student4,student5,student6));

        System.out.println(students);
        System.out.println("================== ");

        System.out.println(students.get(0).name);   // Emre



        // Find me all students from B26
        System.out.println("========= Find me all students from B26 ========= ");

        // 1

        ArrayList<Student> b26Students=new ArrayList<>();

        for (Student eachStudent : students) {
            if(eachStudent.batchNumber==26){
                System.out.println(eachStudent.batchNumber); // OPTIONAL
                b26Students.add(eachStudent);
            }
        }

        System.out.println(b26Students);


        // 2
        System.out.println("========= Find me all students from B26 with RemoveIF ========= ");


        students.removeIf(eachStudent -> eachStudent.batchNumber!=26);
        System.out.println(students);


    }
}
