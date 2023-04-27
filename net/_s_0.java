/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net._m_0;
import net.aMY;
import net.n9_0;
import net.nu_1;

/*
 * Renamed from net._s
 */
class _s_0<T extends EntityLivingBase>
extends _m_0 {
    @Override
    public boolean g() {
        float f = aMY.a(this.d, 1.0f);
        return !(f >= 0.5f) && super.g();
    }

    public _s_0(n9_0 n9_02, Class<T> clazz) {
        super((nu_1)n9_02, clazz, true);
    }
}

