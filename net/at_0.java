/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.TileEntity;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.At
 */
public class at_0 {
    public static TileEntity b(auo_0 auo_02) {
        return auo_02.b();
    }

    public static IBlockState a(auo_0 auo_02) {
        return auo_02.c();
    }

    public static Predicate a(Predicate predicate) {
        return auo_0.a((Predicate<IBlockState>)predicate);
    }

    public static BlockPos c(auo_0 auo_02) {
        return auo_02.a();
    }
}

