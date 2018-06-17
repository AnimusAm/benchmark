package hr.smilebacksmile.domain.append.util.impl;

import hr.smilebacksmile.domain.append.util.Generator;
import hr.smilebacksmile.domain.append.util.abstr.RandomAbstractListGenerator;

import java.util.ArrayList;
import java.util.LinkedList;

public class RandomLinkedListGenerator<V extends LinkedList<T>, T> extends RandomAbstractListGenerator<V, T> {

    public RandomLinkedListGenerator(final Generator genData) {
        this.generator = genData;
    }

    @Override
    public V generateCollection() {
        final V linkedList = (V) new LinkedList<T>();

        for (int i= 0; i< generator.getSize(); i++) {
            linkedList.add((T) generator.getRandomObject());
        }
        return linkedList;
    }
}
