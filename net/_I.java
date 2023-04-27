/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityPlayer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;


public class _I
extends _v_0 {
    private nl_1 d;
    private int f;
    private boolean c;
    private float g;
    private float e;
    private int b;

    @Override
    public void a() {
        this.c = false;
        this.g = 0.0f;
    }

    @Override
    public boolean g() {
        return CG.g(this.d) && this.d.h != null && this.d.h instanceof EntityPlayer && (this.c || CG.x(this.d));
    }

    @Override
    public void b() {
        this.g = 0.0f;
    }

    public _I(nl_1 nl_12, float f) {
        this.d = nl_12;
        this.e = f;
        this.a(7);
    }

    @Override
    public void d() {
        Object object;
        EntityPlayer entityPlayer = (EntityPlayer)this.d.h;
        nu_1 nu_12 = (nu_1)this.d;
        float f = MathHelper.a(entityPlayer.rotationYaw - this.d.rotationYaw) * 0.5f;
        if (f > 5.0f) {
            f = 5.0f;
        }
        if (f < -5.0f) {
            f = -5.0f;
        }
        this.d.rotationYaw = MathHelper.a(this.d.rotationYaw + f);
        if (this.g < this.e) {
            this.g += (this.e - this.g) * 0.01f;
        }
        if (this.g > this.e) {
            this.g = this.e;
        }
        int n = MathHelper.floor_double(this.d.posX);
        int n2 = MathHelper.floor_double(this.d.posY);
        int n3 = MathHelper.floor_double(this.d.posZ);
        float f2 = this.g;
        if (this.c) {
            if (this.f++ > this.b) {
                this.c = false;
            }
            f2 += f2 * 1.15f * MathHelper.sin((float)this.f / (float)this.b * (float)Math.PI);
        }
        float f3 = 0.91f;
        if (this.d.onGround) {
            f3 = BlockStateInvoker.getBlock((IBlockState)aV8.q((World)this.d.worldObj, (BlockPos)new BlockPos((int)MathHelper.f((float)((float)n)), (int)(MathHelper.f((float)((float)n2)) - 1), (int)MathHelper.f((float)((float)n3))))).z * 0.91f;
        }
        float f4 = 0.16277136f / (f3 * f3 * f3);
        float f5 = MathHelper.sin(nu_12.rotationYaw * (float)Math.PI / 180.0f);
        float f6 = MathHelper.cos(nu_12.rotationYaw * (float)Math.PI / 180.0f);
        float f7 = aMY.k(nu_12) * f4;
        float f8 = MathInvoker.b(f2, 1.0f);
        f8 = f7 / f8;
        float f9 = f2 * f8;
        float f10 = -(f9 * f5);
        float f11 = f9 * f6;
        if (MathHelper.d(f10) > MathHelper.d(f11)) {
            if (f10 < 0.0f) {
                f10 -= this.d.width / 2.0f;
            }
            if (f10 > 0.0f) {
                f10 += this.d.width / 2.0f;
            }
            f11 = 0.0f;
        } else {
            f10 = 0.0f;
            if (f11 < 0.0f) {
                f11 -= this.d.width / 2.0f;
            }
            if (f11 > 0.0f) {
                f11 += this.d.width / 2.0f;
            }
        }
        int n4 = MathHelper.floor_double(this.d.posX + (double)f10);
        int n5 = MathHelper.floor_double(this.d.posZ + (double)f11);
        int n6 = MathHelper.f(this.d.width + 1.0f);
        int n7 = MathHelper.f(this.d.n + entityPlayer.n + 1.0f);
        int n8 = MathHelper.f(this.d.width + 1.0f);
        if (n != n4 || n3 != n5) {
            boolean bl;
            object = BlockStateInvoker.getBlock(aV8.q(this.d.worldObj, new BlockPos(n, n2, n3)));
            boolean bl2 = bl = !this.a((Block)object) && (BlocksInvoker.getBlockState((Block)object) != Material.air || !this.a(BlockStateInvoker.getBlock(aV8.q(this.d.worldObj, new BlockPos(n, n2 - 1, n3)))));
            if (0 == UA.a(this.d.worldObj, this.d, n4, n2, n5, n6, n7, n8, false, false, true) && 1 == UA.a(this.d.worldObj, this.d, n, n2 + 1, n3, n6, n7, n8, false, false, true) && 1 == UA.a(this.d.worldObj, this.d, n4, n2 + 1, n5, n6, n7, n8, false, false, true)) {
                qo_2.a(aMY.b(nu_12));
            }
        }
        if (!aSY.a(entityPlayer.abilities) && this.g >= this.e * 0.5f && a5_0.e(CG.a(this.d)) < 0.006f && !this.c && act_2.k((ItemStack)(object = a6w_0.d(entityPlayer))) == Items.carrot_on_a_stick) {
            act_2.damageItem((ItemStack)object, 1, entityPlayer);
            if (((ItemStack)object).a == 0) {
                ItemStack itemStack = new ItemStack(Items.fishing_rod);
                act_2.b(itemStack, act_2.a((ItemStack)object));
                entityPlayer.inventory.b[entityPlayer.inventory.a] = itemStack;
            }
        }
        CG.a(this.d, 0.0f, f2);
    }

    public boolean d() {
        return !this.e() && this.g > this.e * 0.3f;
    }

    public boolean e() {
        return this.c;
    }

    private boolean a(Block block) {
        return block instanceof hn_2 || block instanceof hj_2;
    }

    public void c() {
        this.c = true;
        this.f = 0;
        this.b = a5_0.a(CG.a(this.d), 841) + 140;
    }
}

