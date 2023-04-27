/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.IChatComponent;

public class a3H
implements dv_1 {
    private World a;
    private BlockPos b;

    @Override
    public String b() {
        return XI.c;
    }

    @Override
    public IChatComponent getDisplayName() {
        return new aoz_1(aL0.a(aL0.a(new StringBuilder(), BlocksInvoker.o(Blocks.J)), XI.a).toString(), new Object[0]);
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aam_1(aSK2, this.a, this.b, entityPlayer);
    }

    @Override
    public String getName() {
        return XI.b;
    }

    public a3H(World world, BlockPos blockPos) {
        this.a = world;
        this.b = blockPos;
    }

    @Override
    public boolean e() {
        return false;
    }
}

