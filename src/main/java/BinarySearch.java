public class BinarySearch {
  // input: arr = [1, 2, 3, 3, 5, 7, 7, 7, 7, 9], target = 7; output = 4
// input: arr = [1, 2, 3, 3, 5, 7, 7, 7, 7, 9], target = 8; output = 0
// input: arr = [1, 2, 3, 3, 5, 7, 7, 7, 7, 9], target = 1; output = 1

 public int numberOfOccurrences(int target, int[] arr) {
    // returns number of occurrences of target in arr or 0 if arr does not contain target

   int firstOccurrenceIndex = findFirstOccurrence(target,arr);
   int lastOccurrenceIndex = findLastOccurrence(target, arr);

   if(firstOccurrenceIndex != -1) {
     return (lastOccurrenceIndex +1 )- firstOccurrenceIndex ;
     }

    return 0;
 }

 private int findFirstOccurrence(int target, int[] arr) {

   int left = 0;
   int right = arr.length -1;
   int index = -1;

   while (left <= right) {

     int mid = left + (right - left) / 2;

     if (arr[mid] == target) {
       index = mid;
       right = mid -1;
     } else if (arr[mid] > target) {
       right = mid -1;
     } else {
       left = mid +1;
     }
   }

   return index;
 }

 private int findLastOccurrence(int target, int[] arr) {

   int left = 0;
   int right = arr.length -1;
   int index = -1;

   while (left <= right) {
     int mid = left + (right - left) / 2;

     if (arr[mid] == target) {
       index = mid;
       left = mid +1;
     } else if (arr[mid] > target) {
       right = mid -1;
     } else {
       left = mid +1;
     }
   }
   return index;
 }




}
