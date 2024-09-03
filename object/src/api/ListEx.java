package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {

        // <객체> : 리스트에 담을 타입
        // 1,2,3,4 => <Integer>, <Double> /// int 안됨
        // 10 개의 String 을 담는 크기 설정
        List<String> list = new ArrayList<>(30); /// 좌측을 인터페이스로 함, 우측은 리스트 안되서 어레이리스트 사용

        // add() : 순서대로 추가
        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("사과");
        list.add("복숭아");
        list.add("포도");

        // add(index, 요소) : index 에 추가
        list.add(2, "바나나");

        // 확인
        System.out.println(list); // [사과, 배, 바나나, 수박, 사과, 복숭아, 포도]
        /// 투스트링 오버라이드 잘 되는지 확인 - 잘 열거되어 있다

        System.out.println("list 크기 : " + list.size());

        System.out.println("특정 위치 요소 가져오기 " + list.get(3));
        System.out.println("특정 위치 요소 제거 " + list.remove(3));
        System.out.println(list);
        System.out.println("특정 요소 제거 " + list.remove("복숭아"));
        System.out.println(list);

        System.out.println("특정 요소 포함 여부 " + list.contains("포도"));
        System.out.println("특정 요소 포함 위치 " + list.indexOf("포도"));
        Object[] arr = list.toArray(); /// 배열로 전환할 수도 있다
        for (Object object : arr) {
            System.out.println(object);
        }

        // list.sort(Comparator.reverseOrder()); // 내림차순 ///~ void 라 호출만 할 수 있다, 내림차순
        // 정렬이다
        // list.sort(Comparator.naturalOrder()); // 오름차순
        // java.util.Collections : Collection 과 관련된 유용한 메소드 제공
        // Collections.sort(list); // 오름차순
        Collections.sort(list, Comparator.reverseOrder()); // 내림차순 ///~ sort?
        System.out.println(list);

    }
}
