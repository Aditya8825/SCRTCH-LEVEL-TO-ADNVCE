import java.util.*;

class Student implements Comparable<Student> {

    String name;
    int rno;
    double cgpa;

    Student(String name, int rno, double cgpa) {
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }
}

public class customcom {
    public static void main(String[] args) {

        Student s1 = new Student("Aditya", 200, 8.3);
        Student s2 = new Student("Mukesh", 49, 8.9);
        Student s3 = new Student("Om", 31, 9.9);

        Student[] arr = {s1, s2, s3};

        Arrays.sort(arr);

        for (Student s : arr) {
            System.out.println(s.name + " " + s.rno + " " + s.cgpa);
        }
    }
}