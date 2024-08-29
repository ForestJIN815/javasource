package shop;

public class ShopEx {
    public static void main(String[] args) {
        MyShop shop = new MyShop();

        // 상점 이름 지정
        shop.setTitle("MyShop");

        // user 생성
        shop.genUser();

        // 상품 생성
        shop.genProduct();

        // 상점 시작
        shop.start();

    }
}

////////// 터미널(TERMINAL) 결과를 보려면 - main 창에서 눌러라.
////////// (다형성이라 여러 클래스가 있을때..? 메인 클래스 창에서 클릭)
