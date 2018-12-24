public class E {
    public static void main(String[] args) {
        System.out.println(task(127));
    }

    public static int task(int n) {
        if (n > 0) {
            return ((n % 10) + task(n / 10));
        } else {
            return 0;
        }
    }
}
