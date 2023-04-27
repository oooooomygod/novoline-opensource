/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.events.KeyPressEvent;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.I18n;
import net.IntHashMap;
import net.a8a_0;
import net.aO3;
import net.aS0;
import net.axe_2;
import net.dz_0;
import net.my_0;

public class aII
implements Comparable<aII> {
    private String b;
    private int e;
    private boolean f;
    private String c;
    private int g;
    private static IntHashMap<aII> a;
    private static List<aII> d;
    private boolean j;
    private int i;
    private static Set<String> h;

    public String j() {
        return this.c;
    }

    public int c() {
        return this.i;
    }

    private void d(int n) {
        if (this.h()) {
            KeyPressEvent keyPressEvent = new KeyPressEvent(n);
            EventManagerInvoker.call(keyPressEvent);
            if (!aO3.a(keyPressEvent)) {
                this.i = 0;
                this.f = false;
            }
        }
    }

    public static Set<String> a() {
        return h;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public boolean b() {
        if (this.i == 0) {
            return false;
        }
        --this.i;
        return true;
    }

    public aII(String string, int n, String string2) {
        this.c = string;
        this.e = n;
        this.g = n;
        this.b = string2;
        ListInvoker.add(d, this);
        a8a_0.a(a, n, this);
        aS0.b(h, string2);
    }

    public void c(int n) {
        this.e = n;
    }

    public boolean h() {
        return this.f;
    }

    public boolean f() {
        return this.j;
    }

    public int a(aII aII2) {
        int n = StringInvoker.i(I18n.format(this.b, new Object[0]), I18n.format(aII2.b, new Object[0]));
        n = StringInvoker.i(I18n.format(this.c, new Object[0]), I18n.format(aII2.c, new Object[0]));
        return n;
    }

    public static void g() {
        a8a_0.a(a);
        Iterator iterator = ListInvoker.iterator(d);
        while (dz_0.c(iterator)) {
            aII aII2 = (aII)dz_0.b(iterator);
            a8a_0.a(a, aII2.e, aII2);
        }
    }

    public int e() {
        return this.e;
    }

    public String k() {
        return this.b;
    }

    public static void b(int n) {
        aII aII2 = (aII)a8a_0.c(a, n);
        ++aII2.i;
    }

    public static void a(int n, boolean bl) {
        aII aII2 = (aII)a8a_0.c(a, n);
        aII2.f = bl;
    }

    public void b(boolean bl) {
        this.f = bl;
    }

    public static boolean a(int n) {
        return n != 14 && n != 157 && n != 29 && n != 54 && n != 42 && n != 15 && n != 58 && n != 211 && n != 199 && n != 210 && n != 200 && n != 208 && n != 205 && n != 203 && n != 56 && n != 184 && n != 197 && n != 70 && n != 207 && n != 201 && n != 209 && n != 221 && n != 59 && n != 60 && n != 61 && n != 62 && n != 63 && n != 64 && n != 65 && n != 66 && n != 67 && n != 68 && n != 87 && n != 88;
    }

    public static void d() {
        Iterator iterator = ListInvoker.iterator(d);
        while (dz_0.c(iterator)) {
            aII aII2 = (aII)dz_0.b(iterator);
            aII2.d(aII2.e());
        }
    }

    public int i() {
        return this.g;
    }

    static {
        d = my_0.c();
        a = new IntHashMap();
        h = axe_2.a();
    }
}

