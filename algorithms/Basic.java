package algorithms;

public class Basic {
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static double sqrt(double c) {
        if (c < 0)
            return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t)
            t = (c / t + t) / 2.0;
        return t;
    }

    public static double abs(double c) {
        return c > 0.0 ? c : -c;
    }
    // test
    public static void main(String[] args) {
        int i=0;
        System.out.println(sqrt(i));
    }
}
