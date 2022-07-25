import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {

    public List<Integer> findDuplicatesMapApproach(int[] numbers) {

        Map<Integer,Integer> numbersAmounts = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int number : numbers) {
            if (numbersAmounts.containsKey(number)) {
                numbersAmounts.put(number, numbersAmounts.get(number) + 1);
            } else {
                numbersAmounts.put(number, 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : numbersAmounts.entrySet()) {
            if (entry.getValue()>1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
//        return numbersAmounts.entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public List<Integer> findDuplicatesSimpleApproach(int [] numbers) {

        int numberToCheck;
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i<numbers.length-1; i++) {
            numberToCheck = numbers[i];
            for (int j = i+1; j< numbers.length;j++) {
                if (numberToCheck == numbers[j]) {
                    if (!duplicates.contains(numberToCheck)) {
                        duplicates.add(numberToCheck);}

                }
            }
        }
        return duplicates;
    }
}
