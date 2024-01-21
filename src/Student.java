public class Student extends Person {
    private double gpa;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67){
            return 36600.00;
        } else{
            return 0.00;
        }
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}