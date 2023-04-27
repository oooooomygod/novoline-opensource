/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import net.minecraft.renderer.chunk.RenderChunk;
import net.minecraft.multiplayer.WorldClient;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Renamed from net.wY
 */
public class wy_1 {
    private int g = 0;
    private double e = -2.147483648E9;
    private Set<BlockPos> d = new HashSet<BlockPos>();
    private double c = 0.0;
    private boolean j = false;
    private long f = 0L;
    private double h = -2.147483648E9;
    private z6_0 i = new z6_0();
    private double a = -2.147483648E9;
    private Entity b = null;

    public void b(RenderGlobal renderGlobal) {
        aP2.b();
        Iterator iterator = aS0.f(this.d);
        if (dz_0.c(iterator)) {
            BlockPos blockPos = (BlockPos)dz_0.b(iterator);
            RenderChunk renderChunk = jv_0.a(renderGlobal, blockPos);
            this.a(renderChunk, null, null);
        }
    }

    public double g() {
        return this.h;
    }

    private void a(RenderChunk renderChunk, Set<BlockPos> set, Set<BlockPos> set2) {
        aP2.b();
        if (renderChunk != null) {
            amx_0 amx_02 = afq_2.e(renderChunk);
            if (amx_02 != null && !azb_1.c(amx_02)) {
                afq_2.a(renderChunk, true);
            }
            BlockPos blockPos = afq_2.d(renderChunk);
            if (set != null) {
                aS0.a(set, blockPos);
            }
            if (set2 != null) {
                aS0.b(set2, blockPos);
            }
        }
    }

    public int c() {
        return this.g;
    }

    public double d() {
        return this.a;
    }

    public void a(RenderGlobal renderGlobal) {
        aP2.b();
        if (ys_2.am()) {
            long l4 = SystemInvoker.f();
            if (l4 < this.f + 500L) {
                return;
            }
            this.f = l4;
        }
        double d = this.b.posX - 0.5;
        double d2 = this.b.posY - 0.5 + this.c;
        double d3 = this.b.posZ - 0.5;
        int n = xh_1.a(this.b);
        double d4 = d - this.a;
        double d5 = d2 - this.e;
        double d6 = d3 - this.h;
        double d7 = 0.1;
        if (MathInvoker.a(d4) > d7 || MathInvoker.a(d5) > d7 || MathInvoker.a(d6) > d7 || this.g != n) {
            Object object;
            Object object2;
            this.a = d;
            this.e = d2;
            this.h = d3;
            this.g = n;
            this.j = false;
            WorldClient worldClient = jv_0.j(renderGlobal);
            if (worldClient != null) {
                ain_1.a(this.i, MathHelper.floor_double(d), MathHelper.floor_double(d2), MathHelper.floor_double(d3));
                object2 = aV8.q(worldClient, this.i);
                object = BlockStateInvoker.getBlock((IBlockState)object2);
                this.j = object == Blocks.water;
            }
            object2 = new HashSet();
            object = (MathHelper.floor_double(d) & 0xF) >= 8 ? EnumFacing.EAST : EnumFacing.WEST;
            EnumFacing enumFacing = (MathHelper.floor_double(d2) & 0xF) >= 8 ? EnumFacing.UP : EnumFacing.DOWN;
            EnumFacing enumFacing2 = (MathHelper.floor_double(d3) & 0xF) >= 8 ? EnumFacing.SOUTH : EnumFacing.NORTH;
            BlockPos blockPos = new BlockPos(d, d2, d3);
            RenderChunk renderChunk = jv_0.a(renderGlobal, blockPos);
            RenderChunk renderChunk2 = jv_0.a(renderGlobal, renderChunk, (EnumFacing)object);
            RenderChunk renderChunk3 = jv_0.a(renderGlobal, renderChunk, enumFacing2);
            RenderChunk renderChunk4 = jv_0.a(renderGlobal, renderChunk2, enumFacing2);
            RenderChunk renderChunk5 = jv_0.a(renderGlobal, renderChunk, enumFacing);
            RenderChunk renderChunk6 = jv_0.a(renderGlobal, renderChunk5, (EnumFacing)object);
            RenderChunk renderChunk7 = jv_0.a(renderGlobal, renderChunk5, enumFacing2);
            RenderChunk renderChunk8 = jv_0.a(renderGlobal, renderChunk6, enumFacing2);
            this.a(renderChunk, this.d, (Set<BlockPos>)object2);
            this.a(renderChunk2, this.d, (Set<BlockPos>)object2);
            this.a(renderChunk3, this.d, (Set<BlockPos>)object2);
            this.a(renderChunk4, this.d, (Set<BlockPos>)object2);
            this.a(renderChunk5, this.d, (Set<BlockPos>)object2);
            this.a(renderChunk6, this.d, (Set<BlockPos>)object2);
            this.a(renderChunk7, this.d, (Set<BlockPos>)object2);
            this.a(renderChunk8, this.d, (Set<BlockPos>)object2);
            this.b(renderGlobal);
            this.d = object2;
        }
    }

    public double a() {
        return this.c;
    }

    public boolean b() {
        return this.j;
    }

    public Entity e() {
        return this.b;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), awq_0.a), this.b), awq_0.b), this.c).toString();
    }

    public wy_1(Entity entity) {
        this.b = entity;
        this.c = ayj_0.n(entity);
    }

    public double f() {
        return this.e;
    }
}

