// Cach khai bao va duyet phan tu vao mang danh dau (hoac mang tan suat)
// Tuy theo de bai ma ta se chon su dung ky thuat nao la hieu qua nhat

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] f = new int[1000001]; // Tao mang tan suat

        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
            f[array[i]]++; // Dem so lan array[i] xuat hien
        }

//        Doi voi mang danh dau thi ta duyet phan tu nhu cach ben duoi
//
//        for (int i = 0; i < arraySize; i++) {
//            array[i] = sc.nextInt();
//            f[array[i]] = 1;
//        }


        // In ra tat ca cac phan tu cua mang array kem voi tan suat xuat hien cua phan tu do
        for (int i = 0; i < arraySize; i++){
            System.out.println(array[i] + " " + f[array[i]]);
        }

        sc.close();
    }
}
