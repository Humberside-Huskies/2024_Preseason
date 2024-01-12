package frc.robot.commands.limelight;

import frc.robot.commands.LoggingCommandBase;
import frc.robot.operator.GameController;
import frc.robot.subsystems.LimeLightSubsystem;

public class DafaultLimeLightCommand extends LoggingCommandBase {

    // private final LEDSubsystem limeLightSubsystem;
    private final LimeLightSubsystem limeLightSubsystem;

    /**
     * Creates a new ExampleCommand.
     *
     * @param limeLightSubsystem The subsystem used by this command.
     */
    public DafaultLimeLightCommand(GameController driverController,
        LimeLightSubsystem limeLightSubsystem) {

        this.limeLightSubsystem = limeLightSubsystem;

        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(limeLightSubsystem);
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