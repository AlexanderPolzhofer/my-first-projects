package at.campus.basics.util;

import java.util.Random;

public class RandomHelper {

    public static int randomIntNumber(){
        Random random = new Random();
        return random.nextInt();
    }

    public static double randomDoubleNumber(){
        Random random = new Random();
        return random.nextDouble();
    }
}
