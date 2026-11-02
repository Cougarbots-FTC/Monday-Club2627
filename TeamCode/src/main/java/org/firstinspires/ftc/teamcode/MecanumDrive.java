package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;

public class MecanumDrive {

    private final DcMotor frontLeft, Frontright;

    private final Gamepad driver1, driver2;

    private double speed = 1;

    public MecanumDrive(OpMode mode){
        driver1 = mode.gamepad1;
        driver2 = mode.gamepad2;
    }

}
