/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.aOC;
import net.ayc_0;
import net.jf_1;
import net.mr_1;
import net.nM;
import net.r3;
import net.st_1;

/*
 * Renamed from net.jP
 */
public class jp_1
extends jf_1<nM> {
    private static ResourceLocation q;
    private static ResourceLocation p;

    @Override
    protected ResourceLocation a(nM nM2) {
        return st_1.a(nM2) == 1 ? q : p;
    }

    @Override
    protected void a(nM nM2, float f) {
        if (st_1.a(nM2) == 1) {
            GlStateManagerInvoker.c(1.2f, 1.2f, 1.2f);
        }
    }

    public jp_1(RenderManager renderManager) {
        super(renderManager, new r3(), 0.5f);
        this.b(new mr_1(this));
        this.b(new ayc_0(this, this));
    }

    @Override
    public void a() {
        GlStateManagerInvoker.translate(0.09375f, 0.1875f, 0.0f);
    }

    static {
        p = new ResourceLocation(aOC.a);
        q = new ResourceLocation(aOC.b);
    }
}

