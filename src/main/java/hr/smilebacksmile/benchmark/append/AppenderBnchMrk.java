package hr.smilebacksmile.benchmark.append;

import hr.smilebacksmile.benchmark.inerfaces.InvokableBenchmark;
import hr.smilebacksmile.domain.append.impl.ArrayListBooleanListAppender;
import hr.smilebacksmile.domain.append.impl.LinkedListBooleanListAppender;

import java.util.List;

public class AppenderBnchMrk implements InvokableBenchmark {


/*    @Override
    public void runBenchmark() {

        StopWatch timer = new StopWatch();

        System.out.println("ArrayList: ");
        timer.start();
        final ArrayListBooleanListAppender arrayListBooleanAppender = new ArrayListBooleanListAppender(1000000);
        arrayListBooleanAppender.getInitalList();
        timer.stop();

        System.out.println("Time: " + timer.getTime());

        timer.reset();
        System.out.println("LinkedList: ");
        timer.start();
        final LinkedListBooleanListAppender linkedListBooleanAppender = new LinkedListBooleanListAppender(1000000);
        linkedListBooleanAppender.getInitalList();
        timer.stop();
        System.out.println("Time: " + timer.getTime());
    }*/

    @Override
    public void runBenchmark() {

        final ArrayListBooleanListAppender arrayListBooleanAppender = new ArrayListBooleanListAppender();
        final List<Boolean> arrayList = arrayListBooleanAppender.generateList(100000);
        arrayListBooleanAppender.setList(arrayList);


        final LinkedListBooleanListAppender linkedListBooleanAppender = new LinkedListBooleanListAppender();
        final List<Boolean> linkedList = linkedListBooleanAppender.generateList(100000);
        linkedListBooleanAppender.setList(linkedList);
    }
}
