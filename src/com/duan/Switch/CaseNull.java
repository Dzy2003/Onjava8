package com.duan.Switch;

import java.util.function.Consumer;

/**
 * @author 白日
 * @create 2023/11/15 21:15
 */

public class CaseNull {
    static void oldCheckNull(String s){
        if(s == null) {
            System.out.println("null");
            return;
        }

        switch (s){
            case "XX" -> System.out.println("XX");
            case "YY" -> System.out.println("YY");
            default -> System.out.println("default");
        }
    }
    static void newCheckNull(String s){
        switch (s){
            case "XX" -> System.out.println("XX");
            case "YY" -> System.out.println("YY");
            case null -> System.out.println("null");
            default -> System.out.println("default");
        }
    }

    static void combineNullAndDefault(String s){
        switch (s){
            case "XX" -> System.out.println("XX");
            case "YY" -> System.out.println("YY");
            case null,default -> System.out.println("null or default");
        }
    }

    static void notCheckNull(String s){
        switch (s){
            case "XX" -> System.out.println("XX");
            case "YY" -> System.out.println("YY");
            default -> System.out.println("default");
        }
    }
     static void test(Consumer<String> consumer){
        consumer.accept("XX");
        consumer.accept("YY");
        try {
            consumer.accept(null);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        test(CaseNull::oldCheckNull);
        test(CaseNull::newCheckNull);
        test(CaseNull::combineNullAndDefault);
        test(CaseNull::notCheckNull);
    }

}
