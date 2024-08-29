package inter;

public interface RemoteControl {
    // public static final 있는 상태임
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    void setVolume(int volume);

    // 밑에는 안 해도 된다. 디폴트, 스태틱 앞에 붙이면 할 수 있다는 것을 보여줌
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리");
        } else {
            System.out.println("무음해제");
        }
    }

    static void changeBattery() {
        System.out.println("건전지 교체");
    }
}
