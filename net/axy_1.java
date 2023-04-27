/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.IChatComponent;
import deobf.Vec3;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.axY
 */
class axy_1
implements ICommandSender {
    ICommandSender a;
    ab1_0 b;

    @Override
    public String getName() {
        return this.a.getName();
    }

    @Override
    public boolean c() {
        return this.a.c();
    }

    @Override
    public boolean a(int n, String string) {
        return true;
    }

    @Override
    public void a(a9N a9N2, int n) {
        this.a.a(a9N2, n);
    }

    axy_1(ab1_0 ab1_02, ICommandSender iCommandSender) {
        this.b = ab1_02;
        this.a = iCommandSender;
    }

    @Override
    public BlockPos e() {
        return this.a.e();
    }

    @Override
    public Entity a() {
        return this.a.a();
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.a.getDisplayName();
    }

    @Override
    public World d() {
        return this.a.d();
    }

    @Override
    public Vec3 b() {
        return this.a.b();
    }

    @Override
    public void addChatComponentMessage(IChatComponent iChatComponent) {
        this.a.addChatComponentMessage(iChatComponent);
    }
}

