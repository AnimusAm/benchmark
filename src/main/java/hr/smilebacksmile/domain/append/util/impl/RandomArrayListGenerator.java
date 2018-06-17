package hr.smilebacksmile.domain.append.util.impl;

import hr.smilebacksmile.domain.append.util.Generator;
import hr.smilebacksmile.domain.append.util.abstr.RandomAbstractListGenerator;

import java.util.*;

public class RandomArrayListGenerator<V extends ArrayList<T>, T> extends RandomAbstractListGenerator<V, T> {

    public RandomArrayListGenerator(final Generator genData) {
        this.generator = genData;
    }

    @Override
    public V generateCollection() {
        final V arrayList = (V) new ArrayList<T>();

        for (int i= 0; i< generator.getSize(); i++) {
            arrayList.add((T) generator.getRandomObject());
        }
        return arrayList;
    }
}
