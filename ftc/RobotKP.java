package ftc;

/* Copy of the HardwarePushBot class, customized to the hardware Kernel Panic uses
 * Created by howard on 12/23/17.
 */


class RobotKP
{
    // Define and Initialize Servos
    GyroSensor  gyro           = new GyroSensor();
    //private TouchSensor extensionTouch = null
    Servo       leftClamp      = new Servo();
    Servo       rightClamp     = new Servo();
    DcMotor     leftDrive      = new DcMotor();
    DcMotor     rightDrive     = new DcMotor();
    DcMotor     liftMotor      = new DcMotor();
    DcMotor     leftRear       = new DcMotor();
    DcMotor     rightRear      = new DcMotor();

    static final long CLAMP_TIME = 1;
    static final long MINOR_FRAME = 1;
    static final long TELEMETRY_PERIOD = 1000;

    /* Initialize standard Hardware interfaces */
    void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
      /*  gyro = ahwMap.get(GyroSensor.class, "gyro");
        rightClamp = ahwMap.get(Servo.class, "right_clamp");
        leftClamp = ahwMap.get(Servo.class, "left_clamp");

        //Define and Initialize Sensors
        //extensionTouch = ahwMap.get(TouchSensor.class, "ext_touch")

        // Define and Initialize Motors
        leftDrive  = ahwMap.get(DcMotor.class, "left_drive");
        rightDrive = ahwMap.get(DcMotor.class, "right_drive");
        leftRear  = ahwMap.get(DcMotor.class, "left_rear");
        rightRear = ahwMap.get(DcMotor.class, "right_rear");
        liftMotor = ahwMap.get(DcMotor.class, "lift_motor");*/

       /* leftDrive.setDirection(DcMotor.Direction.FORWARD); //Set to REVERSE if using AndyMark motors
        rightDrive.setDirection(DcMotor.Direction.REVERSE);//Set to FORWARD if using AndyMark motors
        leftRear.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        rightRear.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
        liftMotor.setDirection(DcMotor.Direction.FORWARD);
        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftRear.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightRear.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        liftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);*/

        // Set all motors to zero power
        leftDrive.setPower(0);
        rightDrive.setPower(0);
        leftRear.setPower(0);
        rightRear.setPower(0);
        liftMotor.setPower(0);
    }
}
