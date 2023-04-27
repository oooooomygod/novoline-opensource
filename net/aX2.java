/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  io.netty.buffer.ByteBuf
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.viaversion.viaversion.api.connection.UserConnection;
import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class aX2 {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static void a(UserConnection userConnection, ByteBuf byteBuf, Function function) {
        userConnection.transformOutgoing(byteBuf, function);
    }

    static {
        if (aX2.b() != null) {
            aX2.b(new ListInvoker[3]);
        }
    }

    public static void b(UserConnection userConnection, ByteBuf byteBuf, Function function) {
        userConnection.transformIncoming(byteBuf, function);
    }

    public static boolean c(UserConnection userConnection) {
        return userConnection.shouldTransformPacket();
    }

    public static boolean b(UserConnection userConnection) {
        return userConnection.checkIncomingPacket();
    }

    public static boolean a(UserConnection userConnection) {
        return userConnection.checkOutgoingPacket();
    }

    public static boolean d(UserConnection userConnection) {
        return userConnection.isClientSide();
    }

    public static ListInvoker[] b() {
        return b;
    }
}

