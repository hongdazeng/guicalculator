import javax.swing.JOptionPane;
import java.lang.Math.*;

public class GUIcalculator {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog (null, "Welcome to Hongda's GUI Calculator", "Welcome", JOptionPane.PLAIN_MESSAGE);

        int firstnumber = 0;
        int secondnumber = 0;
        double result = 0.0;
        String answers = "";
        boolean contine = true;

        while (contine) {
            Object[] options = {"add", "subtract", "multiply", "divide", "exponent"};
            String userchoice = "testing";

            userchoice = (String)JOptionPane.showInputDialog(null, "Please chose the operation you wish to perform:\nClick cancel to quit",
                         "Choose an option:",
                         JOptionPane.QUESTION_MESSAGE,
                         null,
                         options,
                         options[0]);

            if (userchoice ==  null) {
                userchoice = "leave";
                System.out.println ("User entered cancel");
                contine = false;
                break;
            }

            String choice1 = JOptionPane.showInputDialog(null, "What's the first number?");
            String choice2 = JOptionPane.showInputDialog(null, "What's the second number?");

            try {
                firstnumber = Integer.parseInt(choice1);
                secondnumber = Integer.parseInt(choice2);
            }

            catch (Exception e) {
                JOptionPane.showMessageDialog (null, "Please enter intergers", "Input error", JOptionPane.PLAIN_MESSAGE);
                userchoice = "cakes";
            }

            if (userchoice.equals("add")) {
                result = add(firstnumber, secondnumber);
                answers = resultbuilder(result);

            } else if (userchoice.equals("subtract")) {
                result = sub(firstnumber, secondnumber);
                answers = resultbuilder(result);

            } else if (userchoice.equals("multiply")) {
                result = mul(firstnumber, secondnumber);
                answers = resultbuilder(result);

            } else if (userchoice.equals("divide")) {
                result = divs(firstnumber, secondnumber);
                answers = "Your answer is " + result;

            } else if (userchoice.equals("leave")) {
                answers = "Thank you for using GUIcalculator";

            } else if (userchoice.equals("exponent")) {
                result = Math.pow(firstnumber, secondnumber);
                answers = "Your answer is " + result;

            } else {
                JOptionPane.showMessageDialog (null, "Please try again", "Unexpected Error", JOptionPane.PLAIN_MESSAGE);
                answers = "Please follow the rules this time!";
            }
            JOptionPane.showMessageDialog (null, answers, "Calculation completed", JOptionPane.PLAIN_MESSAGE);
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

    public static String resultbuilder (double re) {
        return ("Your answer is " + re );
    }
}