import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k, t;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        Node head = new Node();
        head.next = null;
        while (in.hasNext()) {
            t = in.nextInt();
            if (t < 0)
                break;
            Node p = new Node();
            p.data = t;
            p.next = head.next;
            head.next = p;
        }
        in.close();
        for (int i = 0; i < k; ++i)
            head = head.next;
        if (head != null) {
            System.out.print(head.data);
        } else {
            System.out.print("NULL");
        }
    }

    static class Node {
        int data;
        Node next;
    }


}