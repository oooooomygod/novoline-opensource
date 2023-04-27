/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.util.MovingObjectPosition;
import net.minecraft.block.BlockPos;

public class ObjectMouseOverInvoker {
    public static BlockPos getBlockPos(MovingObjectPosition movingObjectPosition) {
        return movingObjectPosition.a();
    }
}

