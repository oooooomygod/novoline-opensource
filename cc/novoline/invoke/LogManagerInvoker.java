/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package cc.novoline.invoke;

import cc.novoline.invoke.ListInvoker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogManagerInvoker {
    private static ListInvoker[] b;

    public static Logger c() {
        return LogManager.getLogger();
    }

    public static Logger a(Class clazz) {
        return LogManager.getLogger((Class)clazz);
    }

    public static Logger a(String string) {
        return LogManager.getLogger((String)string);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    static {
        if (LogManagerInvoker.b() == null) {
            LogManagerInvoker.b(new ListInvoker[5]);
        }
    }
}

