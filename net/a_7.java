/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.type.State;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.FontRenderer;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

import org.checkerframework.checker.nullness.qual.NonNull;

public class a_7
extends AbstractModule {
    private float I;
    private agm_1 H;
    private static long K = a1c.a(3986875029733562126L, 4551768750510060984L, MethodHandles.lookup().lookupClass()).a(15783999408053L);
    private float J;

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        UhcCrafts.d();
        try {
            FontRenderer fontRenderer = this.mc.fontRendererCrack;
            float f = 150.0f;
            Iterator iterator = akr_1.a(my_0.a(new Integer[]{P8.d(this.mc.player.fuck)}));
            if (dz_0.c(iterator)) {
                Object object = dz_0.b(iterator);
                FontRendererInvoker.a(fontRenderer, StringInvoker.a(object), 40.0f, f, 0xFFFFFF, true);
                f += (float)(FontRendererInvoker.d(fontRenderer) + 1);
            }
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    @Override
    public void w() {
    }

    @Override
    public void o() {
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        if (EventInvoker.getState(motionUpdateEvent) == State.PRE) {
            // empty if block
        }
    }

    public a_7(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string) {
        long l4 = K ^ 0x90F36CA805DL;
        long l5 = l4 ^ 0x651224795C1BL;
        int n = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n, moduleManager, l6, enumModuleType, string);
        this.H = new agm_1();
    }
}

