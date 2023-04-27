/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.block.BlockPos;

public interface IWorldAccess {
    public void a(BlockPos var1);

    public void a(int var1, BlockPos var2, int var3);

    public void a(EntityPlayer var1, int var2, BlockPos var3, int var4);

    public void a(Entity var1);

    public void a(EntityPlayer var1, String var2, double var3, double var5, double var7, float var9, float var10);

    public void a(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int ... var15);

    public void a(String var1, BlockPos var2);

    public void a(int var1, int var2, int var3, int var4, int var5, int var6);

    public void b(Entity var1);

    public void b(int var1, BlockPos var2, int var3);

    public void b(BlockPos var1);

    public void a(String var1, double var2, double var4, double var6, float var8, float var9);
}

