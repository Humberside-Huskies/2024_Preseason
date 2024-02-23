package frc.robot.commands.limelight;

import frc.robot.commands.LoggingCommandBase;
import frc.robot.operator.GameController;
import frc.robot.subsystems.VisionSubsystem;

public class DafaultVisionCommand extends LoggingCommandBase {

    // private final LEDSubsystem limeLightSubsystem;
    private final VisionSubsystem visionSubsystem;

    /**
     * Creates a new ExampleCommand.
     *
     * @param limeLightSubsystem The subsystem used by this command.
     */
    public DafaultVisionCommand(GameController driverController,
        VisionSubsystem visionSubsystem) {

        this.visionSubsystem = visionSubsystem;

        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(visionSubsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        logCommandStart();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {

    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        logCommandEnd(interrupted);
    }
}