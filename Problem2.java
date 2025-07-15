import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        oddNumbersUpToN(n);
    }

    private static void oddNumbersUpToN(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num + " ");
            num += 2;
        }
    }
}
