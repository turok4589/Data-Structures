package Leetcode.EasyQuestions;

public class Deletenode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; //put the next value in
        //then you need to get rid of that value.
        node.next = node.next.next;
     }
     //This was a bit weird because usually you have the head of the list, but it makes sense.
     //personally i think this question is stupid as its not traditionally how you delete a node
     //you are passed the node you need to delete
     //typically you need the node before to delete but in this case we can just replace the current nodes value with the next nodes value and then change
     //the next reference to the one after the next node. AKA .NEXT.NEXT
}
