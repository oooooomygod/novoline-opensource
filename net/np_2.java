/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.np
 */
public class np_2
extends mi_1 {
    private B7 az;
    private int aA;
    private int aB;
    private Entity aC;

    @Override
    public int f() {
        return 3;
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public np_2(World world, Entity entity, B7 b7) {
        super(world, entity.posX, entity.getEntityBoundingBox().a + (double)(entity.n / 2.0f), entity.posZ, entity.motionX, entity.motionY, entity.motionZ);
        this.aC = entity;
        this.aB = 3;
        this.az = b7;
        this.onUpdate();
    }

    @Override
    public void onUpdate() {
        int n = 0;
        while (true) {
            double d;
            double d2;
            double d3;
            if ((d3 = (double)(a5_0.e(this.Q) * 2.0f - 1.0f)) * d3 + (d2 = (double)(a5_0.e(this.Q) * 2.0f - 1.0f)) * d2 + (d = (double)(a5_0.e(this.Q) * 2.0f - 1.0f)) * d <= 1.0) {
                double d4 = this.aC.posX + d3 * (double)this.aC.width / 4.0;
                double d5 = this.aC.getEntityBoundingBox().a + (double)(this.aC.n / 2.0f) + d2 * (double)this.aC.n / 4.0;
                double d6 = this.aC.posZ + d * (double)this.aC.width / 4.0;
                aV8.a(this.worldObj, this.az, false, d4, d5, d6, d3, d2 + 0.2, d, new int[0]);
            }
            ++n;
        }
    }
}

