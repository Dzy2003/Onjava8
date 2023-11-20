package com.duan.Switch;

/**
 * @author 白日
 * @create 2023/11/16 21:23
 */

public class SwitchExpression {
    static int colon(String s){
        return switch (s) {
            case "1" : yield 1;
            case "2" : yield 2;
            case "3" : yield 3;
            default : yield 0;
        };
    }
    static int arrow(String s){
        return switch (s) {
            case "1" -> {
                System.out.println(1);
                yield 1;
            }
            case "2" -> {
                System.out.println(2);
                yield 2;
            }
            case "3" -> {
                System.out.println(3);
                yield 3;
            }
            default -> {
                System.out.println(0);
                yield 0;
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new String[]{"1", "2", "3", "4"}) {
            System.out.println(arrow(s));
        }

    }
}
