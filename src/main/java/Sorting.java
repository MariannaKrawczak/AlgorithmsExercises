public class Sorting {

//    input [3,-5,11,18,0,-9,2,2,0,]

    public void insertionSort(int[] arrayToSort) {

        for (int i = 1;i< arrayToSort.length;i++) {
            int current = arrayToSort[i];
            int j = i-1;
            while (j >= 0 && arrayToSort[j]>current) {
                arrayToSort[j+1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j+1] = current;
        }
    }

}
