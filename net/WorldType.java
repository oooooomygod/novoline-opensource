/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.aL0;
import net.aX6;

public class WorldType {
    public static WorldType[] m = new WorldType[16];
    public static WorldType d;
    public static WorldType g;
    private boolean h;
    private int f;
    public static WorldType i;
    private int j;
    private boolean b;
    public static WorldType k;
    public static WorldType n;
    private String a;
    public static WorldType e;
    private boolean c;
    public static WorldType l;

    public int f() {
        return this.j;
    }

    public WorldType a(int n) {
        return this == WorldType.n ? g : this;
    }

    static {
        n = new WorldType(0, aX6.g, 1).b();
        e = new WorldType(1, aX6.f);
        k = new WorldType(2, aX6.c);
        d = new WorldType(3, aX6.d).g();
        i = new WorldType(4, aX6.h);
        l = new WorldType(5, aX6.e);
        g = new WorldType(8, aX6.a, 0).a(false);
    }

    public static WorldType a(String string) {
        for (WorldType worldType : m) {
            if (!StringInvoker.d(worldType.a, string)) continue;
            return worldType;
        }
        return null;
    }

    public String c() {
        return aL0.a(aL0.a(new StringBuilder(), aX6.i), this.a).toString();
    }

    public int a() {
        return this.f;
    }

    public boolean j() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    private WorldType a(boolean bl) {
        this.b = bl;
        return this;
    }

    public String i() {
        return aL0.a(aL0.a(new StringBuilder(), this.c()), aX6.b).toString();
    }

    private WorldType(int n, String string, int n2) {
        this.a = string;
        this.f = n2;
        this.b = true;
        this.j = n;
        WorldType.m[n] = this;
    }

    private WorldType(int n, String string) {
        this(n, string, 0);
    }

    private WorldType b() {
        this.c = true;
        return this;
    }

    private WorldType g() {
        this.h = true;
        return this;
    }

    public boolean h() {
        return this.c;
    }

    public boolean e() {
        return this.b;
    }
}

