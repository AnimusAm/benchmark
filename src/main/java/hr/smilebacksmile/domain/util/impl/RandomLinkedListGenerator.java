package hr.smilebacksmile.domain.util.impl;

import hr.smilebacksmile.domain.util.Generator;
import hr.smilebacksmile.domain.util.abstr.RandomAbstractListGenerator;
import hr.smilebacksmile.domain.util.cast.impl.SafeCastList;

import java.util.LinkedList;

public class RandomLinkedListGenerator<V extends LinkedList<T>, T> extends RandomAbstractListGenerator<V, T> {

    public RandomLinkedListGenerator(final Generator generator) {
        this.generator = generator;
    }

    private V generate(final long size) {
        final V linkedList = SafeCastList.safeCastList(new LinkedList<>());

        for (int i= 0; i< size; i++) {
            linkedList.add((T) generator.getRandomObject());
        }
        return linkedList;
    }

    @Override
    public V generateCollection(final long size) {
        return generate(size);
    }
}
