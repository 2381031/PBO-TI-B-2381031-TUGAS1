package soal2;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan ukuran tangga: ");
        int n = scanner.nextInt();

        char[][] tangga = new char[n][];
        for (int i = 0; i < n; i++) {
            tangga[i] = new char[i + 1];
            for (int j = 0; j < i + 1; j++){
                tangga[i][j] = '#';
            }
        }
        for (char[] baris : tangga ) {
            for (char simbol : baris){
                System.out.print(simbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}
