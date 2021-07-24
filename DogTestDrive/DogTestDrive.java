package dogtestdrive;

public class DogTestDrive {
    public static void main(String[] args) {
        // 1.声明引用变量 3.连接2.创建对象
        // Dog d = new Dog();// dog 本身没有放入d
        Dog[] ld = new Dog[10]; // dog 的引用 缺少dog的实际对象
                                // ld 是一个对象

        for (Dog dog : ld) {
            dog = new Dog();
            dog.bark();
        }
    }
}

class Dog {// ? 放在DogTestDrive前不行 : DogTestDrive.Dog Ҳ main(String[])
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff Ruff !! :");
    }
}

class Echo {
    int cnt = 0;

    void hello() {
        System.out.println("hello");
    }

    void doWork() {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 4) {
            e1.hello();
            ++e1.cnt;
            if (x > 0)
                ++e2.cnt;
            if (x > 1)
                e2.cnt += e1.cnt;
            ++x;
        }
        System.out.println(e2.cnt);
    }
}