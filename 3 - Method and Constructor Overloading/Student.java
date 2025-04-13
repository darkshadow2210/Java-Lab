public class Student {
    int id;
    String name;

    Student() {
        System.out.println("this a default constructor");
    }

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void Teacher() {
        System.out.println("this a method overloading");

    }

    void Teacher(int a, int b) {
        int i, k;
        i = a;
        k = b;
        System.out.println(i + k);
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("\nDefault Constructor values: \n");
        System.out.println("Student Id : " + s.id + "\nStudent Name : " + s.name);
        System.out.println("\nParameterized Constructor values: \n");
        Student student = new Student(10, "David");
        System.out.println("Student Id : " + student.id + "\nStudent Name : " + student.name);
        Student T = new Student();
        T.Teacher();
        T.Teacher(5, 6);
    }
}
