import java.util.Scanner;
public class K {
    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        task();
    }

    public static void task() {
        int a = sc.nextInt();
        if (a != 0) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
            task();
        }

    }
}
