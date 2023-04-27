/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.util.DamageSource;
import deobf.EntityPlayer;

/*
 * Renamed from net.o2
 */
public class o2_0
extends ok_2 {
    @Override
    public int i() {
        return 8;
    }

    @Override
    public IBlockState k() {
        return BlockStateInvoker.a(vz_1.a(Blocks.R), fs_1.P, (Comparable)((Object) EnumFacing.NORTH));
    }

    @Override
    public void a(DamageSource damageSource) {
        super.a(damageSource);
        if (J9.c(aV8.k(this.worldObj), bk_0.a)) {
            this.a(px_0.a(Blocks.R), 1, 0.0f);
        }
    }

    @Override
    public int e() {
        return 27;
    }

    public o2_0(World world) {
        super(world);
    }

    public o2_0(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    @Override
    public anf_0 d() {
        return anf_0.CHEST;
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aaz_0(aSK2, this, entityPlayer);
    }

    @Override
    public String b() {
        return bk_0.b;
    }
}

