package api;

public class ObjectEx {
    public static void main(String[] args) {
        // java.lang.Object : root 클래스 (모든 클래스의 부모격)

        // 인스턴스 생성
        Object obj1 = new Object();
        Object obj2 = new Object();

        // equals() : 주소 비교
        System.out.println(obj1.equals(obj2) ? "같다" : "다르다");
        System.out.println(obj1 == obj2 ? "같다" : "다르다");

        // toString() : 객체가 저장된 곳의 주소
        System.out.println(obj1.toString()); // java.lang.Object@7a81197d
        System.out.println(obj2.toString()); // java.lang.Object@5ca881b5

        // 사용자 지정 클래스
        // 값이 같으면 true 를 만들기 위해 equals() 재정의
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println(v1.equals(v2) ? "같다" : "다르다");
        // 객체가 가지고 있는 값의 출력으로 바꾸려면 toString() 재정의
        System.out.println(v1.toString());
        System.out.println(v2.toString());

        // ~ 내가 정의한 것 아니면 다 부모거다, toString 그냥 주소출력 하는걸로 넘겨 줌, 오버라이딩 해야한다 equals 를,
        // ~ 이거 하면 ㅇ -> ㅁ 로 바뀐다
        // ~ value 의 부모는 objct 다. 밸류타입으로 바꿔줘야 한다. 10 으로 값이 같으면 true, 다르면 false 로 도출해
        // ~ 원래는 오브젝트, toString -> '다르다' 나오는게 맞다. but '재정의' 하라는 것이다.
        // ~ equals, toString(가장 기본적으로 무조건 재정의 해주는건 이것이다.
        // ~ (부모가 내려준 것은 주소 형태여서 우리가 원하는 상태가 아니다)

    }
}
