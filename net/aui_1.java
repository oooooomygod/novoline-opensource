/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import java.util.Comparator;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aui
 */
class aui_1
implements Comparator<Entity> {
    BlockPos a;

    aui_1(BlockPos blockPos) {
        this.a = blockPos;
    }

    public int a(Entity entity, Entity entity2) {
        return v9_0.a(v9_0.a(v9_0.a(), ayj_0.c(entity, this.a), ayj_0.c(entity2, this.a)));
    }
}

