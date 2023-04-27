/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * Renamed from net.a3
 */
public class a3_0 {
    public static boolean a(ConcurrentLinkedQueue concurrentLinkedQueue, Object object) {
        return concurrentLinkedQueue.add(object);
    }

    public static Object a(ConcurrentLinkedQueue concurrentLinkedQueue) {
        return concurrentLinkedQueue.poll();
    }
}

