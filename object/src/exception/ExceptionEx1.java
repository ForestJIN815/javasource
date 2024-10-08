package exception;

public class ExceptionEx1 {
    public static void main(String[] args) {

        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {

                result = number / (int) (Math.random() * 10);
                System.out.println(result);

                int num = Integer.parseInt("abc");
                System.out.println(num);

                // } catch (Exception e) { /// ~ 부모로 한꺼번에 처리? or
            } catch (ArithmeticException | NumberFormatException e) { // 개별적으로 처리?
                // System.out.println("0으로 나눴음");
                // e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

    }
}
