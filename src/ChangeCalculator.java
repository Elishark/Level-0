// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String money = JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickels = Integer.parseInt(money);
		// Ask the user how many dimes they have, and convert their answer
money = JOptionPane.showInputDialog("How many dimes do you have?");
int dimes = Integer.parseInt(money);
		// Ask the user how many quarters they have, and convert their answer
money = JOptionPane.showInputDialog("How many quarters do you have?");
int quarters = Integer.parseInt(money);
		// Calculate how much money the user has and save it in a double variable 
double monay = ((nickels*5)+(dimes*10)+(quarters*25))/100;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null,"You have $"+ monay);
	}
}


