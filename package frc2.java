package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

    private PWMVictorSPX intake;  
    private PWMVictorSPX feeder; 
    private Joystick joystick;   

    @Override
    public void robotInit() {
        
        intake = new PWMVictorSPX(0); 
        feeder = new PWMVictorSPX(1); 
        joystick = new Joystick(0);  

    @Override
    public void teleopPeriodic() {
       
        if (joystick.getRawButton(1)) {
            intake.set(1.0);    
            feeder.set(0.7);   
        } else if (joystick.getRawButton(2)) {
            intake.set(-1.0);  
            feeder.set(-0.7);  
        } else {
            intake.set(0.0);   
            feeder.set(0.0);    
        }
    }
}
