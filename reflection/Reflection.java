package reflection;

import java.lang.FdLibm.Pow;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {
    int cnt;
    int age;
    public static void main(String[] args) {
        var ref=new Reflection();
        ref.getClassName();

        try {
            // 5.反射
            Constructor<Reflection> ctor = Reflection.class.getConstructor();
            Reflection a3 = ctor.newInstance();
            a3.hello();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void hello() {
        System.out.println("Hello Reflection for " + this.getClass().getName());
    }

    void getClassName() {
        String s1 = "hello";
        Class c1 = s1.getClass();
        System.out.println(c1.getName());

        try {
            Class c2 = Class.forName("java.lang.String");
            System.out.println(c2.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }

        Class c3 = String.class;
        System.out.println(c3.getName());
        System.out.println(c3.getDeclaredMethods());
        System.out.println();
        
        
        

    }
}
