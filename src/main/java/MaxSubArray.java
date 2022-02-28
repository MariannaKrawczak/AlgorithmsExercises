public class MaxSubArray {

  //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
  //Output: 6
  //Explanation: [4,-1,2,1] has the largest sum = 6.

  public int maxSubArray(int[] nums) {
    int max = nums[0];

    
    for (int baseIndex = 0; baseIndex < nums.length; baseIndex++) {
      int currentSum = nums[baseIndex];
      for (int endIndex = baseIndex + 1; endIndex < nums.length; endIndex++) {
        if (currentSum > max) {
          max = currentSum;
        }
          currentSum += nums[endIndex];
      }
      if (currentSum > max) {
        max = currentSum;
      }
    }


    return max;
  }
}
