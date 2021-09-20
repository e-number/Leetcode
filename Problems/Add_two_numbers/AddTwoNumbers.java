package Add_two_numbers;


public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String first = "";
        String second = "";
        while (l1 != null) {
            first = l1.val + first;
            second = l2.val + second;
            l1 = l1.next;
            l2 = l2.next;
        }

        String sum = "" + (Integer.parseInt(first.toString()) + Integer.parseInt(second.toString()));

        ListNode previous = new ListNode(Integer.parseInt("" + sum.charAt(0)));
        for (int i = 1; i < sum.length(); i++) {
            ListNode node = new ListNode(Integer.parseInt("" + sum.charAt(i)));
            node.next = previous;
            previous = node;
        }

        return previous;
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
