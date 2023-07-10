import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i < 100; i++) {
            if (a == i * i) {
                System.out.println(i);
                break;
            } else if (a == i) {
                throw new Error();
            }
        }
    }
}