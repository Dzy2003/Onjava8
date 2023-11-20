package com.duan.Switch;

/**
 * @author 白日
 * @create 2023/11/19 21:42
 */

public class SmartCasting {
    static void dumb(Object x){
        if(x instanceof String){
            String s = (String) x;
            if(!s.isEmpty()){
                System.out.println(s.toUpperCase());
            }
        }
    }
    static void smart(Object x){
        if(x instanceof String s){
            if(!s.isEmpty()){
                System.out.println(s.toUpperCase());
            }
        }
    }

    public static void main(String[] args) {
        dumb("dumb");
        smart("smart");
    }
}
