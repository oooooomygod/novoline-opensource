/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import net.minecraft.network.packts.S00PacketServerInfo;
import net.minecraft.network.packts.S01PacketPong;
import net.INetHandler;

public interface INetHandlerStatusClient
extends INetHandler {
    public void a(S00PacketServerInfo var1);

    public void a(S01PacketPong var1);
}

