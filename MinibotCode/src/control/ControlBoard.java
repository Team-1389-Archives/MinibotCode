package control;


public class ControlBoard extends ControlMap{
	private static ControlBoard bInstance = new ControlBoard();
	
	public static ControlBoard getInstance(){
		return bInstance;
	}
	
	private final JoystickController driveController;
	private final JoystickController manipController;
	
	private ControlBoard(){//setting control sticks for drive and manip 
		driveController = new JoystickController(DRIVE_CONTROLLER);
		manipController = new JoystickController(MANIP_CONTROLLER);
	}
	//DRIVER CONTROLS
	
	//axis for forward speed of drivetrain
	
	public PercentIn getThrottle(){
		return driveController.getAxis(ax_THROTTLE_AXIS).applyDeadband(0.2);
		}
	
	//axis for controlling turning of drivetrain
	
	public PercentIn getWheel(){
		return driveController.getAxis(ax_WHEEL_AXIS).applyDeadband(0.2);
		}
	
	//hold a button to switch between curvature to regular tank turning
	
	public RawDigitalInput getQuickTurn(){
		return (RawDigitalInput) driveController.getButton(btn_QUICK_TURN, InputStyle.RAW);
	}
	
	//BUTTON CONTROLS
	
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
}
