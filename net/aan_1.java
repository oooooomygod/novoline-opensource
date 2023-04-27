/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.function.Consumer;

/*
 * Renamed from net.aan
 */
public class aan_1 {
    private static int b;

    public static void b(int n) {
        b = n;
    }

    static {
        if (aan_1.a() == 0) {
            aan_1.b(22);
        }
    }

    public static int a() {
        aan_1.b();
        return 21;
    }

    public static void a(Consumer consumer, Object object) {
        consumer.accept(object);
    }

    public static int b() {
        return b;
    }
}

