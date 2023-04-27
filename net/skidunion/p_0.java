/*
 * Decompiled with CFR 0.152.
 */
package net.skidunion;

import java.io.IOException;
import novoline0.Loader;

/*
 * Renamed from net.net.skidunion.p
 */
public class p_0 {
    private static String[] b;

    public static native String[] b();

    public static native void b(String[] var0);

    public static native void a(long var0) throws Throwable;

    public static native String a(String var0, String var1, String var2) throws Throwable;

    static {
        Loader.registerNativesForClass(3);
        p_0.native_special_clinit4();
    }

    private static native Throwable a(Throwable var0);

    public static native void c() throws IOException;

    public static native void d() throws IOException;

    private static native /* synthetic */ void native_special_clinit4();
}

