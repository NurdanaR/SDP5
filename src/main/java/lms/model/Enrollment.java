package lms.model;

import lms.course.Course;

public class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void startCourse() {
        System.out.println(student.getName() + " started learning:");
        course.deliverContent();
        System.out.println("------------------------------------------------");
    }
}