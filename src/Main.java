import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Введите 10 целых чисел:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Чётные числа из этого массива:");
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}