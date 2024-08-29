package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = null;

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();

        // 자동 형 변환
        car = fe; // Car car = new FireEngine();
        // car.water(); (X)

        fe2 = (FireEngine) car;
        fe2.water();

        Car car2 = new Car();
        // ClassCastExceptin (실행시(런타임) 오류 발생) ; instanceof 연산자
        if (car2 instanceof FireEngine) {
            fe = (FireEngine) car2;
            fe.drive();    
        }
        
        if (car2 instanceof Car) {

        }
  
    }
}
