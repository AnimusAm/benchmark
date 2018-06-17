package hr.smilebacksmile.domain.append.impl;


import hr.hr.smilebacksmile.domain.util.Generator;
import hr.hr.smilebacksmile.domain.util.impl.RandomLinkedListGenerator;
import hr.smilebacksmile.domain.append.abstr.AbstractAppender;

import java.util.LinkedList;
import java.util.List;

public class LinkedListBooleanAppender extends AbstractAppender<Boolean> {

    public LinkedListBooleanAppender(final long size){
        this.listGenerator = new RandomLinkedListGenerator<LinkedList<Boolean>, Boolean>(new Generator(Boolean.class));
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
