/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import deobf.MCInvoker;
import deobf.TimerUtil;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.minecraft.network.packts.S02PacketChat;
import net.minecraft.client.Minecraft;

public class IRCThread {
    private TimerUtil b;
    private static int[] f;
    private long d;
    private Minecraft g;
    private TimerUtil a;
    private boolean e;
    private TimerUtil c = new TimerUtil();

    public static int[] b() {
        return f;
    }

    public static void b(int[] nArray) {
        f = nArray;
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        IRCThread.b();
        if (MCInvoker.q(this.g) == null && aCM.d() && qh_1.c(this.c, 3030L) && !qh_1.c(this.a, 100L)) {
            aDM.b(MCInvoker.aa(this.g), new C01PacketChatMessage(aL0.a(aL0.a(new StringBuilder(), VW.a), (String)ListInvoker.get(aod_2.a(VW.b, 1, 6), 0)).toString()));
            this.e = true;
            qh_1.b(this.b);
            qh_1.b(this.c);
        }
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        IRCThread.b();
        if (PacketEventInvoker.getState(packetEvent) == State.INCOMING) {
            if (PacketEventInvoker.c(packetEvent) instanceof S02PacketChat && MCInvoker.q(this.g) == null && aCM.d()) {
                S02PacketChat s02PacketChat = (S02PacketChat)PacketEventInvoker.c(packetEvent);
                String string = aBO.a(ue_2.c(s02PacketChat));
                String string2 = VW.c;
                String string3 = VW.e;
                String string4 = VW.d;
                if ((string.equals(string2) || string.equals(string3) || string.equals(string4)) && this.e) {
                    this.d = qh_1.a(this.b);
                    this.e = false;
                    PacketEventInvoker.setCancelled(packetEvent, true);
                }
            }
            qh_1.b(this.a);
        }
    }

    static {
        if (IRCThread.b() == null) {
            IRCThread.b(new int[1]);
        }
    }

    public IRCThread(Minecraft minecraft) {
        IRCThread.b();
        this.a = new TimerUtil();
        this.b = new TimerUtil();
        this.g = minecraft;
        ListInvoker.b(new ListInvoker[5]);
    }

    public long c() {
        IRCThread.b();
        long l4 = 0L;
        if (MCInvoker.W(this.g) == null) {
            l4 = 0L;
        }
        if (this.d > 0L) {
            l4 = this.d;
        }
        if (AC.a(aKZ.c(MCInvoker.W(this.g))) != -1L) {
            l4 = AC.a(aKZ.c(MCInvoker.W(this.g)));
        }
        if (ListInvoker.b() != null) {
            IRCThread.b(new int[1]);
        }
        return l4;
    }
}

