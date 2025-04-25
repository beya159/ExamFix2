import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class WholeTemperatureCheckerFix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WholeTemperatureCheckerFix
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class WholeTemperatureCheckerFix
     */
    public WholeTemperatureCheckerFix()
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
    

    public static void
    checkTemperatures (ArrayList<Double>temperatures){
        int feverCount = 0;
        double maxTemp = temperatures.get(0);
        for (double temp : temperatures){
            if (temp>37.5){
            feverCount++;
        }
            if (temp>maxTemp){
            maxTemp=temp;
        }
            System.out.println("Number of fever temperatures:" + feverCount);
            System.out.println("Maximum temperature recorded:" + maxTemp);
    }
    // Question 26
    System.out.println("Max element: " + Collections.max(temperatures));
    
    // Question 27
    Collections.sort(temperatures);
    System.out.println("Max elements (sorted list)" + temperatures.getLast());
    }
}
