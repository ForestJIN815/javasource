package classtest;

public class Calculator2 {
    // 같은 클래스 내부에서 다른 메소드 호출 가능
    // 이름만 사용하면 됨

    int plus(int x, int y) {
        return x + y;
    }

    double divide(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void println(String message) {
        System.out.println(message);
    }

    void execute() {
        println("실행결과 : " + avg(x:7, y:10)); ///////////// 체크
    }

}
