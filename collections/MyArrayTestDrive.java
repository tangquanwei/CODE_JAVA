package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * MyArrayTestDrive
 */
public class MyArrayTestDrive {
    final int SIZE = 100000;

    public static void main(String[] args) {
        var test = new MyArrayTestDrive();
        test.arrayListTestDrive();

    }

    void arrayListTestDrive() {
        ArrayList<Integer> iArrayList = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            iArrayList.add(i);
        }
        long t0, t1;
        // 三种遍历方法
        System.out.print("Iterator:");
        t0 = System.nanoTime();
        Iterator<Integer> it = iArrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        t1 = System.nanoTime();
        System.out.println(t1-t0);

        System.out.print("Indexing:");
        t0 = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            iArrayList.get(i);
        }
        t1 = System.nanoTime();
        System.out.println(t1-t0);

        System.out.print("For-each:");
        t0 = System.nanoTime();
        for (Integer integer : iArrayList) {
            ;
        }
        t1 = System.nanoTime();
        System.out.println(t1-t0);

        
    }

    /**
     * Comp
     */
    public class Comp {
        boolean comp(Integer i, Integer j) {
            return i < j;
        }
    }

    public void conutTime() {
        long startTime = System.nanoTime();
        long usedTime = System.nanoTime() - startTime;
    }

}