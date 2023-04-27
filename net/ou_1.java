/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import deobf.EntityMinecart;

/*
 * Renamed from net.oU
 */
public class ou_1
extends EntityMinecart {
    public ou_1(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    @Override
    public anf_0 d() {
        return anf_0.RIDEABLE;
    }

    @Override
    public void a(int n, int n2, int n3, boolean bl) {
        if (this.h != null) {
            this.h.mountEntity(null);
        }
        if (this.n() == 0) {
            this.h(-this.h());
            this.c(10);
            this.a(50.0f);
            this.k();
        }
    }

    public ou_1(World world) {
        super(world);
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        if (this.h != null && this.h instanceof EntityPlayer && this.h != entityPlayer) {
            return true;
        }
        if (this.h != null && this.h != entityPlayer) {
            return false;
        }
        if (!this.worldObj.isRemote) {
            entityPlayer.mountEntity(this);
        }
        return true;
    }
}

