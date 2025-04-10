import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Khai bao mot mang doi tuong
        Integer[] a = {32, 4, 53, 483, 12, 76, 223};

        // Sap xep mang theo thu tu tang dan
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { // Ham tra ve mot so am va mot so duong

                // Neu return so am thi o1 dung truoc o2 va nguoc lai
                if (o1 < o2) {
                    return -1;
                } else {
                    return 1;
                }
                // Hoac thay vi dung cau dieu kien nhu tren thi ta co the viet
                // return o1 - o2;

            }
        });

        for (int i : a) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
