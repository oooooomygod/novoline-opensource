/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.IChatComponent;
import deobf.Vec3;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.alJ
 */
public class alj_1 {
    private static int[] b;

    public static IChatComponent c(ICommandSender iCommandSender) {
        return iCommandSender.getDisplayName();
    }

    static {
        if (alj_1.b() != null) {
            alj_1.b(new int[1]);
        }
    }

    public static Vec3 f(ICommandSender iCommandSender) {
        return iCommandSender.b();
    }

    public static void a(ICommandSender iCommandSender, IChatComponent iChatComponent) {
        iCommandSender.addChatComponentMessage(iChatComponent);
    }

    public static void a(ICommandSender iCommandSender, a9N a9N2, int n) {
        iCommandSender.a(a9N2, n);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static BlockPos d(ICommandSender iCommandSender) {
        return iCommandSender.e();
    }

    public static boolean a(ICommandSender iCommandSender, int n, String string) {
        return iCommandSender.a(n, string);
    }

    public static boolean b(ICommandSender iCommandSender) {
        return iCommandSender.c();
    }

    public static Entity e(ICommandSender iCommandSender) {
        return iCommandSender.a();
    }

    public static String g(ICommandSender iCommandSender) {
        return iCommandSender.getName();
    }

    public static World a(ICommandSender iCommandSender) {
        return iCommandSender.d();
    }

    public static int[] b() {
        return b;
    }
}

