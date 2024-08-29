package extendstest;

// 은행계좌 + 마이너스 가능한 계좌
public class CreditLineAccount extends Account {

    private int creditline; // 마이너스 한도

    public CreditLineAccount(String accountNo, String owner, int balance, int creditline) {
        super(accountNo, owner, balance); // 부모의 생성자 호출
        this.creditline = creditline;
    }

    @Override
    int withdraw(int account) {
        // 잔액 = 잔액 + 마이너스 한도 - 사용금액
        if (getBalance() + creitLine < amount) {
            return -1;

        }
        // 잔액 = 잔액 + 마이너스 한도 - 사용금액
        setBalance(getBalance()) - amount);
        return getBalance();
    }

    public int getCreditLine() {
        return creditline;
    }

}

//////////////////// 확인해보기!
