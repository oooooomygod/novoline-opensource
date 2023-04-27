/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector3f
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import net.minecraft.client.entity.AbstractClientPlayer;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EntityPlayerSP;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import java.lang.invoke.MethodHandles;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;

public class MoreBends
extends AbstractModule {
    public static float H;
    private static long I;

    @Override
    public void o() {
        aii_0.c();
        ((F5)aGD.a((String)jr_0.c)).e = true;
        atC.a();
    }

    @Override
    public void w() {
        atC.b();
    }

    public MoreBends(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = I ^ 0x7EBD709A3893L;
        long l5 = l4 ^ 0x222F2DA38547L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
    }

    static {
        I = a1c.a(-8888218801632729474L, 6854654315437068470L, MethodHandles.lookup().lookupClass()).a(246427020265395L);
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        HUD.t();
        if (MCInvoker.f().world == null) {
            return;
        }
        int n = 0;
        if (n < ListInvoker.size(atJ.K)) {
            s6_0.a((atJ)ListInvoker.get(atJ.K, n), a1j.a(render3DEvent));
            ++n;
        }
        H = a1j.a(render3DEvent);
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        HUD.t();
        if (MCInvoker.f().world == null) {
            return;
        }
        int n = 0;
        if (n < ListInvoker.size(atJ.K)) {
            atJ atJ2 = (atJ)ListInvoker.get(atJ.K, n);
            Entity entity = BlockInvoker.b(MCInvoker.f().world, atJ2.o);
            if (!StringInvoker.d(atJ2.n, entity.getName())) {
                ListInvoker.remove(atJ.K, atJ2);
                s6_0.c(new atJ(ayj_0.B(entity)));
                abr_0.a(jr_0.b, B9.DEBUG);
            }
            ady_2.a(atJ2.a, (ReadableVector3f)atJ2.f);
            atJ2.f.x = (float)entity.posX - atJ2.d.x;
            atJ2.f.y = (float)entity.posY - atJ2.d.y;
            atJ2.f.z = (float)entity.posZ - atJ2.d.z;
            atJ2.d = new Vector3f((float)entity.posX, (float)entity.posY, (float)entity.posZ);
            ListInvoker.remove(atJ.K, atJ2);
            abr_0.a(jr_0.a, B9.DEBUG);
            ++n;
        }
    }

    @EventTarget
    public void a(BP bP) {
        HUD.j();
        if (v0_0.b(bP) == ad3_0.PRE) {
            if (!(v0_0.f(bP) instanceof EntityPlayer) || this.mc.world == null || v0_0.f(bP) instanceof EntityPlayerSP && awu_1.f(this.mc.gameSettings) == 0 || v0_0.c(bP) instanceof kp_2) {
                return;
            }
            if (atC.a((Entity)v0_0.f((BP)bP)).a) {
                AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)v0_0.f(bP);
                v0_0.a(bP, true);
                OY.a(atC.a(abstractClientPlayer), abstractClientPlayer, v0_0.d(bP), v0_0.a(bP), v0_0.e(bP), 0.0f, H);
            }
        }
    }
}

