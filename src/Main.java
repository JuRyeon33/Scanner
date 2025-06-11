import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        String item = "";

        switch (choice) {
            case 1:
                item = "멜론소다";
                break;

            case 2:
                item = "콜라";
                break;

            case 3:
                item = "사이다";
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                break;

        }
        System.out.println(item);

    }
}