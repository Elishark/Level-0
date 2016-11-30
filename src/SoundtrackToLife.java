import java.net.URI;


import javax.swing.JOptionPane;


public class SoundtrackToLife {


	public static void main(String[] args) {


		// 1. Adjust this pop-up to find out what mood the user is in.
		int DONOTTOUCH = JOptionPane.showOptionDialog(null, "Try not to press me!! ", "dont you DARE", 0,
				JOptionPane.WARNING_MESSAGE, null, new String[] { "Me", "ME" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
		System.out.println(DONOTTOUCH);

		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
if(DONOTTOUCH==0){
	JOptionPane.showMessageDialog(null,"WHYYYYY!");
	JOptionPane.showMessageDialog(null,"I CAN'T STOP IT");
	JOptionPane.showMessageDialog(null, "NOOOOOO!");
	playVideo("https://www.youtube.com/watch?v=QH2-TGUlwu4");
	
}
if(DONOTTOUCH==1){
	JOptionPane.showMessageDialog(null,"WHYYYYY!");
	JOptionPane.showMessageDialog(null,"I CAN'T STOP IT");
	JOptionPane.showMessageDialog(null, "NOOOOOO!");
	playVideo("https://www.youtube.com/watch?v=QH2-TGUlwu4");
	
}
		// 4. Play different songs for other moods.


		// If you are seeing ads at the beginning of your videos, install Adblock.


	}


	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}







/**
* If you can’t think of any, here are some you can use...
*	bit.ly/video-for-happy
*	bit.ly/video-for-sad
*	bit.ly/video-for-angry
**/
