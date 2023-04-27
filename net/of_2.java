/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityLivingBase;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import deobf.NBTBase;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.of
 */
public class of_2
extends ob_1 {
    private ItemStack at;

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, x1_0.c, 10)) {
            this.at = act_2.a(tn_0.d(nBTTagCompound, x1_0.b));
        } else {
            this.c(tn_0.g(nBTTagCompound, x1_0.a));
        }
        if (this.at == null) {
            this.E();
        }
    }

    @Override
    protected float c() {
        return 0.5f;
    }

    public void c(int n) {
        if (this.at == null) {
            this.at = new ItemStack(Items.potionitem, 1, 0);
        }
        act_2.a(this.at, n);
    }

    public of_2(World world, EntityLivingBase entityLivingBase, int n) {
        this(world, entityLivingBase, new ItemStack(Items.potionitem, 1, n));
    }

    public of_2(World world, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        super(world, entityLivingBase);
        this.at = itemStack;
    }

    @Override
    protected float b() {
        return 0.05f;
    }

    public of_2(World world) {
        super(world);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        if (this.at != null) {
            tn_0.a(nBTTagCompound, x1_0.d, (NBTBase)act_2.a(this.at, new NBTTagCompound()));
        }
    }

    @Override
    protected void a(MovingObjectPosition movingObjectPosition) {
        if (!this.worldObj.isRemote) {
            rm_2 rm_22;
            List list;
            List list2 = en_2.a(Items.potionitem, this.at);
            if (!ListInvoker.isEmpty(list2) && !ListInvoker.isEmpty(list = aV8.a(this.worldObj, EntityLivingBase.class, rm_22 = h__0.d(this.getEntityBoundingBox(), 4.0, 2.0, 4.0)))) {
                Iterator iterator = ListInvoker.iterator(list);
                while (dz_0.c(iterator)) {
                    EntityLivingBase entityLivingBase = (EntityLivingBase)dz_0.b(iterator);
                    double d = this.g(entityLivingBase);
                    if (!(d < 16.0)) continue;
                    double d2 = 1.0 - MathInvoker.d(d) / 4.0;
                    if (entityLivingBase == movingObjectPosition.entityHit) {
                        d2 = 1.0;
                    }
                    Iterator iterator2 = ListInvoker.iterator(list2);
                    while (dz_0.c(iterator2)) {
                        a2l_0 a2l_02 = (a2l_0)dz_0.b(iterator2);
                        int n = a3M.b(a2l_02);
                        if (ari_0.h(Potion.potionTypes[n])) {
                            ari_0.a(Potion.potionTypes[n], this, this.d(), entityLivingBase, a3M.g(a2l_02), d2);
                            continue;
                        }
                        int n2 = (int)(d2 * (double)a3M.c(a2l_02) + 0.5);
                        if (n2 <= 20) continue;
                        atn_0.a(entityLivingBase, new a2l_0(n, n2, a3M.g(a2l_02)));
                    }
                }
            }
            aV8.c(this.worldObj, 2002, new BlockPos(this), this.a());
            this.E();
        }
    }

    public of_2(World world, double d, double d2, double d3, int n) {
        this(world, d, d2, d3, new ItemStack(Items.potionitem, 1, n));
    }

    public int a() {
        if (this.at == null) {
            this.at = new ItemStack(Items.potionitem, 1, 0);
        }
        return act_2.c(this.at);
    }

    @Override
    protected float a() {
        return -20.0f;
    }

    public of_2(World world, double d, double d2, double d3, ItemStack itemStack) {
        super(world, d, d2, d3);
        this.at = itemStack;
    }
}

