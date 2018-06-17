package hr.smilebacksmile.domain.append.util.abstr;

import hr.smilebacksmile.domain.append.util.Generator;
import hr.smilebacksmile.domain.append.util.RandomCollectionGenerator;

import java.util.List;


public abstract class RandomAbstractListGenerator<V extends List<T>, T> implements RandomCollectionGenerator<V, T>{

    protected Generator generator;

    @Override
    public abstract V generateCollection();
}
