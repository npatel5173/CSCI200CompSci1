public class StepCounter
{
    //add convertToMiles method here
    public static double convertToMiles(int steps){
        return (double) steps / 2000;
    }
    public static void main(String[] args)
    {
       System.out.println("500 steps is equal to " + convertToMiles(500) + " miles");
       //add 3 more method calls here for 2000, 3000 and 12750 steps.
      System.out.println("2000 steps is equal to " + convertToMiles(2000) + " miles");
      System.out.println("3000 steps is equal to " + convertToMiles(3000) + " miles");
      System.out.println("12750 steps is equal to " + convertToMiles(12750) + " miles");
    }
}