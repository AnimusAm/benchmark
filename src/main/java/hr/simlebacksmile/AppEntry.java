package hr.simlebacksmile;

import hr.simlebacksmile.benchmark.inerfaces.InvokableBenchmark;
import hr.simlebacksmile.benchmark.append.AppenderBnchMrk;

public class AppEntry {

    static InvokableBenchmark benchmark;

    public static void main(String [] args) {

        benchmark = new AppenderBnchMrk();
        benchmark.runBenchmark();
    }
}
