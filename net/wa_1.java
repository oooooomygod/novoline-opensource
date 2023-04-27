/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aam_1;
import net.wu_0;

/*
 * Renamed from net.wa
 */
class wa_1
extends wu_0 {
    aam_1 f;

    wa_1(aam_1 aam_12, String string, boolean bl, int n) {
        this.f = aam_12;
        super(string, bl, n);
    }

    @Override
    public void d() {
        super.d();
        this.f.b(this);
    }
}

