/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import deobf.Tessellator;
import java.util.Random;
import net.RenderManager;
import net.ResourceLocation;
import net.a5_0;
import net.j7_0;
import net.ou_2;

/*
 * Renamed from net.jL
 */
public class jl_1
extends j7_0<ou_2> {
    @Override
    protected ResourceLocation a(ou_2 ou_22) {
        return null;
    }

    public jl_1(RenderManager renderManager) {
        super(renderManager);
    }

    public void a(ou_2 ou_22, double d, double d2, double d3, float f, float f2) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        TessellatorInvoker.getWorldRenderer(tessellator);
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 1);
        double[] dArray = new double[8];
        double[] dArray2 = new double[8];
        double d4 = 0.0;
        double d5 = 0.0;
        Random random = new Random(ou_22.aj);
        int n = 7;
        while (true) {
            dArray[n] = d4;
            dArray2[n] = d5;
            d4 += (double)(a5_0.a(random, 11) - 5);
            d5 += (double)(a5_0.a(random, 11) - 5);
            --n;
        }
    }
}

