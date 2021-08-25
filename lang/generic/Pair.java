package lang.generic;

public class Pair<T> {
    private T first;
    private T second;

    Pair(T f, T s) {
        first = f;
        second = s;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}

