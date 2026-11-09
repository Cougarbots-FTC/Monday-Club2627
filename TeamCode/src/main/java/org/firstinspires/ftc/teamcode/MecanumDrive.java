package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumDrive {

    private final DcMotorEx front_left, front_right, back_left, back_right;

    private final Gamepad driver1, driver2;

    private double speed = 1;

    public MecanumDrive(OpMode mode) {
        driver1 = mode.gamepad1;
        driver2 = mode.gamepad2;

        HardwareMap hardwareMap = mode.hardwareMap;

        front_left = hardwareMap.get(DcMotorEx.class, "FrontLeft"); //2
        front_right = hardwareMap.get(DcMotorEx.class, "FrontRight"); //0
        back_left = hardwareMap.get(DcMotorEx.class, "BackLeft"); //1
        back_right = hardwareMap.get(DcMotorEx.class, "BackRight"); //3

        //example motor direction set
        back_left.setDirection(DcMotorEx.Direction.REVERSE);


        /*
        Pinpoints!

        GoBilda pinpoints are installed underneath the chassis and are directly connected
        to the coding used to program the robot during your 30 second Autonomous period before
        the handheld-controllor TeleOp period (2 min).
        Pinpoints help tell the program where exactly the robot is located on the field, which is
        very important for determining the code to make it move
        */

    }
}
