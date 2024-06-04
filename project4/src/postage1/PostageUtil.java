package postage1;
import java.lang.Math;
import java.util.Scanner;
public class PostageUtil
{
  /**
   * Returns the cost of postage for a letter of the given weight.
   * @param weight
   *   given weight in ounces
   * @return
   *   cost of postage for the weight
   */
  public static double computePostage(double weight)
  {
	/*Scanner weight = new Scanner(System.in);
	weight.nextDouble();*/
	double cost;
    if(weight <= 1.0)
    {
    	cost = 0.47;
    }
    else if(weight <=3.5)
    {
    	cost = 0.47 + Math.ceil(weight - 1.0) * 0.21;
    }
    else
    {
    	cost = 0.94 + Math.ceil(weight - 1.0) * 0.21;
    }
    return cost;
  }
}
