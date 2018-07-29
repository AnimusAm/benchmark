package hr.smilebacksmile.domain.util.factory;

import hr.smilebacksmile.domain.util.Generator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class GeneratorFactory {

    final private static Map<Class<?>, Supplier<Generator>> map = new HashMap<>();

    static {
        map.put(Boolean.class, ()-> new Generator<>(Boolean.class));
        map.put(Integer.class, ()-> new Generator<>(Integer.class));
    }

    public static <T> Generator getGenerator(Class<T> generatorType){
        Supplier<Generator> generatorSupplier = map.get(generatorType);
        if(generatorSupplier != null) {
            return generatorSupplier.get();
        }
        throw new IllegalArgumentException("No such generator " + generatorType.getSimpleName());
    }

}
