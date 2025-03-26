/* 
    No chi duoc cai ngan hon...
*/

import java.util.Scanner;

public class KiemTraSoChinhPhuong{
    public static boolean isSquareNumber(int n){
        return ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        if (isSquareNumber(n)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
