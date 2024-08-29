package poly;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    // 구입한 제품을 저장하기 위한 배열 
    // Computer computers[]=new Computer[3];
    // Air airs[]=new Air[3];
    Product[] products = new Product[0];
    private int i;
    int 1 = 0;

    // Product p = new Computer();
    // Product p = new Air();
    void buy(Product p) {
        // money 보다 물건가격이 적은지 확인
        if (money < p.price) {
            System.out.println("잔액 부족으로 물건 구입 불가");
            return;
        }

        // money = money - 물건가격
        money -= p.price;
        // 보너스포인트 = 보너스포인트 + 구입가격에 따른 포인트
        bonusPoint += p.bonusPoint;
        products[i++] = p; // 장바구니에 담기
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary(){
        // 구매한 물품에 대한 정보 출력
        int sum = 0;
        String itemList = "";

        for (Product product : products) {
            if (product != null) {
                sum += product.price;
                itemList += product + ", ";
                // product 에 많은 의미가 내포됨 - 8.29.AM

            }
            
        }

        // 구입한 물품의 총 금액은 ~~ 만원입니다.
        System.out.printf("구입한 물품의 총 금액은 %d 만원입니다.\n, sum");
        // 구입한 제품은 Computer, Air 입니다.
        System.out.printf("구입한 제품은 %s 입니다\n", itemList);
    }

    // void buy(Air air) {
    // // money 보다 물건가격이 적은지 확인
    // if (money < air.price) {
    // System.out.println("잔액 부족으로 물건 구입 불가");
    // return;
    // }

    // // money = money - 물건가격
    // money -= air.price;
    // // 보너스포인트 = 보너스포인트 + 구입가격에 따른 포인트
    // bonusPoint += air.bonusPoint;
    // System.out.println(air + "을/를 구입하셨습니다.");
    // }
}
