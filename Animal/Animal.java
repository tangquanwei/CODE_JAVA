package Animal;

/**
 * Animal
 */
public abstract class Animal { // @ abstract class
    String food;
    boolean isHunger;
    String name;
    static byte cnt = 0;

    public Animal() {
        this("No food",false,"Tang Quanwei"); //@ using current class's ctor
        System.out.println("Animal's default ctor");
    }

    public Animal(String f, boolean i, String l) {
        food = f;
        isHunger = i;
        name = l;
        ++cnt;
        System.out.println("Make an animal");
    }

    abstract void eat(); // @ abstruct method

    abstract void makeNoise();

    void sleep() {
        System.out.println("I am Seeping ...");
    }
    String getName(){return name;}

    public static void main(String[] args) {
        Animal[] a = new Animal[2];

        a[0] = new Lion(); 
        //@ call Lion's ctor first, next Feline's, next Animal's, 
        //@ then out of Animal,out of Feline,out of Lion. 

        a[1] = new Dog("asd",true,"Quanwei");
        for (Animal animal : a) {
            animal.eat();
            animal.makeNoise();
        }
        System.out.println("The name of Lion is: "+((Lion)a[0]).getName());
        ((Dog) a[1]).play(); // @ cast Animal to Dog
        System.out.println("The name of Dog is: "+((Dog) a[1]).getName());
        System.out.println(Animal.cnt);
    }
}

/**
 * Feline
 */
abstract class Feline extends Animal { // @ inherit
    public Feline() {
        super(); // @ called superclass's default ctor
        System.out.println("Feline's default ctor");

    }

    public Feline(String f, boolean i, String l) {
        super(f, i, l);
    }
}

/**
 * Canline
 */
class Canline extends Animal {
    public Canline() {
        super();
        System.out.println("Canline's default ctor");

    }

    public Canline(String f, boolean i, String l) {
        super(f, i, l);
    }

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
    public Lion() {
        super();
        System.out.println("Lion's default ctor");

    }

    public Lion(String f, boolean i, String l) {
        super(f, i, l);
    }

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
    public Dog() {
        super();
        System.out.println("Dog's default ctor");

    }

    public Dog(String f, boolean i, String l) {
        super(f, i, l);
    }

    void eat() {
        super.eat();
        System.out.println("I eat food for a dog . ");
    }

    void makeNoise() {
        super.makeNoise(); // @ subclass calls superclass's method
        System.out.println("I am a Dog. ");

    }

    public void beFriendly() {
        System.out.println("I am so friendly. ");

    }

    public void play() {
        System.out.println("I am playing. ");
    }

}
