/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static CANTalon1989 motor1 = new CANTalon1989(1);
  public static CANTalon1989 motor2 = new CANTalon1989(2);
  public static CANTalon1989 motor3 = new CANTalon1989(3);
  public static CANTalon1989 motor4 = new CANTalon1989(5);
}
