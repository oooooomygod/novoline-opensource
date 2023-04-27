/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.Initializer;
import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.IRCMessageEvent;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.C08PacketPlayerBlockPlacementInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import deobf.Packet;
import cc.novoline.modules.move.Speed;
import deobf.TimerUtil;
import deobf.Vec3;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.C07PacketPlayerDigging;
import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import net.minecraft.network.packts.C08PacketPlayerBlockPlacement;
import net.minecraft.network.packts.S08PacketPlayerPosLook;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;

public class XQ {
    private static int b;
    private boolean e;
    private boolean c;
    private Runnable d;
    private boolean f;
    private Minecraft h;
    private Runnable a;
    private boolean j;
    private TimerUtil g;
    private List<C03PacketPlayer> i;

    static {
        if (XQ.b() != 0) {
            XQ.b(41);
        }
    }

    public XQ(Minecraft minecraft, Initializer initializer) {
        XQ.b();
        this.i = new ArrayList<C03PacketPlayer>();
        this.g = new TimerUtil();
        this.d = initializer.d;
        this.a = initializer.a;
        this.h = minecraft;
        ListInvoker.b(new ListInvoker[2]);
    }

    public static int a() {
        XQ.b();
        return 25;
    }

    public static int b() {
        return b;
    }

    public static void b(int n) {
        b = n;
    }

    @EventTarget
    public void a(IRCMessageEvent iRCMessageEvent) {
        this.j = false;
        this.e = false;
        int n = XQ.b();
        this.f = false;
        this.c = false;
        if (!ListInvoker.isEmpty(this.i)) {
            ListInvoker.clear(this.i);
        }
        if (ListInvoker.b() != null) {
            XQ.b(++n);
        }
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        block7: {
            Packet<INetHandlerPlayServer> packet;
            block6: {
                XQ.a();
                if (PacketEventInvoker.getState(packetEvent) != State.INCOMING) break block6;
                if (!(PacketEventInvoker.c(packetEvent) instanceof S08PacketPlayerPosLook)) break block7;
                if (this.f) {
                    this.a((KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA));
                    this.f = false;
                }
                if (ListInvoker.isEmpty(this.i)) break block7;
                ListInvoker.forEach(this.i, this::b);
                ListInvoker.clear(this.i);
            }
            if (PacketEventInvoker.c(packetEvent) instanceof C08PacketPlayerBlockPlacement && C08PacketPlayerBlockPlacementInvoker.b(packet = (C08PacketPlayerBlockPlacement)PacketEventInvoker.c(packetEvent)) == 255) {
                NoSlow noSlow = (NoSlow)ModuleInvoker.isEnable(ModuleRegistry.NOSLOWDOWN);
                boolean bl = StringPropertyInvoker.isMode(aAE.c(noSlow), ane_0.a) && (aAE.a(noSlow) || aAE.b(noSlow));
                boolean bl2 = !aAE.a(noSlow, C08PacketPlayerBlockPlacementInvoker.a(packet)) && PlayerInvoker.N(this.h.player) != null;
            }
            if (PacketEventInvoker.c(packetEvent) instanceof C07PacketPlayerDigging && atq_0.b((C07PacketPlayerDigging)(packet = (C07PacketPlayerDigging)PacketEventInvoker.c(packetEvent))) == C07PacketPlayerDigging$Action.RELEASE_USE_ITEM && this.e) {
                sj_1.a(this.d);
                sj_1.a(this.a);
                this.e = false;
                PacketEventInvoker.setCancelled(packetEvent, true);
            }
        }
    }

    private void a(Packet<?> packet) {
        MCInvoker.aa(this.h).a(packet);
    }

    private void b(Packet<?> packet) {
        MCInvoker.aa(this.h).b(packet);
    }

