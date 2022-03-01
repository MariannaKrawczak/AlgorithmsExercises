//You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
//
//Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
//
//You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

import java.util.Arrays;

/**
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.
 * Example 2:
 * <p>
 * Input: n = 1, bad = 1
 * Output: 1
 */

public class FirstBadVersion {


  public int firstBadVersion3(int n) {

    int left = 1;
    int right = n;
    int badVersion = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (isBadVersion(mid)) {
        badVersion = mid;
        right = mid - 1;
      } else if (!isBadVersion(mid)) {
        left = mid + 1;
      }
    }

    return badVersion;
  }

  public int firstBadVersion2(int n) {
    int[] versions = new int[n];

    for (int i = 0; i < n; i++) {
      versions[i] = i + 1;
    }

    int left = 0;
    int right = versions.length - 1;
    int index = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (isBadVersion(versions[mid]) == true) {
        index = mid;
        right = mid - 1;
      } else if (isBadVersion(versions[mid]) != true) {
        left = versions[mid];
      }
    }

    return versions[index];
  }

  public int firstBadVersion1(int n) {
    for (int i = 0; i < n; i++) {
      if (isBadVersion(i) != false) {
        return i;
      }
    }
    return n;
  }

  public boolean isBadVersion(int version) {
    int badVersion = 4;
    return badVersion == version;
  }


}
