public class Student extends Person{
    //variables
    static int numOfStudents = 0;
    private int yearAttending = 0;
    private double yearFees = 0;

    //constructor

    public Student(String name, String address, int yearAttending) {
        super(name, address);
        this.yearAttending = yearAttending;
        this.yearFees = 3000.00 + (yearAttending * 100.00);
        numOfStudents++;
    }

    //getters
    public static int getNumOfStudents() {
        return numOfStudents;
    }

    public double getYearFees() {
        return yearFees;
    }

    //setters
    public void updateYearAttending(int newYear) {
        this.yearAttending = newYear;
        this.yearFees = 3000.00 + (newYear * 100.00);
    }
    //methods
    @Override
    public String toString(){
        return "Name: " + this.getName() + ", address: " + this.getAddress() + ", pay: $" + yearFees;
    }
}
