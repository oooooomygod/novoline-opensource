/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.ArrayList;
import java.util.List;
import net.XF;
import net.a0X;
import net.aFX;
import net.aRS;
import net.ajJ;
import net.asy_0;
import net.w8_0;

public class D2 {
    private static int[] b;
    public float e;
    public float i;
    public List<w8_0> c = new ArrayList<w8_0>();
    public String h;
    public ajJ a;
    public asy_0 g;
    public String f;
    public aRS d;

    static {
        if (D2.b() != null) {
            D2.b(new int[1]);
        }
    }

    public D2(String string, String string2, aRS aRS2, ajJ ajJ2, float f, float f2) {
        this.f = string;
        this.h = string2;
        this.d = aRS2;
        this.a = ajJ2;
        this.i = f;
        this.e = 0.0f;
    }

    public static a0X a(String string) {
        D2.b();
        return StringInvoker.d(string, aFX.c) ? a0X.ADD : (StringInvoker.d(string, aFX.a) ? a0X.SUBSTRACT : (StringInvoker.d(string, aFX.d) ? a0X.SET : (StringInvoker.d(string, aFX.b) ? a0X.MULTIPLY : a0X.DIVIDE)));
    }

    public float a(float f) {
        return XF.a(this.g, f, this.c);
    }

    public D2() {
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public D2 a(asy_0 asy_02) {
        this.g = asy_02;
        return this;
    }

    public static int[] b() {
        return b;
    }
}

