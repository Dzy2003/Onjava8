package com.duan.Switch;

import java.util.stream.Stream;

/**
 * @author 白日
 * @create 2023/11/20 22:09
 */

interface LifeForm{
    String move();
    String react();
}
class Worm implements LifeForm{

    @Override
    public String move() {
        return "Worm::move";
    }

    @Override
    public String react() {
        return "Worm::react";
    }
}
class Giraffe implements LifeForm {

    @Override
    public String move() {
        return "Giraffe::move";
    }

    @Override
    public String react() {
        return "Giraffe::react";
    }
}
public class NormalLiskov{
    public static void main(String[] args) {
        Stream.of(new Worm(),new Giraffe())
                .forEach(il -> System.out.println(
                        il.move() + " " + il.react()
                ));
    }
}

