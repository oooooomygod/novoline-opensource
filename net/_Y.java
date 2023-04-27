/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net._S;
import net.aLD;
import net.aMY;
import net.atn_0;
import net.no_1;

public class _Y
extends _S {
    no_1 h;
    private int j;
    EntityLivingBase i;

    @Override
    public void b() {
        aMY.a(this.d, this.i);
        EntityLivingBase entityLivingBase = aLD.c(this.h);
        this.j = atn_0.G(entityLivingBase);
        super.b();
    }

    public _Y(no_1 no_12) {
        super(no_12, false);
        this.h = no_12;
        this.a(1);
    }

    @Override
    public boolean g() {
        if (!aLD.d(this.h)) {
            return false;
        }
        aLD.c(this.h);
        return false;
    }
}

