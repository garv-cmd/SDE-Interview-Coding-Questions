package LinkedList;
//Remove N-th node from back of LinkedList
//LEETCODE ->19
public class Q4 {
    /*
    *  public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 1;
        if(head == null){
            return head;
        }
        if(head.next == null && n==1){
            head = null;
            return head;
        }
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        int res = len-n-1;

        if(res==0){
            head = head.next;
            return head;
        }
        int k=1;
        ListNode t = head;
        while(k++!=res){
            t = t.next;
        }
        t.next = t.next.next;
        return head;
    }
    *
    * */
}
