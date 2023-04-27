/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.CancellableEvent;
import cc.novoline.invoke.EventManagerInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.bt_0;
import net.rm_2;
import net.skidunion.annotations;

public class CollideWithBlockEvent
extends CancellableEvent {
    private BlockPos c;
    private Block d;
    private rm_2 e;

    @annotations
    public rm_2 getBoundingBox() {
        return this.e;
    }

    @annotations
    public void setBlockPos(BlockPos blockPos) {
        this.c = blockPos;
    }

    @annotations
    public BlockPos getPos() {
        return this.c;
    }

    @annotations
    public void setBlock(Block block) {
        this.d = block;
    }

    @annotations
    public void setBoundingBox(rm_2 rm_22) {
        this.e = rm_22;
    }

    @annotations
    public Block getBlock() {
        return this.d;
    }

    public CollideWithBlockEvent(Block block, BlockPos blockPos, rm_2 rm_22) {
        bt_0 bt_02 = new bt_0(block, blockPos, rm_22);
        EventManagerInvoker.call(bt_02);
        this.d = bt_02.c();
        this.c = bt_02.b();
        this.e = bt_02.a();
    }
}

