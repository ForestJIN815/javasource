package api;

import java.util.ArrayList;
import java.util.List;
/// import 자동완성으로 생성되려면.. main 아래에서 단어를 쳐줄때 자동완성이 뜬다

public class ListEx2 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>(); /// Arr 정도만 쳐주면 <자동완성> 나옴
        /// ==================> ( ) ==========> 내가 직접 다 쳐주고 나면 안 뜬다

        list.add(new Member("hong123", "홍길동"));
        list.add(new Member("hong124", "김길동"));
        list.add(new Member("hong125", "최길동"));
        list.add(new Member("hong126", "이길동"));

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.remove(2));

        System.out.println(list);

        /* 향상된 for문 사용 */
        for (Member member : list) {
            String id = member.getId();
            String name = member.getName();

        }

    }
}
