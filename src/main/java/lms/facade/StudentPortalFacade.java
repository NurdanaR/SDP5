package lms.facade;

import lms.model.Student;
import lms.model.Enrollment;
import lms.course.Course;

import java.util.ArrayList;
import java.util.List;

public class StudentPortalFacade {
    private List<Enrollment> enrollments = new ArrayList<>();

    public void enrollInCourse(Student student, Course course) {
        Enrollment enrollment = new Enrollment(student, course);
        enrollments.add(enrollment);
        System.out.println("✅ " + student.getName() + " enrolled successfully!");
    }

    public void startLearning() {
        for (Enrollment e : enrollments) {
            e.startCourse();
        }
    }
}