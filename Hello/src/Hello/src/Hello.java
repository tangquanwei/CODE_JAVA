package Hello.src;

public class Hello {
    static final int SIZE = 5;//const

    public static void showMyName() {
        System.out.println("Hello Tang Quanwei !!! ") ;
    }

    public static void main(String[] args) {
        showMyName();
        int[] arr = new int[SIZE]; //array new
        for (int i = 0; i < SIZE; ++i) {
            arr[i] = i;
        }
        for (int i : arr) {
            System.out.println(i);
        }
        showMyName();
    }
}