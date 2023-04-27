/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.block.BlockPos;

public interface ICommand
extends Comparable<ICommand> {
    public boolean a(ICommandSender var1);

    public void a(long var1, ICommandSender var3, short var4, String[] var5) throws ht_1;

    public boolean a(String[] var1, int var2);

    public String b(ICommandSender var1);

    public List<String> a();

    public String b();

    public List<String> a(ICommandSender var1, String[] var2, BlockPos var3);
}

