/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import io.netty.buffer.ByteBuf;
import net.NBTTagCompound;
import net.World;
import net.awn_1;

/*
 * Renamed from net.aWo
 */
public class awo_0 {
    private static ListInvoker[] b;

    public static void a(awn_1 awn_12, NBTTagCompound nBTTagCompound) {
        awn_12.a(nBTTagCompound);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static void a(awn_1 awn_12, IChatComponent iChatComponent) {
        awn_12.b(iChatComponent);
    }

    public static void a(awn_1 awn_12, ByteBuf byteBuf) {
        awn_12.a(byteBuf);
    }

    public static void a(awn_1 awn_12, World world) {
        awn_12.a(world);
    }

    public static void a(awn_1 awn_12, boolean bl) {
        awn_12.a(bl);
    }

    public static void b(awn_1 awn_12, NBTTagCompound nBTTagCompound) {
        awn_12.b(nBTTagCompound);
    }

    public static void e(awn_1 awn_12) {
        awn_12.b();
    }

    public static int d(awn_1 awn_12) {
        return awn_12.g();
    }

    public static IChatComponent f(awn_1 awn_12) {
        return awn_12.e();
    }

    public static World a(awn_1 awn_12) {
        return awn_12.d();
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static int b(awn_1 awn_12) {
        return awn_12.a();
    }

    public static boolean g(awn_1 awn_12) {
        return awn_12.d();
    }

    public static String c(awn_1 awn_12) {
        return awn_12.h();
    }

    public static boolean a(awn_1 awn_12, EntityPlayer entityPlayer) {
        return awn_12.a(entityPlayer);
    }

    public static void b(awn_1 awn_12, String string) {
        awn_12.a(string);
    }

    static {
        if (awo_0.b() != null) {
            awo_0.b(new ListInvoker[5]);
        }
    }

    public static void a(awn_1 awn_12, String string) {
        awn_12.b(string);
    }
}

