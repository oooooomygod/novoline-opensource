/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 */
package net;

import com.google.common.collect.Queues;
import java.util.ArrayDeque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * Renamed from net.aRd
 */
public class ard_0 {
    public static ArrayBlockingQueue a(int n) {
        return Queues.newArrayBlockingQueue((int)n);
    }

    public static ConcurrentLinkedQueue b() {
        return Queues.newConcurrentLinkedQueue();
    }

    public static ArrayDeque a() {
        return Queues.newArrayDeque();
    }
}

