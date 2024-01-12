package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LimeLightSubsystem extends SubsystemBase {

    public LimeLightSubsystem() {
        NetworkTable      table = NetworkTableInstance.getDefault().getTable("limelight");
        NetworkTableEntry tx    = table.getEntry("tx");
        NetworkTableEntry ty    = table.getEntry("ty");
        NetworkTableEntry ta    = table.getEntry("ta");

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

        return "Wtf this the LimeLight Subsystem";
    }
}
