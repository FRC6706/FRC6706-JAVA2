package org.usfirst.frc.team6706.robot.commands;

import org.usfirst.frc.team6706.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopGetBallCommand extends Command {

    public StopGetBallCommand() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.getball);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.getball.setspeed(0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.castball.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
