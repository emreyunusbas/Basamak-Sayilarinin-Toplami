import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin: ");
        int number = scanner.nextInt();

        int sum = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }

        System.out.println("Basamak sayılarının toplamı: " + sum);
    }
}