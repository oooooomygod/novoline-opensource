/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Matrix4f
 */
package net;

import cc.novoline.invoke.ListInvoker;
import javax.vecmath.Matrix4f;
import deobf.EnumFacing;

public class aj6 {
    private static ListInvoker[] b;

    static {
        if (aj6.b() == null) {
            aj6.b(new ListInvoker[5]);
        }
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static EnumFacing a(agy_0 agy_02, EnumFacing enumFacing) {
        return agy_02.a(enumFacing);
    }

    public static int a(agy_0 agy_02, EnumFacing enumFacing, int n) {
        return agy_02.a(enumFacing, n);
    }

    public static Matrix4f a(agy_0 agy_02) {
        return agy_02.a();
    }
}

