package extendstest;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(111 - 11, "홍길동", 1000000, 22 - 222);

        // 입금하다
        checkingAccount.deposit(1000000);
        System.out.println("현재 잔액 : " + checkingAccount.getBalance());

        //
        int balance = checkingAccount.pay("222-22", 20000);
        System.out.println("현재 잔액 : " + balance);
    }

}

/////////////////// 수정