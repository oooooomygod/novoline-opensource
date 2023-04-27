/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MapInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;
import deobf.EntityLivingBase;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from net.asQ
 */
public class asq_1
implements KB {
    private kj_2 a = null;

    public asq_1(kj_2 kj_22) {
        this.a = kj_22;
    }

    public static void a(Map map) {
        Object object;
        Object object2;
        aP2.b();
        Set set = MapInvoker.c(map);
        boolean bl = false;
        Iterator iterator = aS0.f(set);
        if (dz_0.c(iterator) && (object2 = MapInvoker.c(map, object = dz_0.b(iterator))) instanceof kj_2) {
            kj_2 kj_22 = (kj_2)object2;
            dj_1.a(kj_22, new asq_1(kj_22));
            bl = true;
        }
        ys_2.d(DR.a);
    }

    @Override
    public boolean a() {
        return false;
    }

    protected void a(EntityLivingBase entityLivingBase, float f, float f2) {
        aP2.b();
        if (ys_2.aM() && entityLivingBase instanceof AbstractClientPlayer) {
            AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)entityLivingBase;
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.y();
            GlStateManagerInvoker.b();
            rv_0 rv_02 = dj_1.a(this.a);
            tr_1.a(rv_02, abstractClientPlayer, f, f2);
            GlStateManagerInvoker.A();
        }
    }

    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(entityLivingBase, f7, f3);
    }
}

