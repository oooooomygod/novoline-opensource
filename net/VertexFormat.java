/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import java.util.List;

import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.aQn
 */
public class VertexFormat {
    private int d = -1;
    private List<Integer> g;
    private static Logger b = LogManagerInvoker.c();
    private int c = -1;
    private List<Integer> a;
    private int f = 0;
    private List<VertexFormatElement> e = my_0.c();

    public String toString() {
        String string = aL0.a(aL0.c(aL0.a(new StringBuilder(), aU1.c), ListInvoker.size(this.e)), aU1.b).toString();
        for (int i = 0; i < ListInvoker.size(this.e); ++i) {
            string = aL0.a(aL0.a(new StringBuilder(), string), ((VertexFormatElement)ListInvoker.get(this.e, i)).toString()).toString();
            if (i == ListInvoker.size(this.e) - 1) continue;
            string = aL0.a(aL0.a(new StringBuilder(), string), aU1.a).toString();
        }
        return string;
    }

    public boolean i() {
        return this.c >= 0;
    }

    public void b() {
        this.e.clear();
        this.a.clear();
        this.d = -1;
        this.g.clear();
        this.c = -1;
        this.f = 0;
    }

    public int b(int n) {
        return P8.b((Integer)ListInvoker.get(this.a, n));
    }

    public VertexFormatElement d(int n) {
        return (VertexFormatElement)ListInvoker.get(this.e, n);
    }

    public VertexFormat() {
        this.a = my_0.c();
        this.g = my_0.c();
    }

    public VertexFormat(VertexFormat aqn_02) {
        this();
        for (int i = 0; i < aqn_02.e(); ++i) {
            this.a(aqn_02.d(i));
        }
        this.f = aqn_02.c();
    }

    public int hashCode() {
        int n = this.e.hashCode();
        n = 31 * n + this.a.hashCode();
        n = 31 * n + this.f;
        return n;
    }

    public int f() {
        return this.c() / 4;
    }

    public int e() {
        return ListInvoker.size(this.e);
    }

    public List<VertexFormatElement> d() {
        return this.e;
    }

    public int c(int n) {
        return P8.b((Integer)ListInvoker.get(this.g, n));
    }

    public boolean a(int n) {
        return ListInvoker.size(this.g) - 1 >= n;
    }

    public VertexFormat a(VertexFormatElement asw_02) {
        if (ev_0.d(asw_02) && this.a()) {
            LoggerInvoker.warn(b, aU1.d);
        } else {
            ListInvoker.add(this.e, asw_02);
            ListInvoker.add(this.a, P8.d(this.f));
            switch (a2s_0.a[ev_0.b(asw_02).ordinal()]) {
                case 1: {
                    this.c = this.f;
                    break;
                }
                case 2: {
                    this.d = this.f;
                    break;
                }
                case 3: {
                    ListInvoker.add(this.g, ev_0.a(asw_02), P8.d(this.f));
                }
            }
            this.f += ev_0.f(asw_02);
        }
        return this;
    }

    public int g() {
        return this.c;
    }

    public int c() {
        return this.f;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() == object.getClass()) {
            VertexFormat aqn_02 = (VertexFormat)object;
            return this.f == aqn_02.f && this.e.equals(aqn_02.e) && this.a.equals(aqn_02.a);
        }
        return false;
    }

    private boolean a() {
        int n = ListInvoker.size(this.e);
        for (int i = 0; i < n; ++i) {
            VertexFormatElement asw_02 = (VertexFormatElement)ListInvoker.get(this.e, i);
            if (!ev_0.d(asw_02)) continue;
            return true;
        }
        return false;
    }

    public int j() {
        return this.d;
    }

    public boolean h() {
        return this.d >= 0;
    }
}

