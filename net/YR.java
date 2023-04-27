/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.EntityPlayer;
import net._C;
import net.a6w_0;
import net.atn_0;
import net.nd_2;
import net.nu_1;

class YR
implements Predicate<T> {
    _C b;
    Predicate a;
    nu_1 c;

    YR(_C _C2, Predicate predicate, nu_1 nu_12) {
        this.b = _C2;
        this.a = predicate;
        this.c = nu_12;
    }

    public boolean a(T t) {
        if (this.a != null && !this.a.apply(t)) {
            return false;
        }
        if (t instanceof nd_2) {
            return false;
        }
        if (t instanceof EntityPlayer) {
            double d = _C.a(this.b);
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
            if ((double)atn_0.a(t, this.c) > d) {
                return false;
            }
        }
        return _C.a(this.b, t, false);
    }
}

