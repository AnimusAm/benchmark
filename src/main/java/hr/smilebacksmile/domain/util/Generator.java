package hr.smilebacksmile.domain.util;

import hr.smilebacksmile.domain.util.cast.SafeCast;

import java.util.Random;

public class Generator<T> {

    private static final long MAX_SIZE = Long.MAX_VALUE;

    private Random rand = new Random();
    private Class<T> generatorType;

    public Generator(final Class<T> generatorType) {
        this.generatorType = generatorType;
    }

    public T getRandomObject() {
        final Object returnValue;
        if (generatorType == Boolean.class) {
            returnValue = rand.nextBoolean();
        } else if (generatorType == Integer.class) {
            returnValue = rand.nextInt();
        } else {
            returnValue = null;
        }

        return SafeCast.cast(generatorType, returnValue);
    }
}
