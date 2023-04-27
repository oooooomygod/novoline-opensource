/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.ThreadInvoker;
import java.io.OutputStream;
import java.io.PrintStream;
import net.FR;
import net.P8;
import net.aqc_2;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.k4
 */
public class k4_0
extends PrintStream {
    private static Logger a = LogManagerInvoker.c();
    private String b;

    @Override
    public void println(String string) {
        this.a(string);
    }

    private void a(String string) {
        StackTraceElement[] stackTraceElementArray = ThreadInvoker.a(ThreadInvoker.a());
        StackTraceElement stackTraceElement = stackTraceElementArray[MathInvoker.b(3, stackTraceElementArray.length)];
        LoggerInvoker.e(a, FR.a, new Object[]{this.b, aqc_2.e(stackTraceElement), P8.d(aqc_2.d(stackTraceElement)), string});
    }

    @Override
    public void println(Object object) {
        this.a(StringInvoker.a(object));
    }

    public k4_0(String string, OutputStream outputStream) {
        super(outputStream);
        this.b = string;
    }
}

