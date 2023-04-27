/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net.minecraft.client.entity;

import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import com.mojang.authlib.GameProfile;
import deobf.EntityPlayer;
import net.minecraft.world.GameType;
import deobf.ITextureObject;
import deobf.MCInvoker;
import net.Items;
import net.J5;
import net.Ma;
import net.NetworkPlayerInfo;
import net.ResourceLocation;
import net.TextureManager;
import net.World;
import net.a4Z;
import net.aD8;
import net.aDM;
import net.aDb;
import net.aL0;
import net.aNL;
import net.aSY;
import net.abb_0;
import net.act_2;
import net.af__0;
import net.ahw_2;
import net.ail_0;
import net.aod_2;
import net.avc_2;
import net.axx_1;
import net.ayy_0;
import net.tr_1;
import net.xv_2;
import net.ys_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractClientPlayer
extends EntityPlayer {
    private ResourceLocation bV = null;
    private NetworkPlayerInfo bT;
    private String bU;

    public boolean t() {
        NetworkPlayerInfo networkPlayerInfo = this.g();
        return aNL.i(networkPlayerInfo);
    }

    public AbstractClientPlayer(World world, GameProfile gameProfile) {
        super(world, gameProfile);
        this.bU = gameProfile.getName();
        if (this.bU != null && !StringInvoker.g(this.bU)) {
            this.bU = aod_2.b(this.bU);
        }
        xv_2.a(this);
        tr_1.a(this);
    }

    protected NetworkPlayerInfo g() {
        if (this.bT == null) {
            this.bT = aDM.a(this.J());
        }
        return this.bT;
    }

    public void a(@Nullable ResourceLocation resourceLocation) {
        this.bV = resourceLocation;
    }

    public float c() {
        float f = 1.0f;
        if (aSY.d(this.abilities)) {
            f *= 1.1f;
        }
        ahw_2 ahw_22 = this.a(abb_0.e);
        f = (float)((double)f * ((Ma.d(ahw_22) / (double)aSY.c(this.abilities) + 1.0) / 2.0));
        if (aSY.c(this.abilities) == 0.0f || axx_1.f(f) || axx_1.c(f)) {
            f = 1.0f;
        }
        if (this.isUsingItem() && act_2.k(this.ai()) == Items.bow) {
            int n = this.Q();
            float f2 = (float)n / 20.0f;
            f2 = f2 > 1.0f ? 1.0f : (f2 *= f2);
            f *= 1.0f - f2 * 0.15f;
        }
        return ayy_0.d(ail_0.P) ? aDb.a(ail_0.P, new Object[]{this, axx_1.a(f)}) : f;
    }

    @NotNull
    public static ResourceLocation a(String string) {
        return new ResourceLocation(aL0.a(aL0.a(new StringBuilder(), aD8.b), aod_2.b(string)).toString());
    }

    public String v() {
        this.g();
        return af__0.b(this.J());
    }

    public ResourceLocation e() {
        if (!ys_2.aM()) {
            return null;
        }
        if (this.bV != null) {
            return this.bV;
        }
        this.g();
        return null;
    }

    public static void a(ResourceLocation resourceLocation, String string) {
        TextureManager textureManager = MCInvoker.E(MCInvoker.f());
        ITextureObject iTextureObject = TextureManagerInvoker.b(textureManager, resourceLocation);
        iTextureObject = new J5(null, StringInvoker.a(aD8.a, new Object[]{aod_2.b(string)}), af__0.a(AbstractClientPlayer.a(string)), new avc_2());
        TextureManagerInvoker.a(textureManager, resourceLocation, iTextureObject);
    }

    public ResourceLocation d() {
        return this.bV;
    }

    public void a(NetworkPlayerInfo networkPlayerInfo) {
        this.bT = networkPlayerInfo;
    }

    public ResourceLocation f() {
        this.g();
        return af__0.a(this.J());
    }

    public String u() {
        return this.bU;
    }

    public boolean w() {
        return this.g() != null;
    }

    @Override
    public boolean k() {
        NetworkPlayerInfo networkPlayerInfo = aDM.a(a4Z.a(this.X()));
        return aNL.c(networkPlayerInfo) == GameType.SPECTATOR;
    }
}

