// Phan tich thua so nguyen to cua so nguyen duong n
// Do phuc tap: O(sqrt(n))

import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void primeFactorization(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                n /= i;
                System.out.print(i + " ");
            }
        }
        if (n > 1)
            System.out.println(n);
            
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        primeFactorization(n);

        sc.close();
    }
}
