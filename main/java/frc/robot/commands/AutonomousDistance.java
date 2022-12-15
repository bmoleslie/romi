// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
        new TurnDegrees(0.3, 45, drivetrain),    //to the right

        new TurnDegrees(-0.3, 90, drivetrain),     //to the left

        new TurnDegrees(0.3, 45, drivetrain),    //back to middle

        new DriveDistance(0.3, 2, drivetrain),    //take it back

        new DriveDistance(0.3, 1,drivetrain),   //back hop

        new DriveDistance(-0.3, 1,drivetrain),   //fwd  hop

        new DriveDistance(0.3, 1,drivetrain),   //back hop

        new DriveDistance(-0.3, 1,drivetrain),   //fwd  hop

        new TurnDegrees(0.4, 10, drivetrain),    //to the right

        new TurnDegrees(-0.3, 5, drivetrain),    //to the right agian

        new TurnDegrees(-0.3, 60, drivetrain),    //back to middle

        new TurnDegrees(-0.4, 10, drivetrain),     //to the left

        new TurnDegrees(0.3, 5, drivetrain),    //to the left again

        new TurnDegrees(-0.4, 300, drivetrain),     //slide to the left

        new TurnDegrees(0.4, 360, drivetrain));    //slide to the right


  }
}
