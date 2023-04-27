/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.events.CollideWithBlockEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

public class A_ {
    public static rm_2 c(CollideWithBlockEvent collideWithBlockEvent) {
        return collideWithBlockEvent.getBoundingBox();
    }

    public static boolean b(CollideWithBlockEvent collideWithBlockEvent) {
        return collideWithBlockEvent.isCancelled();
    }

    public static BlockPos a(CollideWithBlockEvent collideWithBlockEvent) {
        return collideWithBlockEvent.getPos();
    }

    public static void a(CollideWithBlockEvent collideWithBlockEvent, rm_2 rm_22) {
        collideWithBlockEvent.setBoundingBox(rm_22);
    }

    public static Block d(CollideWithBlockEvent collideWithBlockEvent) {
        return collideWithBlockEvent.getBlock();
    }
}

