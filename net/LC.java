/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class LC
extends Item {
    private anh_2 m;
    private float n;

    @Override
    public float a(ItemStack itemStack, Block block) {
        if (block == Blocks.bI) {
            return 15.0f;
        }
        Material material = BlocksInvoker.getBlockState(block);
        return material != Material.F && material != Material.f && material != Material.J && material != Material.z && material != Material.h ? 1.0f : 1.5f;
    }

    @Override
    public boolean l() {
        return true;
    }

    @Override
    public int q() {
        return agv_2.b(this.m);
    }

    @Override
    public ti_1 c(ItemStack itemStack) {
        return ti_1.BLOCK;
    }

    @Override
    public boolean a(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityLivingBase entityLivingBase2) {
        act_2.damageItem(itemStack, 1, entityLivingBase2);
        return true;
    }

    public float b() {
        return this.n;
    }

    @Override
    public boolean b(Block block) {
        return block == Blocks.bI;
    }

    @Override
    public boolean a(ItemStack itemStack, ItemStack itemStack2) {
        return agv_2.d(this.m) == act_2.k(itemStack2) || super.a(itemStack, itemStack2);
    }

    public float a() {
        return this.m.b();
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        a6w_0.a(entityPlayer, itemStack, this.getMaxItemUseDuration(itemStack));
        return itemStack;
    }

    @Override
    public boolean a(ItemStack itemStack, World world, Block block, BlockPos blockPos, EntityLivingBase entityLivingBase) {
        if ((double)BlocksInvoker.b(block, world, blockPos) != 0.0) {
            act_2.damageItem(itemStack, 2, entityLivingBase);
        }
        return true;
    }

    @Override
    public Multimap<String, AttributeModifier> e() {
        Multimap<String, AttributeModifier> multimap = super.e();
        MM.b(multimap, dc_0.c(abb_0.f), new AttributeModifier(h, l8_0.a, this.n, 0));
        return multimap;
    }

    public String c() {
        return this.m.toString();
    }

    public LC(anh_2 anh_22) {
        this.m = anh_22;
        this.c = 1;
        this.setMaxDamage(agv_2.e(anh_22));
        this.a(CreativeTabs.a);
        this.n = 4.0f + anh_22.b();
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack) {
        return 72000;
    }
}

