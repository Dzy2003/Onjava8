package com.duan.Switch;

/**
 * @author 白日
 * @create 2023/11/15 19:23
 */

public class ArrowInSwitch {
    static void colons(int i) {
        switch (i) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("tow");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
        }
    }
    static void arrows(int i) {
        switch (i) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("tow");
            case 3 -> System.out.println("three");
            default -> System.out.println("default");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            colons(i);
            arrows(i);
        }
    }
}
