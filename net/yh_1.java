/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.ICommandManager;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.yH
 */
public class yh_1 {
    public static List a(ICommandManager iCommandManager, ICommandSender iCommandSender, String string, BlockPos blockPos) {
        return iCommandManager.a(iCommandSender, string, blockPos);
    }

    public static List a(ICommandManager iCommandManager, ICommandSender iCommandSender) {
        return iCommandManager.a(iCommandSender);
    }

    public static int a(ICommandManager iCommandManager, ICommandSender iCommandSender, String string) {
        return iCommandManager.a(iCommandSender, string);
    }
}

