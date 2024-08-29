package poly;

public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.drive(new Bus());
        driver.drive(new Taxi());
        driver.drive(new Vehicle());

    }
}

// Vehicle v = new Bus()
// v 가 접근할 수 있는 범위가 제한된다 (부모가 가지고 있는 멤버변수 or 메소드로 제한됨)

// Bus bus= new Bus(); 범위가 다르다

// 상속 시 오버라이딩을 하면
// 부모 메소드는 가려지고 자식 메소드만 실행