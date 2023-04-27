/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;
import deobf.TileEntity;
import net.minecraft.network.packts.S35PacketUpdateTileEntity;

public class a6A
extends TileEntity {
    private Item i;
    private int j;

    public Item b() {
        return this.i;
    }

    @Override
    public Packet g() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        this.c(nBTTagCompound);
        tn_0.a(nBTTagCompound, os_1.b);
        tn_0.b(nBTTagCompound, os_1.i, px_0.a(this.i));
        return new S35PacketUpdateTileEntity(this.g, 5, nBTTagCompound);
    }

    public int a() {
        return this.j;
    }

    public a6A(Item item, int n) {
        this.i = item;
        this.j = n;
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        ResourceLocation cfr_ignored_0 = (ResourceLocation)aLP.c(Item.k, this.i);
        tn_0.a(nBTTagCompound, os_1.c, os_1.d);
        tn_0.b(nBTTagCompound, os_1.f, this.j);
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        this.i = tn_0.a(nBTTagCompound, os_1.h, 8) ? px_0.a(tn_0.m(nBTTagCompound, os_1.g)) : px_0.a(tn_0.g(nBTTagCompound, os_1.a));
        this.j = tn_0.g(nBTTagCompound, os_1.e);
    }

    public a6A() {
    }

    public void a(Item item, int n) {
        this.i = item;
        this.j = n;
    }
}

