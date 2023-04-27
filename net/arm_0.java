/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.aRm
 */
public class arm_0
implements Predicate<IBlockState> {
    private Block a;
    private static Minecraft b;

    public boolean a(IBlockState iBlockState) {
        return BlockStateInvoker.getBlock(iBlockState) == this.a;
    }

    private arm_0(Block block) {
        this.a = block;
    }

    public static arm_0 a(Block block) {
        return new arm_0(block);
    }
}

