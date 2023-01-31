package leetcode;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list=null;
        ListNode tail=null;
        while(list1!=null && list2!=null){
            int val=0;
            if(list1.val<=list2.val){
                val=list1.val;
                list1=list1.next;
            }
            else if(list2.val<list1.val){
                val=list2.val;
                list2=list2.next;
            }
            if(list==null){
                list=new ListNode(val);
                tail=list;
            }else{
                tail.next=new ListNode(val);
                tail=tail.next;
            }
        }
        while(list1!=null){
            int val=list1.val;
            list1=list1.next;
            if(list==null){
                list=new ListNode(val);
                tail=list;
            }else{
                tail.next=new ListNode(val);
                tail=tail.next;
            }
        }
        while(list2!=null){
            int val=list2.val;
            list2=list2.next;
            if(list==null){
                list=new ListNode(val);
                tail=list;
            }else{
                tail.next=new ListNode(val);
                tail=tail.next;
            }
        }
        return list;
    }
}
public class Problem21 {
    
}
