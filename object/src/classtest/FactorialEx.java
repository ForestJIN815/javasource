package classtest;

public class FactorialEx {
    public static void main(String[] args) {
        System.out.println(factorial(n:4));

    }

    static int factorial(int n) {
        int result = 0;
        if (n == 1) {
            result = 1;
        } else {
            // 재귀호출(recursive call) : 메서드 내부에서 메서드 자신을 호출
            result = n * factorial(n - 1);
        }
        return result;
    }
}
