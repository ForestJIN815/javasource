package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        // char_타입 배열 선언, 생성
        // char_타입 [] 배열명 = {'a','b','c','d'}
        // char_타입 배열명[]

        char[] chArr = { 'a', 'b', 'c', 'd' };

        System.out.println(Arrays.toString(chArr)); // [a, b, c, d]

        for (int i = 0; i < chArr.length; i++) {
            System.out.println(chArr[i] + "\t");

        }

        // 향상된 for문
        for (char c : chArr) {
            System.out.println(c + "\t"); // ???????????
        }

        for (float f : flArr) {
            System.out.println(f); // ???????????
        }

        for (String sting : strArr) {
            System.out.println(); // ???????????
        }

        // float 배열 선언, 생성
        float[] flArr = { 12.5f, 13.6f, 14.5f, 13.7f };

        // String 배열 선언, 생성
        String[] strArr = { "A", "B", "C", "D" };
        // ArrayIndexOutOfBoundsException:
        // System.out.println(strArr[4]);

    }
}

/////////////////////// 에러 에러 !!