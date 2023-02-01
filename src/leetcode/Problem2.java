package leetcode;
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

