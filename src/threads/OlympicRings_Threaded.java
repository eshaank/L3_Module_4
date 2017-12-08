package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {

	public static void main(String[] args) {
		Robot blue = new Robot(500, 400);
		Robot black = new Robot(800, 400);
		Robot red = new Robot(1100, 400);
		Robot yellow = new Robot(700, 600);
		Robot green = new Robot(950, 600);
		new Thread(() -> {
			for (int i = 0; i < 120; i++) {
				blue.setSpeed(10);
				blue.penDown();
				blue.setPenColor(Color.BLUE);
				blue.move(10);
				blue.turn(3);
				blue.hide();
				blue.setPenWidth(10);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 120; i++) {
				black.setSpeed(10);
				black.penDown();
				black.setPenColor(Color.BLACK);
				black.move(10);
				black.turn(3);
				black.hide();
				black.setPenWidth(10);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 120; i++) {
				red.setSpeed(10);
				red.penDown();
				red.setPenColor(Color.RED);
				red.move(10);
				red.turn(3);
				red.hide();
				red.setPenWidth(10);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 120; i++) {
				yellow.setSpeed(10);
				yellow.penDown();
				yellow.setPenColor(Color.YELLOW);
				yellow.move(10);
				yellow.turn(3);
				yellow.hide();
				yellow.setPenWidth(10);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 120; i++) {
				green.setSpeed(10);
				green.penDown();
				green.setPenColor(Color.GREEN);
				green.move(10);
				green.turn(3);
				green.hide();
				green.setPenWidth(10);
			}
		}).start();
	}
}
