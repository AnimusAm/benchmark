package hr.smilebacksmile.domain.append.util;

import java.util.Collection;

public interface RandomCollectionGenerator<V extends Collection<T>, T> {

    V generateCollection();
}
