/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import deobf.Vec3;
import java.util.Iterator;


public class F_
extends F0 {
    protected aps_1 l;
    private boolean k;

    public boolean c() {
        return this.l.c();
    }

    public F_(nl_1 nl_12, World world) {
        super(nl_12, world);
    }

    @Override
    protected boolean h() {
        return this.e.onGround || this.e() && this.d() || CG.m(this.e) && this.e instanceof n0_0 && this.e.r instanceof nd_1;
    }

    @Override
    protected void c() {
        super.c();
        if (this.k) {
            if (aV8.w(this.d, new BlockPos(MathHelper.floor_double(this.e.posX), (int)(CG.v((nl_1)this.e).a + 0.5), MathHelper.floor_double(this.e.posZ)))) {
                return;
            }
            for (int i = 0; i < afG.c(this.h); ++i) {
                aQP aQP2 = afG.a(this.h, i);
                if (!aV8.w(this.d, new BlockPos(aQP2.c, aQP2.d, aQP2.j))) continue;
                afG.b(this.h, i - 1);
                return;
            }
        }
    }

    @Override
    protected ana_2 e() {
        this.l = new aps_1();
        this.l.c(true);
        return new ana_2(this.l);
    }

    public void d(boolean bl) {
        this.l.d(bl);
    }

    public void e(boolean bl) {
        this.l.c(bl);
    }

    public void b(boolean bl) {
        this.l.b(bl);
    }

    public void a(boolean bl) {
        this.l.a(bl);
    }

    public boolean b() {
        return this.l.b();
    }

    private int a() {
        if (CG.s(this.e) && this.e()) {
            int n = (int)CG.v((nl_1)this.e).a;
            Block block = BlockStateInvoker.getBlock(aV8.q(this.d, new BlockPos(MathHelper.floor_double(this.e.posX), n, MathHelper.floor_double(this.e.posZ))));
            int n2 = 0;
            while (block == Blocks.flowing_water || block == Blocks.water) {
                block = BlockStateInvoker.getBlock(aV8.q(this.d, new BlockPos(MathHelper.floor_double(this.e.posX), ++n, MathHelper.floor_double(this.e.posZ))));
                if (++n2 <= 16) continue;
                return (int)CG.v((nl_1)this.e).a;
            }
            return n;
        }
        return (int)(CG.v((nl_1)this.e).a + 0.5);
    }

    public boolean e() {
        return this.l.a();
    }

    public void c(boolean bl) {
        this.k = bl;
    }

    @Override
    protected Vec3 i() {
        return new Vec3(this.e.posX, this.a(), this.e.posZ);
    }

    private boolean a(int n, int n2, int n3, int n4, int n5, int n6, Vec3 vec3, double d, double d2) {
        int n7 = n - n4 / 2;
        int n8 = n3 - n6 / 2;
        if (!this.b(n7, n2, n8, n4, n5, n6, vec3, d, d2)) {
            return false;
        }
        for (int i = n7; i < n7 + n4; ++i) {
            for (int j = n8; j < n8 + n6; ++j) {
                double d3 = (double)i + 0.5 - vec3.xCoord;
                double d4 = (double)j + 0.5 - vec3.zCoord;
                if (!(d3 * d + d4 * d2 >= 0.0)) continue;
                Block block = BlockStateInvoker.getBlock(aV8.q(this.d, new BlockPos(i, n2 - 1, j)));
                Material material = BlocksInvoker.getBlockState(block);
                if (material == Material.air) {
                    return false;
                }
                if (material == Material.M && !CG.s(this.e)) {
                    return false;
                }
                if (material != Material.e) continue;
                return false;
            }
        }
        return true;
    }

    private boolean b(int n, int n2, int n3, int n4, int n5, int n6, Vec3 vec3, double d, double d2) {
        Iterator iterator = OV.a(amv_2.b(new BlockPos(n, n2, n3), new BlockPos(n + n4 - 1, n2 + n5 - 1, n3 + n6 - 1)));
        while (dz_0.c(iterator)) {
            Block block;
            double d3;
            BlockPos blockPos = (BlockPos)dz_0.b(iterator);
            double d4 = (double)amv_2.j(blockPos) + 0.5 - vec3.xCoord;
            if (!(d4 * d + (d3 = (double)amv_2.i(blockPos) + 0.5 - vec3.zCoord) * d2 >= 0.0) || BlocksInvoker.b(block = BlockStateInvoker.getBlock(aV8.q(this.d, blockPos)), (IBlockAccess)this.d, blockPos)) continue;
            return false;
        }
        return true;
    }

    @Override
    protected boolean a(Vec3 vec3, Vec3 vec32, int n, int n2, int n3) {
        int n4 = MathHelper.floor_double(vec3.xCoord);
        int n5 = MathHelper.floor_double(vec3.zCoord);
        double d = vec32.xCoord - vec3.xCoord;
        double d2 = vec32.zCoord - vec3.zCoord;
        double d3 = d * d + d2 * d2;
        if (d3 < 1.0E-8) {
            return false;
        }
        double d4 = 1.0 / MathInvoker.d(d3);
        if (!this.a(n4, (int)vec3.yCoord, n5, n += 2, n2, n3 += 2, vec3, d *= d4, d2 *= d4)) {
            return false;
        }
        n -= 2;
        n3 -= 2;
        double d5 = 1.0 / MathInvoker.a(d);
        double d6 = 1.0 / MathInvoker.a(d2);
        double d7 = (double)(n4 * 1) - vec3.xCoord;
        double d8 = (double)(n5 * 1) - vec3.zCoord;
        if (d >= 0.0) {
            d7 += 1.0;
        }
        if (d2 >= 0.0) {
            d8 += 1.0;
        }
        d7 /= d;
        d8 /= d2;
        int n6 = d < 0.0 ? -1 : 1;
        int n7 = d2 < 0.0 ? -1 : 1;
        int n8 = MathHelper.floor_double(vec32.xCoord);
        int n9 = MathHelper.floor_double(vec32.zCoord);
        int n10 = n8 - n4;
        int n11 = n9 - n5;
        while (n10 * n6 > 0 || n11 * n7 > 0) {
            if (d7 < d8) {
                d7 += d5;
                n10 = n8 - (n4 += n6);
            } else {
                d8 += d6;
                n11 = n9 - (n5 += n7);
            }
            if (this.a(n4, (int)vec3.yCoord, n5, n, n2, n3, vec3, d, d2)) continue;
            return false;
        }
        return true;
    }
}

