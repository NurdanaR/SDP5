package lms.course;

public class GamificationDecorator extends CourseDecorator {
    public GamificationDecorator(Course decoratedCourse) {
        super(decoratedCourse);
    }

    @Override
    public void deliverContent() {
        super.deliverContent();
        addGamification();
    }

    private void addGamification() {
        System.out.println("Points and leaderboard activated!");
    }
}