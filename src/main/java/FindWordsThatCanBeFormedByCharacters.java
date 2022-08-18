import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters {

//    Input: words = ["cat","bt","hat","tree"], chars = "atach"
//Output: 6
//Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

    public int countCharacters(String[] words, String chars) {

        int sumOfLengths = 0;
        Map<Character, Integer> charsAmounts = new HashMap<>();

        for (int i = 0; i<chars.length(); i++) {
            char current = chars.charAt(i);
            if (charsAmounts.containsKey(current)) {
                charsAmounts.put(current, charsAmounts.get(current)+1);
            } else {
                charsAmounts.put(current,1);
            }
        }

        for ( String word:words) {
            if (isWordGood(word,new HashMap<>(charsAmounts))) {
                sumOfLengths += word.length();
            }
            }
        return sumOfLengths;
    }

    private boolean isWordGood(String word, Map<Character,Integer> charsAmounts) {

        for (int i = 0; i< word.length(); i++) {
            char current = word.charAt(i);
            if (charsAmounts.containsKey(current) && charsAmounts.get(current) > 1) {
                charsAmounts.put(current, charsAmounts.get(current) - 1);
            } else if (charsAmounts.containsKey(current)) {
                charsAmounts.remove(current);
            } else {
                return false;
            }
        }
        return true;
    }
}
