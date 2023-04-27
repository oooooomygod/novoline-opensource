/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.CancellableEvent;
import cc.novoline.events.State;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.invoke.EventManagerInvoker;
import deobf.MCInvoker;
import deobf.Packet;
import net.aDM;
import net.aoi_1;
import net.bd_0;

public class PacketEvent
extends CancellableEvent {
    private State d;
    private Packet<?> c;
    private static int[] e;

    public State c() {
        return this.d;
    }

    public static void b(int[] nArray) {
        e = nArray;
    }

    public void b(Packet packet) {
        aDM.b(MCInvoker.aa(MCInvoker.f()), packet);
        this.setCancelled(true);
    }

    public void d() {
        aDM.b(MCInvoker.aa(MCInvoker.f()), this.c);
        this.setCancelled(true);
    }

    static {
        if (PacketEvent.a() != null) {
            PacketEvent.b(new int[5]);
        }
    }

    public Packet<?> b() {
        return this.c;
    }

    public static int[] a() {
        return e;
    }

    public void a(Packet<?> packet) {
        this.c = packet;
    }

    public PacketEvent(Packet<?> packet, State state) {
        MotionUpdateEvent.g();
        bd_0 bd_02 = new bd_0(packet, state);
        EventManagerInvoker.call(bd_02);
        if (bd_02.isCancelled()) {
            this.setCancelled(true);
        }
        this.d = bd_02.b();
        this.c = aoi_1.a(bd_02).getPacket();
    }
}

