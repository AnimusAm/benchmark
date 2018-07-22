package hr.smilebacksmile.domain.append.impl;


import hr.smilebacksmile.domain.append.abstr.AbstractListAppender;
import hr.smilebacksmile.domain.util.Generator;
import hr.smilebacksmile.domain.util.impl.RandomArrayListGenerator;
import hr.smilebacksmile.performance.logging.annotations.LoggablePerformance;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBooleanListAppender extends AbstractListAppender<Boolean> {

    public ArrayListBooleanListAppender(final Class<?> type){
        this.listGenerator = new RandomArrayListGenerator<ArrayList<Boolean>, Boolean>(new Generator(type));
        this.innerList = new ArrayList<>();
    }

    @Override
    @LoggablePerformance(logger = "ArrayListBooleanListAppender")
    public List<Boolean> generateList(final long size) {
        return listGenerator.generateCollection(size);
    }

    @Override
    public void append(final List listToAppend) {

    }
}
