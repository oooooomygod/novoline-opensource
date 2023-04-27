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

public class _K
extends _S {
    private int h;
    no_1 i;
    EntityLivingBase j;

    @Override
    public boolean g() {
        if (!aLD.d(this.i)) {
            return false;
        }
        aLD.c(this.i);
        return false;
    }

    @Override
    public void b() {
        aMY.a(this.d, this.j);
        EntityLivingBase entityLivingBase = aLD.c(this.i);
        this.h = atn_0.e(entityLivingBase);
        super.b();
    }

    public _K(no_1 no_12) {
        super(no_12, false);
        this.i = no_12;
        this.a(1);
    }
}

