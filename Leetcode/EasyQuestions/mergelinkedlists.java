package Leetcode.EasyQuestions;

public class mergelinkedlists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //If you are merging lists then its best to use a dummy list
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy; //head of dummy node. Reference to head of new list.
        while(list1 != null && list2 != null){
            //compare the values in the list
            if(list1.val < list2.val){
                dummy.next = list1; //technically we are appeneding the whole list
                list1 = list1.next; //but we change the next reference depending on the comparison
            }
            else{
                dummy.next = list2;
                list2 = list2.next;
            }
           dummy = dummy.next; //move
        }
        //append after the while loop if the list1 != null or list2!= null
        //dummy.next = list1; or list2 appeneding the rest of their lists if they aren't null
        if(list1 != null){
            dummy.next = list1;
        }
        else{
            dummy.next = list2;
        }
      return head.next;
    }
    //This is the same concept as the mergearrays problem
    //create another list and then add to that list depending on the comparison. BOOM
}
