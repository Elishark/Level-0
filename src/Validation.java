import java.util.Random;


import javax.swing.JOptionPane;


public class Validation {
	public static void main(String[] args) {


		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		for(int yo=0; yo<10; yo++){
		int randomNumber = new Random().nextInt(4);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);


		// 3. Use the randomNumber to give the user a random compliment.

		if(randomNumber==(2)){
JOptionPane.showMessageDialog(null, "your nice!");	
}
if(randomNumber==(1)){
JOptionPane.showMessageDialog(null, "you look good!");	
}
if(randomNumber==(3)){
JOptionPane.showMessageDialog(null, "your shoes are cool!");	
}
if(randomNumber==(0)){
JOptionPane.showMessageDialog(null, "Yea um hi uh w-when did you get here?");	
}
}
	}

		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}


