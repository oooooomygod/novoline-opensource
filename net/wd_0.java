/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aad_1;
import net.wu_0;

/*
 * Renamed from net.wD
 */
class wd_0
extends wu_0 {
    aad_1 f;

    @Override
    public int b() {
        return 64;
    }

    wd_0(aad_1 aad_12, String string, boolean bl, int n) {
        this.f = aad_12;
        super(string, bl, n);
    }

    @Override
    public void d() {
        super.d();
        this.f.b(this);
    }
}

