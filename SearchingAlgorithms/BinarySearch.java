import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static boolean binarySearch(int[] arr, int arrSize, int value) {
        int left = 0, right = arrSize - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) return true;
            if (arr[mid] > value) right = mid - 1;
            if (arr[mid] < value) left = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhap cac phan tu trong mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Nhap gia tri can tim: ");
        int val = sc.nextInt();
        if (binarySearch(arr, n, val)) {
            System.out.println("Ton tai gia tri " + val + " trong mang da cho.");
        } else {
            System.out.println("Khong ton tai gia tri " + val + " trong mang da cho.");
        }


        sc.close();
    }
}
