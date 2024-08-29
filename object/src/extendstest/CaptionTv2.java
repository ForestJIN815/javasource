package extendstest;

public class CaptionTv2 extends Tv2 {
    private boolean caption;

    // 묵시적(implicit) / 명시적(explicit)

    // Implicit super constructor Tv2() is undefined
    // for default constructor. Must define an explicit constructor

    // public CaptionTv2(){
    // super(); // 부모의 default 생성자 호출
    // }

    public CaptionTv2(String color, int channel, boolean power, boolean caption) {
        super(color, channel, power);
        this.caption = caption;
    }

    void displayCaption(String text) { /////////////// 체크 체크
        if (caption) {
            System.out.println(text);
        }
    }

    /////////////////////////////////////////////////////////////////////
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    public boolean isCaption() {
        return caption;
    }

    private void setCaption(boolean caption) {
        this.caption = caption;
    }
    ////////////////////////////////////////////////////////////////////// 확인해보자
}
