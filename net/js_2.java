/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.RenderManager;
import net.ResourceLocation;
import net.aVO;
import net.jo_0;
import net.ns_1;
import net.rf_2;

/*
 * Renamed from net.js
 */
public class js_2
extends jo_0<ns_1> {
    private static ResourceLocation m = new ResourceLocation(aVO.a);

    public js_2(RenderManager renderManager) {
        super(renderManager, new rf_2(), 0.3f);
    }

    protected float b(ns_1 ns_12) {
        return 180.0f;
    }

    @Override
    protected ResourceLocation a(ns_1 ns_12) {
        return m;
    }
}

