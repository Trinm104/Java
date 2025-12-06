import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        float gpa = scanner.nextFloat();
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Điểm trung bình: " + gpa);
        scanner.close();

    }
