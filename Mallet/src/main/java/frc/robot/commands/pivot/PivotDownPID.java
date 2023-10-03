package frc.robot.commands.pivot;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PivotSubPID;


public class PivotDownPID extends CommandBase{

    // Required Subsystem of pivot motor
    private PivotSubPID m_pivot;

    public PivotDownPID(PivotSubPID pivot){        
        m_pivot = pivot;
        addRequirements(m_pivot);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs while the command is scheduled.
    // Tells the pivot motor to go up
    @Override
    public void execute() {
        m_pivot.changeAngle(-.7);
    }

    // Called once the command ends or is interrupted.
    // Tells the pivot motor to Stop
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
