import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    Sorting sorting = new Sorting();

    @Test
    public void sortsArrayWithDuplicates() {
        int[] array = {-7,99,0,0,0,5,7,3,5,8,24,38,21};
        int[] expectedArray = {-7, 0, 0, 0, 3, 5, 5, 7, 8, 21, 24, 38, 99};
        sorting.insertionSort3(array);
        assertArrayEquals(expectedArray,array);
    }

}