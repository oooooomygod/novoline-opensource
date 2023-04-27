/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package net;

import deobf.Entity;
import deobf.Vec3;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.awi
 */
class awi_2
extends awn_1 {
    on_2 h;

    awi_2(on_2 on_22) {
        this.h = on_22;
    }

    @Override
    public BlockPos e() {
        return new BlockPos(this.h.posX, this.h.posY + 0.5, this.h.posZ);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void b() {
        aom_0.b(this.h.t(), 23, this.h());
        aom_0.b(this.h.t(), 24, aGU.a(this.e()));
    }

    @Override
    public Vec3 b() {
        return new Vec3(this.h.posX, this.h.posY, this.h.posZ);
    }

    @Override
    public void a(ByteBuf byteBuf) {
        awm_0.a(byteBuf, this.h.r());
    }

    @Override
    public Entity a() {
        return this.h;
    }

    @Override
    public World d() {
        return this.h.worldObj;
    }
}

