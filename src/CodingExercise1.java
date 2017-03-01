
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors.Blues;
import org.teachingextensions.logo.Topping;
import org.teachingextensions.logo.Tortoise;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setSpeed(10);
		// 3. ask the user what color they would like the Robot to draw
		String color = JOptionPane.showInputDialog("What color would you like your shape to be? Red or Blue");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if (color.equals("Blue")) {
			Tortoise.setPenColor(Color.BLUE);
		} else if (color.equals("Red")) {
			Tortoise.setPenColor(Color.RED);
		}

		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the Robot draw a shape
		for (int j = 0; j < 4; j++) {
			Tortoise.move(70);
			Tortoise.turn(90);
		}

	}

}
