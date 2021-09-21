package test;

import org.junit.*;

public class TestJUnit {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println("quanwei");
        }
    }
    @Before
    public void setUp() {
        System.out.println("开始测试");
    }
    @After
    public void finish() {
        System.out.println("结束测试");
    }

    @Test
    public void test() {
        for (int i = 0; i < 6; i++) {
            System.out.println("quanwei");
        }
    }
}