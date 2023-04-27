/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ah2_0;
import net.ahr_2;
import net.ahu_2;
import net.ahv_2;

class ah4
extends ah2_0 {
    ahr_2 i;

    @Override
    public double e() {
        return ((ahu_2)this.c()).e() + 230.0;
    }

    ah4(ahr_2 ahr_22, ahu_2 ahu_22, String string) {
        this.i = ahr_22;
        super(ahu_22, string);
    }

    @Override
    public double a() {
        return ((ahu_2)this.c()).a() + 225.0;
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.e();
        if (this.a(n, n2) && n3 == 0) {
            this.a(false);
            ((ahu_2)this.c()).a(true);
        }
    }

    @Override
    public boolean b() {
        return true;
    }
}

