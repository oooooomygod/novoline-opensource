/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.profiler;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.BY;
import net.Dh;
import net.a16;
import net.aL0;
import net.aS0;
import net.akr_1;
import net.asg_0;
import net.dz_0;
import net.lx_2;
import net.my_0;
import net.tb_0;
import net.ys_2;
import org.apache.logging.log4j.Logger;

public class Profiler {
    private static String l = "render";
    private static String n = "display";
    private static String q = "tick";
    private static int b;
    private static int f;
    private List<Long> h;
    private List<String> m = my_0.c();
    private Map<String, Long> k;
    public boolean g;
    private static int e;
    private static String i = "scheduledExecutables";
    public boolean c;
    private static String j = "preRenderErrors";
    private static int a;
    private static int r;
    private boolean p;
    private static Logger d;
    private String o;

    public void c() {
        if (this.p && this.g) {
            long l4 = SystemInvoker.nanoTime();
            long l5 = lx_2.a((Long)ListInvoker.remove(this.h, ListInvoker.size(this.h) - 1));
            ListInvoker.remove(this.m, ListInvoker.size(this.m) - 1);
            long l6 = l4 - l5;
            if (MapInvoker.b(this.k, this.o)) {
                MapInvoker.c(this.k, this.o, lx_2.b(lx_2.a((Long)MapInvoker.c(this.k, this.o)) + l6));
            } else {
                MapInvoker.c(this.k, this.o, lx_2.b(l6));
            }
            if (l6 > 100000000L) {
                LoggerInvoker.warn(d, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), Dh.b), this.o), Dh.v), (double)l6 / 1000000.0), Dh.a).toString());
            }
            this.o = !ListInvoker.isEmpty(this.m) ? (String)ListInvoker.get(this.m, ListInvoker.size(this.m) - 1) : Dh.c;
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[5];
        int n = 0;
        String string = "\u00071v4+N\u000b\u00121V\u0014<O\u001d\u0004\u0014\u0004 {\u0003*U\u0003\u0012'V\u001e+C\u001a\u0003\"q\n+S\u0006\u0005&}\u0002+R";
        int n2 = "\u00071v4+N\u000b\u00121V\u0014<O\u001d\u0004\u0014\u0004 {\u0003*U\u0003\u0012'V\u001e+C\u001a\u0003\"q\n+S\u0006\u0005&}\u0002+R".length();
        int n3 = 15;
        int n4 = -1;
        while (true) {
            int n5 = 72;
            int n6 = ++n4;
            String string2 = string.substring(n6, n6 + n3);
            int n7 = -1;
            boolean bl = true;
            do {
                char[] cArray;
                block7: {
                    int n8;
                    char[] cArray2;
                    int n9;
                    int n10;
                    block6: {
                        if (!bl || (bl = false) || !true) {
                            string = "Ov<J~\u001dJ\u0004_v,Q";
                            n2 = "Ov<J~\u001dJ\u0004_v,Q".length();
                            n3 = 7;
                            n4 = -1;
                            n5 = 20;
                            int n11 = ++n4;
                            string2 = string.substring(n11, n11 + n3);
                            n7 = 0;
                        }
                        char[] cArray3 = string2.toCharArray();
                        int n12 = cArray3.length;
                        n10 = 0;
                        n9 = n5;
                        cArray2 = cArray3;
                        n8 = n12;
                        if (n12 <= 1) break block6;
                        cArray = cArray2;
                        n8 = n8;
                        if (n8 <= n10) break block7;
                    }
                    do {
                        cArray2 = cArray2;
                        int n13 = n10;
                        int cfr_ignored_1 = n10 % 7;
                        cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x3F));
                        ++n10;
                        n9 = n9;
                        cArray = cArray2;
                        n8 = n8;
                    } while (n8 > n10);
                }
                stringArray[n++] = new String(cArray).intern();
            } while ((n4 += n3) >= n2);
            n3 = string.charAt(n4);
        }
    }

    public void b() {
        MapInvoker.d(this.k);
        this.o = Dh.m;
        ListInvoker.clear(this.m);
        this.p = this.c;
    }

    public void b(String string) {
        if (BY.b()) {
            int n = string.hashCode();
            if (n == r && string.equals(Dh.k)) {
                a16.b(tb_0.x);
            } else if (n == b && string.equals(Dh.i) && ys_2.s()) {
                a16.a(tb_0.x);
                a16.b(tb_0.r);
            } else if (n == e && string.equals(Dh.u)) {
                a16.a(tb_0.r);
            }
        }
        if (this.p && this.g) {
            if (!StringInvoker.g(this.o)) {
                this.o = aL0.a(aL0.a(new StringBuilder(), this.o), Dh.j).toString();
            }
            this.o = aL0.a(aL0.a(new StringBuilder(), this.o), string).toString();
            ListInvoker.add(this.m, this.o);
            ListInvoker.add(this.h, lx_2.b(SystemInvoker.nanoTime()));
        }
    }

    public Profiler() {
        this.h = my_0.c();
        this.o = Dh.t;
        this.k = MapsInvoker.a();
        this.p = this.c = true;
    }

    private Long lambda$getProfilingData$0(String string, Long l4) {
        return lx_2.b(lx_2.a((Long)MapInvoker.c(this.k, string)) * 950L / 1000L);
    }

    public void a(String string) {
        if (this.p) {
            this.c();
            this.b(string);
        }
    }

    public String a() {
        return ListInvoker.isEmpty(this.m) ? Dh.d : (String)ListInvoker.get(this.m, ListInvoker.size(this.m) - 1);
    }

    public List c(String string) {
        Object object;
        this.p = this.c;
        if (!this.p) {
            return new ArrayList(asg_0.b(new Result(Dh.o, 0.0, 0.0)));
        }
        if (!this.g) {
            return null;
        }
        long l4 = lx_2.a((Long)MapInvoker.a(this.k, (Object)Dh.h, lx_2.b(0L)));
        long l5 = lx_2.a((Long)MapInvoker.a(this.k, (Object)string, lx_2.b(-1L)));
        ArrayList arrayList = my_0.c();
        if (!StringInvoker.g(string)) {
            string = aL0.a(aL0.a(new StringBuilder(), string), Dh.q).toString();
        }
        long l6 = 0L;
        Iterator iterator = aS0.f(MapInvoker.c(this.k));
        while (dz_0.c(iterator)) {
            object = dz_0.b(iterator);
            if (StringInvoker.c((String)object) <= StringInvoker.c(string) || !StringInvoker.e((String)object, string) || StringInvoker.b((String)object, Dh.l, StringInvoker.c(string) + 1) >= 0) continue;
            l6 += lx_2.a((Long)MapInvoker.c(this.k, object));
        }
        float f = l6;
        if (l6 < l5) {
            l6 = l5;
        }
        if (l4 < l6) {
            l4 = l6;
        }
        object = aS0.f(MapInvoker.c(this.k));
        while (dz_0.c((Iterator)object)) {
            Object object2 = dz_0.b((Iterator)object);
            String string2 = (String)object2;
            if (StringInvoker.c(string2) <= StringInvoker.c(string) || !StringInvoker.e(string2, string) || StringInvoker.b(string2, Dh.s, StringInvoker.c(string) + 1) >= 0) continue;
            long l7 = lx_2.a((Long)MapInvoker.c(this.k, string2));
            double d = (double)l7 * 100.0 / (double)l6;
            double d2 = (double)l7 * 100.0 / (double)l4;
            String string3 = StringInvoker.a(string2, StringInvoker.c(string));
            akr_1.a(arrayList, new Result(string3, d, d2));
        }
        MapInvoker.a(this.k, this::lambda$getProfilingData$0);
        float f2 = (float)l6 - f;
        int cfr_ignored_1 = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
        asg_0.d(arrayList);
        akr_1.b(arrayList, 0, new Result(string, 100.0, (double)l6 * 100.0 / (double)l4));
        return arrayList;
    }
}

