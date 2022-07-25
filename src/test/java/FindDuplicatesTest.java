import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicatesTest {

    FindDuplicates findDuplicates = new FindDuplicates();

    @Test
    void returnsEmptyListWhenGivenArrayWithoutDuplicates() {
        int [] noDuplicatesArray = {3,6,7,4,8,5};
        assertEquals(List.of(),findDuplicates.findDuplicatesSimpleApproach(noDuplicatesArray));
    }

    @Test
    void returnsDuplicatesWhenGivenPositiveNumbers() {
        int [] numbers = {4,7,8,3,4,4,4,7,5,0};
        List<Integer> expectedDuplicates = Arrays.asList(4,7);
        assertEquals(expectedDuplicates,findDuplicates.findDuplicatesMapApproach(numbers));
    }

    @Test
    void returnsDuplicatesWhenGivenNegativeNumbers() {
        int[] numbers = {-1,-7,-7,-5,-10,-1,-3};
        assertEquals(List.of(-1,-7), findDuplicates.findDuplicatesMapApproach(numbers));
    }

    @Test
    void returnsSingleElementListWhenGivenDuplicatedNumberArray() {
        int[] numbers = {6,6,6,6,6,6,6,6};
        assertEquals(List.of(6), findDuplicates.findDuplicatesSimpleApproach(numbers));
    }

}