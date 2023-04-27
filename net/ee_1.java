/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.MCInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Renamed from net.eE
 */
public class ee_1
extends eg_0<a6L> {
    private static ResourceLocation d;
    private qj_0 e = new qj_0();
    private static Map<String, axx_2> c;

    static {
        c = MapsInvoker.a();
        d = new ResourceLocation(de_1.b);
    }

    private ResourceLocation a(a6L a6L2) {
        Object object;
        Object object2;
        Object object3;
        String string = aez_2.g(a6L2);
        if (StringInvoker.g(string)) {
            return null;
        }
        axx_2 axx_22 = (axx_2)MapInvoker.c(c, string);
        if (MapInvoker.a(c) >= 256) {
            long l4 = SystemInvoker.f();
            object3 = aS0.f(MapInvoker.c(c));
            while (dz_0.c((Iterator)object3)) {
                object2 = (String)dz_0.b((Iterator)object3);
                object = (axx_2)MapInvoker.c(c, object2);
                if (l4 - object.a <= 60000L) continue;
                TextureManagerInvoker.a(MCInvoker.E(MCInvoker.f()), object.b);
                dz_0.a((Iterator)object3);
            }
            if (MapInvoker.a(c) >= 256) {
                return null;
            }
        }
        List list = aez_2.a(a6L2);
        List list2 = aez_2.d(a6L2);
        object3 = my_0.c();
        object2 = ListInvoker.iterator(list);
        while (dz_0.c((Iterator)object2)) {
            object = (qv_2)((Object)dz_0.b((Iterator)object2));
            ListInvoker.add((List)object3, aL0.a(aL0.a(aL0.a(new StringBuilder(), de_1.c), aib_0.f((qv_2)((Object)object))), de_1.a).toString());
        }
        axx_22 = new axx_2(null);
        axx_22.b = new ResourceLocation(string);
        TextureManagerInvoker.a(MCInvoker.E(MCInvoker.f()), axx_22.b, new JL(d, (List<String>)object3, list2));
        MapInvoker.c(c, string, axx_22);
        axx_22.a = SystemInvoker.f();
        return axx_22.b;
    }

    @Override
    public void a(a6L a6L2, double d, double d2, double d3, float f, int n) {
        boolean bl = a6L2.b() != null;
        boolean bl2 = aez_2.c(a6L2) == Blocks.cs;
        int n2 = aez_2.e(a6L2);
        long l4 = aV8.d(a6L2.b());
        GlStateManagerInvoker.pushMatrix();
        float f2 = 0.6666667f;
        GlStateManagerInvoker.translate((float)d + 0.5f, (float)d2 + 0.75f * f2, (float)d3 + 0.5f);
        float f3 = (float)(n2 * 360) / 16.0f;
        GlStateManagerInvoker.b(-f3, 0.0f, 1.0f, 0.0f);
        this.e.h.p = true;
        BlockPos blockPos = aez_2.b(a6L2);
        float f4 = (float)(amv_2.j(blockPos) * 7 + amv_2.h(blockPos) * 9 + amv_2.i(blockPos) * 13) + (float)l4 + f;
        this.e.j.t = (-0.0125f + 0.01f * MathHelper.cos(f4 * (float)Math.PI * 0.02f)) * (float)Math.PI;
        GlStateManagerInvoker.c();
        ResourceLocation resourceLocation = this.a(a6L2);
        this.a(resourceLocation);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.c(f2, -f2, -f2);
        ll_2.a(this.e);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.popMatrix();
    }
}

