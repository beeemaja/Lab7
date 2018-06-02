import java.util.Random;
import java.util.HashSet;
import java.util.Set;
/**
 * Write a description of class Random here.
 *
 * @author Mayya Bareeva, Huong, Omar
 * @version (a version number or a date)
 */
class RandomTester
{
    // instance variables - replace the example below with your own
    private Random random = new Random();
    private HashSet<Integer> set;
    private int[] numbers = new int[49]; //range of numbers you can get

   /**
     * Constructor for objects of class Random
     */
    public RandomTester()
    {
        set = new HashSet();
    }

    /**
     * Print out the numbers you want.
     * @param n - how many rows of  random numbers range must be printed out.
     * 
     */
    public void drawLottery(int n)
  { 
      
       for (int counter = 0; counter < n; counter++)
       {
            set.clear();
            while(set.size() < 6)
            {
                int r = random.nextInt(49) + 1;
                set.add(r);
                numbers[r-1]++; //Random number (Random) here starts with 1,
                //ends with 49. In the Arrays from 0 to 48. So Random 
                //num x in Array is x-1. x-1 is an address of the box.
                //
            }
            for(Integer output : set){
            System.out.print(output+","); 
        }
        System.out.println();
        
       }
        
  }
  
  /**
   * Expansion
   */
  public void frequences(){
    for (int i=1; i<50; i++){//i stands for the ball
        System.out.println(i + " was pulled " + numbers[i-1] + " times.");
    }
    }
  
    
}


