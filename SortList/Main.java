
public class Main {


    static void main() {
        ListNode head = ListNode.getInputData();

        System.out.println(head);

        boolean sorted = false;
        while (!sorted) {
            boolean changed = false;
            ListNode temp = head;
            ListNode previous = null;
            while (temp.next != null) {
                int val = temp.val;
                int nextVal = temp.next.val;
                if (val>nextVal){
                    ListNode x = temp.next;
                    temp.next = x.next;
                    x.next = temp;
                    temp = x;
                    if (previous == null){
                        head = x;
                    }else {
                        previous.next = temp;
                    }
                    changed = true;
                }
                previous = temp;
                temp = temp.next;

            }
            if (!changed){
                sorted = true;
            }
        }
        System.out.println(head);

    }

}
