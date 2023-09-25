public class AddLinkLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    //2. Add two Numbers
    //You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
    // and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode (0);
            ListNode temp = result;
            int carry = 0;

            while(l1!=null||l2!=null){
                int l1Val = (l1 != null) ? l1.val: 0;
                int l2Val = (l2 != null) ? l2.val: 0;

                int currentSum = l1Val + l2Val + carry;
                // 10/10 = 1
                carry = currentSum/10;
                //10%10 = 0
                int lastDigit = currentSum%10;

                ListNode newNode = new ListNode(lastDigit);
                temp.next = newNode;

                if (l1 != null) l1= l1.next;
                if (l2 != null) l2 = l2.next;
                temp = temp.next;
            }

            if (carry>0){
                ListNode newNode = new ListNode (carry);
                temp.next = newNode;
                temp = temp.next;
            }
            return result.next;
        }
    }




}
