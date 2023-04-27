/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import deobf.Vec3;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aRz
 */
class arz_0
implements ICommandSender {
    EntityPlayer b;
    a6z_0 a;

    @Override
    public Entity a() {
        return this.b;
    }

    arz_0(a6z_0 a6z_02, EntityPlayer entityPlayer) {
        this.a = a6z_02;
        this.b = entityPlayer;
    }

    @Override
    public boolean a(int n, String string) {
        return n <= 2;
    }

    @Override
    public BlockPos e() {
        return this.a.g;
    }

    @Override
    public Vec3 b() {
        return new Vec3((double)amv_2.j(this.a.g) + 0.5, (double)amv_2.h(this.a.g) + 0.5, (double)amv_2.i(this.a.g) + 0.5);
    }

    @Override
    public void a(a9N a9N2, int n) {
        aqj_0.a(a6z_0.a(this.a), this, a9N2, n);
    }

    @Override
    public void addChatComponentMessage(IChatComponent iChatComponent) {
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.b.getDisplayName();
    }

    @Override
    public World d() {
        return this.b.d();
    }

    @Override
    public String getName() {
        return this.b.getName();
    }

    @Override
    public boolean c() {
        return false;
    }
}

