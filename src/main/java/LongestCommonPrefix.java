//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/** Example 1:

 Input: strs = ["flower","flow","flight"]
 Output: "fl"
 Example 2:

 Input: strs = ["dog","racecar","car"]
 Output: ""
 Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {

    if (strs == null || strs.length == 0 ) {
      return "";
    }

    String shortestString  = Arrays.stream(strs).min((e2, e1) -> e1.length() > e2.length() ? -1 : 1).get();

    for (int j = 0; j < shortestString.length(); j++) {
      for (String str : strs) {
        if (str.charAt(j) != strs[0].charAt(j)) {
          return str.substring(0, j);
        }
      }
    }
  return shortestString;
  }
}



