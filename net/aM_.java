/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.BitSet;

public class aM_ {
    public static void b(BitSet bitSet, int n) {
        bitSet.set(n);
    }

    public static boolean a(BitSet bitSet, int n) {
        return bitSet.get(n);
    }

    public static void a(BitSet bitSet, int n, boolean bl) {
        bitSet.set(n, bl);
    }

    public static int c(BitSet bitSet, int n) {
        return bitSet.nextClearBit(n);
    }

    public static void a(BitSet bitSet) {
        bitSet.clear();
    }

    public static void a(BitSet bitSet, int n, int n2, boolean bl) {
        bitSet.set(n, n2, bl);
    }

    public static int b(BitSet bitSet) {
        return bitSet.size();
    }
}

