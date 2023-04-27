/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.TileEntity;
import net.NBTTagCompound;
import net.fi_0;
import net.tn_0;

public class a64
extends TileEntity {
    private int i;

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        this.i = tn_0.g(nBTTagCompound, fi_0.a);
    }

    public void a(int n) {
        this.i = n;
    }

    public int a() {
        return this.i;
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        tn_0.b(nBTTagCompound, fi_0.b, this.i);
    }
}

