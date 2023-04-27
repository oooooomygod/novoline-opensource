/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.IBlockAccess;

public class _5
extends _v_0 {
    World b;
    float c;
    float j;
    private int d;
    private no_1 f;
    private EntityLivingBase e;
    private F0 h;
    private double i;
    private boolean g;

    private boolean a(BlockPos blockPos) {
        IBlockState iBlockState = aV8.q(this.b, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        return block == Blocks.air || !BlocksInvoker.p(block);
    }

    public _5(no_1 no_12, double d, float f, float f2) {
        this.f = no_12;
        this.b = no_12.worldObj;
        this.i = d;
        this.h = aLD.b(no_12);
        this.j = f;
        this.c = f2;
        this.a(3);
        if (!(aLD.b(no_12) instanceof F_)) {
            throw new IllegalArgumentException(a7i_0.a);
        }
    }

    @Override
    public void b() {
        this.d = 0;
        this.g = afv_0.a((F_)aLD.b(this.f));
        afv_0.b((F_)aLD.b(this.f), false);
    }

    @Override
    public void d() {
        abs_1.a(aLD.e(this.f), this.e, 10.0f, aLD.h(this.f));
        if (!aLD.a(this.f) && --this.d <= 0) {
            this.d = 10;
            if (!tz_1.a(this.h, this.e, this.i) && !aLD.g(this.f) && aLD.a(this.f, (Entity)this.e) >= 144.0) {
                int n = MathHelper.floor_double(this.e.posX) - 2;
                int n2 = MathHelper.floor_double(this.e.posZ) - 2;
                int n3 = MathHelper.floor_double(atn_0.i((EntityLivingBase)this.e).a);
                int n4 = 0;
                int n5 = 0;
                while (true) {
                    if (aV8.a((IBlockAccess)this.b, new BlockPos(n + n4, n3 - 1, n2 + n5)) && this.a(new BlockPos(n + n4, n3, n2 + n5)) && this.a(new BlockPos(n + n4, n3 + 1, n2 + n5))) {
                        aLD.a(this.f, (float)(n + n4) + 0.5f, n3, (float)(n2 + n5) + 0.5f, this.f.rotationYaw, this.f.rotationPitch);
                        tz_1.a(this.h);
                        return;
                    }
                    ++n5;
                }
            }
        }
    }

    @Override
    public boolean g() {
        aLD.c(this.f);
        return false;
    }

    @Override
    public void a() {
        this.e = null;
        tz_1.a(this.h);
        afv_0.b((F_)aLD.b(this.f), true);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public boolean f() {
        return !tz_1.b(this.h) && aLD.a(this.f, (Entity)this.e) > (double)(this.c * this.c) && !aLD.a(this.f);
    }
}

