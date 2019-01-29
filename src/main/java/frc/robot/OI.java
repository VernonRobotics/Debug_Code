/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public Joystick rightJoystick = new Joystick(0);

  public Button motor1 = new JoystickButton(rightJoystick, 7);
  public Button motor2 = new JoystickButton(rightJoystick, 8);
  public Button motor3 = new JoystickButton(rightJoystick, 9);
  public Button motor4 = new JoystickButton(rightJoystick, 10);


  public OI() {
    motor1.whileHeld(new TestMotorCommand(RobotMap.motor1, .9));
    motor2.whileHeld(new TestMotorCommand(RobotMap.motor2, .9));
    motor3.whileHeld(new TestMotorCommand(RobotMap.motor3, .9));
    motor4.whileHeld(new TestMotorCommand(RobotMap.motor4, .9));

  }

}
