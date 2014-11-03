import javax.swing.JOptionPane;

public class GUIcalculator {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog (null, "Welcome to Hongda's GUI Calculator", "Welcome", JOptionPane.PLAIN_MESSAGE);

        int firstnumber = 0;
        int secondnumber = 0;
        double result = 0.0;
        boolean contine = true;

        while (contine) {
            Object[] options = {"add", "subtract", "multiply", "divide"};
            String userchoice = "testing";

            userchoice = (String)JOptionPane.showInputDialog(null, "Please chose the operation you wish to perform:",
                         "Choose an option:",
                         JOptionPane.QUESTION_MESSAGE,
                         null,
                         options,
                         options[0]);

            System.out.println ("User entered cancel");
            contine = false;


            if (userchoice.equals("add")) {
                result = add(firstnumber, secondnumber);

            } else if (userchoice.equals("subtract")) {
                result = sub(firstnumber, secondnumber);

            } else if (userchoice.equals("multiply")) {
                result = mul(firstnumber, secondnumber);

            } else if (userchoice.equals("divide")) {
                result = divs(firstnumber, secondnumber);
            } else if (userchoice.equals("leave")) {


            } else {
                JOptionPane.showMessageDialog (null, "You have entered en invalid option!", "Unexpected Error", JOptionPane.PLAIN_MESSAGE);
            }
        } // end while
    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static int sub (int a, int b) {
        return a - b;
    }

    public static int mul (int a, int b) {
        return a * b;
    }

    public static double divs (int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter an non-zero int for the second digit", "Dividing by zero error!", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
}