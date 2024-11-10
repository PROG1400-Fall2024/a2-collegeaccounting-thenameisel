public class Staff extends Person{
    //variables
    static int numOfStaff = 0;
    private int yearsOfService = 0;
    private double yearSalery = 0;

    //constructor
    public Staff(String name, String address, int yearsOfService) {
        super(name, address);
        this.yearsOfService = yearsOfService;
        this.yearSalery = 50000.00 + (yearsOfService * 500.00);
        numOfStaff++;
    }

    //getters
    public static int getNumOfStaff() {
        return numOfStaff;
    }

    public double getYearSalery() {
        return yearSalery;
    }

    //setters
    public void updateYearsOfService(int newYear){
        this.yearsOfService = newYear;
        this.yearSalery = 50000.00 + (newYear * 500.00);
    }

    //methods
    @Override
    public String toString(){
        return "Name: " + this.getName() + ", address: " + this.getAddress() + ", pay: $" + yearSalery;
    }
}
