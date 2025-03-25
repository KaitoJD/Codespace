// Chuong trinh in ra tat ca cac so nguyen to nho hon n (Kem giai thich)
// Do phuc tap: O(n)

import java.util.Scanner;

public class SangEuler{
    public static void sieveOfEuler(int n){
        // Tao mang tham chieu de mo phong tat ca cac so tu 1 den n qua cac chi so tham chieu
        boolean[] isPrime = new boolean[n + 1];

        // Tao mang de luu cac so nguyen to
        int[] prime = new int[n];

        // Bien dung de luu kich thuoc cua mang prime
        int count = 0;

        // Ta xem tham chieu i cua mang la so can xet,
        // Ban dau ta gan cho tat ca gia tri cua mang tham chieu la true
        // Co nghia la truoc khi xet, ta gia su tat ca ca so tu 1 den n deu la so nguyen to
        for (int i = 0; i <= n; i++){
            isPrime[i] = true;
        }

        // Ta bat dau thuc hien sang nguyen to thong qua tham so i cua mang tham chieu
        // Bat dau voi 2 la so nguyen to dau tien
        for (int i = 2; i <= n; i++){
            if (isPrime[i]){
                prime[count] = i; // Dung de gan tham so i cua mang tham chieu sang mang luu so nguyen to
                count++; // Do da tim duoc 1 so nguyen to nen ta tang bien dem len 1 don vi
            }

            // Bat dau qua trinh sang cac boi so cua i
            for (int j = 0; j < count; j++){

                // Neu nhu boi so cua i lon hon n thi ta bo qua
                if (i * prime[j] > n){
                    break;
                }

                // Loai bo nhung boi so cua i khoi danh sach so nguyen to
                isPrime[i * prime[j]] = false;

                // Buoc nay dam bao moi gia tri i chi bi luoc bo 1 lan trong suot qua trinh sang
                if (i % prime[j] == 0){
                    break;
                }
            }
        }

        for (int i = 0; i < count; i++){
            System.out.print(prime[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sieveOfEuler(n);

        sc.close();
    }
}