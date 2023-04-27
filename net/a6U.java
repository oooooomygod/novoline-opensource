/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;
import deobf.TileEntity;
import net.minecraft.network.packts.S35PacketUpdateTileEntity;

public class a6U
extends TileEntity {
    private awn_1 i = new aw8_0(this);

    @Override
    public Packet g() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        this.c(nBTTagCompound);
        return new S35PacketUpdateTileEntity(this.g, 2, nBTTagCompound);
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        awo_0.a(this.i, nBTTagCompound);
    }

    public ab1_0 b() {
        return this.i.f();
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        awo_0.b(this.i, nBTTagCompound);
    }

    public awn_1 a() {
        return this.i;
    }
}

