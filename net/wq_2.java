/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import net.a3t_0;
import net.a72;
import net.auy_0;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.wq
 */
public class wq_2 {
    public static a3t_0 a() {
        String string = StringInvoker.i(SystemInvoker.c(a72.b));
        return StringInvoker.a(string, (CharSequence)a72.g) ? a3t_0.WINDOWS : (StringInvoker.a(string, (CharSequence)a72.c) ? a3t_0.OSX : (StringInvoker.a(string, (CharSequence)a72.a) ? a3t_0.SOLARIS : (StringInvoker.a(string, (CharSequence)a72.f) ? a3t_0.SOLARIS : (StringInvoker.a(string, (CharSequence)a72.d) ? a3t_0.LINUX : (StringInvoker.a(string, (CharSequence)a72.e) ? a3t_0.LINUX : a3t_0.UNKNOWN)))));
    }

    public static <V> void a(FutureTask<V> futureTask, Logger logger) {
        try {
            auy_0.b(futureTask);
            auy_0.a(futureTask);
        }
        catch (InterruptedException | ExecutionException exception) {}
    }
}

