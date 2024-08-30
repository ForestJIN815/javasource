package api;

public class StringEx3 {
    public static void main(String[] args) {
        String[] names = { "Queen", "Tod", "Jerry", "Choi", "Kim", "Park" };

        String result = findKim(names);
        System.out.println(result);
    }

    static String findKim(String[] names) {
        // Kim 찾기
        int pos = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("kim")) {
                pos = i;
                break;

            }
        }

        return "Kim 은 " + (pos + 1) + "번째 위치에 있다";
        /// ~ (pos + 1) = 찾은 위치

    }
}

/// ~ 답이 다르다. 체크해보길~! 5 가 나와야 함