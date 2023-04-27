/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.aly_2;
import net.ayh_1;
import net.nz_0;

/*
 * Renamed from net.al6
 */
public class al6_0
extends aly_2 {
    private nz_0 h;

    @Override
    public boolean g() {
        if (ayh_1.e(this.h)) {
            this.d = ayh_1.h(this.h);
            return true;
        }
        return false;
    }

    public al6_0(nz_0 nz_02) {
        super(nz_02, EntityPlayer.class, 8.0f);
        this.h = nz_02;
    }
}

