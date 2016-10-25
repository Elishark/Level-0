import javax.swing.JOptionPane;

public class Are_You_Happy {
public static void main(String[] happy) {
	String smile=JOptionPane.showInputDialog("Are you happy?");
	if(smile.equals("yes")){
	JOptionPane.showMessageDialog(null, "Keep doing whatever you ar doing!!!!!!!!!");	
	}
	String face="";
	if(smile.equals("no")){
	face=JOptionPane.showInputDialog("Do you wan't to be happy?");
	}
	if(face.equals("no")){
	JOptionPane.showMessageDialog(null, "Go die in a hole");	
	}
	
	if(face.equals("yes")){
	JOptionPane.showMessageDialog(null, "change something");
	}
	}
	}
	
	


