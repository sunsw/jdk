package com.sunsw.atomic;

import com.sunsw.singleton.Singleton0;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Sucre on 16/10/7.
 */
public class TestAtomic {
    AtomicInteger at = new AtomicInteger(1);
    AtomicIntegerArray ata = new AtomicIntegerArray(5);
    AtomicReference<Singleton0> atr = new AtomicReference<Singleton0>();

    public void method() {
        at.incrementAndGet();
        ata.addAndGet(0, 8);
        atr.get();
    }
}
