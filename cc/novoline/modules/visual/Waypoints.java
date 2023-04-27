/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectArrayList
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import com.google.common.reflect.TypeToken;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectArrayList;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import deobf.TypeSerializerCollection;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class Waypoints
extends AbstractModule {
    private List<lj_1> H;
    private static long J = a1c.a(-7057697688222252818L, 6198793847031042338L, MethodHandles.lookup().lookupClass()).a(5923163878691L);
    private List<lj_1> I;

    private static boolean lambda$removeWaypoint$0(String string, lj_1 lj_12) {
        return StringInvoker.d(lj_12.d(), string);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public @Nullable lj_1 b(String string) {
        return (lj_1)oc_1.a(aMF.b(aMF.b(ListInvoker.stream(this.H), arg_0 -> Waypoints.lambda$getWaypointByName$1(string, arg_0))), null);
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        HUD.j();
        Iterator iterator = ListInvoker.iterator(this.H);
        if (dz_0.c(iterator)) {
            lj_1 lj_12 = (lj_1)dz_0.b(iterator);
            float f = (float)((double)((float)asi_1.c(lj_12) + 0.0f * a1j.a(render3DEvent)) - MCInvoker.j((Minecraft)this.mc).s);
            float f2 = (float)((double)((float)asi_1.d(lj_12) + 0.0f * a1j.a(render3DEvent)) - MCInvoker.j((Minecraft)this.mc).h);
            float f3 = (float)((double)((float)asi_1.a(lj_12) + 0.0f * a1j.a(render3DEvent)) - MCInvoker.j((Minecraft)this.mc).m);
            asi_1.a(lj_12, asi_1.a(lj_12, f, f2, f3));
        }
    }

    @Override
    protected void a(@NonNull TypeSerializerCollection typeSerializerCollection) {
        asq_0.a(typeSerializerCollection, aqi_1.a, (GE)new aqi_1());
    }

    public void a(@NonNull lj_1 lj_12) {
        ListInvoker.add(this.H, lj_12);
        try {
            this.b();
        }
        catch (a68 a682) {
            LoggerInvoker.b(this.x, net.m.f, a682);
        }
    }

    public List<lj_1> d() {
        return this.H;
    }

    private void b() throws a68 {
        ki_0.a(ki_0.a(aa2_0.a(this.m), new Object[]{net.m.c}), (TypeToken)new aeu_0(this), this.H);
    }

    public List<lj_1> a() {
        return this.I;
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        ListInvoker.forEach(this.H, lj_1::a);
    }

    public boolean a(String string) {
        asl_0.a(string, net.m.b);
        HUD.t();
        boolean bl = ListInvoker.removeIf(this.H, arg_0 -> Waypoints.lambda$removeWaypoint$0(string, arg_0));
        if (bl) {
            try {
                this.b();
            }
            catch (a68 a682) {
                LoggerInvoker.b(this.x, net.m.d, a682);
            }
        }
        return bl;
    }

    public Waypoints(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2, String string3) {
        long l4 = J ^ 0x42BBA812FCD9L;
        long l5 = l4 ^ 0x30F5DF8F3BF5L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super((short)n, moduleManager, string, enumModuleType, (short)n2, n3, string2, string3);
        this.H = new ObjectArrayList();
        this.I = asg_0.b(this.H);
        this.c();
    }

    private void c() {
        try {
            ListInvoker.addAll(this.H, ki_0.a(ki_0.a(aa2_0.a(this.m), new Object[]{net.m.a}), (TypeToken)new alm_0(this), new ArrayList()));
            return;
        }
        catch (a68 a682) {
            throw new RuntimeException(net.m.e, a682);
        }
    }

    private static boolean lambda$getWaypointByName$1(String string, lj_1 lj_12) {
        return StringInvoker.d(lj_12.d(), string);
    }
}

