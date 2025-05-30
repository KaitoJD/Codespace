import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        int[] subArr1 = new int[n1], subArr2 = new int[n2];
        
        for (int i = 0; i < n1; i++)
            subArr1[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            subArr2[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (subArr1[i] <= subArr2[j])
                arr[k++] = subArr1[i++];
            else
                arr[k++] = subArr2[j++];
        }
        while (i < n1)
            arr[k++] = subArr1[i++];
        while (j < n2)
            arr[k++] = subArr2[j++];
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao do lon cua mang: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < arrSize; i++)
            arr[i] = sc.nextInt();

        mergeSort(arr, 0, arrSize - 1);

        for (int x : arr)
            System.out.print(x + " ");

        sc.close();
    }
}
