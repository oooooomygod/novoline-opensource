/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import net.minecraft.network.packts.S00PacketDisconnect;
import net.minecraft.network.packts.S01PacketEncryptionRequest;
import net.minecraft.network.packts.S02PacketLoginSuccess;
import net.minecraft.network.packts.S03PacketEnableCompression;
import net.INetHandler;

public interface INetHandlerLoginClient
extends INetHandler {
    public void a(S02PacketLoginSuccess var1);

    public void a(S03PacketEnableCompression var1);

    public void a(S00PacketDisconnect var1);

    public void a(S01PacketEncryptionRequest var1);
}

