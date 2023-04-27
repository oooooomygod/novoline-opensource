/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import net.minecraft.block.Block;

public class E6 {
    public static boolean a(k2_0 k2_02, IBlockState iBlockState) {
        return k2_02.a(iBlockState);
    }

    public static k2_0 a(k2_0 k2_02, a4_0 a4_02, Predicate predicate) {
        return k2_02.a(a4_02, predicate);
    }

    public static k2_0 a(Block block) {
        return k2_0.a(block);
    }
}

