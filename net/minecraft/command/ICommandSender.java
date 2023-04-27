/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import deobf.Entity;
import deobf.IChatComponent;
import deobf.Vec3;
import net.minecraft.block.BlockPos;

public interface ICommandSender {
    public boolean a(int var1, String var2);

    public Entity a();

    public Vec3 b();

    public BlockPos e();

    public boolean c();

    public World d();

    public void a(a9N var1, int var2);

    public IChatComponent getDisplayName();

    public void addChatComponentMessage(IChatComponent var1);

    public String getName();
}

