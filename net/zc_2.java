/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.Map;
import net.G2;
import net.ResourceLocation;
import net.ajZ;
import net.zg_2;

/*
 * Renamed from net.zc
 */
public class zc_2
extends zg_2<ResourceLocation, ajZ> {
    private Map<ResourceLocation, ajZ> c;

    public void a() {
        MapInvoker.d(this.c);
    }

    @Override
    public void a(ajZ ajZ2) {
        this.a(G2.b(ajZ2), ajZ2);
    }

    @Override
    protected Map<ResourceLocation, ajZ> a() {
        this.c = MapsInvoker.a();
        return this.c;
    }
}

