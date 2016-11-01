
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String eli = "invisibility!!!!!!";
		String cameron = "can make phones grow!!!!";
		String alex = "can hit a home run every time";
		String olivia = "can make hazle teleport anywhere she wants!!!";
		String julia = "make bake potatos popup anywhere she wants!!!!";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		for (int j = 0; j < 1000; j++) {
			String name = JOptionPane.showInputDialog("what is your name?");
			if (name.equals("eli")) {
				JOptionPane.showMessageDialog(null, eli);
			} else if (name.equals("alex")) {
				JOptionPane.showMessageDialog(null, alex);
			} else if (name.equals("olivia")) {
				JOptionPane.showMessageDialog(null, olivia);
			} else if (name.equals("julia")) {
				JOptionPane.showMessageDialog(null, julia);
			} else if (name.equals("cameron")) {
				JOptionPane.showMessageDialog(null, cameron);

			} else {
				JOptionPane.showMessageDialog(null, "go away !! you smell !!!Go die in a hole !!!!!:)");
			}
		}
	}
}

// 3. Show the superpower in a pop-up, depending on the name entered.
