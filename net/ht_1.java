/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.hT
 */
public class ht_1
extends Exception {
    private Object[] a;

    public ht_1(String string, Object ... objectArray) {
        super(string);
        this.a = objectArray;
    }

    public Object[] a() {
        return this.a;
    }

    public ht_1(String string, Throwable throwable, Object ... objectArray) {
        super(string, throwable);
        this.a = objectArray;
    }
}

