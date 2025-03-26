import java.util.Scanner;

public class SapXepChon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arrSize; i++){
            int minPos = i - 1;
            int k = i;
            int min = arr[minPos];
            while (k < arrSize){
                if (min > arr[k]){
                    min = arr[k];
                    minPos = k;
                }
                k++;
            }
            int temp = arr[i - 1];
            arr[i - 1] = arr[minPos];
            arr[minPos] = temp;
        }

        for (int x : arr){
            System.out.print(x + " ");
        }

        sc.close();
    }
}