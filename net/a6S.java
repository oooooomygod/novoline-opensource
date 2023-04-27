/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.ViaPlatformLoader
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.protocol.version.VersionProvider
 *  com.viaversion.viaversion.bungee.providers.BungeeMovementTransmitter
 *  com.viaversion.viaversion.protocols.protocol1_9to1_8.providers.MovementTransmitterProvider
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;
import com.viaversion.viaversion.bungee.providers.BungeeMovementTransmitter;
import com.viaversion.viaversion.protocols.protocol1_9to1_8.providers.MovementTransmitterProvider;
import net.aGT;
import net.aqg_2;
import net.te_1;
import net.xx_0;

public class a6S
implements ViaPlatformLoader {
    private static ListInvoker[] b;

    public void unload() {
    }

    public void load() {
        xx_0.a(aGT.a(te_1.a()), MovementTransmitterProvider.class, (Provider)new BungeeMovementTransmitter());
        a6S.b();
        xx_0.a(aGT.a(te_1.a()), VersionProvider.class, (Provider)new aqg_2(this));
        if (ListInvoker.b() != null) {
            a6S.b(new ListInvoker[2]);
        }
    }

    static {
        if (a6S.b() != null) {
            a6S.b(new ListInvoker[2]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }
}

