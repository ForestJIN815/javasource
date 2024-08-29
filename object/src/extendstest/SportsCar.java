package extendstest;

public class SportsCar extends Car {

    public SportsCar(String name) {
        super(name);
    }

    // 놓쳤다 - Quick Fix 8.29.AM

    @Override // 오버라이드 ?
    void drive() {
        System.out.println("스포츠카가 달립니다");
    }

}
