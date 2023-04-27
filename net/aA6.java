/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.MCInvoker;

public class aA6 {
    public static float a;
    public static aV1 b;

    @EventTarget
    public void a(BP bP) {
        HB.b();
        if (v0_0.b(bP) == ad3_0.PRE) {
            if (!(v0_0.f(bP) instanceof EntityPlayer)) {
                return;
            }
            if (v0_0.c(bP) instanceof kp_2) {
                return;
            }
            if (atC.a((Entity)v0_0.f((BP)bP)).a) {
                AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)v0_0.f(bP);
                v0_0.a(bP, true);
                OY.a(atC.a(abstractClientPlayer), abstractClientPlayer, v0_0.d(bP), v0_0.a(bP), v0_0.e(bP), 0.0f, a);
            }
        }
    }

    static {
        b = new aV1();
    }

    public static boolean a(rm_2 rm_22) {
        HB.b();
        Entity entity = MCInvoker.v(MCInvoker.f());
        ahz_1.a(b, entity.posX, entity.posY, entity.posZ);
        boolean bl = ahz_1.a(b, rm_22);
        ListInvoker.b(new ListInvoker[4]);
        return bl;
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        a = a1j.a(render3DEvent);
    }
}

