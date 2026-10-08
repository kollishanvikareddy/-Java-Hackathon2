import java.util.Scanner;
class Student {
    String studentName, courseName;
    int rollNumber, courseCredits;
    double marks;
    Student(String n, int r, double m, String c, int cr) {
        studentName = n;
        rollNumber = r;
        marks = m;
        courseName = c;
        courseCredits = cr;
    }
    double calculateFee() {
        return courseCredits * 1500;
    }
     boolean checkEligibility() {
        return marks >= 50;
    }
     double calculateScholarship() {
        if (marks >= 85)
            return calculateFee() * 0.20;
        else if (marks >= 70)
            return calculateFee() * 0.10;
        else
            return 0;
    }
      double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }
      void displayDetails() {
        System.out.println("\nName: " + studentName);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + courseName);
        System.out.println("Credits: " + courseCredits);
        System.out.println("Fee: Rs." + calculateFee());
        System.out.println("Scholarship: Rs." + calculateScholarship());
        System.out.println("Final Fee: Rs." + calculateFinalFee());
    }
}
      public class StudentCourseRegistration {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Name: ");
        String n = sc.nextLine();
        System.out.print("Roll No: ");
        int r = sc.nextInt();
        System.out.print("Marks: ");
        double m = sc.nextDouble();
        sc.nextLine();
       System.out.print("Course: ");
        String c = sc.nextLine();
        System.out.print("Credits: ");
        int cr = sc.nextInt();
       Student s = new Student(n, r, m, c, cr);
       if (s.checkEligibility())
            s.displayDetails();
        else
            System.out.println("Not eligible for registration.");
            sc.close();
    }
}

