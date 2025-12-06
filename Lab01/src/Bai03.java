import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh hình lập phương: ");
        float side = scanner.nextFloat();
        // Thể tích hình lập phương
        float v = (float) Math.pow(side, 3);
        System.out.println("Thể tích hình lập phương là: " + v);
        scanner.close();

    }
}
