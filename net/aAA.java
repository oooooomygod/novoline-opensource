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

public class aAA
implements dv_1 {
    private BlockPos b;
    private World a;

    @Override
    public String b() {
        return K0.b;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    public aAA(World world, BlockPos blockPos) {
        this.a = world;
        this.b = blockPos;
    }

    @Override
    public IChatComponent getDisplayName() {
        return new aoz_1(aL0.a(aL0.a(new StringBuilder(), BlocksInvoker.o(Blocks.aq)), K0.a).toString(), new Object[0]);
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aa9_0(aSK2, this.a, this.b);
    }
}

