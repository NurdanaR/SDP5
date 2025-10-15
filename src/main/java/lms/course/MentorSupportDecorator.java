package lms.course;

public class MentorSupportDecorator extends CourseDecorator {
    public MentorSupportDecorator(Course decoratedCourse) {
        super(decoratedCourse);
    }

    @Override
    public void deliverContent() {
        super.deliverContent();
        addMentorSupport();
    }

    private void addMentorSupport() {
        System.out.println("Personal mentor support added!");
    }
}