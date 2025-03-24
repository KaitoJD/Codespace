// Dem so uoc cua mot so nhap vao tu ban phim
// Do phuc tap thoi gian O(sqrt(n))

import java.util.Scanner;

public class CountingDivisors {
    public static int numberOfDivisor(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                count++;
                if (n / i != i){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberOfDivisor(n));

        sc.close();
    }
}
