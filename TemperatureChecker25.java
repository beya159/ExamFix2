import java.util.ArrayList;
/**
 * Write a description of class TemperatureChecker25 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TemperatureChecker25
{
    // instance variables - replace the example below with your own
    private int x;
    
    /**
     * Constructor for objects of class TemperatureChecker25
     */
    public TemperatureChecker25()
    {
        // initialise instance variables
        x = 0;
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
    temperatures.add(37.2);
    temperatures.add(32.5);
    temperatures.add(37.0);
    temperatures.add(35.0);
    }
}
