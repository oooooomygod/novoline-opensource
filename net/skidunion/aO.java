/*
 * Decompiled with CFR 0.152.
 */
package net.skidunion;

import net.skidunion.aE;
import novoline0.Loader;

public class aO
extends aE {
    long p;

    @Override
    public native void a(byte[] var1, byte[] var2);

    @Override
    public native void b(long[] var1);

    @Override
    public native void a(int[] var1);

    @Override
    public native void b(long[] var1, long[] var2);

    @Override
    public native void b(int[] var1, int[] var2);

    @Override
    public native void b(byte[] var1);

    public native long a();

    public aO(long l4) {
        this.a(l4);
    }

    @Override
    public native void b(byte[] var1, byte[] var2);

    @Override
    public native void a(long[] var1);

    public aO(byte[] byArray) {
        this.c(byArray);
    }

    @Override
    public native void a(byte[] var1);

    private native long e(long var1);

    @Override
    public native void b(int[] var1);

    @Override
    public native void e();

    public native void d(byte[] var1);

    public native void a(long var1);

    private native long b(long var1);

    @Override
    public native void a(long[] var1, long[] var2);

    public aO() {
        this.a(0L);
    }

    @Override
    public native void a(int[] var1, int[] var2);

    public native void c(byte[] var1);

    static {
        Loader.registerNativesForClass(5);
        aO.native_special_clinit22();
    }

    private static native /* synthetic */ void native_special_clinit22();
}

