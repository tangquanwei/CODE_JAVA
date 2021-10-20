
//B.java
package my.xyz;

import my.abc.A; //add my.

class B {
    public static void main(String[] args) {
        A a = new A();
        a.x = 100;
        a.print();
    }
}// remove }
