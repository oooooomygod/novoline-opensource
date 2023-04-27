/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.Entity;
import deobf.EnumPlayerType;
import deobf.MCInvoker;
import deobf.TimerUtil;
import net.minecraft.network.packts.C01PacketChatMessage;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aT
 */
public class at_1
extends a0_0 {
    private int m;
    private boolean o;
    private int n;
    private TimerUtil l = new TimerUtil();
    private Minecraft k = MCInvoker.f();

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        amv_2.b();
        if (EventInvoker.getState(motionUpdateEvent) == State.PRE && qh_1.c(this.l, 1000L)) {
            qh_1.b(this.l);
            MCInvoker.aa(this.k).a(new C01PacketChatMessage(a0v_0.q));
            this.a();
        }
    }

    public at_1(@NotNull Novoline novoline, String string, String string2, List<String> list) {
        super(novoline, string, string2, list);
    }

    private boolean a() {
        String string;
        String[] stringArray;
        String string2;
        NetworkPlayerInfo networkPlayerInfo;
        amv_2.b();
        Iterator iterator = ListInvoker.iterator(a9E.a(GW.e(this.k.ingameGUI)));
        if (dz_0.c(iterator) && (networkPlayerInfo = (NetworkPlayerInfo)dz_0.b(iterator)) != null && StringInvoker.c(string2 = (stringArray = StringInvoker.g(string = sd_1.a((Team)aNL.h(networkPlayerInfo), a4Z.d(aNL.a(networkPlayerInfo))), a0v_0.s))[stringArray.length - 1], a0v_0.o) && StringInvoker.a(string2, (CharSequence)a0v_0.w)) {
            String string3 = StringInvoker.a(string2, (CharSequence)a0v_0.b, (CharSequence)a0v_0.e);
            long l4 = aj_.a(aj_.a(StringInvoker.b(string3), at_1::lambda$findBounty$0));
            int n = Integer.parseInt(string3 = StringInvoker.a(string3, (int)(l4 * 2L)));
            if (n >= this.m && n <= this.n) {
                if (!this.b(networkPlayerInfo) || this.a(networkPlayerInfo)) {
                    this.a(a0v_0.j, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), a0v_0.k), (Object)anw_0.GOLD), n), a0v_0.f), (Object)anw_0.RESET), a0v_0.c), a4Z.d(aNL.a(networkPlayerInfo))), a0v_0.p).toString(), 5000, NotificationType.INFO);
                    a8F.c(NovolineInvoker.A(this.g), a4Z.d(aNL.a(networkPlayerInfo)), EnumPlayerType.TARGET);
                    this.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), a0v_0.t), a4Z.d(aNL.a(networkPlayerInfo))), a0v_0.r).toString());
                    int n2 = 0;
                    aci_0.a(NovolineInvoker.i(this.g), new aUS(this, 100 * n2, ag3_0.TICK));
                    ++n2;
                    EventManagerInvoker.b(this);
                }
                return true;
            }
        }
        return false;
    }

    private static boolean lambda$findBounty$0(int n) {
        amv_2.b();
        return n == 167;
    }

    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1, IOException {
        ListInvoker[] listInvokerArray = amv_2.b();
        int n3 = stringArray.length;
        if (listInvokerArray == null) {
            if (n3 == 0) {
                this.a(a0v_0.n, a0v_0.a);
                return;
            }
            n3 = stringArray.length;
        }
        if (listInvokerArray == null) {
            if (n3 != 1) {
                this.a(a0v_0.m, a0v_0.g);
                return;
            }
            n3 = StringInvoker.d(stringArray[0], a0v_0.u) ? 1 : 0;
        }
        if (n3 != 0) {
            EventManagerInvoker.b(this);
            return;
        }
        String[] stringArray2 = StringInvoker.g(stringArray[0], a0v_0.v);
        this.m = Integer.parseInt(stringArray2[0]);
        this.n = Integer.parseInt(stringArray2[1]);
        if (this.m > this.n) {
            this.a(a0v_0.l, a0v_0.d);
            return;
        }
        this.d(a0v_0.h);
        qh_1.b(this.l);
        if (!this.a()) {
            this.d(a0v_0.i);
            EventManagerInvoker.a(this);
        }
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    private boolean a(NetworkPlayerInfo networkPlayerInfo) {
        Entity entity;
        amv_2.b();
        Iterator iterator = ListInvoker.iterator(BlockInvoker.e(this.k.world));
        if (dz_0.c(iterator) && ayj_0.R(entity = (Entity)dz_0.b(iterator)) == a4Z.a(aNL.a(networkPlayerInfo))) {
            return MathInvoker.a(this.k.player.posY - entity.posY) > 5.0;
        }
        return false;
    }

    private boolean b(NetworkPlayerInfo networkPlayerInfo) {
        Entity entity;
        amv_2.b();
        Iterator iterator = ListInvoker.iterator(BlockInvoker.e(this.k.world));
        return dz_0.c(iterator) && ayj_0.R(entity = (Entity)dz_0.b(iterator)) == a4Z.a(aNL.a(networkPlayerInfo));
    }
}

