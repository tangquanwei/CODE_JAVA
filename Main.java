import java.util.HashMap;
import java.util.StringTokenizer;

import org.junit.jupiter.api.Test;

import lang.objectoriented.Man;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.testEquals();
        main.testA();
    }

    @Test
    public void testStringTokenizer() {
        String str = "I love java program";
        StringTokenizer t = new StringTokenizer(str);
        while (t.hasMoreTokens())
            System.out.println(t.nextToken());
    }

    @Test
    public void testString() {
        String[] strings = { "string", "starting", "strong", "street", "stir", "studeng", "soft", "sting" };
        int stStart = 0, ngEnd = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>(strings.length);
        for (String string : strings) {
            if (string.startsWith("st"))
                ++stStart;
            if (string.endsWith("ng"))
                ++ngEnd;
            map.put(string, string.indexOf("r"));

        }
        System.out.println(
                "以st开头的字符串有: " + stStart + "个;\n以ng结尾的字符串有: " + ngEnd + "个;\n字符‘r’在字符串中第一次出现的位置:\n" + map.toString());
    }

    @Test
    public void testEquals() {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        String s5 = s4;
        System.out.println("s1==s2: " + (s1 == s2));
        System.out.println("s1==s3: " + (s1 == s3));
        System.out.println("s3==s4: " + (s3 == s4));
        System.out.println("s4==s5: " + (s4 == s5));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s3.equals(s4): " + s3.equals(s4));
        System.out.println("s4.equals(s5): " + s4.equals(s5));
    }

    @Test
    public void testA() {
        A a1 = new A();
        A a2 = new A();
        A a3 = a1;
        System.out.println("a1==a2: "+(a1==a2));
        System.out.println("a1==a3: "+(a1==a3));
        System.out.println("a1.equals(a2): "+a1.equals(a2));
        System.out.println("a1.equals(a3): "+a1.equals(a3));
    }
}

class Spot {
    private double x, y;

    Spot(double u, double v) {
        setX(u);
        setY(v);
    }

    void setX(double x1) {
        x = x1;
    }

    void setY(double y1) {
        y = y1;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    Spot midSpot(Spot s) {
        return new Spot(s.getX() / 2, s.getY() / 2);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}

class A {
    @Override
    public String toString() {
        return this.getClass().descriptorString();
    }
}