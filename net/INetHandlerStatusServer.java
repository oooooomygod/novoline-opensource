/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.C00PacketServerQuery;
import net.minecraft.network.packts.C01PacketPing;

public interface INetHandlerStatusServer
extends INetHandler {
    public void a(C00PacketServerQuery var1);

    public void a(C01PacketPing var1);
}

