/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.CancellableEvent;
import cc.novoline.events.Event;
import cc.novoline.events.State;
import deobf.MCInvoker;
import deobf.Packet;
import net.minecraft.network.packts.C00PacketKeepAlive;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.minecraft.network.packts.C02PacketUseEntity;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.C04PacketPlayerPosition;
import net.minecraft.network.packts.C05PacketPlayerLook;
import net.minecraft.network.packts.C06PacketPlayerPosLook;
import net.minecraft.network.packts.C0CPacketInput;
import net.minecraft.network.packts.C0EPacketClickWindow;
import net.minecraft.network.packts.C0FPacketConfirmTransaction;
import net.minecraft.network.packts.C13PacketPlayerAbilities;
import net.minecraft.network.packts.C18PacketSpectate;
import net.minecraft.network.packts.S08PacketPlayerPosLook;
import net.skidunion.annotations;

/*
 * Renamed from net.Bd
 */
public class bd_0
extends CancellableEvent
implements Event {
    private State c;
    private static String d = "MLxoS";
    private Packet<?> e;

    public State b() {
        return this.c;
    }

    @annotations
    public xz_2<?> getPacket() {
        bd_0.a();
        if (this.e instanceof C04PacketPlayerPosition) {
            return new gl_0((C04PacketPlayerPosition)this.e);
        }
        if (this.e instanceof C05PacketPlayerLook) {
            return new kp_0((C05PacketPlayerLook)this.e);
        }
        if (this.e instanceof C06PacketPlayerPosLook) {
            return new ayf_0((C06PacketPlayerPosLook)this.e);
        }
        if (this.e instanceof C03PacketPlayer) {
            return new arh_2((C03PacketPlayer)this.e);
        }
        if (this.e instanceof C0FPacketConfirmTransaction) {
            return new aW0((C0FPacketConfirmTransaction)this.e);
        }
        if (this.e instanceof C02PacketUseEntity) {
            return new ant_1((C02PacketUseEntity)this.e);
        }
        if (this.e instanceof C00PacketKeepAlive) {
            return new aKW((C00PacketKeepAlive)this.e);
        }
        if (this.e instanceof C13PacketPlayerAbilities) {
            return new aXB((C13PacketPlayerAbilities)this.e);
        }
        if (this.e instanceof C0CPacketInput) {
            return new amp_2((C0CPacketInput)this.e);
        }
        if (this.e instanceof C0EPacketClickWindow) {
            return new ab5_0((C0EPacketClickWindow)this.e);
        }
        if (this.e instanceof C18PacketSpectate) {
            return new a4F((C18PacketSpectate)this.e);
        }
        if (this.e instanceof S08PacketPlayerPosLook) {
            return new ar4_0((S08PacketPlayerPosLook)this.e);
        }
        if (this.e instanceof C01PacketChatMessage) {
            return new adl_1((C01PacketChatMessage)this.e);
        }
        return new wz_0(this);
    }

    public static void b(String string) {
        d = string;
    }

    public bd_0(Packet<?> packet, State state) {
        this.c = state;
        this.e = packet;
    }

    static Packet a(bd_0 bd_02) {
        return bd_02.e;
    }

    public static String a() {
        return d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @annotations
    public void setPacket(String string, Object ... objectArray) {
        bd_0.a();
        MCInvoker.f();
        if (this.b() != State.OUTGOING) return;
        String string2 = string;
        int n = -1;
        switch (string2.hashCode()) {
            case 1546828: {
                if (!string2.equals(aub_0.a)) return;
                n = 0;
            }
            case 1546846: {
                if (!string2.equals(aub_0.d)) return;
                n = 1;
            }
            case 1546830: {
                if (!string2.equals(aub_0.l)) return;
                n = 2;
            }
            case 1546829: {
                if (!string2.equals(aub_0.i)) return;
                n = 3;
            }
            case 1546827: {
                if (!string2.equals(aub_0.b)) return;
                n = 4;
            }
            case 1546826: {
                if (!string2.equals(aub_0.g)) return;
                n = 5;
            }
            case 1546825: {
                if (!string2.equals(aub_0.p)) return;
                n = 6;
            }
            case 1546832: {
                if (!string2.equals(aub_0.e)) return;
                n = 7;
            }
            case 1546831: {
                if (!string2.equals(aub_0.h)) return;
                n = 8;
            }
            case 1546833: {
                if (!string2.equals(aub_0.j)) return;
                n = 9;
            }
            case 1546841: {
                if (!string2.equals(aub_0.c)) return;
                n = 10;
            }
            case 1546842: {
                if (!string2.equals(aub_0.m)) return;
                n = 11;
            }
            case 1546858: {
                if (!string2.equals(aub_0.k)) return;
                n = 12;
            }
            case 1546863: {
                if (!string2.equals(aub_0.f)) return;
                n = 13;
            }
            case 1546845: {
                if (!string2.equals(aub_0.o)) return;
                n = 14;
            }
            case 1546843: {
                if (!string2.equals(aub_0.n)) return;
                return;
            }
        }
    }

    static {
        if (bd_0.a() == null) {
            bd_0.b("MLxoS");
        }
    }
}

