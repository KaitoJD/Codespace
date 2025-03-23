import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long mod = 1000000007L;
        BigInteger k = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            k = k.multiply(BigInteger.valueOf(num));
        }
        BigInteger sqrt = k.sqrt();

        if (sqrt.multiply(sqrt).equals(k)) {
            System.out.println("28tech " + sqrt.mod(BigInteger.valueOf(mod)));
        } else {
            System.out.println("29tech");
        }
        sc.close();
    }
}