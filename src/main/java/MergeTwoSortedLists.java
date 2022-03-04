//You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//Return the head of the merged linked list.

public class MergeTwoSortedLists {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    if (list1==null) {
      return list2;
    } else if (list2 == null) {
      return list1;
    }

    ListNode sorted = new ListNode();
    ListNode head = sorted;

    while(list1 !=null || list2 != null) {

      if(list1== null) {
        sorted.next = list2;
        sorted = sorted.next;
        list2 = list2.next;
        continue;
      }
      if (list2 == null) {
        sorted.next = list1;
        sorted = sorted.next;
        list1 = list1.next;
        continue;
      }
      if (list1.val <= list2.val) {
        sorted.next = list1;
        sorted = sorted.next;
        list1 = list1.next;
      } else {
        sorted.next = list2;
        sorted = sorted.next;
        list2 = list2.next;
      }
    }

    return head.next;
  }
}
