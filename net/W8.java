/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import net.aD0;
import net.ao2_0;
import net.asi_0;

public class W8
extends Logger {
    private static ListInvoker[] b;
    private org.apache.logging.log4j.Logger c;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    @Override
    public void log(Level level, String string, Object object) {
        W8.b();
        if (level == Level.FINE) {
            LoggerInvoker.a(this.c, string, new Object[]{object});
        }
        if (level == Level.WARNING) {
            LoggerInvoker.b(this.c, string, new Object[]{object});
        }
        if (level == Level.SEVERE) {
            LoggerInvoker.c(this.c, string, new Object[]{object});
        }
        if (level == Level.INFO) {
            LoggerInvoker.e(this.c, string, new Object[]{object});
        }
        LoggerInvoker.d(this.c, string, new Object[]{object});
    }

    @Override
    public void log(Level level, String string, Throwable throwable) {
        W8.b();
        if (level == Level.FINE) {
            LoggerInvoker.c(this.c, string, throwable);
        }
        if (level == Level.WARNING) {
            LoggerInvoker.b(this.c, string, throwable);
        }
        if (level == Level.SEVERE) {
            LoggerInvoker.a(this.c, string, throwable);
        }
        if (level == Level.INFO) {
            LoggerInvoker.f(this.c, string, throwable);
        }
        LoggerInvoker.e(this.c, string, throwable);
    }

    @Override
    public void log(LogRecord logRecord) {
        this.log(aD0.b(logRecord), aD0.a(logRecord));
    }

    public W8(org.apache.logging.log4j.Logger logger) {
        super(asi_0.a, null);
        this.c = logger;
    }

    @Override
    public void log(Level level, String string, Object[] objectArray) {
        this.log(level, ao2_0.a(string, objectArray));
    }

    static {
        if (W8.b() == null) {
            W8.b(new ListInvoker[1]);
        }
    }

    @Override
    public void log(Level level, String string) {
        W8.b();
        if (level == Level.FINE) {
            LoggerInvoker.b(this.c, string);
        }
        if (level == Level.WARNING) {
            LoggerInvoker.warn(this.c, string);
        }
        if (level == Level.SEVERE) {
            LoggerInvoker.f(this.c, string);
        }
        if (level == Level.INFO) {
            LoggerInvoker.info(this.c, string);
        }
        LoggerInvoker.a(this.c, string);
    }

    public static ListInvoker[] b() {
        return b;
    }
}

