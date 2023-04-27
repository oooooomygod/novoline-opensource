/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityMinecart;

public class aK9
extends aKS {
    private EntityMinecart k;
    private float l = 0.0f;

    public aK9(EntityMinecart entityMinecart) {
        super(new ResourceLocation(ast_1.a));
        this.k = entityMinecart;
        this.e = true;
        this.c = 0;
    }

    @Override
    public void b() {
        if (this.k.isDead) {
            this.j = true;
        } else {
            this.d = (float)this.k.posX;
            this.h = (float)this.k.posY;
            this.i = (float)this.k.posZ;
            float f = MathHelper.e(this.k.motionX * this.k.motionX + this.k.motionZ * this.k.motionZ);
            if ((double)f >= 0.01) {
                this.l = MathHelper.b(this.l + 0.0025f, 0.0f, 1.0f);
                this.g = 0.0f + MathHelper.b(f, 0.0f, 0.5f) * 0.7f;
            } else {
                this.l = 0.0f;
                this.g = 0.0f;
            }
        }
    }
}

