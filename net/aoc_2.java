/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.util.SortedMap;
import java.util.TreeMap;
import net.PC;
import net.aIJ;
import net.af3_0;
import net.af7_0;
import net.aha_0;
import net.ahy_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.aoc
 */
public class aoc_2 {
    private aha_0 b = aha_0.OVERWRITE;
    private SortedMap<Object[], PC> a = new TreeMap<Object[], PC>(new aIJ());

    public @NonNull aha_0 b() {
        return this.b;
    }

    public @NonNull aoc_2 a(@NonNull aha_0 aha_02) {
        this.b = aha_02;
        return this;
    }

    public @NonNull af3_0 a() {
        return new af7_0(this.a, this.b);
    }

    protected aoc_2() {
    }

    public @NonNull aoc_2 a(Object[] objectArray, PC pC) {
        ahy_0.a(this.a, objectArray, pC);
        return this;
    }
}

