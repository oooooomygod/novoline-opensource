/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import java.util.Random;
import net.Material;
import net.RenderManager;
import net.ResourceLocation;
import net.a5_0;
import net.aax_2;
import net.aqi_0;
import net.aul_1;
import net.jo_0;
import net.nn_0;
import net.rv_1;
import net.xf_2;

/*
 * Renamed from net.jN
 */
public class jn_0
extends jo_0<nn_0> {
    private Random m = new Random();
    private rv_1 o = (rv_1)this.h;
    private static ResourceLocation n = new ResourceLocation(aqi_0.a);

    @Override
    protected ResourceLocation a(nn_0 nn_02) {
        return n;
    }

    public jn_0(RenderManager renderManager) {
        super(renderManager, new rv_1(0.0f), 0.5f);
        this.b(new aul_1(this));
        this.b(new xf_2(this));
    }

    @Override
    public void a(nn_0 nn_02, double d, double d2, double d3, float f, float f2) {
        this.o.t = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aax_2.c(nn_02))) != Material.air;
        this.o.s = aax_2.b(nn_02);
        if (aax_2.b(nn_02)) {
            double d4 = 0.02;
            d += a5_0.f(this.m) * d4;
            d3 += a5_0.f(this.m) * d4;
        }
        super.b(nn_02, d, d2, d3, f, f2);
    }
}

