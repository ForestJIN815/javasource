package shop;

public class SmartTv extends Product {

    private String resolution;

    public SmartTv(String pName, int price, String resolution) {
        super(pName, price);
        this.resolution = resolution;
    }

    // 해상도(resolution)

    @Override
    void printExtra() {
        // 해상도 출력
        System.out.println("해상도 정보 : " + resolution);
    }
}
