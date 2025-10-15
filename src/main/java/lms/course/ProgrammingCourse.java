package lms.course;

public class ProgrammingCourse implements Course {
    @Override
    public void deliverContent() {
        System.out.println("Delivering Programming Course content...");
    }
}