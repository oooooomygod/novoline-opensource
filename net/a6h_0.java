/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import deobf.TileEntity;
import net.ChatComponentText;
import net.DD;
import net.NBTTagCompound;
import net.TH;
import net.aHP;
import net.aoz_1;
import net.dv_1;
import net.ef_0;

/*
 * Renamed from net.a6h
 */
public abstract class a6h_0
extends TileEntity
implements dv_1,
aHP {
    private DD i = DD.a;

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        if (this.i != null) {
            TH.a(this.i, nBTTagCompound);
        }
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        this.i = TH.a(nBTTagCompound);
    }

    @Override
    public boolean d() {
        return this.i != null && !TH.a(this.i);
    }

    @Override
    public void a(DD dD) {
        this.i = dD;
    }

    @Override
    public DD e() {
        return this.i;
    }

    @Override
    public IChatComponent getDisplayName() {
        return ef_0.a(this) ? new ChatComponentText(ef_0.b(this)) : new aoz_1(ef_0.b(this), new Object[0]);
    }
}

