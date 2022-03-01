import java.util.Arrays;

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class TwoIntsSumResultTarget {
  public int[] twoSum(int[] nums, int target) {

    //HashMap

//    int firstIndex = nums[0];

    for (int firstIndex = 0; firstIndex < nums.length; firstIndex++) {
      for (int secondIndex  = firstIndex+ 1; secondIndex < nums.length; secondIndex++) {
        if (nums[firstIndex] + nums[secondIndex] == target) {
          return new int[] {firstIndex,secondIndex};
        }
      }
    }
    return null;
  }

}
