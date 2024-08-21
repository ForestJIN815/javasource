package ch3;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 점수를 입력받아서
        // 90 이상이면 A, 98 이상이면 A+, 94 이상이면 A0, 94 미만이면 A-
        // 80 이상이면 B, 98 이상이면 B+, 94 이상이면 B0, 94 미만이면 B-

        char grade = ' ', opt = '0';

        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 >> ");

        int jumsu = sc.nextInt();

        if (jumsu >= 90) {
            grade = 'A';
            if (jumsu >= 98) {
                opt = '+';
            } else if (jumsu < 94) {
                opt = '-';
            }

            /////////////// 다시 확인 할것 !

        } else if (jumsu >= 80) {
            grade = 'B';
            if (jumsu >= 88) {
                opt = '+';
            } else if (jumsu < 84) {
                opt = '-';
            }
        }

        System.out.printf("점수 입력 : %d, 학점 : %c%c\n", jumsu, grade, opt);
        //////////////// 점수 입력 ????????
        sc.close();
    }
}
