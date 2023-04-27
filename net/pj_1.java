/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import deobf.Entity;
import deobf.IChatComponent;
import deobf.Vec3;
import net.minecraft.block.BlockPos;
import net.ChatComponentText;

/*
 * Renamed from net.pJ
 */
public class pj_1
implements ICommandSender {
    private static pj_1 b = new pj_1();
    private StringBuffer a = new StringBuffer();

    @Override
    public void a(a9N a9N2, int n) {
    }

    @Override
    public IChatComponent getDisplayName() {
        return new ChatComponentText(this.getName());
    }

    @Override
    public String getName() {
        return aof_1.a;
    }

    @Override
    public Vec3 b() {
        return new Vec3(0.0, 0.0, 0.0);
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
    public void addChatComponentMessage(IChatComponent iChatComponent) {
        adw_2.a(this.a, aBO.d(iChatComponent));
    }

    @Override
    public World d() {
        return ServerInvoker.d().d();
    }

    @Override
    public BlockPos e() {
        return new BlockPos(0, 0, 0);
    }

    @Override
    public boolean c() {
        return true;
    }
}

