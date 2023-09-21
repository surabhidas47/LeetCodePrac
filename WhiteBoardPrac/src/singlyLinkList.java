public class singlyLinkList {

//You are given the heads of two sorted linked lists list1 and list2.
//
//    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//    Return the head of the merged linked list.

//    Input: list1 = [1,2,4], list2 = [1,3,4]
//    Output: [1,1,2,3,4,4]




    //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode temp = new ListNode(0);
            //points to the temp
            ListNode current =temp;

            while(list1!=null && list2!=null){
                if(list1.val<=list2.val){
                    //
                    current.next=list1;
                    //moving the pointer down one
                    list1=list1.next;
                } else {
                    //is list2 head is smaller
                    current.next=list2;
                    list2=list2.next;
                }
                //also have to move pointer down for current
                current = current.next;

            }

            //have to check if we reached end of both the lists, one may have reached null and broke out of loop

            if(list1!=null){
                current.next=list1;
                list1=list1.next;
            }

            if(list2!=null){
                current.next=list2;
                list2=list2.next;
            }
            return temp.next;


        }
    }
}
