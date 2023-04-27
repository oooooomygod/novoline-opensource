/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import java.util.Iterator;
import java.util.Map;
import net.ResourceLocation;
import net.TextureManager;
import net.dz_0;
import net.ek_2;
import net.ms_0;
import net.u6;
import net.wp_1;

public class aGQ {
    private TextureManager a;
    private Map<String, ek_2> b = MapsInvoker.a();
    private static ResourceLocation c = new ResourceLocation(u6.a);

    static TextureManager a(aGQ aGQ2) {
        return aGQ2.a;
    }

    public aGQ(TextureManager textureManager) {
        this.a = textureManager;
    }

    private ek_2 a(wp_1 wp_12) {
        ek_2 ek_22 = (ek_2)MapInvoker.c(this.b, wp_12.b);
        ek_22 = new ek_2(this, wp_12, null);
        MapInvoker.c(this.b, wp_12.b, ek_22);
        return ek_22;
    }

    public void b(wp_1 wp_12) {
        ek_2.b(this.a(wp_12));
    }

    public void b() {
        Iterator iterator = ms_0.a(this.b.values());
        while (dz_0.c(iterator)) {
            ek_2 ek_22 = (ek_2)dz_0.b(iterator);
            TextureManagerInvoker.a(this.a, ek_2.a(ek_22));
        }
        MapInvoker.d(this.b);
    }

    static ResourceLocation a() {
        return c;
    }

    public void a(wp_1 wp_12, boolean bl) {
        ek_2.a(this.a(wp_12), bl);
    }
}

