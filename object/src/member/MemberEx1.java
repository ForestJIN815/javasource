package member;

import java.util.ArrayList;
import java.util.List;

public class MemberEx1 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        // List 에 Member 추가
        list.add(new Member("hong123", "홍길동", "서울", "hong@naver.com"));
        list.add(new Member("hong124", "홍길동", "서울", "hong@naver.com"));
        list.add(new Member("hong125", "홍길동", "서울", "hong@naver.com"));
        list.add(new Member("hong126", "홍길동", "서울", "hong@naver.com"));

        for (Member member : list) {
            System.out.print(member.getId() + "\t");
            System.out.print(member.getName() + "\t");
            System.out.print(member.getAddr() + "\t");
            System.out.println(member.getEmail());
        }
    }

}
