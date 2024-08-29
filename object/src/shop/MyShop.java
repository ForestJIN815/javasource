package shop;

import java.util.Scanner;

public class MyShop implements IShop {

    private String title;

    // User 배열 생성
    User users[] = new User[2];

    // 상품 배열 생성
    Product products[] = new Product[5];

    // cart 생성
    Product cart[] = new Product[10];

    Scanner sc = new Scanner(System.in);

    // 선택된 user 의 inex 보관
    private int selUser;

    private String sum;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // user 2명을 생성 후 users 배열 담기
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);

    }

    @Override
    public void genProduct() {
        // Cellphone, SmartTv 5개 생성 후 products 배열 담기
        products[0] = new CellPhone("아이폰 13", 1500000, "KT");
        products[1] = new CellPhone("갤럭시 노트13", 1200000, "SKT");
        products[2] = new CellPhone("갤럭시 Z 플립", 1300000, "LGT");
        products[3] = new SmartTv("삼성 울트라 HD", 1800000, "4K");
        products[4] = new SmartTv("LG 스마트", 1400000, "1080p");

    }

    @Override
    public void start() {
        // 출력
        // MyShop : 메인화면 - 계정선택 (MyShop 은 title)
        // ===============================
        // [1] 홍길동(CARD) // (Users 배열을 이용해서)
        // [2] 성춘향(CASH) // (Users 배열을 이용해서)
        // [X] 종료
        // 선택 >>

        System.out.println(title + " 메인화면 - 계정선택");
        System.out.println("=========================================");
        for (int i = 0; i < users.length; i++) {
            System.out.printf("[%d] %s(%s)\n", (i + 1), users[i].getName(), users[i].getPayType());
        }
        System.out.println("[X] 종료");
        System.out.print("선택 >> ");
        // 사용자 입력 : 1,2,X
        // 사용자 입력이 1,2 인 경우 productList() 호출
        // X 인 경우 : System.exit(0)
        String input = sc.nextLine();

        switch (input) {
            case "1":
            case "2":
                // 배열 ~~~~ ////////// 놓침...
                selUser = Integer.parseInt(input); // 문자니깐 숫자로 받기 위해? 숫자니깐 문자로 ??
                productList();
                break;
            case "X":
            case "x":
                System.exit(0);
            default:
                System.out.println("입력을 확인해 주세요");
                start();
                break;
        }

    }

    public void productList() {
        // 출력
        // MyShop : 상품목록 - 상품선택
        // ===============================
        // [1] 상품 보여주기
        // [2] 상품 보여주기
        // [3] ~ [5]
        // [h] 메인화면
        // [c] 체크아웃
        // 선택 >>

        System.out.println(title + " 상품목록 - 상품선택");
        System.out.println("=========================================");

        int i = 0;
        for (Product product : products) {
            System.out.printf("[%d]", i++);
            product.printDetail();
        }
        System.out.println("[h] 메인화면");
        System.out.println("[X] 체크아웃");
        System.out.print("선택 >> ");

        // 메뉴 받기
        String input = sc.nextLine(); ////////////// 위치 체크
        // 0~4 or h or c
        // h : 메인화면 - 계정선택 호출
        // c : checkOut() 호출
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                // 0 ~ 4 : cart 에 담기
                for (int j = 0; j < cart.length; j++) {
                    if (cart[j] == null) {
                        cart[j] = products[Integer.parseInt(input)]; // 따옴표 떨어뜨리기 위해서 Integer.parseInt 입력한것
                        break;
                    }
                }
                productList();
                break;
            case "h":
                start();
                break;
            case "c":
                start();
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                productList();
                break;
        }

    }

    public void checkOut() {
        // cart 화면 출력
        System.out.println();
        System.out.println(title + " - " + users[selUser].getName() + " : 체크아웃");
        System.out.println("===================================================");

        int i = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[d%] %s (%d)\n", i++, product.getpName(), product.getPrice());
            }
        }

        // 결제방법 : CARD or CASH
        System.out.println("결제방법 : " + users[selUser].getPayType());
        // 합계 : 카트에 담긴 물건
        System.out.println("합계 : " + sum);
        // [p] 이전
        System.out.println("[p] 이전");
        // [q] 결제완료
        System.out.println("[q] 결제완료");

        // 입력값에 따라
        String input = sc.nextLine();
        // p : 상품목록 화면 보여주기
        switch (input) {
            case "p":
                productList();
                break;
            // q : 종료
            case "q":
                System.exit(0);
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                checkOut();
                break;
        }
    }
}