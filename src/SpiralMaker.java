
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
		String sides= JOptionPane.showInputDialog("how many sides do you want your shape to have?");
		Tortoise.setSpeed(10);
		drawShape(Integer.parseInt(sides));
		// 3. Make a variable to hold the number of sides and set it to 0
		
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		
		
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		

		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}
	
	public static void drawShape (int numsides){
		for(int j=0; j<80; j++){
Tortoise.setPenWidth(j);
			Tortoise.move(j*4);
			Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.turn(360/numsides);
		}
		}
		
	}
	



