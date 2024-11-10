import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //variables
        String userName;
        String userAddress;
        String outputReport = "";
        int userYear = 0;
        int userChoice;
        double salaryTally = 0;
        double feeTally = 0;
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Staff> staffList = new ArrayList<>();
        String[] buttonOptions = {"Student", "Staff", "Finish"};



        //ask the user the first time what they want to do
        userChoice = JOptionPane.showOptionDialog(null,"Select Student or Staff", "Accounting App", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttonOptions, buttonOptions[2]);

        while (userChoice != 2){

            switch (userChoice){
                case 0: //if student was picked
                    //get and validate userName
                    do {
                        userName = JOptionPane.showInputDialog(null, "Enter the student's name:");
                        if (userName.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please enter valid information.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (userName.trim().isEmpty());

                    // get and validate userAddress
                    do {
                        userAddress = JOptionPane.showInputDialog(null, "Enter the student's address:");
                        if (userAddress.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please enter valid information.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (userAddress.trim().isEmpty());

                    // get and validate userYear
                    boolean validYear = false;
                    do {
                        String year = JOptionPane.showInputDialog(null, "Enter the student's year: (1-4)");
                        try {
                            userYear = Integer.parseInt(year.trim());
                            validYear = true; // If the parse succeeds, the input is valid
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Please enter a number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (!validYear);
                    studentList.add(new Student(userName, userAddress, userYear));
                    break;
                case 1://if Staff was picked
                    //get and validate userName
                    do {
                        userName = JOptionPane.showInputDialog(null, "Enter the staff's name:");
                        if (userName.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please enter valid information.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (userName.trim().isEmpty());

                    // get and validate userAddress
                    do {
                        userAddress = JOptionPane.showInputDialog(null, "Enter the staff's address:");
                        if (userAddress.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please enter valid information.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (userAddress.trim().isEmpty());

                    // get and validate userYear
                    validYear = false;
                    do {
                        String year = JOptionPane.showInputDialog(null, "Enter the staff's years of service:");
                        try {
                            userYear = Integer.parseInt(year.trim());
                            validYear = true; // If the parse succeeds, the input is valid
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Please enter a number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (!validYear);
                    staffList.add(new Staff(userName, userAddress, userYear));
                    break;
            }
            //check to see if user wishes to continue
            userChoice = JOptionPane.showOptionDialog(null,"Select Student or Staff", "Accounting App", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttonOptions, buttonOptions[2]);
        }

        //output the results to a popup
        outputReport += "Students: " + Student.numOfStudents + "\n";
        for(Student student : studentList){
            feeTally += student.getYearFees();
            outputReport += student.toString() + "\n";
        }
        outputReport += "Staff: " + Staff.numOfStaff + "\n";
        for(Staff staff : staffList){
            salaryTally += staff.getYearSalery();
            outputReport += staff.toString() + "\n";
        }
        outputReport += "Results:\nOutgoing: $" + String.format("%.2f", salaryTally/26) + "\nIncoming: $" + String.format("%.2f", feeTally) + "\nTotal: $" + String.format("%.2f", feeTally-(salaryTally/26));

        JOptionPane.showMessageDialog(null, outputReport);

    }
}
