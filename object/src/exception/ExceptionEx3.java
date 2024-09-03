package exception;

public class ExceptionEx3 {
    public static void main(String[] args) throws Exception {
        // method1();

        // 컴파일 예외 ///~ 작성하며 빨간줄이 떠서 바로 확인 가능함
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundExcepton e) { /// ~ 나는 왜 윗 문장 오류가 발생 안 하지?
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        // method2();
    }

    // method2() 실행시 Exception 발생함
    // method2 에서 처리하지 않음(try~catch) => 메소드를 호출하는 쪽에서 처리하기
    static void method2() throws Exception {
        // throw new Exception();
    }

}
