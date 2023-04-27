/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.C00PacketLoginStart;
import net.minecraft.network.packts.C01PacketEncryptionResponse;

/*
 * Renamed from net.Ss
 */
public class ss_0 {
    public static void a(INetHandlerLoginServer iNetHandlerLoginServer, C00PacketLoginStart c00PacketLoginStart) {
        iNetHandlerLoginServer.a(c00PacketLoginStart);
    }

    public static void a(INetHandlerLoginServer iNetHandlerLoginServer, C01PacketEncryptionResponse c01PacketEncryptionResponse) {
        iNetHandlerLoginServer.a(c01PacketEncryptionResponse);
    }
}

