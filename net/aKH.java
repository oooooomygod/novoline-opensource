/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import deobf.EntityMinecart;

public class aKH
extends aKS {
    private EntityPlayer l;
    private EntityMinecart k;

    public aKH(EntityPlayer entityPlayer, EntityMinecart entityMinecart) {
        super(new ResourceLocation(mw_0.a));
        this.l = entityPlayer;
        this.k = entityMinecart;
        this.a = ys_1.NONE;
        this.e = true;
        this.c = 0;
    }

    @Override
    public void b() {
        if (!this.k.isDead && a6w_0.B(this.l) && this.l.r == this.k) {
            float f = MathHelper.e(this.k.motionX * this.k.motionX + this.k.motionZ * this.k.motionZ);
            this.g = (double)f >= 0.01 ? 0.0f + MathHelper.b(f, 0.0f, 1.0f) * 0.75f : 0.0f;
        } else {
            this.j = true;
        }
    }
}

