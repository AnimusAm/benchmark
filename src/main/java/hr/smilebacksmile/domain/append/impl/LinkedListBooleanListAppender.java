package hr.smilebacksmile.domain.append.impl;


import hr.smilebacksmile.domain.append.abstr.AbstractListAppender;
import hr.smilebacksmile.domain.util.Generator;
import hr.smilebacksmile.domain.util.factory.RandomListFactory;
import hr.smilebacksmile.domain.util.impl.RandomLinkedListGenerator;
import hr.smilebacksmile.performance.logging.annotations.LoggablePerformance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBooleanListAppender extends AbstractListAppender<Boolean> {

    public LinkedListBooleanListAppender(final Class<?> type){
        this.listGenerator = RandomListFactory.make(LinkedList.class, type);
        this.innerList = new LinkedList<>();
    }

    @Override
    @LoggablePerformance(logger = "LinkedListBooleanListAppender")
    public List<Boolean> generateList(final long size) {
        return listGenerator.generateCollection(size);
    }

    @Override
    public void append(final List listToAppend) {

    }
}
