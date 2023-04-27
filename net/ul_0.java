/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.JsonObject;
import net.aF3;
import net.aOV;

/*
 * Renamed from net.Ul
 */
public class ul_0 {
    private int c;
    private int f;
    private boolean g;
    private int e;
    private int a;
    private static ul_0 d = null;
    private int h;
    private boolean b;

    public ul_0(int n, int n2, int n3, int n4, int n5) {
        this(true, false, n, n2, n3, n4, n5);
    }

    public ul_0() {
        this(false, true, 1, 0, 1, 0, 32774);
    }

    private static int b(String string) {
        String string2 = StringInvoker.i(StringInvoker.h(string));
        return string2.equals(aOV.G) ? 32774 : (string2.equals(aOV.u) ? 32778 : (string2.equals(aOV.a) ? 32779 : (string2.equals(aOV.g) ? 32779 : (string2.equals(aOV.q) ? 32775 : (string2.equals(aOV.w) ? 32776 : 32774)))));
    }

    private static int a(String string) {
        String string2 = StringInvoker.i(StringInvoker.h(string));
        string2 = StringInvoker.a(string2, aOV.j, aOV.b);
        string2 = StringInvoker.a(string2, aOV.e, aOV.f);
        string2 = StringInvoker.a(string2, aOV.s, aOV.C);
        return (string2 = StringInvoker.a(string2, aOV.h, aOV.l)).equals(aOV.t) ? 0 : (string2.equals(aOV.z) ? 1 : (string2.equals(aOV.y) ? 768 : (string2.equals(aOV.v) ? 769 : (string2.equals(aOV.n) ? 774 : (string2.equals(aOV.A) ? 775 : (string2.equals(aOV.k) ? 770 : (string2.equals(aOV.B) ? 771 : (string2.equals(aOV.o) ? 772 : (string2.equals(aOV.H) ? 773 : -1)))))))));
    }

    public ul_0(int n, int n2, int n3) {
        this(false, false, n, n2, n, n2, n3);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ul_0)) {
            return false;
        }
        ul_0 ul_02 = (ul_0)object;
        return this.e == ul_02.e && this.c == ul_02.c && this.h == ul_02.h && this.g == ul_02.g && this.b == ul_02.b && this.f == ul_02.f && this.a == ul_02.a;
    }

    public int hashCode() {
        int n = this.a;
        n = 31 * n + this.f;
        n = 31 * n + this.h;
        n = 31 * n + this.c;
        n = 31 * n + this.e;
        n = 31 * n + (this.b ? 1 : 0);
        n = 31 * n + (this.g ? 1 : 0);
        return n;
    }

    public void b() {
        if (!this.equals(d)) {
            if (d == null || this.g != d.a()) {
                d = this;
                if (this.g) {
                    GlStateManagerInvoker.disableBlend();
                    return;
                }
                GlStateManagerInvoker.enableBlend();
            }
            aF3.a(this.e);
            if (this.b) {
                GlStateManagerInvoker.b(this.a, this.h, this.f, this.c);
            } else {
                GlStateManagerInvoker.b(this.a, this.h);
            }
        }
    }

    public boolean a() {
        return this.g;
    }

    public static ul_0 a(JsonObject jsonObject) {
        return new ul_0();
    }

    private ul_0(boolean bl, boolean bl2, int n, int n2, int n3, int n4, int n5) {
        this.b = bl;
        this.a = n;
        this.h = n2;
        this.f = n3;
        this.c = n4;
        this.g = bl2;
        this.e = n5;
    }
}

