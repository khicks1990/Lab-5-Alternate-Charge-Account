import javax.swing.JOptionPane;

/**
   Demo program for the Validator class
*/

public class Main
{
   public static void main(String[] args)
   {
      String input;        // To hold keyboard input
      int accountNumber;   // Account number to validate

      // Create a Validator object.
      Validator val = new Validator();

      // Get a charge account number.
      input = JOptionPane.showInputDialog("Enter your charge account number: ");
      accountNumber = Integer.parseInt(input);

      // Determine whether it is valid.
      if (val.isValid(accountNumber))
         JOptionPane.showMessageDialog(null, "That's a valid account number.");
      else
         JOptionPane.showMessageDialog(null, "That's an INVALID account number.");

      System.exit(0);
   }
}