package hr.simlebacksmile.benchmark.append;

import hr.simlebacksmile.benchmark.inerfaces.InvokableBenchmark;
import hr.smilebacksmile.domain.append.impl.ArrayListBooleanAppender;
import hr.smilebacksmile.domain.append.impl.LinkedListBooleanAppender;
import org.apache.commons.lang3.time.StopWatch;

public class AppenderBnchMrk implements InvokableBenchmark {


    @Override
    public void runBenchmark() {
        final ArrayListBooleanAppender arrayListBooleanAppender = new ArrayListBooleanAppender();
        final LinkedListBooleanAppender linkedListBooleanAppender = new LinkedListBooleanAppender();

        StopWatch timer = new StopWatch();

        System.out.println("ArrayList: ");
        timer.start();
        arrayListBooleanAppender.getInitalList().forEach(b -> System.out.println(b));
        timer.stop();
        System.out.println("Time: " + timer.getTime());

        timer.reset();
        System.out.println("LinkedList: ");
        timer.start();
        linkedListBooleanAppender.getInitalList().forEach(b -> System.out.println(b));
        timer.stop();
        System.out.println("Time: " + timer.getTime());
    }
}
