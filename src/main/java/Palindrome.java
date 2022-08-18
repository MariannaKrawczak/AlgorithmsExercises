import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {

//    input "kayak"
//    input "cat"

    public boolean isPalindrome(String wordToCheck) {

       String word = wordToCheck.toLowerCase();
        int i = 0;
        int j = j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) == word.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isNumberPalindrome(int number) {
        String numberAsString = Integer.toString(number);
        int i = 0;
        int j = j = numberAsString.length() - 1;
        while (i < j) {
            if (numberAsString.charAt(i) == numberAsString.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
         }
    public boolean isNumberPalindromeWithoutConverting(int number) {

        if (number<0) {
            return false;
        }

        int temp = number;
        List<Integer> digits = new ArrayList<>();
        while (temp>0) {
            digits.add(temp%10);
            temp /= 10;
        }

        int i = 0;
        int j = digits.size() -1 -i;

        while (j>i) {
            if (digits.get(i) == digits.get(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
    public boolean isNumberPalindromeWithoutConverting2(int number) {

        if (number<0) {
            return false;
        }
        int temp = number;
        int reversed = 0;

        while (temp>0) {
            reversed = reversed *10 + temp%10;
            temp /= 10;
        }
        return reversed == number;
    }

    public boolean isPalindromeInterview(String s) {
        for (int i =1;i<s.length();i++) {
            if (s.charAt(i-1) != s.charAt(s.length()-i)) {
                return false;
            }
        }
        return true;
    }
    }

