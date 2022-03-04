//Given the head of a singly linked list, reverse the list, and return the reversed list.


import java.util.*;
import java.util.stream.Collectors;

/**Input: head = [1,2,3,4,5]
  Output: [5,4,3,2,1]
 */

public class ReverseLinkedList {


  public ListNode reverseListIterative(ListNode head) {

    ListNode previous = null;
    ListNode current = head;
    ListNode next = null;

    while (current != null) {

      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }

    return previous;
  }

  public ListNode reverseListRecursive(ListNode head) {

    if (head == null || head.next == null) return head;

    ListNode previous = reverseListRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return previous;


  }


//  ListNode previous = null;
//  ListNode current = head;
//
//    while (current != null) {
//      current.next = previous;
//      previous = current;
//      current = next;
//      }
//      return previous;

////

//  public ListNode reverseList5(ListNode head) {
//    List<ListNode> list = new ArrayList<>();
//
//    while (head.next != null) {
//      list.add(head);
//      head = head.next;
//    }
//
//
//    Collections.reverse(list);
//
//    return list.get(0);
//  }
}