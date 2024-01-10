import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.LoggingCommandBase;
import frc.robot.operator.GameController;
import frc.robot.subsystems.LEDSubsystem;

public class DafaultLEDCommand extends LoggingCommandBase {

    // private final LEDSubsystem ledSubsystem;
    private final XboxController driverController;
    private final LEDSubsystem   ledSubsystem;

    /**
     * Creates a new ExampleCommand.
     *
     * @param armSubsystem The subsystem used by this command.
     */
    public DafaultLEDCommand(GameController driverController,
        LEDSubsystem ledSubsystem) {

        this.driverController = driverController;
        this.ledSubsystem     = ledSubsystem;

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
        boolean RB = driverController.getLeftBumper();
        boolean LB = driverController.getRightBumper();

        // if (LB)
        // for(int i = 0; i <
        // ledSubsystem.setHSV();

    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        // The default drive command never ends, but can be interrupted by other commands.
        return false;
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        logCommandEnd(interrupted);
    }
}