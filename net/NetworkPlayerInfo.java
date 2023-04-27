/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.world.GameType;
import deobf.IChatComponent;
import deobf.MCInvoker;

public class NetworkPlayerInfo {
    private int k = 0;
    private ResourceLocation m;
    private long e = 0L;
    private ResourceLocation j;
    private String b;
    private GameProfile d;
    private GameType c;
    private boolean h = false;
    private IChatComponent a;
    private long f = 0L;
    private int g;
    private long l = 0L;
    private int i = 0;

    protected void a(int n) {
        this.g = n;
    }

    public int d() {
        return this.k;
    }

    private void lambda$loadPlayerTextures$0(MinecraftProfileTexture.Type type, ResourceLocation resourceLocation, MinecraftProfileTexture minecraftProfileTexture) {
        switch (aUD.a[type.ordinal()]) {
            case 1: {
                this.m = resourceLocation;
                this.b = af0.a(minecraftProfileTexture, aya_0.a);
                if (this.b != null) break;
                this.b = aya_0.b;
                break;
            }
            case 2: {
                this.j = resourceLocation;
            }
        }
    }

    public long n() {
        return this.e;
    }

    public void a(long l4) {
        this.l = l4;
    }

    public GameProfile l() {
        return this.d;
    }

    public ResourceLocation o() {
        if (this.m == null) {
            this.j();
        }
        return this.m != null ? this.m : af__0.a(a4Z.a(this.d));
    }

    public ResourceLocation b() {
        if (this.m == null) {
            this.j();
        }
        return (ResourceLocation)aWU.a(this.m, af__0.a(a4Z.a(this.d)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void j() {
        NetworkPlayerInfo networkPlayerInfo = this;
        synchronized (networkPlayerInfo) {
            if (!this.h) {
                this.h = true;
                aFZ.a(MCInvoker.N(MCInvoker.f()), this.d, this::lambda$loadPlayerTextures$0, true);
            }
            return;
        }
    }

    public GameType c() {
        return this.c;
    }

    public int f() {
        return this.i;
    }

    public void b(int n) {
        this.i = n;
    }

    public void c(int n) {
        this.k = n;
    }

    public int m() {
        return this.g;
    }

    public boolean h() {
        return this.m != null;
    }

    public String g() {
        return this.b == null ? af__0.b(a4Z.a(this.d)) : this.b;
    }

    public long i() {
        return this.f;
    }

    public ResourceLocation p() {
        if (this.j == null) {
            this.j();
        }
        return this.j;
    }

    public NetworkPlayerInfo(ayb_1 ayb_12) {
        this.d = aH7.d(ayb_12);
        this.c = aH7.b(ayb_12);
        this.g = aH7.c(ayb_12);
        this.a = ayb_12.a();
    }

    public long e() {
        return this.l;
    }

    public IChatComponent a() {
        return this.a;
    }

    public void c(long l4) {
        this.f = l4;
    }

    public a35 k() {
        return VM.c(BlockInvoker.o(MCInvoker.f().world), a4Z.d(this.l()));
    }

    protected void a(GameType gameType) {
        this.c = gameType;
    }

    public void b(long l4) {
        this.e = l4;
    }

    public NetworkPlayerInfo(GameProfile gameProfile) {
        this.d = gameProfile;
    }

    public void a(IChatComponent iChatComponent) {
        this.a = iChatComponent;
    }
}

