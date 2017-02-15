import javax.swing.JOptionPane;

public class nintyninebottles {
public static void main(String[] args) {
	for(int j=99; j>0; j--){
	JOptionPane.showMessageDialog(null, j + " bottles of beer on the wall " + j + " bottles of beer. Take on down pass it around " + (j-1) + " bottles the wall");
	}
	
}
}
