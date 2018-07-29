package hr.smilebacksmile.domain.util.impl;

import hr.smilebacksmile.domain.util.Generator;
import hr.smilebacksmile.domain.util.abstr.RandomAbstractListGenerator;
import hr.smilebacksmile.domain.util.cast.impl.SafeCastList;
import hr.smilebacksmile.domain.util.factory.GeneratorFactory;

import java.util.ArrayList;

public class RandomArrayListGenerator<V extends ArrayList<T>, T> extends RandomAbstractListGenerator<V, T> {

    public RandomArrayListGenerator(final Class<T> type) {
       super(type);
    }

    private V generate(final long size) {
        final V arrayList = SafeCastList.safeCastList(new ArrayList<>());

        for (int i= 0; i< size; i++) {
            arrayList.add((T) generator.getRandomObject());
        }
        return arrayList;
    }

    @Override
    public V generateCollection(final long size) {
        return generate(size);
    }
}
