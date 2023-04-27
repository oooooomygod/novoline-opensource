/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.Yo
 */
public class yo_0 {
    private static Logger a = LogManagerInvoker.c();
    private static AtomicInteger b = new AtomicInteger(0);

    static AtomicInteger b() {
        return b;
    }

    static Logger a() {
        return a;
    }
}

