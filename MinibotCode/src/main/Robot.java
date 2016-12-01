package main;

import arduinoControl.Joystick;
import arduinoControl.Victor;

public class Robot {
	
	 Victor v = new Victor(3);

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	Joystick joy;

	public void robotInit() {
		joy = new Joystick(0);
	}

	public void teleopInit() {
		joy.getButton(0);

	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		joy.getButton(0);
	}

	public static void main(String[] args) {
		Joystick.printControllers();
		Robot r = new Robot();
		r.robotInit();
		r.teleopInit();
		while (true) {
			r.teleopPeriodic();
		}
	}
}
