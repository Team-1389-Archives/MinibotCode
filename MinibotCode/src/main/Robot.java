package main;

import arduinoControl.Joystick;

public class Robot {

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	Joystick joy;

	public void robotInit() {
		joy = new Joystick(0);
	}

	public void teleopInit() {

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
