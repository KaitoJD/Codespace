import java.util.Scanner;

public class SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++){
            arr[i] = sc.nextInt();
        }

        boolean swapped = true;
        int pos = arrSize - 1;

        while (swapped){
            swapped = false;
            for (int i = 0; i < pos; i++){
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped){
                pos--;
            }
        }

        for (int x : arr){
            System.out.print(x + " ");
        }

        sc.close();
    }
}