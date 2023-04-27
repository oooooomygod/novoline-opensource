/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.Vec3;
import net.minecraft.block.BlockPos;

public class a91
extends a9K {
    @Override
    public boolean a(int n, int n2) {
        return true;
    }

    @Override
    public float a(long l4, float f) {
        return 0.0f;
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public float[] a(float f, float f2) {
        return null;
    }

    @Override
    public int r() {
        return 50;
    }

    @Override
    public String h() {
        return aF6.a;
    }

    @Override
    public float i() {
        return 8.0f;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public Vec3 b(float f, float f2) {
        int n = 0xA080A0;
        float f3 = MathHelper.cos(f * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        f3 = MathHelper.b(f3, 0.0f, 1.0f);
        float f4 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f5 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f6 = (float)(n & 0xFF) / 255.0f;
        return new Vec3(f4 *= f3 * 0.0f + 0.15f, f5 *= f3 * 0.0f + 0.15f, f6 *= f3 * 0.0f + 0.15f);
    }

    @Override
    public em_1 f() {
        return new axd_1(this.g, aV8.w(this.g));
    }

    @Override
    public BlockPos b() {
        return new BlockPos(100, 50, 0);
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public String c() {
        return aF6.b;
    }

    @Override
    public void d() {
        this.a = new cd_2(il_0.l, 0.0f);
        this.f = 1;
        this.c = true;
    }

    @Override
    public boolean b(int n, int n2) {
        return akm_1.d(BlocksInvoker.getBlockState(aV8.m(this.g, new BlockPos(n, 0, n2))));
    }
}

