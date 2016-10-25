import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] cheese) {
		String first=JOptionPane.showInputDialog("What is your first name?");
		String Last=JOptionPane.showInputDialog("What is your last name?");
		String Destination=JOptionPane.showInputDialog("What is your Destination airport?(for security purposes)");
		String birthday=JOptionPane.showInputDialog("What is your birthday?(for security purposes)");
		String Male_Female=JOptionPane.showInputDialog("Are you a male of female?(for security purposes) Please check to make sure!!!");
		JOptionPane.showMessageDialog(null, first+"/"+ Last+"\n"+ Destination+"\n"+birthday+"\n"+Male_Female);
	}
}






/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/