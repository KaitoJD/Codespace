// Counting Sort co the sap xep mot mang
// ma gia tri cac phan tu trong mang trong doan
// 0 <= arr[i] <= 1000000

import java.util.Scanner;

public class CountingSort {
    public static void countingSort(int[] arr, int n) {
        int k = -1000000000;
        int[] count = new int[1000001];
        for (int i = 0; i < n; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
            k = Math.max(k, arr[i]);
        }
        for (int i = 0; i <= k; i++){
            if (count[i] != 0) {
                for (int j = 0; j < count[i]; j++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhap mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countingSort(arr, n);
    }
}
