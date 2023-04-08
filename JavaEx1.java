import java.util.Scanner;

public class JavaEx1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", (n * (n + 1)) / 2);

    }
}