import javax.swing.JOptionPane;

public class Doyoulikepizza {
	public static void main(String[] args) {
		String Pizza = JOptionPane.showInputDialog("Do you like pizza?");
		if (Pizza.equals("yes")) {
			String Pepperoni = JOptionPane.showInputDialog("Do you like pepperoni Pizza?");
			if (Pepperoni.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Enjoy your Pepperoni pizza!");
			}
			else{
				JOptionPane.showMessageDialog(null, "Enjoy your cheese pizza after you die in a hole!");
			}
		}

		else if (Pizza.equals("no")) {
			String Salad = JOptionPane.showInputDialog("Do you like salad?");
			if(Salad.equals("yes")){
			JOptionPane.showMessageDialog(null, "Enjoy your pepperoni salad");	
			}
			else{
			JOptionPane.showMessageDialog(null, "Then you will die. In a hole");	
			}
			}
			}
		} 
		

		
	


