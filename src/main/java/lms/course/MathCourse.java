package lms.course;

public class MathCourse implements Course {
    @Override
    public void deliverContent() {
        System.out.println("Delivering Math Course content...");
    }
}