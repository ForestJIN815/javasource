package extendstest;

public class AccountEx {
    private static boolean hasTrafficCard;

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("111 - 11", "홍길동", 1000000, "22 - 222");

        // 입금하다
        checkingAccount.deposit(1000000);
        System.out.println("현재 잔액 : " + checkingAccount.getBalance());

        //
        int balance = checkingAccount.pay("222-22", 20000);
        System.out.println("현재 잔액 : " + balance);

        System.out.println("====================================================");

        CreditLineAccount creditLineAccount = new CreditLineAccount("333-33", "현빈", 100000, 5000000);
        System.out.println("마이너스 통장 계좌 잔액 확인 : " + checkingAccount.getBalance());

        balance = creditLineAccount.withdraw(4000000);
        System.out.println("현재 잔액 : " + balance);

        System.out.println("====================================================");
        BonusPointAccount bonusPointAccount = new BonusPointAccount("444-55", "김지수", balance //// 얼마?);
        System.out.println("현재 보너스 점수 : " + bonusPointAccount.getBonusPoint());

        bonusPointAccount.deposit(2000000);
        System.out.println("현재 잔액 : " + bonusPointAccount.getBalance());
        System.out.println("현재 보너스 점수 : " + bonusPointAccount.getBonusPoint());

        System.out.println("====================================================");
        CheckingTrafficCardAccount cardAccount = new CheckingTrafficCardAccount("555-66", "김수용", 100000, "333-33");
        System.out.println("교통 카드 여부 : " + cardAccount.isHasTrafficCard() ? "교통카드 기능 있음" : "교통카드 기능 없음");

        // 교통카드 기능 추가
        cardAccount.setHasTrafficCard(hasTrafficCard:true);

        // 교통비 지불
        balance = cardAccount.payTrafficCard("333-33", 2400);
        if(balance == -1){
            System.out.println("교통카드 기능이 없습니다");
        } else {
            System.out.println("교통비 지불 후 잔액 : " + balance);
        }

    }
}