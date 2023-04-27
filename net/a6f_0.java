/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.ITickable;
import deobf.Packet;
import deobf.TileEntity;
import net.minecraft.network.packts.S35PacketUpdateTileEntity;

/*
 * Renamed from net.a6f
 */
public class a6f_0
extends TileEntity
implements ITickable {
    private OP i = new oq_0(this);

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        this.i.b(nBTTagCompound);
    }

    @Override
    public Packet g() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        this.c(nBTTagCompound);
        tn_0.a(nBTTagCompound, s7_0.a);
        return new S35PacketUpdateTileEntity(this.g, 1, nBTTagCompound);
    }

    public OP a() {
        return this.i;
    }

    @Override
    public boolean a(int n, int n2) {
        return apq_1.a(this.i, n) || super.a(n, n2);
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        this.i.a(nBTTagCompound);
    }

    @Override
    public void b() {
        apq_1.d(this.i);
    }
}

