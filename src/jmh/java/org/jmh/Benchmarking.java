package org.jmh;

import java.util.concurrent.TimeUnit;


import org.example.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class Benchmarking {
    @Benchmark
    public void javaJoin(Blackhole bh) {
        bh.consume(String.join(",\n", Main.getProductList()));
    }

    @Benchmark
    public void myJoin(Blackhole bh) {
        bh.consume(String.join(",\n", Main.myJoinStringList(Main.getProductList())));
    }
}
