/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.player;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import java.lang.invoke.MethodHandles;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Respawn
extends AbstractModule {
    private static long H = a1c.a(8882409060679410820L, -4419377015871739260L, MethodHandles.lookup().lookupClass()).a(96704356580563L);

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        UhcCrafts.d();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE) && this.mc.currentScreen instanceof rk_0) {
            PlayerInvoker.ap(this.mc.player);
        }
    }

    public Respawn(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string) {
        long l4 = H ^ 0x4F778E6C5FFL;
        long l5 = l4 ^ 0x268D6A7016FDL;
        int n = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n, moduleManager, l6, enumModuleType, string);
    }
}

