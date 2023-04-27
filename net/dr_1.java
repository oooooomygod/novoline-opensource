/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.minecraft.world.GameType;

/*
 * Renamed from net.dR
 */
public class dr_1
implements Comparable<dr_1> {
    private boolean h;
    private GameType c;
    private String g;
    private boolean b;
    private String e;
    private long f;
    private boolean a;
    private long d;

    public dr_1(String string, String string2, long l4, long l5, GameType gameType, boolean bl, boolean bl2, boolean bl3) {
        this.e = string;
        this.g = string2;
        this.d = l4;
        this.f = l5;
        this.c = gameType;
        this.a = bl;
        this.b = bl2;
        this.h = bl3;
    }

    public long b() {
        return this.d;
    }

    public String h() {
        return this.g;
    }

    public GameType e() {
        return this.c;
    }

    public boolean f() {
        return this.b;
    }

    public int a(dr_1 dr_12) {
        return this.d < dr_12.d ? 1 : (this.d > dr_12.d ? -1 : StringInvoker.i(this.e, dr_12.e));
    }

    public long g() {
        return this.f;
    }

    public boolean a() {
        return this.h;
    }

    public boolean c() {
        return this.a;
    }

    public String d() {
        return this.e;
    }
}

