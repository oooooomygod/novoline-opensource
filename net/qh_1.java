/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.TimerUtil;

/*
 * Renamed from net.qH
 */
public class qh_1 {
    private static ListInvoker[] b;

    static {
        if (qh_1.b() == null) {
            qh_1.b(new ListInvoker[1]);
        }
    }

    public static long c(TimerUtil timerUtil) {
        return timerUtil.d();
    }

    public static boolean c(TimerUtil timerUtil, long l4) {
        return timerUtil.c(l4);
    }

    public static void a(TimerUtil timerUtil, long l4) {
        timerUtil.a(l4);
    }

    public static boolean b(TimerUtil timerUtil, long l4) {
        return timerUtil.d(l4);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static void b(TimerUtil timerUtil) {
        timerUtil.a();
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static boolean a(TimerUtil timerUtil, double d) {
        return timerUtil.a(d);
    }

    public static long a(TimerUtil timerUtil) {
        return timerUtil.c();
    }
}

