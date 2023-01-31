/**
2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */

package leetcode;
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
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public void insert(int val){
        if(this.val==0){
            this.val=val;
        }else{
            ListNode root=this;
            while(root.next!=null)
                root=root.next;
            root.next=new ListNode(val);
        }
    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode tail=null;
        int val=0;
        while(l1!=null && l2!=null){
            val+=l1.val+l2.val;
            if(head==null){
                head=new ListNode(val%10);
                tail=head;
            }else{
                tail.next=new ListNode(val%10);
                tail=tail.next;
            }
            l1=l1.next;
            l2=l2.next;
            val/=10;
        }
        while(l1!=null){
            val+=l1.val;
            l1=l1.next;
            tail.next=new ListNode(val%10);
            tail=tail.next;
            val/=10;
        }
        while(l2!=null){
            val+=l2.val;
            l2=l2.next;
            tail.next=new ListNode(val%10);
            tail=tail.next;
            val/=10;
        }
        if(val!=0)
            tail.next=new ListNode(val%10);
        return head;
    }
}
class Problem2 {
    public static void main(String[] args) {
        Solution s=new Solution();
        int a[]={1,2,3};
        int b[]={4,5,6};
        ListNode l1=new ListNode();
        ListNode l2=new ListNode();
        for(int i=0;i<3;i++){
            l1.insert(a[i]);
            l2.insert(b[i]);
        }
        ListNode res=s.addTwoNumbers(l1,l2);
        while(res!=null){
            System.out.println(l1.val);
            l1=l1.next;
        }
    }
}
