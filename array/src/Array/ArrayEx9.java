package Array;

public class ArrayEx9 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Yi" };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "\t");
            System.out.println();

            char[] chArr = (names[0].toCharArray());

            // System.out.println(Arrays.toString(chArr));

            for (int j = 0; j < chArr.length; j++) {
                int pos = (int) (Math.random() * chArr.length);

                char temp = chArr[j];
                chArr[j] = chArr[pos];
                chArr[pos] = temp;
            }

            System.out.println(new String(chArr));

        }

        ////////////////////// 영역지정 -> Alt + 화살표 -> 이동

    }
}
