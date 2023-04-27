/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import java.util.List;
import java.util.Map;
import net.minecraft.block.BlockPos;
import net.ICommand;
import net.ICommandSender;

public interface ICommandManager {
    public Map<String, ICommand> a();

    public List<String> a(ICommandSender var1, String var2, BlockPos var3);

    public int a(ICommandSender var1, String var2);

    public List<ICommand> a(ICommandSender var1);
}

