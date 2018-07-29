package hr.smilebacksmile.domain.util.factory;

import hr.smilebacksmile.domain.util.abstr.RandomAbstractListGenerator;
import hr.smilebacksmile.domain.util.impl.RandomArrayListGenerator;
import hr.smilebacksmile.domain.util.impl.RandomLinkedListGenerator;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.function.Supplier;

public class RandomListFactory {

    final private static HashMap<Pair<String, String>, Supplier<RandomAbstractListGenerator>> map = new HashMap<>();

    static {
        map.put(new ImmutablePair<>("ArrayList", "Boolean"),
                () -> new RandomArrayListGenerator<>(Boolean.class));
        map.put(new ImmutablePair<>("LinkedList", "Boolean"),
                () -> new RandomLinkedListGenerator<>(Boolean.class));

    }

    public static <T, V> RandomAbstractListGenerator make(Class<V> collectionType, Class<T> type) {

        final Pair<String, String> key = new ImmutablePair<>(collectionType.getSimpleName(), type.getSimpleName());
        Supplier<RandomAbstractListGenerator> listSupplier = map.get(key);
        if(listSupplier != null) {
            return listSupplier.get();
        } else {
            return null;
        }
    }
}
