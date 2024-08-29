package member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        Member[] members = new Member[5];
        MemberConsoleUtil util = new MemberConsoleUtil();

        while (flag) {
            System.out.println("============== 회원관리 프로그램 ===============");
            System.out.println("1. 회원등록");
            System.out.println("1. 회원목록");
            System.out.println("1. 회원수정");
            System.out.println("1. 회원삭제");
            System.out.println("1. 프로그램 종료");
            System.out.println();

            System.out.print("메뉴번호 >> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // addMember() 호출 후 리턴 받기
                    Member member = util.addMember(sc);

                    // 받은 리턴값을 배열에 추가
                    for (int i = 0; i < members.length; i++) {
                        if (members[i] == null) {
                            members[i] = member;
                            break;
                        }
                    }
                    break;
                case 2:
                    util.printMembers(members);
                    break;
                case 3:
                    member = util.updateMember(sc, members);
                    if (member != null) {
                        System.out.println(member.getId() + "님 주소가 수정되었습니다.");
                    }
                    break;
                case 4:

                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("번호를 확인해 주세요");
                    break;
            }

        }

    }
}
