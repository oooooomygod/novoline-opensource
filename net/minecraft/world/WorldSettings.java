/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.NO;
import net.WorldInfo;
import net.WorldType;
import net.ar3_0;
import net.uv_2;

public class WorldSettings {
    private String d = NO.a;
    private GameType f;
    private boolean c;
    private boolean h;
    private long b;
    private WorldType a;
    private boolean g;
    private boolean e;

    public static GameType a(int n) {
        return ar3_0.a(n);
    }

    public void d() {
        this.c = true;
    }

    public WorldSettings(WorldInfo worldInfo) {
        this(worldInfo.g(), worldInfo.s(), worldInfo.n(), uv_2.t(worldInfo), worldInfo.j());
    }

    public WorldSettings j() {
        this.e = true;
        return this;
    }

    public boolean g() {
        return this.g;
    }

    public String h() {
        return this.d;
    }

    public boolean f() {
        return this.c;
    }

    public long a() {
        return this.b;
    }

    public boolean i() {
        return this.h;
    }

    public WorldType c() {
        return this.a;
    }

    public WorldSettings a(String string) {
        this.d = string;
        return this;
    }

    public WorldSettings(long l4, GameType gameType, boolean bl, boolean bl2, WorldType worldType) {
        this.b = l4;
        this.f = gameType;
        this.h = bl;
        this.g = bl2;
        this.a = worldType;
    }

    public GameType e() {
        return this.f;
    }

    public boolean b() {
        return this.e;
    }
}

