/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 */
package net;

import com.google.common.util.concurrent.FutureCallback;
import deobf.NetHandlerPlayClient;
import net.minecraft.network.packts.C19PacketResourcePackStatus;
import net.minecraft.network.packts.C19PacketResourcePackStatus$Action;

class PQ
implements FutureCallback<Object> {
    String b;
    NetHandlerPlayClient a;

    public void onFailure(Throwable throwable) {
        NetHandlerPlayClient.a(this.a).sendPacket(new C19PacketResourcePackStatus(this.b, C19PacketResourcePackStatus$Action.FAILED_DOWNLOAD));
    }

    public void onSuccess(Object object) {
        NetHandlerPlayClient.a(this.a).sendPacket(new C19PacketResourcePackStatus(this.b, C19PacketResourcePackStatus$Action.SUCCESSFULLY_LOADED));
    }

    PQ(NetHandlerPlayClient netHandlerPlayClient, String string) {
        this.a = netHandlerPlayClient;
        this.b = string;
    }
}

