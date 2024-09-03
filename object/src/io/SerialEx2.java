package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialEx2 {
    public static void main(String[] args) {

        // 객체 상태로 저장된 파일 읽기
        try (FileInputStream fis = new FileInputStream("c:\\temp\\person.dat");
                BufferedInputStream bis = new BufferedInputStream(fis);
                ObjectInputStream ois = new ObjectInputStream(bis)) {

            for (int i = 0; i < 2; i++) {
                Person p1 = (Person) ois.readObject();
                System.out.println(p1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}