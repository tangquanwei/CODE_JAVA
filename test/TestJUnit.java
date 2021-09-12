package test;

import org.junit.*;

public class TestJUnit {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println("quanwei");
        }
    }

    @Test
    public void test() {
        for (int i = 0; i < 6; i++) {
            System.out.println("quanwei");
        }
    }
}