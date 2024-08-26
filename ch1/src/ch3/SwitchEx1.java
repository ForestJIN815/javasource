package ch3;

public class SwitchEx1 {
    public static void main(String[] args) {
        // swith : if ~ else if ~ else 대체

        // switch (char or String or int) {
        // case value:

        // break;

        // default:
        // break;
        // }

        int random = (int) (Math.random() * 6) + 1;

        switch (random) {
            case 1: // random == 1
                System.out.println("주사위 1이 나옴");
                break;
            case 2: // random == 2
                System.out.println("주사위 2이 나옴");
                break;
            case 3: // random == 3
                System.out.println("주사위 3이 나옴");
                break;
            case 4: // random == 4
                System.out.println("주사위 4이 나옴");
                break;
            case 5: // random == 5
                System.out.println("주사위 5이 나옴");
                break;
            default: // else
                System.out.println("주사위 6이 나옴");
                break;
        }

    }
}
