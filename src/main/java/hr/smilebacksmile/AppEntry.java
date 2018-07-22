package hr.smilebacksmile;

import hr.smilebacksmile.benchmark.inerfaces.InvokableBenchmark;
import hr.smilebacksmile.benchmark.append.AppenderBnchMrk;

public class AppEntry {

    static InvokableBenchmark benchmark;

    public static void main(String [] args) {

        benchmark = new AppenderBnchMrk();
        benchmark.runBenchmark();
    }
}
