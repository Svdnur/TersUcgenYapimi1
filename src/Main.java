import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i;

        System.out.print("Basamak sayısını giriniz:");
        n = input.nextInt();

        for (i = n; i >= 1; i--) {

            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}

