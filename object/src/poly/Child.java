package poly;

public class Child extends Parent {

    String name;

    void play() {
        System.out.println("놀자!!!!");
    }

    @Override ///////// pr 치면 자동완성 뜸 - [육면체그림]print() 누르면 됨
    void print() {
        super.print(); // 가지려는 부모의 메소드 호출
        System.out.println("자식 메소드");
    }
}
