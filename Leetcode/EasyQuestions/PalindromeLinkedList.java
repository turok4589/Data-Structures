package Leetcode.EasyQuestions;
//Can't have two public clases in one file.
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next; //moving twice as fast
            slow = slow.next; //gonna land somewhere in the middle
        }
        //set fast back to the head pointer
        fast = head;
        slow = reverseList(slow); //reverse the middle of the list.
        //can't reverse the whole list because we need to keep our pointers pointed at the right spots.
        //if we reverse the whole list then fast will always point to the end because we changed the head.
        //This is bad because we can't go in reverse when it comes to a linked list.
        //Because we changed the whole list in memory.
        while(slow != null && fast != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
      return true;
    }
    
    public ListNode reverseList(ListNode head) {
        //Different approach we are going to start with prev equal to null
        //and we move head.next to previous
        ListNode dummy = head;
        ListNode prev = null;
        int preval = 0;
        while(head != null){
            dummy = head.next; //points to the next item in list
            head.next = prev; //next head points to previous
            prev = head; //previous now points to the head node
            head = dummy;
    }
    return prev;
}
   public boolean useStack(ListNode head){
     return true;
   }
}
