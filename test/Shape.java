package test;

public class Shape {
    public static void main(String[] args) {
        var a = new Rectangle(10, 23);
        var b = new Square(10);

        System.out.println(a instanceof Rectangle);
        System.out.println("The Area is: " + a.getArea());
        System.out.println("The Perimeter is: " + a.getPerimeter());
        System.out.println("The type is: " + a.getType());

        System.out.println(b instanceof Rectangle);
        System.out.println("The type is: " + b.getType());
        System.out.println("The Area is: " + b.getArea());
        System.out.println("The Perimeter is: " + b.getPerimeter());
    }

}

/**
 * Rectangle
 */
class Rectangle {
    protected int length, width;

    Rectangle() {
        length = 0;
        width = 0;
    }

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int getPerimeter() {
        return 2 * (length + width);
    }

    int getArea() {
        return length * width;
    }

    String getType() {
        return "instance of Rectangle";
    }

}

final class Square extends Rectangle{
    Square() {
        super();
    }

    Square(int a) {
        super(a, a);
    }

    @Override//? 编译器帮助检查是否进行了正确的覆写
    String getType() {
        return "instance of Square";
    }
}