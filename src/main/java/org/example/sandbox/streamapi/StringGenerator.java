package org.example.sandbox.streamapi;

import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {

    protected Random random = new Random();
    protected char[] letters = "0123456789ABCDEF".toCharArray();

    @Override
    public String get() {
        return "" + letters[random.nextInt(letters.length)];
    }
}
