import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //variables
        String userName;
        String userAddress;
        int userYear;
        int userChoice;
        String[] buttonOptions = {"Student", "Staff", "Finish"};
        //set up the frame
        JFrame frame = new JFrame("Popup Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(300, 200);
        frame.setVisible(true);

        //ask the user the first time what they want to do
        userChoice = JOptionPane.showOptionDialog(frame,"Please choose an option:", "Select Role", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttonOptions, buttonOptions[2]);

        frame.dispose();
    }
}
