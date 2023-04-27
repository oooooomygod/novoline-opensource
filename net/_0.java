/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.EntityLivingBase;
import net._m_0;
import net.aLD;
import net.no_1;

public class _0<T extends EntityLivingBase>
extends _m_0 {
    private no_1 m;

    public _0(no_1 no_12, Class<T> clazz, boolean bl, Predicate<? super T> predicate) {
        super(no_12, clazz, 10, bl, false, predicate);
        this.m = no_12;
    }

    @Override
    public boolean g() {
        return !aLD.d(this.m) && super.g();
    }
}

