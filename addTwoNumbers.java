class Solution {
    public Node addTwoNumbers(Node head, Node head1) {

        Node dummy = new Node(0);
        Node curr = dummy;

        int carry = 0;

        while (head != null || head1 != null || carry != 0) {

            int sum = carry;

            if (head != null) {
                sum += head.data;
                head = head.next;
            }

            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }

            carry = sum / 10;

            curr.next = new Node(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }
}
