// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousTime extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on time. This will drive out for a period of time, turn
   * around for time (equivalent to time to turn around) and drive forward again. This should mimic
   * driving out, turning around and driving back.
   *
   * @param drivetrain The drive subsystem on which this command will run
   */
  public AutonomousTime(Drivetrain drivetrain) {
    addCommands(
        new TurnTime(0.3, 3.5, drivetrain),
        
        new TurnTime(-0.3, 3.5, drivetrain),
        
        new TurnTime(0.3, 2.5, drivetrain),
        
        new DriveTime(0.3, 6.0, drivetrain),
      
        new DriveTime(0.3, 2.0, drivetrain),

        new DriveTime(-0.3, 2.5, drivetrain),

        new DriveTime(0.3, 2.5, drivetrain),

        new DriveTime(-0.4, 2.0, drivetrain),

        new TurnTime(0.3, 2.5, drivetrain),
        
        new TurnTime(-0.3, 3.5, drivetrain),

        new TurnTime(-0.4, 2.5, drivetrain),

        new TurnTime(0.3, 1.0, drivetrain),
        
        new TurnTime(-1.0, 1.0, drivetrain),

        new TurnTime(1.0, 1.0, drivetrain));
        


  }
}
