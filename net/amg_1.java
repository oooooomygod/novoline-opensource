/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.ViaAPIBase
 *  io.netty.buffer.ByteBuf
 */
package net;

import com.viaversion.viaversion.ViaAPIBase;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

/*
 * Renamed from net.amG
 */
public class amg_1 {
    public static void a(ViaAPIBase viaAPIBase, UUID uUID, ByteBuf byteBuf) {
        viaAPIBase.sendRawPacket(uUID, byteBuf);
    }

    public static int a(ViaAPIBase viaAPIBase, UUID uUID) {
        return viaAPIBase.getPlayerVersion(uUID);
    }
}

