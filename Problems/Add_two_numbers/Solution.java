package Add_two_numbers;


public class Solution {
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        StringBuilder first = new StringBuilder();
//        StringBuilder second = new StringBuilder();
//        while (l1 != null) {
//            first.insert(0, l1.val);
//            second.insert(0, l2.val);
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//
//        String sum = "" + (Integer.parseInt(first.toString()) + Integer.parseInt(second.toString()));
//
//        ListNode previous = new ListNode(Integer.parseInt("" + sum.charAt(0)));
//        for (int i = 1; i < sum.length(); i++) {
//            ListNode node = new ListNode(Integer.parseInt("" + sum.charAt(i)));
//            node.next = previous;
//            previous = node;
//        }
//
//        return previous;
//    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode one_1 = new ListNode(2);
        ListNode one_2 = new ListNode(4);
        ListNode one_3 = new ListNode(3);
        one_1.next = one_2;
        one_2.next = one_3;

        ListNode two_1 = new ListNode(5);
        ListNode two_2 = new ListNode(6);
        ListNode two_3 = new ListNode(4);
        two_1.next = two_2;
        two_2.next = two_3;

        ListNode sum = addTwoNumbers(one_1, two_1);
        System.out.println(sum.next);

        while(sum != null){
            System.out.println(sum.val);
            sum = sum.next;
        }
    }
}
