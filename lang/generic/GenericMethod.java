package lang.generic;

public class GenericMethod {
    public <T> GenericClass<T> getReverse(GenericClass<T> g) { // generic method has a <T> befor return type
        return new GenericClass<T>(g.getLower(),g.getUpper());
    }
}
