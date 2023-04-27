/*
 * Decompiled with CFR 0.152.
 */
package net;

public class E1 {
    public static int a(ThreadGroup threadGroup, Thread[] threadArray, boolean bl) {
        return threadGroup.enumerate(threadArray, bl);
    }

    public static int a(ThreadGroup threadGroup) {
        return threadGroup.activeCount();
    }
}

