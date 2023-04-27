/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Timer;
import java.util.TimerTask;

/*
 * Renamed from net.asj
 */
public class asj_2 {
    public static void a(Timer timer, TimerTask timerTask, long l4, long l5) {
        timer.schedule(timerTask, l4, l5);
    }

    public static void a(Timer timer) {
        timer.cancel();
    }
}

