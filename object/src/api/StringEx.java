package api;

import java.util.Arrays;

public class StringEx {

    public static void main(String[] args) {
        // java.lang.String
        // - 변경이 불가능한(immutable) 클래스
        // 한번 생성된 인스턴스는 읽기만 가능한 상태

        String str = "a";
        str = str + "bcd"; // 기존의 str 을 파괴하고 다시 공간(인스턴스) 생성 후 연결함
        String str5 = "fg";
        str = str + str5; // 기존의 str 을 파괴하고 다시 공간(인스턴스) 생성 후 연결함

        // 문자열 변경이 가능 ///~ (파괴해서 새로 형성 안해도 됨, 직접적으로 연결이 가능하다)
        // java.lang.StringBuilder
        // java.lang.StringBuffer

        // 문자열 리터럴 지정 : 저장이 된 후 동일한 문자열이 들어온 경우에는 한번만 저장
        String str1 = "abc";
        String str4 = "abc";

        // 생성자 사용
        String str2 = "abc";
        String str3 = new String("abc");
        char ch[] = { 'a', 'b', 'c' };
        String str6 = new String(ch);
        /// ~ 주로 사용하는 방식
        /// ~ 두번째, 세번째 방식은 -> 만드는 방식이 다르다

        System.out.println(str1 == str4); // true
        System.out.println(str1 == str2); // false

        // 1. 문자열 비교 : equal() / equalsIgnoreCase() : 대소문자 구분 없이 비교
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));

        // 2. CharAt(int index)
        System.out.println("charAt(1) : " + str1.charAt(1));

        str1 = new String("Hello!! Java"); /// ~ 중간의 공백도 문자열이다

        // 3. length()
        System.out.println("str1 길이" + str1.length());

        // str1 ==> char 배열로 변환
        // ['H','e','l','l']
        char ch1[] = new char[str1.length()]; // char 배열을 선언 -> 그래야 oo에 담을 수 있다.
        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
        }
        System.out.println(Arrays.toString(ch1));

        // 4. toCharArray() : 문자열을 char 배열로 변환
        char ch2[] = str1.toCharArray();
        System.out.println(Arrays.toString(ch2)); //////// 잘 이해안감 8.30.am

        // 5. indexOf(찾을문자) : 주어진 문자의 시작위치 리턴 / 못찾으면 -1 => index 는 0부터 시작
        // 5. indexOf(찾을문자,시작위치) : 주어진 문자의 시작위치 리턴 / 못찾으면 -1 => index 는 0부터 시작
        System.out.println("indexOf(e) : " + str1.indexOf("e"));
        System.out.println("indexOf(Java) : " + str1.indexOf("Java"));
        System.out.println("indexOf(b) : " + str1.indexOf("b"));
        System.out.println("indexOf(e) : " + str1.indexOf('e'));
        System.out.println("indexOf(e) : " + str1.indexOf('e', 4));
        /// ~ 없는 문자를 넣을 경우, -1

        // 6. lastindexOf : 문자열 끝에서부터 찾기
        System.out.println("lastindexOf(e) : " + str1.lastIndexOf("e"));

        System.out.println("lastindexOf(Java) : " + str1.lastIndexOf("Java"));

        // 7. contains(문자열) : 문자열이 포함되어 있는지 확인 후 true/false
        /// 포함되어 있으면 true, (false 포함X)
        System.out.println("contains(e) : " + str1.contains("e"));
        System.out.println("contains(f) : " + str1.contains("f"));

        // 8. startsWith() / endsWith() : 지정된 문자열로 시작하는지 끝나는지 화긴 후 t/f
        str2 = "java.lang.String";
        System.out.println("startsWith(java) : " + str2.startsWith("java"));
        System.out.println("startsWith(lang) : " + str2.startsWith("lang"));
        str3 = "file.txt";
        System.out.println("endsWith(txt) : " + str3.endsWith("txt"));

        // 9. concat(문자열) : 문자열 뒤로 연결
        System.out.println("concat(str2) : " + str1.concat(str2));

        // 10. replace(old문자, new문자) : old 문자를 new 문자로 변경 후 새로운 문자열로 리턴
        str1 = "Hellollo";
        System.out.println(str1.replace("ll", "LL")); // Hellollo
        System.out.println(str1.replaceAll("ll", "LL")); // Hellollo
        System.out.println(str1.replaceFirst("ll", "LL")); // Hellollo ///~ 제일 처음 찾은것만
        System.out.println(str1); // Hellollo

        // 11. split("패턴 or 분리기호") : 문자열을 분리자로 나누어 문자 배열로 리턴
        String animals = "cat,dog,bear";
        String[] arr = animals.split(",");
        for (String s : arr) {
            System.out.println(s);
        }
        arr = animals.split(",", 2);
        for (String s : arr) {
            System.out.println(s); // cat / dog,bear
        }

        // 12. substring(시작위치) : 시작위치부터 끝까지 잘라내기
        // 12. substring(시작위치,끝위치) : 시작위치 포함, 끝위치의 문자는 포함되지 않음
        str1 = "java.lang.Object";
        System.out.println("substing(시작위치) : " + str1.substring(10));
        System.out.println("substing(시작위치,끝위치) : " + str1.substring(5, 9));

        // 13. toUpperCase() / toLowerCase() : 대문자 / 소문자로 변환
        System.out.println("toUpperCase() : " + str1.toUpperCase()); // JAVA.LANG.OBJECT
        System.out.println("toLowerCase() : " + str1.toLowerCase()); // java.lang.object

        // 14. trim() : 공백제거
        // " Hello World ".equals("Hello World")
        // "Hello World ".equals("Hello World") ///-> 공백을 제거하고 처리한다
        str1 = "     Hello    World     ";
        System.out.println(str1);
        System.out.println(str1.trim());

        // 15. valueOf() : 기본형(char,int,float,double,boolean) 값을 String 으로 변환
        /// ~ 오버로딩이 많이 되어 있다. <특징> static 붙어있음. 내가 char 넣어주면 -> string 으로 돌려준다.
        System.out.println("String.valueOf(0) : " + String.valueOf(0)); // 0 => "0"
        System.out.println("String.valueOf(0) : " + String.valueOf(true)); // true => "true"
        System.out.println("String.valueOf(0) : " + String.valueOf(10.5)); // 10.5 => "10.5"

        int i = 100;
        String newStr = String.valueOf(i); // 성능은 valueOf() 가 좋긴 하나 편리함을 따진다면 + "" 더 많이 사용함
        newStr = i + ""; /// ~ 이걸 더 많이 쓴다

        // Integer.parseInt("33")
        // String 을 기본형 값으로 변환 "100" => 100
        int j = Integer.parseInt(newStr);
        System.out.println("j = " + j);

        // NumberFormatException ///~ 변환을 못할때 나온다 (소수점 더블이기 때문에 정수형 형태로 변환해야)
        // j = Integer.parseInt("33.5"); -- X 안됨
        // System.out.println("j = " + j); -- X 안됨
        double d = Double.parseDouble("33.5");
        System.out.println("d = " + d);

        // "true" ==> true
        boolean b = Boolean.parseBoolean("true");
        System.out.println("b = " + b);

        // int(기본타입) => Integer(참조타입)
        // float => Float / boolean => Boolean / double => Double / char => Character
        float f1 = 3.14f;
        Float f2 = 3.14f;

        str1 = "Hello World";
        // 거꾸로 출력
        // dlroW olleH
        for (int k = str1.length() - 1; k >= 0; k--) {
            System.out.print(str1.charAt(k));
        }

        System.out.println();

        // StringBuffer 의 reverse() 이용
        StringBuffer sb = new StringBuffer(str1);
        System.out.println(sb.reverse());

    }
}

/// ~ 자바 서비스
/// ~ final 붙으면 -> 상속금지
/// ~ implements -> 인터페이스

//////////////////// String 위주로 많이 쓰는 메소드를 알아보았다