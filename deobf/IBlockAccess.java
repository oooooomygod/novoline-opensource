/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import deobf.TileEntity;
import net.minecraft.block.BlockPos;
import net.IBlockState;
import net.WorldType;
import net.il_0;

public interface IBlockAccess {
    public IBlockState b(BlockPos var1);

    public il_0 d(BlockPos var1);

    public WorldType e();

    public TileEntity c(BlockPos var1);

    public int a(BlockPos var1, int var2);

    public int a(BlockPos var1, EnumFacing var2);

    public boolean a(BlockPos var1);

    public boolean d();
}

