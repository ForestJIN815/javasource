package classtest;

// 자바 - 객체지향언어
//        main() 메소드를 가지는 클래스와 가지지 않는 클래스

// 클래스 정의 : 객체를 정의해 놓은 것
// 클래스 용도 : 객체 생성하는데 사용

// 객체 : 사물 또는 개념

/* Car 클래스 */
public class Car {

    /* 필드 영역 */
    // 특징(속성) => 필드(변수로 작성)
    // 제조사, 모델, 색상, 최대속도
    String company;
    String model;
    String color;
    int maxSpeed;

    /* 메소드 영역 */
    // 기능(동작) => 메소드
    void foward() {
        System.out.println("전진한다.");
    }

    void backword() {
        System.out.println("후진한다.");
    }

}
