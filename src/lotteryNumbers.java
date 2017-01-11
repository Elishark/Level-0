import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {
public static void main(String[] args) {
	String the = " The winning lottery numbers are ";

	for(int j=0; j<5; j++){
		int random= new Random().nextInt(50)+1;
		the+=random+", ";
	 }
	 JOptionPane.showMessageDialog(null, the);
}

}
