/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.IPlayerUsage;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import net.CT;
import net.FG;
import net.P8;
import net.aL0;
import net.aS0;
import net.als_2;
import net.ank_0;
import net.aok_0;
import net.asj_2;
import net.auu_0;
import net.awc_1;
import net.dz_0;
import net.lx_2;
import net.yb_2;

public class PlayerUsageSnooper {
    private URL g;
    private IPlayerUsage a;
    private Map<String, Object> c = MapsInvoker.a();
    private Timer e;
    private long b;
    private Object d;
    private String f;
    private Map<String, Object> j = MapsInvoker.a();
    private boolean h;
    private int i;

    public void b() {
        this.a(CT.j, lx_2.b(als_2.b(als_2.a())));
        this.a(CT.s, lx_2.b(als_2.d(als_2.a())));
        this.a(CT.n, lx_2.b(als_2.a(als_2.a())));
        this.a(CT.h, P8.d(als_2.c(als_2.a())));
        aok_0.a(this.a, this);
    }

    private void a() {
        this.h();
        this.b(CT.d, this.f);
        this.a(CT.c, this.f);
        this.a(CT.a, SystemInvoker.c(CT.m));
        this.a(CT.l, SystemInvoker.c(CT.w));
        this.a(CT.u, SystemInvoker.c(CT.o));
        this.a(CT.g, SystemInvoker.c(CT.i));
        this.b(CT.p, CT.v);
        aok_0.b(this.a, this);
    }

    public long d() {
        return this.b;
    }

    static String a(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(String string, Object object) {
        Object object2 = this.d;
        synchronized (object2) {
            MapInvoker.c(this.c, string, object);
            return;
        }
    }

    public boolean g() {
        return this.h;
    }

    static URL f(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.g;
    }

    private void h() {
        RuntimeMXBean runtimeMXBean = yb_2.a();
        List list = auu_0.a(runtimeMXBean);
        int n = 0;
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            if (!StringInvoker.e(string, CT.e)) continue;
            this.b(aL0.a(aL0.c(aL0.a(new StringBuilder(), CT.f), n++), CT.k).toString(), string);
        }
        this.b(CT.b, P8.d(n));
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    static Map h(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.j;
    }

    static int b(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.i++;
    }

    static Map c(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.c;
    }

    static Object d(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Map<String, String> f() {
        LinkedHashMap linkedHashMap = MapsInvoker.c();
        Object object = this.d;
        synchronized (object) {
            Map.Entry entry;
            this.b();
            Iterator iterator = aS0.f(MapInvoker.b(this.c));
            while (dz_0.c(iterator)) {
                entry = (Map.Entry)dz_0.b(iterator);
                MapInvoker.c(linkedHashMap, FG.b(entry), FG.a(entry).toString());
            }
            iterator = aS0.f(MapInvoker.b(this.j));
            while (dz_0.c(iterator)) {
                entry = (Map.Entry)dz_0.b(iterator);
                MapInvoker.c(linkedHashMap, FG.b(entry), FG.a(entry).toString());
            }
            return linkedHashMap;
        }
    }

    public void c() {
        asj_2.a(this.e);
    }

    static int e(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.i;
    }

    public void e() {
        if (!this.h) {
            this.h = true;
            this.a();
            asj_2.a(this.e, new ank_0(this), 0L, 900000L);
        }
    }

    static IPlayerUsage g(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(String string, Object object) {
        Object object2 = this.d;
        synchronized (object2) {
            MapInvoker.c(this.j, string, object);
            return;
        }
    }

    public PlayerUsageSnooper(String string, IPlayerUsage iPlayerUsage, long l4) {
        this.f = awc_1.a().toString();
        this.e = new Timer(CT.r, true);
        this.d = new Object();
        try {
            this.g = new URL(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), CT.q), string), CT.t), 2).toString());
            this.a = iPlayerUsage;
            this.b = l4;
            return;
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException();
        }
    }

    public String i() {
        return this.f;
    }
}

