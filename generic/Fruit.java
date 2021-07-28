package generic;

public class Fruit<T> extends GenericClass{
    private T lower;
    private T upper;
    public T getLower() {
        return lower;
    }
    public T getUpper() {
        return upper;
    }

}
