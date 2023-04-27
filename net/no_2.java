/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.MapInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;

/*
 * Renamed from net.no
 */
public class no_2
extends nc_2 {
    private float am = 1.0f;

    private void a(ItemStack itemStack, boolean bl) {
        itemStack = act_2.C(itemStack);
        itemStack.a = 1;
        act_2.a(itemStack, this);
        aom_0.b(this.t(), 8, itemStack);
        aom_0.f(this.t(), 8);
        if (this.ak != null) {
            aV8.d(this.worldObj, this.ak, Blocks.air);
        }
    }

    private void b(int n, boolean bl) {
        aom_0.b(this.t(), 9, axt_2.a((byte)(n % 8)));
        if (this.ak != null) {
            aV8.d(this.worldObj, this.ak, Blocks.air);
        }
    }

    public int d() {
        return aom_0.g(this.t(), 9);
    }

    @Override
    public int a() {
        return 12;
    }

    @Override
    public boolean b(double d) {
        double d2 = 16.0;
        return d < (d2 = d2 * 64.0 * this.I) * d2;
    }

    @Override
    public void a(Entity entity) {
        this.a(entity, true);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, a5S.g);
        if (!tn_0.b(nBTTagCompound2)) {
            this.a(act_2.a(nBTTagCompound2), false);
            this.b((int)tn_0.e(nBTTagCompound, a5S.f), false);
            if (tn_0.a(nBTTagCompound, a5S.a, 99)) {
                this.am = tn_0.k(nBTTagCompound, a5S.h);
            }
            if (tn_0.b(nBTTagCompound, a5S.b)) {
                this.b(this.d() * 2, false);
            }
        }
        super.g(nBTTagCompound);
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        if (this.e() == null) {
            ItemStack itemStack = a6w_0.d(entityPlayer);
            if (!this.worldObj.isRemote) {
                this.a(itemStack);
                if (!aSY.a(entityPlayer.abilities) && --itemStack.a <= 0) {
                    InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, null);
                }
            }
        } else if (!this.worldObj.isRemote) {
            this.c(this.d() + 1);
        }
        return true;
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (!aDJ.h(damageSource) && this.e() != null) {
            if (!this.worldObj.isRemote) {
                this.a(aDJ.d(damageSource), false);
                this.a((ItemStack)null);
            }
            return true;
        }
        return super.a(damageSource, f);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        if (this.e() != null) {
            tn_0.a(nBTTagCompound, a5S.j, (NBTBase)act_2.a(this.e(), new NBTTagCompound()));
            tn_0.a(nBTTagCompound, a5S.i, (byte)this.d());
            tn_0.a(nBTTagCompound, a5S.e, this.am);
        }
        super.b(nBTTagCompound);
    }

    @Override
    public int c() {
        return 12;
    }

    public no_2(World world, BlockPos blockPos, EnumFacing enumFacing) {
        super(world, blockPos);
        this.a(enumFacing);
    }

    private void b(ItemStack itemStack) {
        if (act_2.k(itemStack) == Items.filled_map) {
            wp_1 wp_12 = pt_1.a((ItemMap)act_2.k(itemStack), itemStack, this.worldObj);
            MapInvoker.a(wp_12.e, aL0.c(aL0.a(new StringBuilder(), a5S.d), this.r()).toString());
        }
        act_2.a(itemStack, null);
    }

    public void c(int n) {
        this.b(n, true);
    }

    public void a(Entity entity, boolean bl) {
        if (J9.c(aV8.k(this.worldObj), a5S.c)) {
            ItemStack itemStack = this.e();
            if (entity instanceof EntityPlayer) {
                EntityPlayer entityPlayer = (EntityPlayer)entity;
                if (aSY.a(entityPlayer.abilities)) {
                    this.b(itemStack);
                    return;
                }
            }
            this.a(new ItemStack(Items.item_frame), 0.0f);
            if (a5_0.e(this.Q) < this.am) {
                itemStack = act_2.C(itemStack);
                this.b(itemStack);
                this.a(itemStack, 0.0f);
            }
        }
    }

    @Override
    public float A() {
        return 0.0f;
    }

    public no_2(World world) {
        super(world);
    }

    public int b() {
        return this.e() == null ? 0 : this.d() % 8 + 1;
    }

    public void a(ItemStack itemStack) {
        this.a(itemStack, true);
    }

    public ItemStack e() {
        return aom_0.c(this.t(), 8);
    }

    @Override
    protected void g() {
        aom_0.a(this.t(), 8, 5);
        aom_0.a(this.t(), 9, axt_2.a((byte)0));
    }
}

