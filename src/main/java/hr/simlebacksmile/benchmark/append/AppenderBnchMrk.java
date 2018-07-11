package hr.simlebacksmile.benchmark.append;

import hr.simlebacksmile.benchmark.inerfaces.InvokableBenchmark;
import hr.smilebacksmile.domain.append.impl.ArrayListBooleanAppender;
import hr.smilebacksmile.domain.append.impl.LinkedListBooleanAppender;
import org.apache.commons.lang3.time.StopWatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppenderBnchMrk implements InvokableBenchmark {


    @Override
    public void runBenchmark() {

        StopWatch timer = new StopWatch();

        System.out.println("ArrayList: ");
        timer.start();
        final ArrayListBooleanAppender arrayListBooleanAppender = new ArrayListBooleanAppender(1000000);
        arrayListBooleanAppender.getInitalList();
        timer.stop();

        System.out.println("Time: " + timer.getTime());

        timer.reset();
        System.out.println("LinkedList: ");
        timer.start();
        final LinkedListBooleanAppender linkedListBooleanAppender = new LinkedListBooleanAppender(1000000);
        linkedListBooleanAppender.getInitalList();
        timer.stop();
        System.out.println("Time: " + timer.getTime());
    }
}
