/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import net.a5Y;
import net.a5l_0;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.r2
 */
public class r2_0
extends q1_0 {
    private a5Y j;
    private a5Y h;
    private a5Y i = new a5Y(this, a5l_0.c);

    public r2_0(float f, boolean bl) {
        up_0.a(up_0.b(this.i, 0, 0), -4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.j = new a5Y(this, a5l_0.a);
        up_0.a(up_0.b(this.j, 32, 0), -4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.h = new a5Y(this, a5l_0.b);
        up_0.a(up_0.b(this.h, 0, 16), -6.0f, 0.0f, -6.0f, 12, 4, 12);
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
        GlStateManagerInvoker.translate(0.0f, -0.5f, 0.0f);
        if (this.h != null) {
            up_0.b(this.h, f6);
        }
        GlStateManagerInvoker.b(f2, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.translate(0.0f, 0.8f + f3, 0.0f);
        GlStateManagerInvoker.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        up_0.b(this.i, f6);
        GlStateManagerInvoker.c(0.875f, 0.875f, 0.875f);
        GlStateManagerInvoker.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        GlStateManagerInvoker.b(f2, 0.0f, 1.0f, 0.0f);
        up_0.b(this.i, f6);
        GlStateManagerInvoker.c(0.875f, 0.875f, 0.875f);
        GlStateManagerInvoker.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        GlStateManagerInvoker.b(f2, 0.0f, 1.0f, 0.0f);
        up_0.b(this.j, f6);
        GlStateManagerInvoker.popMatrix();
    }
}