    private void b(KillAura killAura) {
        XQ.b();
        if (ListInvoker.size(this.i) > 1) {
            this.a(new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.RELEASE_USE_ITEM));
            this.b((Packet)ListInvoker.get(this.i, 0));
            if (atH.m(killAura)) {
                atH.n(killAura);
            }
            this.a(new C08PacketPlayerBlockPlacement(null));
            this.b((Packet)ListInvoker.get(this.i, 1));
            ListInvoker.clear(this.i);
        }
    }

    private void a(KillAura killAura, Speed speed, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n;
        XQ.b();
        int n2 = bl2 || bl3 ? 5 : (n = bl ? 2 : 1);
        if ((ListInvoker.size(this.i) > 1 || !bl2 && !bl3) && atH.m(killAura) && !bl4) {
            atH.n(killAura);
        }
        if (ListInvoker.size(this.i) > n) {
            int n3;
            if (bl2 || bl3) {
                sj_1.a(this.d);
                sj_1.a(this.a);
            }
            if ((n3 = 0) < ListInvoker.size(this.i)) {
                C03PacketPlayer c03PacketPlayer = (C03PacketPlayer)ListInvoker.get(this.i, n3);
                if (bl4) {
                    ka_0.a(c03PacketPlayer, ae4_0.a(PlayerInvoker.N(this.h.player)));
                }
                this.b(c03PacketPlayer);
                if (bl4) {
                    BlockPos blockPos = PlayerInvoker.N(this.h.player);
                    EnumFacing enumFacing = BlocksInvoker.a(blockPos);
                    double d = amv_2.j(blockPos);
                    double d2 = amv_2.h(blockPos);
                    double d3 = amv_2.i(blockPos);
                    Vec3 vec3 = MathHelper.a(blockPos, enumFacing);
                    float f = (float)(vec3.xCoord - d);
                    float f2 = (float)(vec3.yCoord - d2);
                    float f3 = (float)(vec3.zCoord - d3);
                    this.a(new C08PacketPlayerBlockPlacement(blockPos, SJ.i(enumFacing), new ItemStack(PS.a()), f, f2, f3));
                    this.j = false;
                }
                ++n3;
            }
            if (bl2 || bl3) {
                this.a(new C08PacketPlayerBlockPlacement(PlayerInvoker.h(this.h.player)));
            }
            ListInvoker.clear(this.i);
        }
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        this.j = false;
        this.e = false;
        XQ.a();
        this.f = false;
        this.c = false;
        if (!ListInvoker.isEmpty(this.i)) {
            ListInvoker.forEach(this.i, this::b);
            ListInvoker.clear(this.i);
        }
    }

    private void a(KillAura killAura) {
        XQ.a();
        if (StringPropertyInvoker.isMode(atH.e(killAura), ane_0.e)) {
            sj_1.a(this.d);
            sj_1.a(this.a);
        }
        this.a(new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.RELEASE_USE_ITEM));
    }

    @EventTarget
    private void a(MotionUpdateEvent motionUpdateEvent) {
        XQ.a();
        if (EventInvoker.getState(motionUpdateEvent) == cc.novoline.events.type.State.PRE) {
            boolean bl;
            KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
            NoSlow noSlow = (NoSlow)ModuleInvoker.isEnable(ModuleRegistry.NOSLOWDOWN);
            Speed speed = (Speed)ModuleInvoker.isEnable(ModuleRegistry.SPEED);
            boolean bl2 = WW.a(speed);
            boolean bl3 = atH.a(killAura, ane_0.f);
            boolean bl4 = aAE.a(noSlow, ane_0.c);
            boolean bl5 = atH.a(killAura, ane_0.d);
            boolean bl6 = PlayerInvoker.N(this.h.player) != null && this.j;
            boolean bl7 = bl = StringPropertyInvoker.isMode(aAE.c(noSlow), ane_0.b) && (aAE.a(noSlow) || aAE.b(noSlow));
            if (bl2 || bl3 || bl4 || bl5) {
                if (atH.j(killAura)) {
                    EventInvoker.a(motionUpdateEvent, atH.c(killAura));
                    EventInvoker.b(motionUpdateEvent, atH.g(killAura));
                }
                if (WW.b(speed)) {
                    EventInvoker.b(motionUpdateEvent, true);
                }
                ListInvoker.add(this.i, EventInvoker.d(motionUpdateEvent));
                EventInvoker.a(motionUpdateEvent, true);
                if (bl3 || bl5) {
                    this.f = true;
                }
                if (bl4) {
                    this.f = false;
                }
                if (this.f) {
                    this.a(killAura);
                    this.f = false;
                }
                if (this.e) {
                    this.e = false;
                }
                if (bl5) {
                    this.b(killAura);
                }
                this.a(killAura, speed, bl2, bl3, bl4, false);
            }
            if (this.f) {
                this.a(killAura);
                this.f = false;
            }
            if (!ListInvoker.isEmpty(this.i)) {
                ListInvoker.forEach(this.i, this::b);
                ListInvoker.clear(this.i);
            }
        }
    }
}

