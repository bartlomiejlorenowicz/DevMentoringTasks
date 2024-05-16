package pl.devmentoring.dziedziczenie;

public class Student extends Person {
    private int studentNumber;
    private double averageMark;

    public Student(String name, int phoneNumber, String email, Address address, int studentNumber, double averageMark) {
        super(name, phoneNumber, email, address);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    @Override
    public void purchaseParkingPass() {
        super.purchaseParkingPass();
        System.out.println("Student parking pass purchased");
    }

    public void isEligibleToEnroll() {
        if (this.averageMark >= 4) {
            System.out.println("Student is eligible to enroll in the university");
        } else {
            System.out.println("Student is not eligible to enroll in the university");
        }
    }

    public void getSeminarsTaken() {
        System.out.println("Seminars: Physics");
    }
}
