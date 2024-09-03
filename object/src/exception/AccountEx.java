package exception;

public class AccountEx {
    private static boolean hasTrafficCard;

    public static void main(String[] args) throws Exception {
        Account account = new Account("111 - 11", "홍길동", 1000000);

        // try {
        // account.withdraw(5000000);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        account.withdraw(5000000);

    }
}