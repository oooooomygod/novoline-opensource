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

/*
 * Renamed from net.ay0
 */
class ay0_0
implements FutureCallback<Object> {
    String a;
    NetHandlerPlayClient b;

    public void onFailure(Throwable throwable) {
        NetHandlerPlayClient.a(this.b).sendPacket(new C19PacketResourcePackStatus(this.a, C19PacketResourcePackStatus$Action.FAILED_DOWNLOAD));
    }

    public void onSuccess(Object object) {
        NetHandlerPlayClient.a(this.b).sendPacket(new C19PacketResourcePackStatus(this.a, C19PacketResourcePackStatus$Action.SUCCESSFULLY_LOADED));
    }

    ay0_0(NetHandlerPlayClient netHandlerPlayClient, String string) {
        this.b = netHandlerPlayClient;
        this.a = string;
    }
}

