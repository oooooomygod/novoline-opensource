/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import deobf.MCInvoker;
import net.FT;
import net.OP;
import net.a6f_0;
import net.apq_1;
import net.ayj_0;
import net.eg_0;
import net.kk_1;

/*
 * Renamed from net.ef
 */
public class ef_2
extends eg_0<a6f_0> {
    @Override
    public void a(a6f_0 a6f_02, double d, double d2, double d3, float f, int n) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d + 0.5f, (float)d2, (float)d3 + 0.5f);
        ef_2.a(kk_1.a(a6f_02), d, d2, d3, f);
        GlStateManagerInvoker.popMatrix();
    }

    public static void a(OP oP, double d, double d2, double d3, float f) {
        Entity entity = apq_1.a(oP, apq_1.c(oP));
        float f2 = 0.4375f;
        GlStateManagerInvoker.translate(0.0f, 0.4f, 0.0f);
        GlStateManagerInvoker.b((float)(apq_1.a(oP) + (apq_1.b(oP) - apq_1.a(oP)) * (double)f) * 10.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(-30.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.translate(0.0f, -0.4f, 0.0f);
        GlStateManagerInvoker.c(f2, f2, f2);
        ayj_0.b(entity, d, d2, d3, 0.0f, 0.0f);
        FT.a(MCInvoker.j(MCInvoker.f()), entity, 0.0, 0.0, 0.0, 0.0f, f);
    }
}

