package com.learn.tool.utils;

import java.util.Random;
import java.util.UUID;

public class RandomUtil {

    public static int getRandom() {
        double random = Math.random();
        return (int) (random * 100);
    }
}
