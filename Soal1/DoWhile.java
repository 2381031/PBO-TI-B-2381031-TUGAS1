package Soal1;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.println("Masukkan jumlah elemen array: ");
            x = scanner.nextInt();
        } while (x <= 0);
        int[] ar = new int[x];
        System.out.println("Masukkan elemen-elemen array: ");
        int i = 0;
        do {
            System.out.println("Elemen ke-" + (i + 1) + ": ");
            ar[i] = scanner.nextInt();
            i++;
        }while (i < ar.length);
        int sum = 0;
        int z = 0;
        do{
            sum += ar[z];
            z++;
        }while (z < ar.length);

        System.out.println("Jumlah elemen array: " + sum);
        scanner.close();
    }
}
