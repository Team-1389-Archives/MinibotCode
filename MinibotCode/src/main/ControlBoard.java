package main;

import arduinoControl.Joystick;

public class ControlBoard extends ControlMap{
	private static ControlBoard bInstance = new ControlBoard();
	
	public static ControlBoard getInstance(){
		return bInstance;
	}
	
	private final Joystick driveController;
	private final Joystick manipController;
	
	
	private ControlBoard(){//setting control sticks for drive and manip 
		
	driveController = new Joystick(DRIVE_CONTROLLER);
	manipController = new Joystick(MANIP_CONTROLLER);
		
		
	}
	//DRIVER CONTROLS
	
	//axis for forward speed of drivetrain
	
	public double getThrottle(){
		return driveController.getAxis(ax_THROTTLE_AXIS).applyDeadband(0.2);
	}
	
	//axis for controlling turning of drivetrain
	
	public double getWheel(){
		return driveController.getAxis(ax_WHEEL_AXIS).applyDeadband(0.2);
	}
	
	public double getIntake(){
		return driveController.getAxis(ax_INTAKE_AXIS).applyDeadband(0.2);
	}
	
	//BUTTON CONTROLS
	/*button when pressed, turn right 90 degrees
	 */
	public LatchedDigitalInput get90(){
		return (LatchedDigitalInput) manipController.getButton(btn_90_DEGREE);
	}
	/*button when pressed, turn right 45 degrees
	 */
	public LatchedDigitalInput getC45(){
		return (LatchedDigitalInput) manipController.getButton(btn_45_DEGREE); 
	}
	/*button when pressed, turn right 180 degrees
	 */
	public LatchedDigitalInput get180(){
		return (LatchedDigitalInput) manipController.getButton(btn_180_DEGREE);
	}
	/*button when pressed, turn right 360 degrees
	 */
	public LatchedDigitalInput get360(){
		return (LatchedDigitalInput) manipController.getButton(btn_360_DEGREE);
	}
	/*button when pressed, flywheels spin to output ball 
	 */
	
	/*axis for moving arm
	 */
	//incline plane
	public double getArm(){
		return driveController.getAxis(ax_ARM_AXIS);
	}
	//trap door
	public double getTrapDoor(){
		return driveController.getAxis(btn_ANGLE_TRAP_DOOR);
	}
	public double getInclinePlane(){
		return driveController.getAxis(btn_ANGLE_PLANE);
	}
}