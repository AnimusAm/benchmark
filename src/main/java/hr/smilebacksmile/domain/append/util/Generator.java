package hr.smilebacksmile.domain.append.util;

import java.util.Random;

public class Generator {

    private static final long MAX_SIZE = 20;// Long.MAX_VALUE;

    private Random rand = new Random();
    private long size = MAX_SIZE;
    private Class<?> generatorType = Boolean.class.getClass();

    public Generator(){ }

    public Generator(final long size, Class<?> generatorType) {
        this.size = size;
        this.generatorType = generatorType;
    }

    public Object getRandomObject() {
        final Object returnValue;
        if (generatorType == Boolean.class) {
            returnValue = rand.nextBoolean();
        } else if (generatorType == Integer.class) {
            returnValue = rand.nextInt();
        } else {
            returnValue = null;
        }
        return returnValue;
    }

    public long getSize() {
        return size;
    }
}
