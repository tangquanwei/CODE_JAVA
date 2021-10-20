package algorithms;

import org.junit.Test;

public class TestList {
    @Test
    public void testReverseRecursive() {
        LinkedList l1 = new LinkedList(1, 2, 3, 4, 5, 6, 7, 8);
        ListNode reverse = LinkedList.reverseRecursive(l1.head);
        LinkedList.print(reverse);
    }
}
