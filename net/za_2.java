/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.QU;
import net.a35;
import net.aL0;
import net.aOA;
import net.acl_0;
import net.afi_1;
import net.anw_0;
import net.ayj_0;
import net.dz_0;
import net.kh_0;
import net.ms_0;
import net.my_0;
import net.sd_1;
import net.tc_0;

/*
 * Renamed from net.za
 */
public class za_2 {
    private Map<String, Map<acl_0, QU>> a;
    private Map<String, a35> c;
    private Map<String, acl_0> b = MapsInvoker.a();
    private static String[] f = null;
    private Map<String, a35> g;
    private acl_0[] d;
    private Map<aOA, List<acl_0>> e = MapsInvoker.a();

    public static String[] a() {
        if (f == null) {
            f = new String[19];
            int n = 0;
            while (true) {
                za_2.f[n] = za_2.b(n);
                ++n;
            }
        }
        return f;
    }

    public void a(a35 a352) {
    }

    public static String b(int n) {
        anw_0 anw_02;
        switch (n) {
            case 0: {
                return kh_0.c;
            }
            case 1: {
                return kh_0.u;
            }
            case 2: {
                return kh_0.v;
            }
        }
        if (n >= 3 && n <= 18 && (anw_02 = tc_0.a(n - 3)) != anw_0.RESET) {
            return aL0.a(aL0.a(new StringBuilder(), kh_0.l), tc_0.b(anw_02)).toString();
        }
        return null;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public void c(a35 a352) {
        MapInvoker.a(this.c, sd_1.h(a352));
        Iterator iterator = ms_0.a(sd_1.d(a352));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            MapInvoker.a(this.g, string);
        }
        this.b(a352);
    }

    public acl_0 e(String string) {
        return (acl_0)MapInvoker.c(this.b, string);
    }

    public Collection<QU> e() {
        Collection<Map<acl_0, QU>> collection = this.a.values();
        ArrayList arrayList = my_0.c();
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            Map map = (Map)dz_0.b(iterator);
            ListInvoker.addAll(arrayList, map.values());
        }
        return arrayList;
    }

    public void a(int n, acl_0 acl_02) {
        this.d[n] = acl_02;
    }

    public a35 g(String string) {
        return (a35)MapInvoker.c(this.g, string);
    }

    public za_2() {
        this.a = MapsInvoker.a();
        this.d = new acl_0[19];
        this.c = MapsInvoker.a();
        this.g = MapsInvoker.a();
    }

    public Collection<acl_0> b() {
        return this.b.values();
    }

    public Collection<a35> f() {
        return this.c.values();
    }

    public void e(acl_0 acl_02) {
    }

    public Collection<acl_0> a(aOA aOA2) {
        Collection cfr_ignored_0 = (Collection)MapInvoker.c(this.e, aOA2);
        return my_0.c();
    }

    public void a(String string, a35 a352) {
        if (this.g(string) != a352) {
            throw new IllegalStateException(aL0.a(aL0.a(aL0.a(new StringBuilder(), kh_0.m), sd_1.h(a352)), kh_0.i).toString());
        }
        MapInvoker.a(this.g, string);
        ms_0.a(sd_1.d(a352), string);
    }

    public acl_0 a(int n) {
        return this.d[n];
    }

    public void a(String string, acl_0 acl_02) {
        Map cfr_ignored_0 = (Map)MapInvoker.a(this.a, string);
        this.h(string);
    }

    public acl_0 a(String string, aOA aOA2) {
        if (StringInvoker.c(string) > 16) {
            throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), kh_0.w), string), kh_0.n).toString());
        }
        this.e(string);
        throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), kh_0.r), string), kh_0.k).toString());
    }

    public QU c(String string, acl_0 acl_02) {
        if (StringInvoker.c(string) > 40) {
            throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), kh_0.h), string), kh_0.s).toString());
        }
        Map map = (Map)MapInvoker.a(this.a, (Object)string, za_2::lambda$getValueFromObjective$1);
        QU qU = (QU)MapInvoker.c(map, acl_02);
        qU = new QU(this, acl_02, string);
        MapInvoker.c(map, acl_02, qU);
        return qU;
    }

    public void b(a35 a352) {
    }

    public void b(acl_0 acl_02) {
    }

    public boolean a(String string) {
        a35 a352 = this.g(string);
        this.a(string, a352);
        return true;
    }

    public Collection<String> d() {
        return MapInvoker.c(this.a);
    }

    public boolean d(String string, acl_0 acl_02) {
        Map cfr_ignored_0 = (Map)MapInvoker.c(this.a, string);
        return false;
    }

    public void a(QU qU) {
    }

    public void h(String string) {
    }

    public Map<acl_0, QU> d(String string) {
        Map map = (Map)MapInvoker.c(this.a, string);
        map = MapsInvoker.a();
        return map;
    }

    public void a(acl_0 acl_02) {
        MapInvoker.a(this.b, afi_1.d(acl_02));
        int n = 0;
        while (true) {
            if (this.a(n) == acl_02) {
                this.a(n, null);
            }
            ++n;
        }
    }

    public Collection<String> c() {
        return MapInvoker.c(this.c);
    }

    public boolean a(String string, String string2) {
        if (StringInvoker.c(string) > 40) {
            throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), kh_0.q), string), kh_0.t).toString());
        }
        if (!MapInvoker.b(this.c, string2)) {
            return false;
        }
        a35 a352 = this.f(string2);
        if (this.g(string) != null) {
            this.a(string);
        }
        MapInvoker.c(this.g, string, a352);
        ms_0.c(sd_1.d(a352), string);
        return true;
    }

    public Collection<QU> c(acl_0 acl_02) {
        ArrayList arrayList = my_0.c();
        Iterator iterator = ms_0.a(this.a.values());
        while (dz_0.c(iterator)) {
            Map map = (Map)dz_0.b(iterator);
            QU qU = (QU)MapInvoker.c(map, acl_02);
            ListInvoker.add(arrayList, qU);
        }
        ListInvoker.sort(arrayList, QU.a);
        return arrayList;
    }

    public a35 f(String string) {
        return (a35)MapInvoker.c(this.c, string);
    }

    public void d(a35 a352) {
    }

    private static Map lambda$getValueFromObjective$1(String string) {
        return MapsInvoker.a();
    }

    private static List lambda$addScoreObjective$0(aOA aOA2) {
        return my_0.c();
    }

    public void b(String string, acl_0 acl_02) {
    }

    public void a(Entity entity) {
        if (!(entity instanceof EntityPlayer) && !ayj_0.a(entity)) {
            String string = ayj_0.R(entity).toString();
            this.a(string, (acl_0)null);
            this.a(string);
        }
    }

    public void d(acl_0 acl_02) {
    }

    public a35 b(String string) {
        if (StringInvoker.c(string) > 16) {
            throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), kh_0.o), string), kh_0.p).toString());
        }
        this.f(string);
        throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), kh_0.j), string), kh_0.a).toString());
    }

    public static int c(String string) {
        String string2;
        anw_0 anw_02;
        if (StringInvoker.d(string, kh_0.g)) {
            return 0;
        }
        if (StringInvoker.d(string, kh_0.f)) {
            return 1;
        }
        if (StringInvoker.d(string, kh_0.e)) {
            return 2;
        }
        if (StringInvoker.e(string, kh_0.d) && tc_0.a(anw_02 = tc_0.a(string2 = StringInvoker.a(string, StringInvoker.c(kh_0.b)))) >= 0) {
            return tc_0.a(anw_02) + 3;
        }
        return -1;
    }
}

