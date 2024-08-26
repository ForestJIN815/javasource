package classtest;

public class Tv {
    public static void main(String[] args) { /////////// 에러 에러

    // 속성 => 변수
    private int channel; // 채널 : 번호
    private boolean power; // 전원상태 : true(on) / false(off)
    private String company; // 제조사 : 삼성, LG
    /* 멤버변수 */

    // 생성자
    // 클래스 이름(){}
    // 생성자 오버로딩 (하나의 클래스에 생성자가 여러개 존재)
    Tv() {
        // default 생성자
    }

    Tv(int channel, boolean power, String company) {
        this.channel = channel;
        this.power = power;
        this.company = company;
        /* 지역변수 (중괄호 안에 선언한 것들) */
    }

    // 전원을 켠다 / 끈다
    void power() {
        this.power = !this.power(); /////////// 에러 에러
    }

    // 채널 올린다 / 내린다
    void channelUp() {
        this.channel++;
    }

    void channelDown() {
        this.channel--;
    }

    // set 으로 시작하는 메소는는 setter 메소드 임

    // get 으로 시작하는 메소드는 getter 메소드 임
    public int getChannel() {
        // channel 값 보낼께
        return channel;
    }

    public String getCompany() {
        return company;
    }

    public String isPower() {
        return company;
    }

}

//////////////////////// 갱신 갱신 !!