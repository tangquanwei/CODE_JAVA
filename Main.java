import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double len = in.nextDouble();
        double l = in.nextDouble();
        double w = in.nextDouble();
        double r = in.nextDouble();
        in.close();
        Square square = new Square(len);
        Rectangle rectangle = new Rectangle(l, w);
        Circle circle = new Circle(r);
        System.out.printf("%.2f %.2f\n", square.getPerimeter(), square.getArea());
        System.out.printf("%.2f %.2f\n", rectangle.getPerimeter(), rectangle.getArea());
        System.out.printf("%.2f %.2f\n", circle.getPerimeter(), circle.getArea());
    }
}

class Shape {
    double getPerimeter() {
        return 0.0;
    }

    double getArea() {
        return 0.0;
    }

}

class Rectangle extends Shape {
    double length, width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }

    double getArea() {
        return length * width;
    }
}

class Square extends Rectangle {

    public Square(double l) {
        super(l, l);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}
