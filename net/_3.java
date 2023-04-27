/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net._r_0;
import net.ng_1;

class _3
extends _r_0 {
    @Override
    protected double a(EntityLivingBase entityLivingBase) {
        return 4.0f + entityLivingBase.width;
    }

    public _3(ng_1 ng_12) {
        super(ng_12, EntityLivingBase.class, 1.4, true);
    }
}

