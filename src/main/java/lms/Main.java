package lms;

import lms.course.*;
import lms.facade.StudentPortalFacade;
import lms.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentPortalFacade portal = new StudentPortalFacade();

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);

        System.out.println("\nChoose a course: ");
        System.out.println("1 - MathCourse (with MentorSupport + Certificate)");
        System.out.println("2 - ProgrammingCourse (with Gamification)");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        Course course;

        if (choice == 1) {
            course = new CertificateDecorator(new MentorSupportDecorator(new MathCourse()));
        } else {
            course = new GamificationDecorator(new ProgrammingCourse());
        }

        portal.enrollInCourse(student, course);

        System.out.println("\nStart learning? (y/n): ");
        String start = scanner.next();
        if (start.equalsIgnoreCase("y")) {
            portal.startLearning();
        } else {
            System.out.println("Learning canceled");
        }
    }
}