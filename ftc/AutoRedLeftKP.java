package ftc;



/* *
 * Created by Columbus FTC Robotics on 11/19/17.
 * Concept by Howard
 * First Coding by Jeffrey and Alexis
 */


public class AutoRedLeftKP {

    public static void runOpMode() {
        Structures as = new Structures();
        RobotKP robot   = new RobotKP();   // Use a Pushbot's hardware

        // constants for clamp & un-clamp, lift up and move lifter down.
        // should be in Structures, but placed here for easier reference.
        final int CL = 1;
        final int UC = -1;
        final int UP = 1;
        //final float DN = -1

        // states for the NAV switch statement
        final int CLM = 0; // clamp: uses clamping, power, timeLim
        final int MOV = 2; // move: compass, forward, crab, power, timeLim
        final int LFT = 3; // lifter: uses lifter, power, timeLim
        final int WT = 4;  // wait: uses timeLim

        int[] action =   {CLM,  LFT, MOV,  MOV,  CLM,  MOV,  WT};
        int[] clamping = { CL,    0,   0,    0,   UC,    0,   0};
        int[] lifter =   {  0,   UP,   0,    0,    0,    0,   0};

        int[] compass =  {  0,    0,   0,   90,    0,    0,   0};
        float[] forward = { 0,    0,   0,    0,    0,    0,   0};
        float[] crab =   {  0,    0,   0,    0,    0,    0,   0};
        float[] power =  {  0,   25,   0,   30,    0,   25,   0};

        long[] timeLim = {3, 2, 9,  3, 1, 2, 5};
        // ideally, sum of times would be <= 30000

        // copy the local declarations of the arrays into the ones we'll use
        // when we invoke the autonomous methods.
        as.mode = action;
        as.clamp = clamping;
        as.heading = compass;
        as.vCrab = crab;
        as.vFwd = forward;
        as.vLift = lifter;
        as.vPwr = power;
        as.dur = timeLim;

        // init hardware map, then wait for start
        //robot.init(hardwareMap);
        //waitForStart();

        // call the common code
        KPAutoCommon.autoTasks(robot, as);
    }

}
