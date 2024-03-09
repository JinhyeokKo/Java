# 클래스
```Java
// 패키지
package com.company.project.toppackage.lowerpackage;

// 클래스 임포트
import com.company.project.toppackage.lowerpackage.Armor;
import java.io.*;

// 클래스
public class Armor {
    // 필드
    public String name;
    private int height;
    protected int weight;
    String color; // default
    boolean isFly;

    // 메서드
    void land() {
    }

    public boolean takeOff() {
        System.out.println("Take on!");
        System.out.println("Take off!");
        return true;
    }
    
    // 매개변수
    void launchMissile(int value) {
        int missile = value;
    }
    
    // 메서드 오버로딩
    void launchMissile(int value, int value_speed) {
        int missile = value;
        int missileSpeed = value_speed;
    }
    
    // 가변 길이 인자
    void shootLaser(int... values) {
        System.out.print(values.length + " Laser:");
        for (int i = 0; i < values.length; i++) {
            System.out.print(" " + values[i]);
        }
        System.out.println();
    }
    
    // 복합 선언
    void pilot(String name, int ...values) {
        System.out.println("Pilot: " + name);
        for (int i = 0; i < values.length; i++) {
            System.out.println("Value: " + values[i]);
        }
    }

    public static void main(String[] args) {
        //코드
        System.out.println("Hello World");
        //메서드 호출
        takeOff();
        lanchMissile(3);
        lanchMissile(3, 100);
        shortLaser(1, 2, 3, 4, 5);
        shortLaser(1, 2, 3);
        pilot("Tom", 1, 3, 7, 9, 11);
    }
}
```
