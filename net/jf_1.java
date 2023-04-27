/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.aNV;
import net.ado_1;
import net.jo_0;
import net.mr_1;
import net.nl_1;
import net.ry_1;

/*
 * Renamed from net.jF
 */
public class jf_1<T extends nl_1>
extends jo_0<T> {
    private static ResourceLocation n = new ResourceLocation(aNV.a);
    protected ry_1 o;
    protected float m;

    public jf_1(RenderManager renderManager, ry_1 ry_12, float f) {
        this(renderManager, ry_12, f, 1.0f);
        this.b(new mr_1(this));
    }

    public jf_1(RenderManager renderManager, ry_1 ry_12, float f, float f2) {
        super(renderManager, ry_12, f);
        this.o = ry_12;
        this.m = f2;
        this.b(new ado_1(ry_12.r));
    }

    @Override
    public void a() {
        GlStateManagerInvoker.translate(0.0f, 0.1875f, 0.0f);
    }

    @Override
    protected ResourceLocation a(T t) {
        return n;
    }
}

