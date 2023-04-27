/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.alt.AltList;

class ahQ
extends ahx_1 {
    ahw_1 i;

    @Override
    public double e() {
        return ((ahw_1)this.c()).e() - (double)220.3f - avf_2.h((AltList)((ahv_2)((ahw_1)this.c()).c()).c());
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.d();
        if (this.a(n, n2)) {
            ((ahw_1)this.c()).a(false);
            ((ahv_2)((ahw_1)this.c()).c()).a(true);
        }
    }

    ahQ(ahw_1 ahw_12, ahw_1 ahw_13, String string) {
        this.i = ahw_12;
        super(ahw_13, string);
    }
}

