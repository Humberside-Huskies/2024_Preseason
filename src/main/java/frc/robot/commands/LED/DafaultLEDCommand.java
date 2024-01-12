package frc.robot.commands.LED;

import frc.robot.commands.LoggingCommandBase;
import frc.robot.operator.GameController;
import frc.robot.subsystems.LEDSubsystem;

public class DafaultLEDCommand extends LoggingCommandBase {

    // private final LEDSubsystem ledSubsystem;
    private final LEDSubsystem ledSubsystem;

    /**
     * Creates a new ExampleCommand.
     *
     * @param LEDSubsystem The subsystem used by this command.
     */
    public DafaultLEDCommand(GameController driverController,
        LEDSubsystem ledSubsystem) {

        this.ledSubsystem = ledSubsystem;

        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(ledSubsystem);
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