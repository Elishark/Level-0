import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class obdenttortose {
	public static void main(String[] args) {
		int shape=JOptionPane.showOptionDialog(null, "What shape do you want me to draw?", "Shape", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "square", "circle","triangle" }, null);
		int color=JOptionPane.showOptionDialog(null, "what color do you want your shape to be?", "color", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "red", "green","blue" }, null);
		Tortoise.show();
		Tortoise.setSpeed(10);
		if(shape==(2)){
			drawShape(3);
		}
		if(shape==(1)){
			drawCircle();	
		}
		if(shape==(0)){
			drawShape(4);
		}
		}
		
		//drawSquare();
		//drawTriangle();
		//drawCircle();
	
		
	
	static void drawSquare() {
		Tortoise.penDown();
		for (int j = 0; j < 4; j++) {
			Tortoise.turn(360 / 4);
			Tortoise.move(90);

		}
	}

	static void drawTriangle() {
		Tortoise.penDown();
		for (int j = 0; j < 3; j++) {
			Tortoise.turn(360 / 3);
			Tortoise.move(90);

		}

	}

	static void drawCircle() {
		for(int j=0; j<360; j++){
		Tortoise.turn(360 / 360);
		Tortoise.move(2);
		}
	}
	static void drawShape(int numside){
		for (int j = 0; j < numside; j++) {
		Tortoise.turn(360/numside);
Tortoise.move(90);
		}
		
		
	}
	}

