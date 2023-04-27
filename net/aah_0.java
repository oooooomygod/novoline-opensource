/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;

/*
 * Renamed from net.aAh
 */
public class aah_0 {
    public static int b(BlockingQueue blockingQueue) {
        return blockingQueue.size();
    }

    public static boolean d(BlockingQueue blockingQueue) {
        return blockingQueue.isEmpty();
    }

    public static boolean a(BlockingQueue blockingQueue, Object object) {
        return blockingQueue.offer(object);
    }

    public static Object c(BlockingQueue blockingQueue) {
        return blockingQueue.take();
    }

    public static boolean b(BlockingQueue blockingQueue, Object object) {
        return blockingQueue.remove(object);
    }

    public static boolean c(BlockingQueue blockingQueue, Object object) {
        return blockingQueue.add(object);
    }

    public static boolean a(BlockingQueue blockingQueue, Collection collection) {
        return blockingQueue.addAll(collection);
    }

    public static Object a(BlockingQueue blockingQueue) {
        return blockingQueue.poll();
    }
}

