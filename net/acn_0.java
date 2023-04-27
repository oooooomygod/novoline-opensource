/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.IChatComponent;
import deobf.Vec3;
import net.minecraft.block.BlockPos;
import net.ChatComponentText;

/*
 * Renamed from net.acN
 */
class acn_0
implements ICommandSender {
    a6z_0 a;

    @Override
    public String getName() {
        return aPB.a;
    }

    @Override
    public Vec3 b() {
        return new Vec3((double)amv_2.j(this.a.g) + 0.5, (double)amv_2.h(this.a.g) + 0.5, (double)amv_2.i(this.a.g) + 0.5);
    }

    @Override
    public BlockPos e() {
        return this.a.g;
    }

    @Override
    public Entity a() {
        return null;
    }

    @Override
    public boolean a(int n, String string) {
        return true;
    }

    @Override
    public World d() {
        return this.a.e;
    }

    @Override
    public void a(a9N a9N2, int n) {
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public IChatComponent getDisplayName() {
        return new ChatComponentText(this.getName());
    }

    @Override
    public void addChatComponentMessage(IChatComponent iChatComponent) {
    }

    acn_0(a6z_0 a6z_02) {
        this.a = a6z_02;
    }
}

