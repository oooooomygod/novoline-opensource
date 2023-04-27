/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Packet;
import net.minecraft.network.packts.C02PacketUseEntity;
import net.minecraft.network.packts.C02PacketUseEntity$Action;
import net.skidunion.annotations;

/*
 * Renamed from net.anT
 */
public class ant_1
implements xz_2 {
    private C02PacketUseEntity a;
    private static ListInvoker[] b;

    @Override
    @annotations
    public String getName() {
        return qy_1.a;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public ant_1(C02PacketUseEntity c02PacketUseEntity) {
        this.a = c02PacketUseEntity;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (ant_1.b() == null) {
            ant_1.b(new ListInvoker[2]);
        }
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }

    @annotations
    public C02PacketUseEntity$Action getAction() {
        return this.a.a();
    }
}

