/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;

/*
 * Renamed from net.n8
 */
public class n8_0
extends ne_2 {
    @Override
    public float b(BlockPos blockPos) {
        return aV8.i(this.worldObj, blockPos) - 0.5f;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 100.0);
        Ma.a(this.a(abb_0.e), 0.5);
        Ma.a(this.a(abb_0.f), 50.0);
    }

    public n8_0(World world) {
        super(world);
        this.c(this.width * 6.0f, this.n * 6.0f);
    }

    @Override
    public float w() {
        return 10.440001f;
    }
}

