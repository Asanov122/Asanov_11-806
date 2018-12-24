public class H {
    public static boolean prime = true;

    public static void main(String[] args) {
        int n = 7;
        if (task(2, n)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean task(int divider, int n) {
        if (n > 1) {
            if (divider < n / 2) {
                if (n % divider == 0) {
                    prime = false;
                } else {
                    task(divider += 1, n);
                }
            }
            return prime;
        }
        return false;
    }
}
