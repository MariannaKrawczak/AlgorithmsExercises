public class Sorting {

//    input [3,-5,11,18,0,-9,2,2,0,]
    // [1,2,3,8,9,6,5]

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

    public void insertionSort2(int[] arr) {
        int n = arr.length;;
        int current;
        int otherIndex;

        for (int i = 1; i<n; i++) {
            current = arr[i];
            otherIndex = i;
            while (otherIndex > 0 && current < arr[otherIndex - 1]) {
                 arr[otherIndex] = arr[otherIndex - 1];
                 otherIndex--;
            }
            arr[otherIndex] = current;
        }
    }

    public void insertionSort3(int[] array) {
        // [1,2,3,8,9,6,5]
        for (int i = 1; i< array.length; i++) {
            int current = array[i];
            int otherIndex = i-1;
            while(otherIndex>=0 && current < array[otherIndex]) {
                array[otherIndex +1] = array[otherIndex];
                otherIndex--;
            }
            array[otherIndex+1] = current;
        }
    }
}
