/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.aSw
 */
public class VertexFormatElement {
    private int e;
    private int d;
    private aPX a;
    private ml_2 b;
    private static Logger c = LogManagerInvoker.c();

    public int c() {
        return this.b.a() * this.e;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() == object.getClass()) {
            VertexFormatElement asw_02 = (VertexFormatElement)object;
            return this.e == asw_02.e && this.d == asw_02.d && this.b == asw_02.b && this.a == asw_02.a;
        }
        return false;
    }

    private boolean a(int n, aPX aPX2) {
        return aPX2 == aPX.UV;
    }

    public ml_2 b() {
        return this.b;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(new StringBuilder(), this.e), aur_0.a), ed_2.a(this.a)), aur_0.b), aku_0.b(this.b)).toString();
    }

    public aPX e() {
        return this.a;
    }

    public int d() {
        return this.d;
    }

    public boolean f() {
        return this.a == aPX.POSITION;
    }

    public int hashCode() {
        int n = this.b.hashCode();
        n = 31 * n + this.a.hashCode();
        n = 31 * n + this.d;
        n = 31 * n + this.e;
        return n;
    }

    public VertexFormatElement(int n, ml_2 ml_22, aPX aPX2, int n2) {
        if (!this.a(n, aPX2)) {
            LoggerInvoker.warn(c, aur_0.c);
            this.a = aPX.UV;
        } else {
            this.a = aPX2;
        }
        this.b = ml_22;
        this.d = n;
        this.e = n2;
    }

    public int a() {
        return this.e;
    }
}

