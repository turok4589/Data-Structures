package Leetcode.EasyQuestions;

public class reverselinkedlist {
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
    //your setting the reference to the nextnode to the previous
    //So think you are changing the nextnode to the previous
}
