/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;

/*
 * Renamed from net.aq9
 */
public class aq9_0
implements KB<nq_2> {
    private jk_0 a;

    @Override
    public void a(nq_2 nq_22, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!yh_2.a(nq_22)) {
            GlStateManagerInvoker.pushMatrix();
            up_0.a(xl_1.a((jk_0)this.a).k, 0.0625f);
            float f8 = 0.625f;
            GlStateManagerInvoker.translate(0.0f, -0.34375f, 0.0f);
            GlStateManagerInvoker.b(180.0f, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.c(f8, -f8, -f8);
            aq__0.a(MCInvoker.S(MCInvoker.f()), nq_22, new ItemStack(Blocks.ap, 1), go_0.HEAD);
            GlStateManagerInvoker.popMatrix();
        }
    }

    public aq9_0(jk_0 jk_02) {
        this.a = jk_02;
    }

    @Override
    public boolean a() {
        return true;
    }
}

