/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import net.IThreadListener;
import net.INetHandler;
import net.X7;
import net.si_1;
import net.yt_1;

public class PacketThreadUtil {
    private static yt_1 a(yt_1 yt_12) {
        return yt_12;
    }

    private static void lambda$checkThreadAndEnqueue$0(Packet packet, INetHandler INetHandler) {
        si_1.a(packet, INetHandler);
    }

    public static <T extends INetHandler> void a(Packet<T> packet, T t, IThreadListener iThreadListener) throws yt_1 {
        if (!X7.a(iThreadListener)) {
            X7.a(iThreadListener, () -> PacketThreadUtil.lambda$checkThreadAndEnqueue$0(packet, t));
            throw yt_1.a;
        }
    }
}

