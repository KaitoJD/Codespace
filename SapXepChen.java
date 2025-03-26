import java.util.Scanner;

public class SapXepChen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arrSize - 1; i++){
            for (int j = i + 1; j > 0; j--){
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        for (int x : arr){
            System.out.print(x + " ");
        }

        sc.close();
    }
}
