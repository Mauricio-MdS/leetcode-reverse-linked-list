class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode previousNode = null;

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = previousNode;
            previousNode = head;
            head = nextNode;
        }
        return previousNode;
    }
}