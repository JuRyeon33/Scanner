import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("-----자판기 메뉴-----");
        System.out.println("1. 멜론소다 : 1000원");
        System.out.println("2. 콜라 : 2000원");
        System.out.println("3. 사이다 : 3000원");
        System.out.println("4. 환타 : 5000원");
        System.out.println("5. 물 : 6000원");

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

            case 4:
                item = "환타";
                break;

            case 5:
                item = "물";
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                break;


        }
        System.out.println(item);

    }
}