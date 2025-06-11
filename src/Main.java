import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("-----자판기 메뉴-----");
        System.out.println("1. 멜론소다 : 1000원");
        System.out.println("2. 콜라 : 2000원");
        System.out.println("3. 사이다 : 3000원");
        System.out.println("4. 환타 : 4000원");
        System.out.println("5. 물 : 5000원");

        int choice = scanner.nextInt();
        int price = 0;

        String item = "";


        switch (choice) {
            case 1:
                item = "멜론소다";
                price = 1000;
                break;

            case 2:
                item = "콜라";
                price = 2000;
                break;

            case 3:
                item = "사이다";
                price = 3000;
                break;

            case 4:
                item = "환타";
                price = 4000;
                break;

            case 5:
                item = "물";
                price =5000;
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                break;


        }
        System.out.println(item + "을(를) 선택하셨습니다. 금액을 넣어주세요 : ");
        int money = scanner.nextInt();

        while (money < price) {
            System.out.println("금액이 부족합니다. 부족한 금액을 추가해 주시길 바랍니다. 현재 투입된 금액은 : " + money + "입니다.");
            int add = scanner.nextInt();
            money += add;
        } if (money > price) {
            int change = money - price;
            System.out.println(item  + "을(를) 드립니다. 잔돈은 " + change + "원 입니다.");
        }

    }
}