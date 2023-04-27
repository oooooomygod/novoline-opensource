/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.CancellableEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Bt
 */
public class bt_0
extends CancellableEvent {
    private rm_2 e;
    private Block c;
    private BlockPos d;

    public void a(BlockPos blockPos) {
        this.d = blockPos;
    }

    public void a(Block block) {
        this.c = block;
    }

    public bt_0(Block block, BlockPos blockPos, rm_2 rm_22) {
        this.c = block;
        this.d = blockPos;
        this.e = rm_22;
    }

    public void a(rm_2 rm_22) {
        this.e = rm_22;
    }

    public Block c() {
        return this.c;
    }

    public BlockPos b() {
        return this.d;
    }

    public rm_2 a() {
        return this.e;
    }
}

