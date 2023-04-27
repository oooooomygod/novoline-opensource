/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.yT
 */
public class yt_1
extends RuntimeException {
    public static yt_1 a = new yt_1();

    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    private yt_1() {
        this.setStackTrace(new StackTraceElement[0]);
    }
}

