package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] rob = new Robot[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < rob.length; i++) {
	if(i==0) {
		rob[i]=new Robot("batman");
		rob[i].penDown();
		rob[i].setPenWidth(10);
	}else  {
		rob[i]= new Robot();
	}

	rob[i].setY(550);
	rob[i].setX(i*150+150);
	
}
Robot.setWindowSize(10000, 700);
JOptionPane.showMessageDialog(null, "                   Start!");
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random random = new Random();
boolean LOL = true;
while (LOL) {
	
for (int i = 0; i < rob.length; i++) {
	rob[i].setSpeed(12);
	rob[i].move(random.nextInt(50));
	
	if (rob[i].getY()<=0) {
		
		System.out.println("Robot "+ (i+1) +" won!\nLet's have a party for it!!");
		LOL=false;
		break;
	}
}}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	
}
}
