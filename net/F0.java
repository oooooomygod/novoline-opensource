/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import deobf.Entity;
import deobf.IBlockAccess;
import deobf.Vec3;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.BlockPos;

public abstract class F0 {
    protected aMH h;
    private int a;
    private ahw_2 f;
    private float b = 1.0f;
    private Vec3 g = new Vec3(0.0, 0.0, 0.0);
    private ana_2 i;
    protected nl_1 e;
    protected World d;
    protected double c;
    private int j;

    protected abstract boolean a(Vec3 var1, Vec3 var2, int var3, int var4, int var5);

    public boolean a(aMH aMH2, double d) {
        this.h = null;
        return false;
    }

    protected void c() {
    }

    public aMH a(Entity entity) {
        if (!this.h()) {
            return null;
        }
        float f = this.g();
        ProfilerInvoker.startSection(this.d.A, a03.a);
        BlockPos blockPos = amv_2.e(new BlockPos(this.e));
        int n = (int)(f + 16.0f);
        avn_0 avn_02 = new avn_0(this.d, amv_2.a(blockPos, -n, -n, -n), amv_2.a(blockPos, n, n, n), 0);
        aMH aMH2 = arq_1.a(this.i, (IBlockAccess)avn_02, (Entity)this.e, entity, f);
        ProfilerInvoker.endSection(this.d.A);
        return aMH2;
    }

    protected void a(Vec3 vec3) {
        if (this.j - this.a > 100) {
            if (aNE.e(vec3, this.g) < 2.25) {
                this.k();
            }
            this.a = this.j;
            this.g = vec3;
        }
    }

    public float g() {
        return (float)Ma.d(this.f);
    }

    protected abstract Vec3 i();

    public boolean a(double d, double d2, double d3, double d4) {
        aMH aMH2 = this.a(MathHelper.floor_double(d), (int)d2, MathHelper.floor_double(d3));
        return this.a(aMH2, d4);
    }

    public void k() {
        this.h = null;
    }

    public void a(double d) {
        this.c = d;
    }

    public aMH j() {
        return this.h;
    }

    public F0(nl_1 nl_12, World world) {
        this.e = nl_12;
        this.d = world;
        this.f = CG.a(nl_12, abb_0.c);
        this.i = this.e();
    }

    public void b() {
        ++this.j;
        if (!this.f()) {
            Object object;
            Vec3 vec3;
            if (this.h()) {
                this.a();
            } else if (this.h != null && afG.e(this.h) < afG.c(this.h)) {
                vec3 = this.i();
                object = afG.a(this.h, this.e, afG.e(this.h));
                if (vec3.yCoord > ((Vec3)object).yCoord && !this.e.onGround && MathHelper.floor_double(vec3.xCoord) == MathHelper.floor_double(((Vec3)object).xCoord) && MathHelper.floor_double(vec3.zCoord) == MathHelper.floor_double(((Vec3)object).zCoord)) {
                    afG.c(this.h, afG.e(this.h) + 1);
                }
            }
            if (!this.f()) {
                vec3 = afG.a(this.h, this.e);
                object = h__0.d(new rm_2(vec3.xCoord, vec3.yCoord, vec3.zCoord, vec3.xCoord, vec3.yCoord, vec3.zCoord), 0.5, 0.5, 0.5);
                List list = aV8.b(this.d, this.e, h__0.a((rm_2)object, 0.0, -1.0, 0.0));
                double d = -1.0;
                object = h__0.b((rm_2)object, 0.0, 1.0, 0.0);
                Iterator iterator = ListInvoker.iterator(list);
                while (dz_0.c(iterator)) {
                    rm_2 rm_22 = (rm_2)dz_0.b(iterator);
                    d = h__0.a(rm_22, (rm_2)object, d);
                }
                MK.a(CG.i(this.e), vec3.xCoord, vec3.yCoord + d, vec3.zCoord, this.c);
            }
        }
    }

    public void a(float f) {
        this.b = f;
    }

    protected abstract ana_2 e();

    public aMH a(BlockPos blockPos) {
        if (!this.h()) {
            return null;
        }
        float f = this.g();
        ProfilerInvoker.startSection(this.d.A, a03.b);
        BlockPos blockPos2 = new BlockPos(this.e);
        int n = (int)(f + 8.0f);
        avn_0 avn_02 = new avn_0(this.d, amv_2.a(blockPos2, -n, -n, -n), amv_2.a(blockPos2, n, n, n), 0);
        aMH aMH2 = arq_1.a(this.i, (IBlockAccess)avn_02, (Entity)this.e, blockPos, f);
        ProfilerInvoker.endSection(this.d.A);
        return aMH2;
    }

    public boolean a(Entity entity, double d) {
        aMH aMH2 = this.a(entity);
        return this.a(aMH2, d);
    }

    protected abstract boolean h();

    public aMH a(double d, double d2, double d3) {
        return this.a(new BlockPos(MathHelper.floor_double(d), (int)d2, MathHelper.floor_double(d3)));
    }

    public boolean f() {
        return this.h == null || afG.d(this.h);
    }

    protected void a() {
        int n;
        Vec3 vec3 = this.i();
        int n2 = afG.c(this.h);
        for (int i = afG.e(this.h); i < afG.c(this.h); ++i) {
            if (afG.a((aMH)this.h, (int)i).d == (int)vec3.yCoord) continue;
            n2 = i;
            break;
        }
        float f = this.e.width * this.e.width * this.b;
        for (n = afG.e(this.h); n < n2; ++n) {
            Vec3 vec32 = afG.a(this.h, this.e, n);
            if (!(aNE.e(vec3, vec32) < (double)f)) continue;
            afG.c(this.h, n + 1);
        }
        n = MathHelper.c(this.e.width);
        int n3 = (int)this.e.n + 1;
        int n4 = n;
        for (int i = n2 - 1; i >= afG.e(this.h); --i) {
            if (!this.a(vec3, afG.a(this.h, this.e, i), n, n3, n4)) continue;
            afG.c(this.h, i);
            break;
        }
        this.a(vec3);
    }

    protected boolean d() {
        return CG.s(this.e) || CG.p(this.e);
    }
}

