import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

public class CreateAMethod {
	public static void main(String[] args) {
		YOUARECOOL();
		Yourbirthyear(1000);
	}

	static void YOUARECOOL() {

		String Name = JOptionPane.showInputDialog("What is your name?");
if(Name.equals("Alex")){

	JOptionPane.showMessageDialog(null, Name+" you try to be cool but your not that cool!!!");
	
}
else {
	JOptionPane.showMessageDialog(null, Name + " You are cool.");
}
	}

	static void Yourbirthyear(int Age) {

		int answer = 2017 - Age;
		JOptionPane.showMessageDialog(null, "You were born in " + answer);

	}

}
