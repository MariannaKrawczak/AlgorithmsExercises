import javax.persistence.criteria.CriteriaBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountMaxOccurrences {

  // input: "AbTcCbbbBowQ", output: 4
  // input: "aabb", output: 2


 public int maxLetterCount(String s) {
    // input is a string with characters from range a-zA-Z
    // return maximum number of occurrences for some letter in a given input
   Map<Character, Integer> occurrences = new HashMap<>();

   for (int i = 0; i< s.length(); i++) {
     char key = s.charAt(i);
     if (occurrences.containsKey(key)) {
       occurrences.put(key, occurrences.get(key) + 1);
     } else {
       occurrences.put(key,1);
     }
   }

   int maxCount = 0;
   char maxKey;

   for(Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
     if (entry.getValue() > maxCount) {
       maxCount = entry.getValue();
       maxKey = entry.getKey();
     }
   }
   return maxCount;
  }

}


