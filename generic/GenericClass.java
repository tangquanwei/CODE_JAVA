package generic;

/**
 * Generic 参数化类型 避免类型转化 代码可复用
 * 
 */
public class GenericClass<T> {
    private T lower;
    private T upper;

    public GenericClass() {
    }

    public GenericClass(T lower, T upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public T[] getItem() {
        T[] ts = (T[]) new Object[2];
        ts[0] = lower;
        ts[1] = upper;
        return ts;
    }

    public T getLower() {
        return lower;
    }

    public T getUpper() {
        return upper;
    }

    public static <T> GenericClass<T> getReverse(GenericClass<T> g) { // generic method has a <T> befor return type
        return new GenericClass<T>(g.getLower(), g.getUpper());
    }

    // public <T extends Comparable & Serializable> boolean less(T a, T b) {
    // return a < b;
    // }
    public static void main(String[] args) {
        var gen = new GenericClass<Integer>(100, 299);
        for (int i = 0; i < gen.getItem().length; ++i) {
            System.out.println();
        }
    }

}