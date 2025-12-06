import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        // Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài hình chữ nhật: ");
        float length = scanner.nextFloat();
        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        float width = scanner.nextFloat();
        float area = length * width;
        float perimeter = 2 * (length + width);
        System.out.println("Chu vi hình chữ nhật là: " + perimeter);
        System.out.println("Diện tích hình chữ nhật là: " + area);

        scanner.close();

    }
}
