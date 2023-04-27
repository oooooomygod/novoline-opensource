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
 * Renamed from net.aw8
 */
class aw8_0
extends awn_1 {
    a6U h;

    @Override
    public void b() {
        aV8.p(this.h.b(), this.h.g);
    }

    @Override
    public BlockPos e() {
        return this.h.g;
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public void a(ByteBuf byteBuf) {
        awm_0.a(byteBuf, amv_2.j(this.h.g));
        awm_0.a(byteBuf, amv_2.h(this.h.g));
        awm_0.a(byteBuf, amv_2.i(this.h.g));
    }

    @Override
    public void a(String string) {
        super.a(string);
        this.h.d();
    }

    @Override
    public World d() {
        return this.h.b();
    }

    @Override
    public Entity a() {
        return null;
    }

    @Override
    public Vec3 b() {
        return new Vec3((double)amv_2.j(this.h.g) + 0.5, (double)amv_2.h(this.h.g) + 0.5, (double)amv_2.i(this.h.g) + 0.5);
    }

    aw8_0(a6U a6U2) {
        this.h = a6U2;
    }
}

