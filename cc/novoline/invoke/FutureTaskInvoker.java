/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import java.util.Queue;

public class FutureTaskInvoker {
    public static Object a(Queue queue) {
        return queue.remove();
    }

    public static boolean c(Queue queue) {
        return queue.isEmpty();
    }

    public static Object d(Queue queue) {
        return queue.poll();
    }

    public static boolean a(Queue queue, Object object) {
        return queue.add(object);
    }

    public static int b(Queue queue) {
        return queue.size();
    }
}

