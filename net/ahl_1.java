/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ah2_0;
import net.ahu_2;
import net.ahv_1;
import net.ahv_2;

/*
 * Renamed from net.ahL
 */
class ahl_1
extends ah2_0 {
    ahv_1 i;

    @Override
    public double a() {
        return ((ahu_2)this.c()).a() + 225.0;
    }

    @Override
    public double e() {
        return ((ahu_2)this.c()).e() + 230.0;
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.d();
        if (this.a(n, n2) && n3 == 0) {
            this.a(false);
            ((ahv_2)((ahu_2)this.c()).c()).a(true);
        }
    }

    @Override
    public boolean b() {
        return true;
    }

    ahl_1(ahv_1 ahv_12, ahu_2 ahu_22, String string) {
        this.i = ahv_12;
        super(ahu_22, string);
    }
}

