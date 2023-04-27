/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.nl
 */
public class nl_2
extends mi_1 {
    private int aA = 8;
    private int az;

    @Override
    public int f() {
        return 1;
    }

    @Override
    public void onUpdate() {
        int n = 0;
        while (true) {
            double d = this.posX + (a5_0.c(this.Q) - a5_0.c(this.Q)) * 4.0;
            double d2 = this.posY + (a5_0.c(this.Q) - a5_0.c(this.Q)) * 4.0;
            double d3 = this.posZ + (a5_0.c(this.Q) - a5_0.c(this.Q)) * 4.0;
            aV8.a(this.worldObj, B7.EXPLOSION_LARGE, d, d2, d3, (float)this.az / (float)this.aA, 0.0, 0.0, new int[0]);
            ++n;
        }
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    protected nl_2(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
    }
}

