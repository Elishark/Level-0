import org.teachingextensions.logo.Tortoise;

public class obdenttortose {
public static void main(String[] args) {
	Tortoise.show();
	Tortoise.setSpeed(10);
drawSquare();
}

static void drawSquare(){
Tortoise.penDown();
Tortoise.move(90);
Tortoise.turn(90);
Tortoise.move(90);
Tortoise.turn(90);
Tortoise.move(90);
Tortoise.turn(90);
Tortoise.move(90);
}
}