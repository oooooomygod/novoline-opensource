/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.invoke.MethodHandles;
import java.util.List;
import net.minecraft.block.BlockPos;

public class XO {
    private static long a = a1c.a(7398024556551981918L, -3043563995055365618L, MethodHandles.lookup().lookupClass()).a(125740579182998L);

    public static void a(byte by, long l4, ICommand iCommand, ICommandSender iCommandSender, String[] stringArray) {
        long l5 = ((long)by << 56 | l4 << 8 >>> 8) ^ a;
        long l6 = l5 ^ 0x7A37BE3AE917L;
        long l7 = l6 >>> 16;
        int n = (int)(l6 << 48 >>> 48);
        iCommand.a(l7, iCommandSender, (short)n, stringArray);
    }

    public static boolean a(ICommand iCommand, ICommandSender iCommandSender) {
        return iCommand.a(iCommandSender);
    }

    public static List b(ICommand iCommand) {
        return iCommand.a();
    }

    public static String a(ICommand iCommand) {
        return iCommand.b();
    }

    public static boolean a(ICommand iCommand, String[] stringArray, int n) {
        return iCommand.a(stringArray, n);
    }

    public static List a(ICommand iCommand, ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return iCommand.a(iCommandSender, stringArray, blockPos);
    }
}

