package ftc;

public class Range {
    static float clip (float a, float min, float max) {
    	float retVal;
    	a = (a < min)? min : a;
    	retVal = (a > max)? max : a;
    	return retVal;
    }
}
