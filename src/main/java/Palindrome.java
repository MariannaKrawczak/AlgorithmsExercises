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
}
