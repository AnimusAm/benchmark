package hr.smilebacksmile.domain.append.impl;


import hr.smilebacksmile.domain.append.abstr.AbstractAppender;
import hr.smilebacksmile.domain.append.util.Generator;
import hr.smilebacksmile.domain.append.util.impl.RandomArrayListGenerator;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBooleanAppender extends AbstractAppender<Boolean> {


    public ArrayListBooleanAppender(){
        this.listGenerator = new RandomArrayListGenerator<ArrayList<Boolean>, Boolean>(new Generator(18, Boolean.class));
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
