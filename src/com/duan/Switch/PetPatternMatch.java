package com.duan.Switch;

import java.util.stream.Stream;

/**
 * @author 白日
 * @create 2023/11/20 22:37
 */

public class PetPatternMatch {
    static void CareFor(Pet pet){
        switch (pet){
            case Dog d -> d.bark();
            case Fish f -> f.changeWater();
            case Pet sp -> sp.feed();
        }
    }

    public static void main(String[] args) {
        Stream.of(new Dog(),new Fish(),new Pet())
                .forEach(PetPatternMatch::CareFor);
    }
}
