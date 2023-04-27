/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.ArrayList;
import java.util.Map;
import net.P8;
import net.aPA;
import net.my_0;

public enum B7 {
    EXPLOSION_NORMAL(aPA.aw, 0, true),
    EXPLOSION_LARGE(aPA.I, 1, true),
    EXPLOSION_HUGE(aPA.H, 2, true),
    FIREWORKS_SPARK(aPA.t, 3, false),
    WATER_BUBBLE(aPA.s, 4, false),
    WATER_SPLASH(aPA.aB, 5, false),
    WATER_WAKE(aPA.S, 6, false),
    SUSPENDED(aPA.d, 7, false),
    SUSPENDED_DEPTH(aPA.D, 8, false),
    CRIT(aPA.aF, 9, false),
    CRIT_MAGIC(aPA.G, 10, false),
    SMOKE_NORMAL(aPA.aC, 11, false),
    SMOKE_LARGE(aPA.T, 12, false),
    SPELL(aPA.M, 13, false),
    SPELL_INSTANT(aPA.aG, 14, false),
    SPELL_MOB(aPA.y, 15, false),
    SPELL_MOB_AMBIENT(aPA.ap, 16, false),
    SPELL_WITCH(aPA.au, 17, false),
    DRIP_WATER(aPA.ag, 18, false),
    DRIP_LAVA(aPA.ao, 19, false),
    VILLAGER_ANGRY(aPA.B, 20, false),
    VILLAGER_HAPPY(aPA.f, 21, false),
    TOWN_AURA(aPA.c, 22, false),
    NOTE(aPA.J, 23, false),
    PORTAL(aPA.b, 24, false),
    ENCHANTMENT_TABLE(aPA.m, 25, false),
    FLAME(aPA.K, 26, false),
    LAVA(aPA.F, 27, false),
    FOOTSTEP(aPA.N, 28, false),
    CLOUD(aPA.P, 29, false),
    REDSTONE(aPA.h, 30, false),
    SNOWBALL(aPA.aD, 31, false),
    SNOW_SHOVEL(aPA.ae, 32, false),
    SLIME(aPA.n, 33, false),
    HEART(aPA.l, 34, false),
    BARRIER(aPA.j, 35, false),
    ITEM_CRACK(aPA.ai, 36, false, 2),
    BLOCK_CRACK(aPA.aj, 37, false, 1),
    BLOCK_DUST(aPA.an, 38, false, 1),
    WATER_DROP(aPA.ak, 39, false),
    ITEM_TAKE(aPA.Z, 40, false),
    MOB_APPEARANCE(aPA.k, 41, true);

    private int e;
    private boolean c;
    private static Map<Integer, B7> d;
    private int a;
    private static String[] f;
    private String b;

    public int e() {
        return this.e;
    }

    public int c() {
        return this.a;
    }

    private B7(String string2, int n2, boolean bl, int n3) {
        this.b = string2;
        this.a = n2;
        this.c = bl;
        this.e = n3;
    }

    private B7(String string2, int n2, boolean bl) {
        this(string2, n2, bl, 0);
    }

    public String a() {
        return this.b;
    }

    public static String[] f() {
        return f;
    }

    public static B7 a(int n) {
        return (B7)((Object)MapInvoker.c(d, P8.d(n)));
    }

    static {
        d = MapsInvoker.a();
        ArrayList arrayList = my_0.c();
        for (B7 b7 : B7.values()) {
            MapInvoker.c(d, P8.d(b7.c()), (Object)b7);
            if (StringInvoker.c(b7.a(), aPA.aq)) continue;
            ListInvoker.add(arrayList, b7.a());
        }
        f = (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
    }

    public boolean b() {
        return this.e > 0;
    }

    public boolean d() {
        return this.c;
    }
}

