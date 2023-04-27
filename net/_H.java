/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net._9;
import net.n__0;
import net.nu_1;

class _H
extends _9 {
    @Override
    protected void a(nu_1 nu_12, EntityLivingBase entityLivingBase) {
        super.a(nu_12, entityLivingBase);
        if (nu_12 instanceof n__0) {
            n__0.a((n__0)nu_12, entityLivingBase);
        }
    }

    public _H(n__0 n__02) {
        super((nu_1)n__02, true, new Class[0]);
    }
}

