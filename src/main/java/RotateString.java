//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//
//A shift on s consists of moving the leftmost character of s to the rightmost position.
//
//For example, if s = "abcde", then it will be "bcdea" after one shift.

import java.util.Arrays;

/**
 * Example 1:
 * <p>
 * Input: s = "abcde", goal = "cdeab"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "abcde", goal = "abced"
 * Output: false
 */

public class RotateString {
  public boolean rotateString(String s, String goal) {

    if (s == null || goal == null) {
      return false;
    }
    if (s.equals(goal)) {
      return true;
    }

    if (s.length() != goal.length()) {
      return false;
    }

    for (int i = 0; i < s.length(); i++) {
      if (s.equals(goal)) {
        return true;
      } else {
        s = new StringBuilder(s).append(s.charAt(0)).deleteCharAt(0).toString();
      }
    }

    return false;
  }
}
