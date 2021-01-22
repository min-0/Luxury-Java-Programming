import java.util.*;

public class _2장2번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n / 10 == n % 10) {
            System.out.print("10의 자리와 1의 자리가 같습니다");
        } else {
            System.out.print("달라요");
        }

        sc.close();
    }
}