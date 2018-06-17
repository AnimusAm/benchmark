package hr.hr.smilebacksmile.domain.util;

import java.util.Collection;

public interface RandomCollectionGenerator<V extends Collection<T>, T> {

    V generateCollection(long size);
}
