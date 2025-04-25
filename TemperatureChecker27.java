import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class TemperatureChecker27 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TemperatureChecker27
{
    // instance variables - replace the example below with your own
    private int x;

    public static double
    getMaxTemperatures (ArrayList<Double> temperatures){
        Collections.sort(temperatures);
        return
        temperatures.get(temperatures.size()-1);
    }
    /**
     * Constructor for objects of class TemperatureChecker27
     */
    public TemperatureChecker27()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
