public class G {
    public static void main(String[] args) {
        task(228);
    }

    public static void task(int n) {
        if (n >= 1) {
            task(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
}
