/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aEk
 */
class aek_0 {
    double b;
    double a;

    float a() {
        return MathHelper.e(this.b * this.b + this.a * this.a);
    }

    void b() {
        double d = this.a();
        this.b /= d;
        this.a /= d;
    }

    public boolean a(double d, double d2, double d3, double d4) {
        boolean bl = false;
        if (this.b < d) {
            this.b = d;
            bl = true;
        } else if (this.b > d3) {
            this.b = d3;
            bl = true;
        }
        if (this.a < d2) {
            this.a = d2;
            bl = true;
        } else if (this.a > d4) {
            this.a = d4;
            bl = true;
        }
        return bl;
    }

    aek_0(double d, double d2) {
        this.b = d;
        this.a = d2;
    }

    public void a(aek_0 aek_02) {
        this.b -= aek_02.b;
        this.a -= aek_02.a;
    }

    double b(aek_0 aek_02) {
        double d = this.b - aek_02.b;
        double d2 = this.a - aek_02.a;
        return MathInvoker.d(d * d + d2 * d2);
    }

    public boolean a(World world) {
        BlockPos blockPos = new BlockPos(this.b, 256.0, this.a);
        while (amv_2.h(blockPos) > 0) {
            Material material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos = amv_2.g(blockPos))));
            if (material == Material.air) continue;
            return !akm_1.f(material) && material != Material.b;
        }
        return false;
    }

    public int b(World world) {
        BlockPos blockPos = new BlockPos(this.b, 256.0, this.a);
        while (amv_2.h(blockPos) > 0) {
            if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos = amv_2.g(blockPos)))) == Material.air) continue;
            return amv_2.h(blockPos) + 1;
        }
        return 257;
    }

    aek_0() {
    }

    public void a(Random random, double d, double d2, double d3, double d4) {
        this.b = MathHelper.a(random, d, d3);
        this.a = MathHelper.a(random, d2, d4);
    }
}

