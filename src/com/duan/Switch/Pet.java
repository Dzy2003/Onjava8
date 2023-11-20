package com.duan.Switch;

/**
 * @author 白日
 * @create 2023/11/20 22:26
 */
public class Pet {
    void feed() {
        System.out.println("Pet::feed");
    }
}
class Dog extends Pet {
    void bark() {
        System.out.println("Dog::bark");
    }
}

class Fish extends Pet {
    void changeWater() {
        System.out.println("Fish::changeWater");
    }
}
