package extendstest;

public class CaptionTv {
    private boolean caption;

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
}
