/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.network.packts.S44PacketWorldBorder;

/*
 * Renamed from net.ayh
 */
class ayh_2
implements aci_1 {
    ServerConfigurationManager a;

    ayh_2(ServerConfigurationManager serverConfigurationManager) {
        this.a = serverConfigurationManager;
    }

    @Override
    public void a(agl_1 agl_12, double d, double d2) {
        this.a.a(new S44PacketWorldBorder(agl_12, axs_2.SET_CENTER));
    }

    @Override
    public void a(agl_1 agl_12, double d) {
    }

    @Override
    public void c(agl_1 agl_12, double d) {
    }

    @Override
    public void b(agl_1 agl_12, double d) {
        this.a.a(new S44PacketWorldBorder(agl_12, axs_2.SET_SIZE));
    }

    @Override
    public void a(agl_1 agl_12, int n) {
        this.a.a(new S44PacketWorldBorder(agl_12, axs_2.SET_WARNING_TIME));
    }

    @Override
    public void a(agl_1 agl_12, double d, double d2, long l4) {
        this.a.a(new S44PacketWorldBorder(agl_12, axs_2.LERP_SIZE));
    }

    @Override
    public void b(agl_1 agl_12, int n) {
        this.a.a(new S44PacketWorldBorder(agl_12, axs_2.SET_WARNING_BLOCKS));
    }
}

