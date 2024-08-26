package classtest;

public class CardEx {
    public static void main(String[] args) {

        // 클래스 변수 : 클래스가 메모리에 올라갈 때 이미 로드가 된 상태이므로 바로 부를 수 있음
        System.out.println("카드 width : " + Card.width); /////////////// 체크
        System.out.println("카드 height : " + Card.height);

        // 인스턴스 생성
        Card card1 = new Card("Heart", 7);
        System.out.println("card1 kind : " + card1.getkind() + " card1 number : " + card1.getNumber());

        Card card2 = new Card("Spade", 4);
        System.out.println("card2 kind : " + card2.getkind() + " card2 number : " + card2.getNumber());

        Card.width = 150;
        Card.height = 300;
        System.out.println("카드 width : " + Card.width);
        System.out.println("카드 height : " + Card.height);

        // Cannot make a static reference
        // to the non-static method firstMethod()
        // from the type CardExJava(603979977)
        firstMethod();

        CardEx obj = new CardEx();
        obj.secondMethod();

    }

    void firstMethod() {

    }

    void secondMethod() {

    }

}
