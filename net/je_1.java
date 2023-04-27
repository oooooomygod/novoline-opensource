/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.aYQ;
import net.aZT;
import net.ado_1;
import net.awl_1;
import net.jg_1;
import net.mr_1;
import net.ol_2;
import net.rw_1;

/*
 * Renamed from net.jE
 */
public class je_1
extends jg_1<ol_2> {
    public static ResourceLocation m = new ResourceLocation(aZT.a);

    @Override
    protected ResourceLocation a(ol_2 ol_22) {
        return m;
    }

    @Override
    protected void a(ol_2 ol_22, float f, float f2, float f3) {
        GlStateManagerInvoker.b(180.0f - f2, 0.0f, 1.0f, 0.0f);
    }

    @Override
    protected boolean b(ol_2 ol_22) {
        return awl_1.b(ol_22);
    }

    public rw_1 a() {
        return (rw_1)super.d();
    }

    public je_1(RenderManager renderManager) {
        super(renderManager, new rw_1(), 0.0f);
        aYQ aYQ2 = new aYQ(this, this);
        this.b(aYQ2);
        this.b(new mr_1(this));
        this.b(new ado_1(this.a().r));
    }
}

