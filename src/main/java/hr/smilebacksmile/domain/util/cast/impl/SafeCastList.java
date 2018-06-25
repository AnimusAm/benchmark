package hr.smilebacksmile.domain.util.cast.impl;

import hr.smilebacksmile.domain.util.cast.SafeCast;

import java.util.Collection;
import java.util.List;

public abstract class SafeCastList implements SafeCast {

    protected static <T> void checkListContents(Collection<T> collection, Class<T> elementType) {
        for (T entry : collection) {
            SafeCast.checkType(elementType, entry);
        }
    }

    @SuppressWarnings({"unchecked"})
    public static <V extends List<T>, T> V safeCastList(Collection<T> collection) {
        SafeCast.checkType(List.class, collection);
        return (V) collection;
    }
}
