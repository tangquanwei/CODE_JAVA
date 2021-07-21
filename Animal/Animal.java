package Animal;

/**
 * Animal
 */
public abstract class Animal { // @ abstract class
    String food;
    boolean isHunger;
    int location;

    abstract void eat(); // @ abstruct method

    abstract void makeNoise();

    void sleep() {
        System.out.println("I am Seeping ...");
    }

    public static void main(String[] args) {
        Animal[] a = new Animal[2];
        a[0] = new Lion();
        a[1] = new Dog();
        for (Animal animal : a) {
            animal.eat();
            animal.makeNoise();
        }
        ((Dog) a[1]).play(); // @ cast Animal to Dog
    }
}

/**
 * Feline
 */
abstract class Feline extends Animal { // @ inherit

}

/**
 * Canline
 */
class Canline extends Animal {
    void eat() {
        System.out.println("Canline eat:");
    }

    void makeNoise() {
        System.out.println("Canline say:");
    }
}

/**
 * Lion
 */
class Lion extends Feline {
    void eat() {
        System.out.println("I eat lion meat. ");
    }

    void makeNoise() {
        System.out.println("I am a Lion. ");

    }

}

/**
 * Pet
 */
interface Pet {// @ interface is like a pure abstract class
    abstract void beFriendly();

    abstract void play();
}

/**
 * Dog
 */
class Dog extends Canline implements Pet { // @ implement interface
    void eat() {
        super.eat();
        System.out.println("I eat food for a dog . ");
    }

    void makeNoise() {
        super.makeNoise(); //@ subclass calls superclass's method
        System.out.println("I am a Dog. ");

    }

    public void beFriendly() {
        System.out.println("I am so friendly. ");

    }

    public void play() {
        System.out.println("I am playing. ");
    }

}
