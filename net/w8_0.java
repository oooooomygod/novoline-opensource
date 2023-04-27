/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import net.D2;
import net.MathHelper;
import net.a0X;
import net.ahj_1;
import net.asy_0;

/*
 * Renamed from net.w8
 */
public class w8_0 {
    public String a = null;
    public float c;
    public a0X b;

    public w8_0 a(String string) {
        this.a = string;
        return this;
    }

    public static float a(asy_0 asy_02, float f, List<w8_0> list) {
        float f2 = f;
        D2.b();
        int n = 0;
        if (n < ListInvoker.size(list)) {
            f2 = ((w8_0)ListInvoker.get(list, n)).a(f2);
            ++n;
        }
        if (asy_02 == asy_0.COS) {
            f2 = MathHelper.cos(f2);
        }
        if (asy_02 == asy_0.SIN) {
            f2 = MathHelper.sin(f2);
        }
        return f2;
    }

    public float a(float f) {
        D2.b();
        float f2 = this.a != null ? ahj_1.a(this.a) : this.c;
        float f3 = 0.0f;
        if (this.b == a0X.ADD) {
            f3 = f + f2;
        }
        if (this.b == a0X.SET) {
            f3 = f2;
        }
        if (this.b == a0X.SUBSTRACT) {
            f3 = f - f2;
        }
        if (this.b == a0X.MULTIPLY) {
            f3 = f * f2;
        }
        if (this.b == a0X.DIVIDE) {
            f3 = f / f2;
        }
        return f3;
    }

    public w8_0(a0X a0X2, float f) {
        this.b = a0X2;
        this.c = f;
    }
}

