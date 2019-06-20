package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot king=new Robot();

        // 3. Put the robot's pen down
king.penDown();

king.setSpeed(100);

        // 6. Make the robot move as fast as possible
for (int j = 0; j < 10; j++) {
	

        // 5. Do everything below here 4 times
for (int i = 0; i < 7; i++) {
	


        //         2. Move your robot 200 pixels
king.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
king.turn(360/7);

    }
king.setRandomPenColor();
king.move(25);
}
}}