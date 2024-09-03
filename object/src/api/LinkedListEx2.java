package api;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {
    public static void main(String[] args) {
        // LikedList 와 ArrayList 수행속도 비교
        ArrayList<String> a1 = new ArrayList<>(2000000);
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("========= 순차적 추가 ===========");
        System.out.println("ArrayList : " + add1(a1));
        System.out.println("LinkedList : " + add1(linkedList));
        System.out.println();
        System.out.println("========= 중간 추가 ===========");
        System.out.println("ArrayList : " + add2(a1));
        System.out.println("LinkedList : " + add2(linkedList));
        System.out.println();
        System.out.println("========= 중간 삭제 ===========");
        System.out.println("ArrayList : " + remove2(a1));
        System.out.println("LinkedList : " + remove2(linkedList));
        System.out.println();
        System.out.println("========= 순차 삭제 ===========");
        System.out.println("ArrayList : " + remove1(a1));
        System.out.println("LinkedList : " + remove1(linkedList));

    }

    static long add1(List<String> list) { // 둘 다 받으려면, 부모로 받아야 함 <다형성>
        // currentTimeMillis() : millisecond
        long start = System.currentTimeMillis(); // System(클래스.. 대문자이므로), current~~(메소드)
        for (int i = 0; i < 1000000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;

    }

    static long add2(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(500, "X"); // list.add(index:500, element:"X") - 자동완성??
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long remove1(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long remove2(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

}
