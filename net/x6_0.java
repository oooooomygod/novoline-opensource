/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.CountDownLatch;
import net.skidunion.Q;

/*
 * Renamed from net.x6
 */
public class x6_0 {
    private static String[] b;

    public static String[] b() {
        return b;
    }

    public static CountDownLatch a(Q q) {
        return q.e();
    }

    public static Throwable b(Q q) {
        return q.a();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void a(Q q, Object object) {
        q.a(object);
    }

    public static void a(Q q, Throwable throwable) {
        q.a(throwable);
    }

    static {
        if (x6_0.b() != null) {
            x6_0.b(new String[2]);
        }
    }
}

