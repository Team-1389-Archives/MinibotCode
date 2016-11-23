package main;

import arduinoControl.*;

public class Robot{	

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
	
	}
	public void autonomousInit() {
		
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		
	}

	public void teleopInit(){
		
	}
	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		
	}


	public static void main(String[] args){
		Robot r = new Robot();
		r.robotInit();
		boolean auton = false;
		if(auton){
			r.autonomousInit();
			while(true){
				r.autonomousPeriodic();
			}
		}
		else{
			r.teleopInit();
			while(true){
				r.teleopPeriodic();
			}
		}
	}
}


