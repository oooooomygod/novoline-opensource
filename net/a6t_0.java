/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import com.mojang.authlib.GameProfile;
import deobf.NBTBase;
import deobf.Packet;
import deobf.TileEntity;
import net.minecraft.network.packts.S35PacketUpdateTileEntity;
import java.util.UUID;

/*
 * Renamed from net.a6t
 */
public class a6t_0
extends TileEntity {
    private int j;
    private int k;
    private GameProfile i = null;

    public void b(int n) {
        this.k = n;
    }

    public int b() {
        return this.k;
    }

    @Override
    public Packet g() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        this.c(nBTTagCompound);
        return new S35PacketUpdateTileEntity(this.g, 4, nBTTagCompound);
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        tn_0.a(nBTTagCompound, me_2.g, (byte)(this.j & 0xFF));
        tn_0.a(nBTTagCompound, me_2.c, (byte)(this.k & 0xFF));
        if (this.i != null) {
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            S1.a(nBTTagCompound2, this.i);
            tn_0.a(nBTTagCompound, me_2.h, (NBTBase)nBTTagCompound2);
        }
    }

    public void a(GameProfile gameProfile) {
        this.j = 3;
        this.i = gameProfile;
        this.a();
    }

    public void a(int n) {
        this.j = n;
        this.i = null;
    }

    public static GameProfile b(GameProfile gameProfile) {
        if (!aod_2.a(a4Z.d(gameProfile))) {
            if (a4Z.b(gameProfile) && ayw_0.a(a4Z.c(gameProfile), me_2.d)) {
                return gameProfile;
            }
            if (ServerInvoker.d() == null) {
                return gameProfile;
            }
            aUu.a(ServerInvoker.L(ServerInvoker.d()), a4Z.d(gameProfile));
            return gameProfile;
        }
        return gameProfile;
    }

    public int c() {
        return this.j;
    }

    private void a() {
        this.i = a6t_0.b(this.i);
        this.d();
    }

    public GameProfile d() {
        return this.i;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        this.j = tn_0.e(nBTTagCompound, me_2.f);
        this.k = tn_0.e(nBTTagCompound, me_2.i);
        if (this.j == 3) {
            String string;
            if (tn_0.a(nBTTagCompound, me_2.k, 10)) {
                this.i = S1.a(tn_0.d(nBTTagCompound, me_2.e));
            } else if (tn_0.a(nBTTagCompound, me_2.j, 8) && !aod_2.a(string = tn_0.m(nBTTagCompound, me_2.b))) {
                this.i = new GameProfile((UUID)null, string);
                this.a();
            }
        }
    }
}

