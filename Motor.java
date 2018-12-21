/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3926.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Motor extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	Talon m = new Talon(0);
	private static Motor instance;
	
	public static Motor getInstance(){
		if(instance == null) {
			instance = new Motor();
		}
		return instance;
	}

	public void setSpeed(double speed) {
		m.set(speed);
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
