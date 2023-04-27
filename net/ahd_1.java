/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ah2_0;
import net.ahu_2;
import net.ahv_2;

/*
 * Renamed from net.ahD
 */
class ahd_1
extends ah2_0 {
    ahu_2 i;

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.d();
        if (this.a(n, n2)) {
            ((ahu_2)this.c()).a(false);
            ((ahv_2)((ahu_2)this.c()).c()).a(true);
        }
    }

    ahd_1(ahu_2 ahu_22, ahu_2 ahu_23, String string) {
        this.i = ahu_22;
        super(ahu_23, string);
    }

    @Override
    public double e() {
        return ((ahu_2)this.c()).e();
    }
}

