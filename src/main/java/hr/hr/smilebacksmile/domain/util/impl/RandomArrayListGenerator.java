package hr.hr.smilebacksmile.domain.util.impl;

import hr.hr.smilebacksmile.domain.util.Generator;
import hr.hr.smilebacksmile.domain.util.abstr.RandomAbstractListGenerator;
import hr.hr.smilebacksmile.domain.util.cast.SafeCast;
import hr.hr.smilebacksmile.domain.util.cast.impl.SafeCastArrayList;
import hr.hr.smilebacksmile.domain.util.cast.impl.SafeCastList;

import java.util.*;

public class RandomArrayListGenerator<V extends ArrayList<T>, T> extends RandomAbstractListGenerator<V, T> {

    public RandomArrayListGenerator(final Generator generator) {
        this.generator = generator;
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
