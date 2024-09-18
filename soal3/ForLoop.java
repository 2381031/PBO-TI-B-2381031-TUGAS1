package soal3;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String input = scanner.next();
        int jumlah = 1;
         for (int i = 0; i < input.length(); i++){
             char c = input.charAt(i);
             if (Character.isUpperCase(c)) {
                 jumlah++;
             }
         }
        System.out.println("Masukkan kata: " + jumlah);
         scanner.close();
    }
}
