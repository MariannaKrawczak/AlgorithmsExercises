import java.util.Arrays;
import java.util.Collection;

public class Playground {
  public static void main(String[] args) {

//     input: "AbTcCbbbBowQ", output: 4
//     input: "aabb", output: 2
//CountMaxOccurrences countMaxOccurrences = new CountMaxOccurrences();
//    System.out.println(countMaxOccurrences.maxLetterCount("AbTcCbbbBowQ"));
//    System.out.println(countMaxOccurrences.maxLetterCount("aabb"));
//
////     input: arr = [1, 2, 3, 3, 5, 7, 7, 7, 7, 9], target = 7; output = 4
//// input: arr = [1, 2, 3, 3, 5, 7, 7, 7, 7, 9], target = 8; output = 0
//// input: arr = [1, 2, 3, 3, 5, 7, 7, 7, 7, 9], target = 1; output = 1
//
//  LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
//  String[] strings = {"a","ab"};
//
//    System.out.println(longestCommonPrefix.longestCommonPrefix(strings));

//      Palindrome palindrome = new Palindrome();
//      System.out.println(palindrome.isPalindrome("marianna"));

//      FindDuplicates findDuplicates = new FindDuplicates();
//      int [] numbers = {3,6,8,3,9,8};
//      System.out.println(findDuplicates.findDuplicatesSimpleApproach(numbers));

//      ReverseString reverseString = new ReverseString();
//      System.out.println(reverseString.reverseString2("caterpillar"));

      Sorting sorting = new Sorting();
      int[] arrayToSort = {3,-5,11,18,0,-9,2,2,0};
      sorting.insertionSort(arrayToSort);
      System.out.println(Arrays.toString(arrayToSort));
      int[] array = {-7,99,0,0,0,5,7,3,5,8,24,38,21};
      Arrays.sort(array);
      System.out.println(Arrays.toString(array));

  }
}