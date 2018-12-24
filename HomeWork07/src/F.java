public class F {
    public static void main(String[] args) {
        task(123);
    }

    public static void task(int n) {
        if (n >= 1) {
            System.out.print(n % 10 + " ");
            task(n / 10);
        }
    }
}
