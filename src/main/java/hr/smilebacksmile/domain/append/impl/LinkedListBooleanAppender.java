package hr.smilebacksmile.domain.append.impl;


import hr.smilebacksmile.domain.append.abstr.AbstractAppender;
import hr.smilebacksmile.domain.append.util.Generator;
import hr.smilebacksmile.domain.append.util.impl.RandomArrayListGenerator;
import hr.smilebacksmile.domain.append.util.impl.RandomLinkedListGenerator;

import java.util.LinkedList;
import java.util.List;

public class LinkedListBooleanAppender extends AbstractAppender<Boolean> {


    public LinkedListBooleanAppender(){
        this.listGenerator = new RandomLinkedListGenerator<LinkedList<Boolean>, Boolean>(new Generator(18, Boolean.class));
        this.initalList = listGenerator.generateCollection();
    }

    @Override
    public List<Boolean> generateList() {
        return listGenerator.generateCollection();
    }

    @Override
    public void append(final List listToAppend) {

    }
}
