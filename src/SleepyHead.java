
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int SLEEP = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);

		int friYAY;

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * 
		 * print “get up lazy bones!” If it is a weekday, and we are on
		 * vacation, print “sleep in”.
		 */
		if (SLEEP == JOptionPane.YES_OPTION) {
			isWeekday = true;
		} else  {
			isWeekday = false;
		}
		friYAY = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "", JOptionPane.YES_NO_OPTION);

		if (friYAY == JOptionPane.YES_OPTION) {
			isVacation = true;
		}
		else {
			isVacation = false;
		}
	
		if(isWeekday == true){
		if(isVacation== true){
		JOptionPane.showMessageDialog(null, "Sleep in");	
		}
		else{
		JOptionPane.showMessageDialog(null, "Get up lazybones");	
		}
		}
		else{

		JOptionPane.showMessageDialog(null, "sleep in");	
		
		}
			
			
			
			
			
			
		}
}
	
		
	

		
		
	



