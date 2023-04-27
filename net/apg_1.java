/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.KB;
import net.aV7;
import net.apt_2;
import net.axm_1;
import net.jy_1;
import net.ny_1;
import net.q1_0;
import net.rz_2;

/*
 * Renamed from net.apG
 */
public class apg_1
implements KB<ny_1> {
    private jy_1 b;
    private q1_0 a = new rz_2(0);

    public apg_1(jy_1 jy_12) {
        this.b = jy_12;
    }

    @Override
    public void a(ny_1 ny_12, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!apt_2.a(ny_12)) {
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.n();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771);
            aV7.a(this.a, axm_1.a(this.b));
            aV7.a(this.a, ny_12, f, f2, f4, f5, f6, f7);
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.t();
        }
    }

    @Override
    public boolean a() {
        return true;
    }
}

