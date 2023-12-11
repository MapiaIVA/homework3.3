import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату x: ");
        int x = scanner.nextInt();
        System.out.print("Введите координату y: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Точка находится в I четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится в II четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находится в III четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находится в IV четверти");
        } else if (x == 0 && y != 0) {
            System.out.println("Точка находится на оси y");
        } else if (y == 0 && x != 0) {
            System.out.println("Точка находится на оси x");
        } else {
            System.out.println("Точка находится в начале координат");
        }
    }
}