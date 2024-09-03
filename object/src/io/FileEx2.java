package io;

import java.io.File;

public class FileEx2 {
    public static void main(String[] args) {
        File f = new File("c:\\temp");

        if (!f.exists() || !f.isDirectory()) {
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0); // 종료
        }

        // 폴더 접근 후 파일 목록 읽어오기 ///~ 자바 프로그램을 통해서 내 폴더에 접근 가능하다
        File[] files = f.listFiles();
        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();
            System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
        }
    }
}
