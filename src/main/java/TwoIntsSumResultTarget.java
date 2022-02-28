public class TwoIntsSumResultTarget {
  public int[] twoSum(int[] nums, int target) {

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
