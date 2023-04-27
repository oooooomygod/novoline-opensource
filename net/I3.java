/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.minecraft.block.BlockPos;

public class I3
extends il_0 {
    protected il_0 aF;

    @Override
    public void a(World world, Random random, xb_1 xb_12, int n, int n2, double d) {
        this.aF.a(world, random, xb_12, n, n2, d);
    }

    @Override
    public boolean a(il_0 il_02) {
        return this.aF.a(il_02);
    }

    @Override
    public Class<? extends il_0> l() {
        return this.aF.l();
    }

    public I3(int n, il_0 il_02) {
        super(n);
        this.aF = il_02;
        this.a(il_02.I, true);
        this.Y = aL0.a(aL0.a(new StringBuilder(), il_02.Y), a5n_0.a).toString();
        this.aB = il_02.aB;
        this.J = il_02.J;
        this.ad = il_02.ad;
        this.d = il_02.d;
        this.a = il_02.a;
        this.C = il_02.C;
        this.o = il_02.o;
        this.ae = il_02.ae;
        this.e = il_02.e;
        this.S = il_02.S;
        this.P = my_0.a(il_02.P);
        this.ar = my_0.a(il_02.ar);
        this.aj = my_0.a(il_02.aj);
        this.x = my_0.a(il_02.x);
        this.C = il_02.C;
        this.o = il_02.o;
        this.d = il_02.d + 0.1f;
        this.a = il_02.a + 0.2f;
    }

    @Override
    public ann_0 k() {
        return this.aF.k();
    }

    @Override
    public int c(BlockPos blockPos) {
        return this.aF.c(blockPos);
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        arn_2.a(this.aF.ai, world, random, this, blockPos);
    }

    @Override
    public int b(BlockPos blockPos) {
        return this.aF.b(blockPos);
    }

    @Override
    public float e() {
        return this.aF.e();
    }

    @Override
    public ii_1 b(Random random) {
        return this.aF.b(random);
    }
}

