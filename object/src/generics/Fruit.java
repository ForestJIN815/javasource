package generics;

public class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }

}

class FruitBox<T extends Fruit> extends Box3<T> {
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makejuice(FruitBox<? extends Fruit> box) { // ~ 와일드 카드 쓴거임
        String tmp = "";
        for (Fruit f : box.getlist()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}
