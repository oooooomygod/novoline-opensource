/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.C00PacketLoginStart;
import net.minecraft.network.packts.C01PacketEncryptionResponse;

public interface INetHandlerLoginServer
extends INetHandler {
    public void a(C01PacketEncryptionResponse var1);

    public void a(C00PacketLoginStart var1);
}

