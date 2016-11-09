

	 import java.util.Random;

import javax.swing.JOptionPane;


	// Copyright Wintriss Technical Schools 2013
	public class HighLowGame {


		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int random = new Random().nextInt(100)+1;
			// 2. Print out the random variable above
			//System.out.println(random);
			// 11. do the following 10 times
			for(int j=0; j<10; j++){
				// 1. ask the user for a guess using a pop-up window, and save their response 
String number = JOptionPane.showInputDialog("What number am I thinkin"
		+ "g of?");

				// 4. convert the users’ answer to an int (Integer.parseInt(string))
				int thing = Integer.parseInt(number);
				// 5. if the guess is correct
				if(thing==(random)){
					// 6. win
					JOptionPane.showMessageDialog(null, "Yay you got it correct");
					System.exit(0);
					break;
					
				}					
				// 7. if the guess is high
				else if (thing>(random)){
				JOptionPane.showMessageDialog(null, "thats too high!!!");
				}
				
					// 8. tell them it's too high
				// 9. if the guess is low
			if (thing<(random)){
			JOptionPane.showMessageDialog(null, "thats too low");	
			}
			}
					// 10. tell them it's too low
			JOptionPane.showMessageDialog(null, "You got it incorrect!! go away you smell! go die in a hole!");

		}
			// 12. tell them they lose
		


	






		// TODO Auto-generated constructor stub
	}


