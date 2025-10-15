package lms.course;

public class CertificateDecorator extends CourseDecorator {
    public CertificateDecorator(Course decoratedCourse) {
        super(decoratedCourse);
    }

    @Override
    public void deliverContent() {
        super.deliverContent();
        addCertificate();
    }

    private void addCertificate() {
        System.out.println("Certificate granted after completion!");
    }
}