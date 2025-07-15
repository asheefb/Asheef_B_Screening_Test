import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int n = sc.nextInt();

        oddNumbersUpTo2n_min_1(n);
    }

    private static void oddNumbersUpTo2n_min_1(int n) {
        int limit = n % 2 == 0 ? n - 1 : n;

        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
    }
}
