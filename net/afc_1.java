/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.Entity;
import deobf.MCInvoker;
import net.B9;
import net.HB;
import net.a1j;
import net.abr_0;
import net.ady_2;
import net.aqv_0;
import net.atJ;
import net.ayj_0;
import net.s6_0;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;

/*
 * Renamed from net.afc
 */
public class afc_1 {
    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        HB.b();
        if (MCInvoker.f().world == null) {
            return;
        }
        int n = 0;
        if (n < ListInvoker.size(atJ.K)) {
            s6_0.a((atJ)ListInvoker.get(atJ.K, n), a1j.a(render3DEvent));
            ++n;
        }
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        HB.b();
        if (MCInvoker.f().world == null) {
            return;
        }
        int n = 0;
        if (n < ListInvoker.size(atJ.K)) {
            atJ atJ2 = (atJ)ListInvoker.get(atJ.K, n);
            Entity entity = BlockInvoker.b(MCInvoker.f().world, atJ2.o);
            if (!StringInvoker.d(atJ2.n, ayj_0.x(entity))) {
                ListInvoker.remove(atJ.K, atJ2);
                s6_0.c(new atJ(ayj_0.B(entity)));
                abr_0.a(aqv_0.a, B9.DEBUG);
            }
            ady_2.a(atJ2.a, (ReadableVector3f)atJ2.f);
            atJ2.f.x = (float)entity.posX - atJ2.d.x;
            atJ2.f.y = (float)entity.posY - atJ2.d.y;
            atJ2.f.z = (float)entity.posZ - atJ2.d.z;
            atJ2.d = new Vector3f((float)entity.posX, (float)entity.posY, (float)entity.posZ);
            ListInvoker.remove(atJ.K, atJ2);
            abr_0.a(aqv_0.b, B9.DEBUG);
            ++n;
        }
    }
}

