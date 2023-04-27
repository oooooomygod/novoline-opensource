/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.init.Blocks;

/*
 * Renamed from net.j4
 */
public class j4_0
extends ju_1<oo_2> {
    @Override
    protected void a(oo_2 oo_22, float f, IBlockState iBlockState) {
        super.a(oo_22, f, iBlockState);
        if (BlockStateInvoker.getBlock(iBlockState) == Blocks.p) {
            afa_0.a(mt_0.a(oo_22), oo_22.posX, oo_22.posY, oo_22.posZ, f);
        }
    }

    public j4_0(RenderManager renderManager) {
        super(renderManager);
    }
}

