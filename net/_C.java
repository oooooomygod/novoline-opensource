/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.EntityLivingBase;
import net.YR;
import net._m_0;
import net.nu_1;

class _C<T extends EntityLivingBase>
extends _m_0<T> {
    static boolean a(_C _C2, EntityLivingBase entityLivingBase, boolean bl) {
        return _C2.a(entityLivingBase, bl);
    }

    static double a(_C _C2) {
        return _C2.a();
    }

    public _C(nu_1 nu_12, Class<T> clazz, int n, boolean bl, boolean bl2, Predicate<? super T> predicate) {
        super(nu_12, clazz, n, bl, bl2, predicate);
        this.i = new YR(this, predicate, nu_12);
    }
}

