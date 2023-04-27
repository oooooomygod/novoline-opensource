/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import deobf.EntityPlayerSP;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.NetHandlerPlayClient;
import deobf.Vec3;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.anm
 */
public class anm_2
extends anh_1 {
    private boolean k = false;

    @Override
    public boolean a(BlockPos blockPos, EnumFacing enumFacing) {
        this.k = true;
        boolean bl = super.a(blockPos, enumFacing);
        this.k = false;
        return bl;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer, World world, ItemStack itemStack) {
        this.k = true;
        boolean bl = super.a(entityPlayer, world, itemStack);
        this.k = false;
        return bl;
    }

    @Override
    public boolean b(BlockPos blockPos, EnumFacing enumFacing) {
        this.k = true;
        boolean bl = super.b(blockPos, enumFacing);
        this.k = false;
        return bl;
    }

    @Override
    public boolean b(EntityPlayerSP entityPlayerSP, WorldClient worldClient, ItemStack itemStack, BlockPos blockPos, EnumFacing enumFacing, Vec3 vec3) {
        this.k = true;
        boolean bl = super.b(entityPlayerSP, worldClient, itemStack, blockPos, enumFacing, vec3);
        this.k = false;
        return bl;
    }

    public anm_2(Minecraft minecraft, NetHandlerPlayClient netHandlerPlayClient) {
        super(minecraft, netHandlerPlayClient);
    }

    public boolean c() {
        return this.k;
    }
}

