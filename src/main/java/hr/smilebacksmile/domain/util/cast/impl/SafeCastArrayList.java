package hr.smilebacksmile.domain.util.cast.impl;

import hr.smilebacksmile.domain.util.cast.SafeCast;

import java.util.ArrayList;
import java.util.Collection;

public class SafeCastArrayList extends SafeCastList {

    protected static <T> void checkListType(Collection<T> collection) {
        SafeCast.checkType(ArrayList.class, collection);
    }

    @SuppressWarnings({"unchecked"})
    public static <V extends ArrayList<T>, T> V safeCastList(Collection<T> collection, Class<T> elementType) {
        checkListType(collection);
        checkListContents(collection, elementType);
        return (V) collection;
    }
}
