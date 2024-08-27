package classtest;

public class Time {
    // 속성 : 시,분,초(float)
    private int hour;
    private int minute;
    private int second;

    // 생성자
    // public Time(int hour, int minute, int second) {
    // this.hour = hour;
    // this.minute = minute;
    // this.second = second;
    // }

    // getter 메소드 작성 ////// -> (우)마우스 - Source Action - Generate getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            return;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            return;
        this.minute = minute;  //////// 확인
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            return;
        this.second = second; ///////// 확인
    }

    @Override //////////////////////////// 클래스 정의할때 toString 무조건 해라!
    public String toString() {
        return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
    }

}