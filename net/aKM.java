/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.aA8;
import net.aBR;
import net.aKS;
import net.nx_1;
import net.ys_1;

public class aKM
extends aKS {
    private nx_1 k;

    @Override
    public void b() {
        if (!this.k.isDead && aBR.e(this.k)) {
            this.d = (float)this.k.posX;
            this.h = (float)this.k.posY;
            this.i = (float)this.k.posZ;
            float f = aBR.b(this.k, 0.0f);
            this.g = 0.0f + 1.0f * f * f;
            this.b = 0.7f + 0.5f * f;
        } else {
            this.j = true;
        }
    }

    public aKM(nx_1 nx_12) {
        super(new ResourceLocation(aA8.a));
        this.k = nx_12;
        this.a = ys_1.NONE;
        this.e = true;
        this.c = 0;
    }
}

