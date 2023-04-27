/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net._m_0;
import net.a6w_0;
import net.atn_0;

/*
 * Renamed from net.Bw
 */
class bw_0
implements Predicate<T> {
    _m_0 a;
    Predicate b;

    public boolean a(T t) {
        if (this.b != null && !this.b.apply(t)) {
            return false;
        }
        if (t instanceof EntityPlayer) {
            double d = this.a.a();
            if (atn_0.s(t)) {
                d *= (double)0.8f;
            }
            if (atn_0.M(t)) {
                float f = a6w_0.b((EntityPlayer)t);
                if (f < 0.1f) {
                    f = 0.1f;
                }
                d *= (double)(0.7f * f);
            }
            if ((double)atn_0.a(t, this.a.d) > d) {
                return false;
            }
        }
        return this.a.a((EntityLivingBase)t, false);
    }

    bw_0(_m_0 _m_02, Predicate predicate) {
        this.a = _m_02;
        this.b = predicate;
    }
}

