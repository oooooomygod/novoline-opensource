/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net._S;
import net.avp_0;
import net.nf_2;

public class _M
extends _S {
    nf_2 i;
    EntityLivingBase h;

    public _M(nf_2 nf_22) {
        super(nf_22, false, true);
        this.i = nf_22;
        this.a(1);
    }

    @Override
    public void b() {
        avp_0.a(this.i, this.h);
        super.b();
    }

    @Override
    public boolean g() {
        avp_0.a(this.i);
        return false;
    }
}

