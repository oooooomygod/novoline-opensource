/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import deobf.Entity;
import deobf.IChatComponent;
import deobf.MinecraftServer;
import deobf.Vec3;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.adT
 */
class adt_1
implements ICommandSender {
    ICommandSender f;
    double c;
    BlockPos b;
    ba_1 e;
    Entity d;
    double g;
    double a;

    @Override
    public boolean c() {
        MinecraftServer minecraftServer = ServerInvoker.d();
        return J9.c(a3V.z(minecraftServer.r[0]), ace_1.a);
    }

    @Override
    public boolean a(int n, String string) {
        return this.f.a(n, string);
    }

    adt_1(ba_1 ba_12, Entity entity, ICommandSender iCommandSender, BlockPos blockPos, double d, double d2, double d3) {
        this.e = ba_12;
        this.d = entity;
        this.f = iCommandSender;
        this.b = blockPos;
        this.g = d;
        this.a = d2;
        this.c = d3;
    }

    @Override
    public void addChatComponentMessage(IChatComponent iChatComponent) {
        this.f.addChatComponentMessage(iChatComponent);
    }

    @Override
    public String getName() {
        return this.d.getName();
    }

    @Override
    public World d() {
        return this.d.worldObj;
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.d.getDisplayName();
    }

    @Override
    public void a(a9N a9N2, int n) {
        this.d.a(a9N2, n);
    }

    @Override
    public BlockPos e() {
        return this.b;
    }

    @Override
    public Vec3 b() {
        return new Vec3(this.g, this.a, this.c);
    }

    @Override
    public Entity a() {
        return this.d;
    }
}

