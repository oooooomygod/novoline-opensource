/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MathHelper;
import net._v_0;
import net.a5_0;
import net.alk_1;
import net.nJ;

/*
 * Renamed from net.aln
 */
class aln_2
extends _v_0 {
    private nJ b;

    @Override
    public void d() {
        int n = alk_1.b(this.b);
        if (n > 100) {
            alk_1.a(this.b, 0.0f, 0.0f, 0.0f);
        } else if (a5_0.a(alk_1.a(this.b), 50) == 0 || !nJ.a(this.b) || !alk_1.c(this.b)) {
            float f = a5_0.e(alk_1.a(this.b)) * (float)Math.PI * 2.0f;
            float f2 = MathHelper.cos(f) * 0.2f;
            float f3 = -0.1f + a5_0.e(alk_1.a(this.b)) * 0.2f;
            float f4 = MathHelper.sin(f) * 0.2f;
            alk_1.a(this.b, f2, f3, f4);
        }
    }

    public aln_2(nJ nJ2) {
        this.b = nJ2;
    }

    @Override
    public boolean g() {
        return true;
    }
}

