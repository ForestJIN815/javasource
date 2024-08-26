package classtest;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath math = new MyMath();

        // 메소드 호출 후 결과 출력
        long result1 = math.add(5L, 3L);
        long result2 = math.subsract(5L, 3L);
        long result3 = math.multiply(5L, 3L);

        double result4 = math.divide(5L, 0L);

        int result5 = math.divide(5, 0);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        ////////// println 영역지정하고 -- Ctrl + SpaceBar 쳐보기

        System.out.println("divide(5L, 3L) = " + result4);

        System.out.println("divide(5L, 0) = " + result5);

        System.out.println("add(5L, 3L) = " + result1);
        // 인스턴스 메소드 사칙연산
        System.out.println("15 + 5 = " + math2.add());
        System.out.println("15 - 5 = " + math2.subsract());
        System.out.println("15 * 5 = " + math2.multiply());
        System.out.println("15 / 5 = " + math2.divide());

        // 클래스 메소드 사칙연산
        System.out.println("15 + 5 = " + MyMath2.add(15, 5);
        System.out.println("15 - 5 = " + MyMath2.subsract(15, 5);
        System.out.println("15 * 5 = " + MyMath2.multiply(15, 5);
        System.out.println("15 / 5 = " + MyMath2.divide(15, 5);
    }

    ////////////////////////////////////// 체크 체크~~~~~

}}
