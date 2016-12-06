package control;

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
		return driveController.getAxis(ax_THROTTLE_AXIS);
		}
	
	//axis for controlling turning of drivetrain
	
	public double getWheel(){
		return driveController.getAxis(ax_WHEEL_AXIS);
		}
	
	//BUTTON CONTROLS
	/*button when pressed, turn right 45 degrees
	 */
	public LatchedDigitalInput getCEightTurn(){
		return (LatchedDigitalInput) manipController.getButton(btn_CLOCKWISE_EIGHTH_TURN);
	}
	/*button when pressed, turn right 90 degrees
	 */
	public LatchedDigitalInput getCFourthTurn(){
		return (LatchedDigitalInput) manipController.getButton(btn_CLOCKWISE_FOURTH_TURN); 
	}
	
	public LatchedDigitalInput getCCEightTurn(){
		return (LatchedDigitalInput) manipController.getButton(btn_COUNTERCLOCKWISE_EIGHTH_TURN);
	}
	public LatchedDigitalInput getCCFourthTurn(){
		return (LatchedDigitalInput) manipController.getButton(btn_COUNTERCLOCKWISE_FOURTH_TURN);
	}
	/*button when pressed, flywheels spin to output ball 
	 */
	public LatchedDigitalInput getOutput(){
		return (LatchedDigitalInput) manipController.getButton(ax_INTAKE_AXIS); //check the arguments for the method
	}
	
	/*button when pressed, flywheels spin to input ball
	 */
	public LatchedDigitalInput getInput(){
		return (LatchedDigitalInput) manipController.getButton(ax_INTAKE_AXIS);//check the arguments for the method
	}
	
	/*axis for moving arm
	 */
	public double getArm(){
		return manipController.getButton(btn_ARM);
	}
}
