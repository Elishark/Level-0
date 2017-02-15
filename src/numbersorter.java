import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class numbersorter {
	public static void main(String[] args) {

		String one = JOptionPane.showInputDialog("pick a number.");
		String two = JOptionPane.showInputDialog("pick another number.");
		String three = JOptionPane.showInputDialog("Pick your last number.");
		int one2 = Integer.parseInt(one);
		int two2 = Integer.parseInt(two);
		int three2 = Integer.parseInt(three);

		if (one2 < two2 && one2 < three2) {
			if (two2 < three2) {
				JOptionPane.showMessageDialog(null, one2 + " " + two2 + " " + three2);
			} else {
				JOptionPane.showMessageDialog(null, one2 + " " + three2 + " " + two2);
			}
		}

		if (two2 < one2 && two2 < three2) {
			if (one2 < three2) {
				JOptionPane.showMessageDialog(null, two2 + " " + one2 + " " + three2);
			} else {
				JOptionPane.showMessageDialog(null, two2 + " " + three2 + " " + two2);
			}
		}
		
		if (three2 < one2 && three2 < two2) {
			if (one2 < two2) {
				JOptionPane.showMessageDialog(null, three2 + " " + one2 + " " + two2);
			} else {
				JOptionPane.showMessageDialog(null, three2 + " " + two2 + " " + one2);
			}
		}

	}
}
