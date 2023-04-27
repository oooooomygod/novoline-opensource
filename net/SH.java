/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.visual.ClickGui;
import java.awt.Color;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import net.skidunion.Protection;

public class SH {
    private double o;
    private double i;
    private double k;
    private aqx_2 a;
    private boolean h;
    private double c;
    private on_0 g;
    private boolean b;
    private ayr_1 n;
    private ClickGUI f;
    private boolean m;
    private double d;
    private List<V2> e = new CopyOnWriteArrayList<V2>();
    private boolean p;
    private boolean l;
    private double j;

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }

    public void a(ClickGui clickGui, int n, int n2, double d, double d2) {
        double d3;
        double d4;
        block9: {
            block8: {
                aq7_0.d();
                this.i = d;
                this.o = d2;
                adp_0.b(false);
                a1V.b(d, d2, d + 130.0, d2 + I_.d(this.a) + 20.0, -1);
                adp_0.a(true);
                a1V.b(d, d2, d + 130.0, d2 + I_.d(this.a) + 20.0, aol_1.b(new Color(55, 55, 55)));
                d4 = I_.d(this.a) + 20.0;
                double d5 = I_.d(this.a) + 20.0;
                double d6 = ListInvoker.size(this.e) * 20;
                d3 = d5 / d6 * d4;
                double d7 = d4 - d3;
                double d8 = d6 - d4;
                double d9 = d8 / d7;
                this.k = (int)(this.c * d9);
                this.j += (this.k - this.j) * 0.1;
                double d10 = d2;
                try {
                    Iterator iterator = ListInvoker.iterator(this.e);
                    if (dz_0.c(iterator)) {
                        V2 v2 = (V2)dz_0.b(iterator);
                        afr_2.a(v2, this.f, n, n2, d, d10 - this.j);
                        d10 += 20.0;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    // empty catch block
                }
                adp_0.a();
                a1V.a((float)d + 130.0f - 5.0f, (float)d2, 5.0f, (float)I_.d(this.a) + 20.0f, 0.0f, aol_1.b(new Color(45, 45, 45)));
                if (!(d6 > d5)) break block8;
                a1V.a((float)(d + 130.0 - 4.0), (float)(d2 + this.c), 3.0f, (float)d3 - 1.0f, 0.0f, aol_1.b(new Color(50, 50, 50, 255)));
                if (!((double)n >= d) || !((double)n <= d + 120.0) || !((double)n2 >= d2) || !((double)n2 <= d2 + I_.d(this.a) + 20.0)) break block9;
                int n3 = MouseInvoker.m();
                this.c += 10.0;
                this.c -= 10.0;
                this.c = (int)MathHelper.b(this.c, 0.0, d4 - d3);
            }
            this.k = 0.0;
            this.c = 0.0;
        }
        if (this.h && (double)n2 - this.d != 0.0) {
            this.c += (double)n2 - this.d;
            this.c = (int)MathHelper.b(this.c, 0.0, d4 - d3);
            this.d = n2;
        }
        a1V.b(d, d2 + I_.d(this.a) + 20.0, d + 130.0, d2 + I_.d(this.a) + 60.0, aol_1.b(new Color(45, 45, 45, 255)));
        akq_1.a(this.g, d + 2.0, d2 + I_.d(this.a) + 23.0, 15.0, 124.5, akq_1.a(this.g, n, n2) ? aol_1.b(new Color(60, 60, 60)) : aol_1.b(new Color(54, 54, 54)), aol_1.b(new Color(50, 50, 50)), n, n);
        PY.a(this.n, d + 2.0, d2 + I_.d(this.a) + 40.5, 124.5, 17.0, PY.a(this.n, n, n2) ? aol_1.b(new Color(60, 60, 60)) : aol_1.b(new Color(54, 54, 54)), aol_1.b(new Color(50, 50, 50)), n, n2);
    }

    public void a(char c, int n) {
        akq_1.a(this.g, c, n);
    }

    public SH(ClickGUI clickGUI, aqx_2 aqx_22) {
        this.a = aqx_22;
        this.g = new on_0();
        this.f = clickGUI;
        this.n = new ayr_1(ug_2.c, this::lambda$new$0);
    }

    public void a() {
        ListInvoker.clear(this.e);
    }

    public void a(int n, int n2, int n3) {
        this.h = false;
    }

    private void lambda$new$0(String string) {
        ListInvoker.clear(this.e);
    }

    public void a(List<String> list) {
        block5: {
            long l4;
            long l5;
            String string;
            String string2;
            block6: {
                aq7_0.d();
                ListInvoker.clear(this.e);
                Iterator iterator = ListInvoker.iterator(list);
                if (!dz_0.c(iterator)) break block5;
                String string3 = (String)dz_0.b(iterator);
                String[] stringArray = StringInvoker.g(string3, ug_2.a);
                String[] stringArray2 = StringInvoker.g(stringArray[0], ug_2.b);
                string2 = stringArray2[0];
                string = stringArray2[1];
                l5 = lx_2.a(stringArray[1]);
                l4 = lx_2.a(stringArray[2]);
                if (PY.a(this.n) != aeg_0.SELF_ONLY) break block6;
                if (!string.equals(Protection.I)) break block5;
                ListInvoker.add(this.e, new V2(string, string2, l5, l4, this));
            }
            ListInvoker.add(this.e, new V2(string, string2, l5, l4, this));
        }
        if (PY.a(this.n) == aeg_0.MOST_RECENT) {
            this.e = (List)aMF.a(aMF.a(ListInvoker.stream(this.e), aN_.a(aN_.a(V2::b))), aB0.a());
        }
        if (PY.a(this.n) == aeg_0.AVERAGE_BAN_TIME) {
            this.e = (List)aMF.a(aMF.a(ListInvoker.stream(this.e), aN_.a(aN_.a(V2::a))), aB0.a());
        }
    }

    public void b(int n, int n2, int n3) {
        Iterator iterator;
        aq7_0.d();
        if ((double)n2 > this.o && (double)n2 < this.o + I_.d(this.a) + 20.0 && (double)n < this.i + 115.0 && dz_0.c(iterator = ListInvoker.iterator(this.e))) {
            V2 v2 = (V2)dz_0.b(iterator);
            v2.a(n, n2, n3);
        }
        PY.a(this.n, n3, n, n2);
        akq_1.a(this.g, n3, n, n2);
        if ((double)n >= this.i + 120.0 - 8.0 && (double)n <= this.i + 120.0 && (double)n2 >= this.o && (double)n2 <= this.o + I_.d(this.a) + 20.0) {
            this.h = true;
            this.d = n2;
        }
    }
}

