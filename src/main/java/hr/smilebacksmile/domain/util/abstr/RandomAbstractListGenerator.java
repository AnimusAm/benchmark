package hr.smilebacksmile.domain.util.abstr;

import hr.smilebacksmile.domain.util.Generator;
import hr.smilebacksmile.domain.util.RandomCollectionGenerator;

import java.util.List;


public abstract class RandomAbstractListGenerator<V extends List<T>, T> implements RandomCollectionGenerator<V, T> {

    protected Generator generator;

    @Override
    public abstract V generateCollection(final long size);
}
