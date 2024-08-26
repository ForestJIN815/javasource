package classtest;

public class ReferenceParamEx1 {
    public static void main(String[] args) {

        int[] arr = { 3, 2, 1, 6, 5, 4 };

        printArr(arr): // [3,2,1,6,5,2,]
        sortArr(arr);
        printArr(arr); // [1,2,3,4,5,6,]
        System.out.println("배열 총합 = 21); ///////////////// 체크 체크

    }

    static void printArr(int[] arr) {

    }

    static int sumArr(int[] sumArr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static void sortArr(int[] arr) {
        // 정렬 알고리즘
        // 1. 선택
        // 2. 버블
        // 3. 퀵
        // ....
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

////////////////// 다 못함.. 채우기
