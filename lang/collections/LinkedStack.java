package lang.collections;

import java.util.Iterator;

/**
 * LinkedStack
 */
public class LinkedStack<Item> implements Iterable<Item> {
    private class Node {
        Item item;
        Node next;
    }

    private Node first;
    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldfirst = first;
        Node first = new Node();
        first.item = item;
        first.next = oldfirst;
        ++N;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        --N;
        return item;
    }

    public Iterator<Item> iterator() {
        return new LinkedStackIterator();
    }

    private class LinkedStackIterator implements Iterator<Item> {
        public boolean hasNext() {
            return first.next != null;
        }

        public Item next() {
            Item ret = first.next.item;
            first = first.next;
            return ret;
        }

        public void remove() {
        }

    }
}