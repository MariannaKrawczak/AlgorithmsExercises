import java.util.HashMap;
import java.util.Map;

public class Recurrency {

  //Input: n = 3
  //Output: 3
  //Explanation: There are three ways to climb to the top.
  //1. 1 step + 1 step + 1 step
  //2. 1 step + 2 steps
  //3. 2 steps + 1 step

  Map<Integer,Integer> steps = new HashMap<>();
  public int climbStairs(int n) {
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    if (steps.containsKey(n)) {
      return steps.get(n);
    }
    int result = climbStairs(n-1) + climbStairs(n-2);
    steps.put(n,result);
    return result;

  }
  }
