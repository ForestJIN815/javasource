package extendstest;

public class Triangle extends Shape {
    // Point p1 = new Point();
    // Point p2 = new Point();
    // Point p3 = new Point();

    Point[] p = new Point[3];

    public Triangle(Point[] p) {
        this.p = p;
    }

    @Override
    void draw() {
        System.out.printf("[p1 = %s, p2 = %s, color = %s]\n", p[0].getXY(), p[1].getXY(), p[2].getXY(), getColor()); /////////////////// 자동완성기능(확인해보기)

    }

}
