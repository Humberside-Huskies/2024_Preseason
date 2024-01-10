package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.LEDConstants;


public class LEDSubsystem extends SubsystemBase {

    // The motors on the left side of the drive.
    private final PWMSparkMax LEDController = new PWMSparkMax(LEDConstants.LED_PWPORT);
    // private final AddressablLedBuffer ledBuffer;

    /** Creates a new DriveSubsystem. */
    public LEDSubsystem() {

        // We need to invert one side of the drivetrain so that positive voltages
        // result in both sides moving forward. Depending on how your robot's
        // gearbox is constructed, you might have to invert the left side instead.
     \//   ledBuffer.setData(ledBuffer);


    }

    /**
     * Set the arm speed of the arm motor
     *
     * @param red Red component (0 to 1)
     * @param green Green Component (0 to 1)
     * @param blue Blue Component (0 to 1)
     */
    public void setLEDColor(double red, double green, double blue) {

        int pwmRed   = (int) (red * 255);
        int pwdGreen = (int) (green * 255);
        int pwdBlue  = (int) (blue * 255);
    }

    /** Safely stop the subsystem from moving */
    public void stop() {
    }

    @Override
    public void periodic() {
        /*
         * Update all dashboard values in the periodic routine
         */
    }

    @Override
    public String toString() {
        // Create an appropriate text readable string describing the state of the subsystem

        return "Wtf this the LED Subsystem";
    }

}
