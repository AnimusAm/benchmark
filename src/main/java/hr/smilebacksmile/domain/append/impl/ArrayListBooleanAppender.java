package hr.smilebacksmile.domain.append.impl;


import hr.hr.smilebacksmile.domain.util.Generator;
import hr.hr.smilebacksmile.domain.util.impl.RandomArrayListGenerator;
import hr.smilebacksmile.domain.append.abstr.AbstractAppender;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBooleanAppender extends AbstractAppender<Boolean> {

    public ArrayListBooleanAppender(final long size){
        this.listGenerator = new RandomArrayListGenerator<ArrayList<Boolean>, Boolean>(new Generator(Boolean.class));
        this.initalList = listGenerator.generateCollection(size);
    }

    @Override
    public List<Boolean> generateList(final long size) {
        return listGenerator.generateCollection(size);
    }

    @Override
    public void append(final List listToAppend) {

    }
}
