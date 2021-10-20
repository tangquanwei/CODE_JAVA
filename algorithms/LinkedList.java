package algorithms;

import java.util.PriorityQueue;

class ListNode {
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
}

public class LinkedList {

    ListNode head;

    public LinkedList() {
        head = new ListNode();
    }

    public LinkedList(int... is) {
        head = new ListNode(is[0]);
        for (int i = is.length - 1; i > 0; --i) {
            ListNode p = new ListNode(is[i]);
            p.next = head.next;
            head.next = p;
        }
    }

    public void print() {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val);
            if (p.next != null) {
                System.out.print(" -> ");
                p = p.next;
            } else
                break;
        }
    }

    public static void print(ListNode node) {
        ListNode p = node;
        while (p != null) {
            System.out.print(p.val);
            if (p.next != null) {
                System.out.print(" -> ");
                p = p.next;
            } else
                break;
        }
    }

    /**
     * 合并 k 个有序链表 使用 优先级队列（二叉堆）
     * 
     * @param lists
     * @return
     */
    ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        // 虚拟头结点
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        // 优先级队列，最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> (a.val - b.val));
        // 将 k 个链表的头结点加入最小堆
        for (ListNode head : lists) {
            if (head != null)
                pq.add(head);
        }

        while (!pq.isEmpty()) {
            // 获取最小节点，接到结果链表中
            ListNode node = pq.poll();
            p.next = node;
            if (node.next != null) {
                pq.add(node.next);
            }
            // p 指针不断前进
            p = p.next;
        }
        return dummy.next;
    }

    // 返回链表的倒数第 k 个节点
    ListNode findFromEnd(ListNode head, int k) {
        ListNode p1 = head;
        // p1 先走 k 步
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        ListNode p2 = head;
        // p1 和 p2 同时走 n - k 步
        while (p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        // p2 现在指向第 n - k 个节点
        return p2;
    }

    /**
     * 删除链表的倒数第 N 个结点
     * 
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 虚拟头结点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 删除倒数第 n 个，要先找倒数第 n + 1 个节点
        ListNode x = findFromEnd(dummy, n + 1);
        // 删掉倒数第 n 个节点
        x.next = x.next.next;
        return dummy.next;
    }

    /**
     * 单链表的中点
     */
    ListNode middleNode(ListNode head) {
        // 快慢指针初始化指向 head
        ListNode slow = head, fast = head;
        // 快指针走到末尾时停止
        while (fast != null && fast.next != null) {
            // 慢指针走一步，快指针走两步
            slow = slow.next;
            fast = fast.next.next;
        }
        // 慢指针指向中点
        return slow;
    }

    /**
     * 判断链表是否包含环
     * 
     * @param head
     * @return
     */
    boolean hasCycle(ListNode head) {
        // 快慢指针初始化指向 head
        ListNode slow = head, fast = head;
        // 快指针走到末尾时停止
        while (fast != null && fast.next != null) {
            // 慢指针走一步，快指针走两步
            slow = slow.next;
            fast = fast.next.next;
            // 快慢指针相遇，说明含有环
            if (slow == fast) {
                return true;
            }
        }
        // 不包含环
        return false;
    }

    /**
     * 计算这个环的起点
     */
    ListNode detectCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                break;
        }
        // 上面的代码类似 hasCycle 函数
        if (fast == null || fast.next == null) {
            // fast 遇到空指针说明没有环
            return null;
        }

        // 重新指向头结点
        slow = head;
        // 快慢指针同步前进，相交点就是环起点
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 两个链表是否相交
     * 
     * 让 p1 遍历完链表 A 之后开始遍历链表 B，
     * 
     * 让 p2 遍历完链表 B 之后开始遍历链表 A，
     * 
     * 这样相当于「逻辑上」两条链表接在了一起
     */
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // p1 指向 A 链表头结点，p2 指向 B 链表头结点
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            // p1 走一步，如果走到 A 链表末尾，转到 B 链表
            if (p1 == null)
                p1 = headB;
            else
                p1 = p1.next;
            // p2 走一步，如果走到 B 链表末尾，转到 A 链表
            if (p2 == null)
                p2 = headA;
            else
                p2 = p2.next;
        }
        return p1;
    }

    public static ListNode reverseRecursive(ListNode head) {
        if (head.next == null)
            return head;
        ListNode last = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    public static void main(String[] args) {
        
    }

}
