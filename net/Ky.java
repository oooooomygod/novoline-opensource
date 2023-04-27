/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import net.minecraft.item.ItemStack;
import java.util.Map;

public enum Ky {
    COD(0, a3W.f, 2, 0.1f, 5, 0.6f),
    SALMON(1, a3W.g, 2, 0.1f, 6, 0.8f),
    CLOWNFISH(2, a3W.e, 1, 0.1f),
    PUFFERFISH(3, a3W.a, 1, 0.1f);

    private static Map<Integer, Ky> g = MapsInvoker.a();
    private int d;
    private int h;
    private int i;
    private float b;
    private String e;
    private boolean a = false;
    private float f;

    private Ky(int n2, String string2, int n3, float f, int n4, float f2) {
        this.i = n2;
        this.e = string2;
        this.d = n3;
        this.b = f;
        this.h = n4;
        this.f = f2;
        this.a = true;
    }

    public int g() {
        return this.d;
    }

    private Ky(int n2, String string2, int n3, float f) {
        this.i = n2;
        this.e = string2;
        this.d = n3;
        this.b = f;
        this.h = 0;
        this.f = 0.0f;
        this.a = false;
    }

    public int c() {
        return this.i;
    }

    public float a() {
        return this.b;
    }

    public float d() {
        return this.f;
    }

    static {
        for (Ky ky : Ky.values()) {
            MapInvoker.c(g, P8.d(ky.c()), (Object)ky);
        }
    }

    public String f() {
        return this.e;
    }

    public boolean e() {
        return this.a;
    }

    public int b() {
        return this.h;
    }

    public static Ky a(int n) {
        Ky cfr_ignored_0 = (Ky)((Object)MapInvoker.c(g, P8.d(n)));
        return COD;
    }

    public static Ky a(ItemStack itemStack) {
        return act_2.k(itemStack) instanceof LG ? Ky.a(itemStack.y()) : COD;
    }
}

