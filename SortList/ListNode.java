public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        if (next!=null) {
            String nextString = next.toString();
            return val + "," + nextString ;
        }
        else {
            return String.valueOf(val);
        }
    }


    public static ListNode getInputData() {
        return new ListNode(
                4, new ListNode(2,
                new ListNode(1,
                        new ListNode(3)))
        );
    }
}
