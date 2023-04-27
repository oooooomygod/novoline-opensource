/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import com.google.common.collect.Multimap;
import deobf.EntityLivingBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.Set;

/*
 * Renamed from net.Lw
 */
public class lw_0
extends Item {
    private float n;
    protected anh_2 m;
    private Set<Block> o;
    protected float p = 4.0f;

    @Override
    public boolean a(ItemStack itemStack, World world, Block block, BlockPos blockPos, EntityLivingBase entityLivingBase) {
        if ((double)BlocksInvoker.b(block, world, blockPos) != 0.0) {
            act_2.damageItem(itemStack, 1, entityLivingBase);
        }
        return true;
    }

    @Override
    public boolean a(ItemStack itemStack, ItemStack itemStack2) {
        return agv_2.d(this.m) == act_2.k(itemStack2) || super.a(itemStack, itemStack2);
    }

    protected lw_0(float f, anh_2 anh_22, Set<Block> set) {
        this.m = anh_22;
        this.o = set;
        this.c = 1;
        this.setMaxDamage(agv_2.e(anh_22));
        this.p = agv_2.c(anh_22);
        this.n = f + anh_22.b();
        this.a(CreativeTabs.c);
    }

    public float b() {
        return this.n;
    }

    public float c() {
        return this.n;
    }

    @Override
    public boolean l() {
        return true;
    }

    @Override
    public Multimap<String, AttributeModifier> e() {
        Multimap<String, AttributeModifier> multimap = super.e();
        MM.b(multimap, dc_0.c(abb_0.f), new AttributeModifier(h, axp_2.a, this.n, 0));
        return multimap;
    }

    @Override
    public boolean a(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityLivingBase entityLivingBase2) {
        act_2.damageItem(itemStack, 2, entityLivingBase2);
        return true;
    }

    public String a() {
        return this.m.toString();
    }

    @Override
    public int q() {
        return agv_2.b(this.m);
    }

    @Override
    public float a(ItemStack itemStack, Block block) {
        return aS0.c(this.o, block) ? this.p : 1.0f;
    }

    public anh_2 d() {
        return this.m;
    }
}

