/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 */
package net;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.ThreadFactory;

/*
 * Renamed from net.aGg
 */
public class agg_0 {
    private static boolean b;

    public static ThreadFactory a(ThreadFactoryBuilder threadFactoryBuilder) {
        return threadFactoryBuilder.build();
    }

    static {
        if (agg_0.b()) {
            agg_0.b(true);
        }
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static ThreadFactoryBuilder a(ThreadFactoryBuilder threadFactoryBuilder, String string) {
        return threadFactoryBuilder.setNameFormat(string);
    }

    public static ThreadFactoryBuilder a(ThreadFactoryBuilder threadFactoryBuilder, boolean bl) {
        return threadFactoryBuilder.setDaemon(bl);
    }

    public static boolean c() {
        agg_0.b();
        return true;
    }
}

