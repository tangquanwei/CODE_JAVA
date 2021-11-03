package test;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void run();

    public abstract void eat();

    @Override
    public String toString() {
        return "name: " + this.name + "\tage: " + this.age + "\tweight: " + this.weight;
    }

    // public static void main(String[] args) {
    //     System.out.println("--------Test Cat--------");
    //     Cat cat = new Cat("Cendy", 3, 8.0, "miao~ miao~");
    //     System.out.println(cat);
    //     cat.run();
    //     cat.eat();
    //     cat.say();
    //     System.out.println("--------Test Dog--------");
    //     Dog dog = new Dog("Wangcai", 4, 12.5);
    //     System.out.println(dog);
    //     dog.run();
    //     dog.eat();
    //     System.out.println("--------Test Whitecat----");
    //     WhiteCat whiter = new WhiteCat("Whiter", 2, 6.8, "wu~ wu~");
    //     whiter.run();
    //     whiter.eat();
    //     whiter.say();
    // }
}

class Cat extends Animal {
    String lang;
    String className;
    {
        Class<? extends Cat> c = this.getClass();
        className = c.getSimpleName();
    }

    public Cat(String name, int age, double weight, String lang) {
        super(name, age, weight);
        this.lang = lang;
    }

    @Override
    public void run() {
        System.out.println("Run in " + this.className + " of " + this.name);
    }

    @Override
    public void eat() {
        System.out.println("Eat in " + this.className + " of " + this.name);

    }

    public void say() {
        System.out.println(this.className + " " + this.name + " says :\" " + this.lang + " \".");
    }

    @Override
    public String toString() {
        return super.toString() + "\tsays: " + this.lang;
    }
}

class Dog extends Animal {

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void run() {
        System.out.println("Run in Dog of " + this.name);
    }

    @Override
    public void eat() {
        System.out.println("Eat in Dog of " + this.name);

    }
}

class WhiteCat extends Cat {
    public WhiteCat(String name, int age, double weight, String lang) {
        super(name, age, weight, lang);
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void eat() {
        System.out.println(this.className + " " + this.name + "\'s Eat");
    }

    @Override
    public void say() {
        super.say();
    }
}
