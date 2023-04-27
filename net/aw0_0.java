/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapsInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.Vec3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Renamed from net.aw0
 */
public class aw0_0 {
    private double j;
    private Entity h;
    private float e;
    private Random k = new Random();
    private boolean b;
    private Map<EntityPlayer, Vec3> c;
    private World a;
    private List<BlockPos> d = my_0.c();
    private double g;
    private boolean i;
    private double f;

    public void e() {
        ListInvoker.clear(this.d);
    }

    public aw0_0(World world, Entity entity, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        this.c = MapsInvoker.a();
        this.a = world;
        this.h = entity;
        this.e = f;
        this.g = d;
        this.j = d2;
        this.f = d3;
        this.b = bl;
        this.i = bl2;
    }

    public EntityLivingBase d() {
        return this.h == null ? null : (this.h instanceof od_1 ? B.a((od_1)this.h) : (this.h instanceof EntityLivingBase ? (EntityLivingBase)this.h : null));
    }

    public Map<EntityPlayer, Vec3> c() {
        return this.c;
    }

    public void a(boolean bl) {
        BlockPos blockPos;
        Iterator iterator;
        aV8.a(this.a, this.g, this.j, this.f, aGV.a, 4.0f, (1.0f + (a5_0.e(this.a.o) - a5_0.e(this.a.o)) * 0.2f) * 0.7f);
        if (this.e >= 2.0f && this.i) {
            aV8.a(this.a, B7.EXPLOSION_HUGE, this.g, this.j, this.f, 1.0, 0.0, 0.0, new int[0]);
        } else {
            aV8.a(this.a, B7.EXPLOSION_LARGE, this.g, this.j, this.f, 1.0, 0.0, 0.0, new int[0]);
        }
        if (this.i) {
            iterator = ListInvoker.iterator(this.d);
            while (dz_0.c(iterator)) {
                blockPos = (BlockPos)dz_0.b(iterator);
                Block block = BlockStateInvoker.getBlock(aV8.q(this.a, blockPos));
                double d = (float)amv_2.j(blockPos) + a5_0.e(this.a.o);
                double d2 = (float)amv_2.h(blockPos) + a5_0.e(this.a.o);
                double d3 = (float)amv_2.i(blockPos) + a5_0.e(this.a.o);
                double d4 = d - this.g;
                double d5 = d2 - this.j;
                double d6 = d3 - this.f;
                double d7 = MathHelper.e(d4 * d4 + d5 * d5 + d6 * d6);
                d4 /= d7;
                d5 /= d7;
                d6 /= d7;
                double d8 = 0.5 / (d7 / (double)this.e + 0.1);
                aV8.a(this.a, B7.EXPLOSION_NORMAL, (d + this.g * 1.0) / 2.0, (d2 + this.j * 1.0) / 2.0, (d3 + this.f * 1.0) / 2.0, d4 *= (d8 *= (double)(a5_0.e(this.a.o) * a5_0.e(this.a.o) + 0.3f)), d5 *= d8, d6 *= d8, new int[0]);
                aV8.a(this.a, B7.SMOKE_NORMAL, d, d2, d3, d4, d5, d6, new int[0]);
                if (BlocksInvoker.getBlockState(block) == Material.air) continue;
                if (BlocksInvoker.a(block, this)) {
                    BlocksInvoker.a(block, this.a, blockPos, aV8.q(this.a, blockPos), 1.0f / this.e, 0);
                }
                aV8.a(this.a, blockPos, BlocksInvoker.t(Blocks.air), 3);
                BlocksInvoker.a(block, this.a, blockPos, this);
            }
        }
        if (this.b) {
            iterator = ListInvoker.iterator(this.d);
            while (dz_0.c(iterator)) {
                blockPos = (BlockPos)dz_0.b(iterator);
                if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(this.a, blockPos))) != Material.air || !BlocksInvoker.g(BlockStateInvoker.getBlock(aV8.q(this.a, amv_2.g(blockPos)))) || a5_0.a(this.k, 3) != 0) continue;
                aV8.a(this.a, blockPos, abb_1.a(Blocks.c));
            }
        }
    }

    public aw0_0(World world, Entity entity, double d, double d2, double d3, float f, List<BlockPos> list) {
        this(world, entity, d, d2, d3, f, false, true, list);
    }

    public List<BlockPos> a() {
        return this.d;
    }

    public aw0_0(World world, Entity entity, double d, double d2, double d3, float f, boolean bl, boolean bl2, List<BlockPos> list) {
        this(world, entity, d, d2, d3, f, bl, bl2);
        ListInvoker.addAll(this.d, list);
    }

    public void b() {
        axe_2.a();
        boolean bl = false;
        boolean bl2 = false;
        int n = 0;
        while (true) {
            ++n;
        }
    }
}

