package Leetcode.Medium;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class Removenthnode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode fastp = head; //start at position 1 and then traverse the list n times
        ListNode slowp = dummyhead;
        
        //traverse through the list so that you can get fast p
        //to position n+1
        //if(dummyhead.next == null)
            //dummyhead = dummyhead.next;
        
        for(int i=0; i < n; i++){ //think about this, technically u do
            //start from position 0
          if(fastp != null)
             fastp= fastp.next;
         }
        //now I need slowp to be at position n-1
        while(fastp != null){
            fastp = fastp.next;
            slowp = slowp.next; //slow needs to be at the n-1 position so start it at an earlier spot than fastp which traverses the list n times.
        }
        //need to handle edge cases
           
        slowp.next = slowp.next.next;
         
            
    return dummyhead.next; //Gets rid of the extra appended node
  }
}
