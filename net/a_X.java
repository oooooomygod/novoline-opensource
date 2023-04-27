/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import net.minecraft.network.packts.C04PacketPlayerPosition;
import net.minecraft.network.packts.C06PacketPlayerPosLook;
import java.lang.invoke.MethodHandles;

import org.checkerframework.checker.nullness.qual.NonNull;

public class a_X
extends AbstractModule {
    private static long H = a1c.a(3584444435623253780L, -4931847642866877281L, MethodHandles.lookup().lookupClass()).a(16804315120831L);

    @Override
    public void o() {
        this.a(SB.b);
    }

    public a_X(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = H ^ 0x3FED7635BB74L;
        long l5 = l4 ^ 0x640BEDEA8CEAL;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        ChestStealer.j();
        if (EventInvoker.getState(motionUpdateEvent) == State.PRE) {
            double d = this.mc.player.posX;
            double d2 = this.mc.player.posY;
            double d3 = this.mc.player.posZ;
            float f = this.mc.player.rotationYaw;
            float f2 = this.mc.player.rotationPitch;
            boolean bl = this.mc.player.onGround;
            if (PlayerInvoker.ag(this.mc.player) && (act_2.k(PlayerInvoker.h(this.mc.player)) instanceof ItemPotion || act_2.k(PlayerInvoker.h(this.mc.player)) instanceof LA)) {
                this.b(new C04PacketPlayerPosition(d, d2, d3, bl));
                this.b(new C06PacketPlayerPosLook(d, d2, d3, f, f2, bl));
                this.b(new C04PacketPlayerPosition(d, d2, d3, bl));
                this.b(new C06PacketPlayerPosLook(d, d2, d3, f, f2, bl));
            }
        }
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a(SB.a);
    }
}

