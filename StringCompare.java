
/**
 * Write a description of class StringCompare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringCompare
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main (String[] args)
    {
        //a)  Declare and assign values
        String str1 = "hello";
        String str2 = "hello";
        //b) Test if they are equal
        if (str1.equals(str2)){
            System.out.println("The Strings are equal.");
        }
        else{
         //c) if not equal
         System.out.println("The Strings are not equal.");
        }
    }
    
    /**
     * Constructor for objects of class StringCompare
     */
    public StringCompare()
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
