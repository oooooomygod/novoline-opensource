/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.CollideWithBlockEvent;
import cc.novoline.modules.AbstractModule;
import net.minecraft.init.Blocks;
import cc.novoline.modules.EnumModuleType;
import java.lang.invoke.MethodHandles;

import org.checkerframework.checker.nullness.qual.NonNull;

public class a_e
extends AbstractModule {
    private static long H = a1c.a(-7986601270491910630L, 811028032836720319L, MethodHandles.lookup().lookupClass()).a(135220023894651L);

    @EventTarget
    private void a(CollideWithBlockEvent collideWithBlockEvent) {
        ChestStealer.d();
        if (A_.d(collideWithBlockEvent) == Blocks.a9) {
            A_.a(collideWithBlockEvent, new rm_2(A_.a(collideWithBlockEvent), amv_2.a(A_.a(collideWithBlockEvent), 1, 1, 1)));
        }
    }

    public a_e(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = H ^ 0x329051287C07L;
        long l5 = l4 ^ 0x7E39F3537BC0L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
    }
}

