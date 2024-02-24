
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

}

public class LeetCode2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode();


        

        return node;
        
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(0);
        root.next.next = new ListNode(2);
        root.next.next.next = new ListNode(2);

        ListNode root2 = new ListNode(0);
        root2.next = new ListNode(2);
        root2.next.next = new ListNode(8);
        root2.next.next.next = new ListNode(1);

    }
}
