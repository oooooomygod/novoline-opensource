/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.ITickable;
import deobf.TileEntity;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.a6e
 */
public class a6e_0
extends TileEntity
implements ITickable {
    private boolean j;
    private boolean m;
    private List<Entity> n = my_0.c();
    private float l;
    private IBlockState i;
    private float k;
    private EnumFacing o;

    public void c() {
        if (this.k < 1.0f && this.e != null) {
            this.l = 1.0f;
            this.k = 1.0f;
            aV8.n(this.e, this.g);
            this.e();
            if (BlockStateInvoker.getBlock(aV8.q(this.e, this.g)) == Blocks.aR) {
                aV8.a(this.e, this.g, this.i, 3);
                aV8.e(this.e, this.g, BlockStateInvoker.getBlock(this.i));
            }
        }
    }

    @Override
    public void b() {
        this.k = this.l;
        if (this.k >= 1.0f) {
            this.a(1.0f, 0.25f);
            aV8.n(this.e, this.g);
            this.e();
            if (BlockStateInvoker.getBlock(aV8.q(this.e, this.g)) == Blocks.aR) {
                aV8.a(this.e, this.g, this.i, 3);
                aV8.e(this.e, this.g, BlockStateInvoker.getBlock(this.i));
            }
        } else {
            this.l += 0.5f;
            if (this.l >= 1.0f) {
                this.l = 1.0f;
            }
            if (this.j) {
                this.a(this.l, this.l - this.k + 0.0625f);
            }
        }
    }

    public boolean f() {
        return this.j;
    }

    @Override
    public int m() {
        return 0;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        this.i = BlocksInvoker.a(BlocksInvoker.a(tn_0.g(nBTTagCompound, a59.d)), tn_0.g(nBTTagCompound, a59.i));
        this.o = SJ.a(tn_0.g(nBTTagCompound, a59.f));
        this.k = this.l = tn_0.k(nBTTagCompound, a59.e);
        this.j = tn_0.c(nBTTagCompound, a59.h);
    }

    public IBlockState a() {
        return this.i;
    }

    public float a(float f) {
        return this.j ? (this.c(f) - 1.0f) * (float)SJ.f(this.o) : (1.0f - this.c(f)) * (float)SJ.f(this.o);
    }

    public float c(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        return this.k + (this.l - this.k) * f;
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        tn_0.b(nBTTagCompound, a59.g, BlocksInvoker.v(BlockStateInvoker.getBlock(this.i)));
        tn_0.b(nBTTagCompound, a59.c, BlocksInvoker.c(BlockStateInvoker.getBlock(this.i), this.i));
        tn_0.b(nBTTagCompound, a59.j, SJ.i(this.o));
        tn_0.a(nBTTagCompound, a59.b, this.k);
        tn_0.a(nBTTagCompound, a59.a, this.j);
    }

    public float d(float f) {
        return this.j ? (this.c(f) - 1.0f) * (float)SJ.k(this.o) : (1.0f - this.c(f)) * (float)SJ.k(this.o);
    }

    public EnumFacing e() {
        return this.o;
    }

    public boolean d() {
        return this.m;
    }

    private void a(float f, float f2) {
        f = this.j ? 1.0f - f : (f -= 1.0f);
        rm_2 rm_22 = ali_0.a(Blocks.aR, this.e, this.g, this.i, f, this.o);
        List list = aV8.a(this.e, (Entity)null, rm_22);
        if (!ListInvoker.isEmpty(list)) {
            ListInvoker.addAll(this.n, list);
            Iterator iterator = ListInvoker.iterator(this.n);
            while (dz_0.c(iterator)) {
                Entity entity = (Entity)dz_0.b(iterator);
                if (BlockStateInvoker.getBlock(this.i) == Blocks.b && this.j) {
                    switch (SJ.h(this.o)) {
                        case X: {
                            entity.motionX = SJ.k(this.o);
                            break;
                        }
                        case Y: {
                            entity.motionY = SJ.f(this.o);
                            break;
                        }
                        case Z: {
                            entity.motionZ = SJ.a(this.o);
                        }
                    }
                    continue;
                }
                ayj_0.b(entity, f2 * (float)SJ.k(this.o), f2 * (float)SJ.f(this.o), f2 * (float)SJ.a(this.o));
            }
            ListInvoker.clear(this.n);
        }
    }

    public a6e_0(IBlockState iBlockState, EnumFacing enumFacing, boolean bl, boolean bl2) {
        this.i = iBlockState;
        this.o = enumFacing;
        this.j = bl;
        this.m = bl2;
    }

    public float b(float f) {
        return this.j ? (this.c(f) - 1.0f) * (float)SJ.a(this.o) : (1.0f - this.c(f)) * (float)SJ.a(this.o);
    }

    public a6e_0() {
    }
}

