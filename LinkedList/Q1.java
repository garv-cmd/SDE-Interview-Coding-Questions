package LinkedList;
// Reverse a LinkedList
//HackerRank ->
public class Q1 {
public static void main(String args[]){
    //Solution ->
    /*
    *  static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head==null){
            return head;
        }
        Stack<Integer> stack = new Stack<>();
        SinglyLinkedListNode temp = head;
        while(temp!=null){
            stack.push(temp.data);
            temp = temp.next;
        }
        SinglyLinkedListNode ret = head;
        while(head!=null){
            head.data = stack.pop();
            head = head.next;
        }
        return ret;

    }
    * */
}

}