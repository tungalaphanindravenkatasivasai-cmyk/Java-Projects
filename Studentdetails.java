import java.util.Scanner;

class Student {
    int id;
    String name;
    String dept;

    Student(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    void displayCommonDetails() {
        if (id < 0) {
            System.out.println("Invalid ID");
        } else {
            System.out.println("Student ID: " + id);
        }

        if (name.isEmpty()) {
            System.out.println("Invalid Name");
        } else {
            System.out.println("Student Name: " + name);
        }

        System.out.println("Department: " + dept);
    }
}

class UnderGraduate extends Student {
    int sem;
    double cgpa;

    UnderGraduate(int id, String name, String dept, int sem, double cgpa) {
        super(id, name, dept);
        this.sem = sem;
        this.cgpa = cgpa;
    }

    void displayUnderGraduateDetails() {
        displayCommonDetails();

        if (sem < 1 || sem > 8) {
            System.out.println("Invalid Semester");
        } else {
            System.out.println("Semester: " + sem);
        }

        if (cgpa < 0 || cgpa > 10) {
            System.out.println("Invalid CGPA");
        } else {
            System.out.println("CGPA: " + cgpa);
        }
    }
}

class PostGraduate extends Student {
    String spl;
    String rt;

    PostGraduate(int id, String name, String dept, String spl, String rt) {
        super(id, name, dept);
        this.spl = spl;
        this.rt = rt;
    }

    void displayPostGraduateDetails() 
        displayCommonDetails();

        if (spl.isEmpty()) {
            System.out.println("Invalid Specialization");
        } else {
            System.out.println("Specialization: " + spl);
        }

        if (rt.isEmpty()) {
            System.out.println("Invalid Research Topic");
        } else {
            System.out.println("Research Topic: " + rt);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Undergraduate");
        System.out.println("2. Postgraduate");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();

            System.out.print("Enter CGPA: ");
            double cgpa = sc.nextDouble();

            UnderGraduate ug =
                    new UnderGraduate(id, name, dept, sem, cgpa);

            System.out.println("\nUndergraduate Details:");
            ug.displayUnderGraduateDetails();

        } else if (choice == 2) {

            System.out.print("Enter Specialization: ");
            String spl = sc.nextLine();

            System.out.print("Enter Research Topic: ");
            String rt = sc.nextLine();

            PostGraduate pg =
                    new PostGraduate(id, name, dept, spl, rt);

            System.out.println("\nPostgraduate Details:");
            pg.displayPostGraduateDetails();

        } else {
            System.out.println("Invalid choice");
        }  
        
        sc.close();
    }
