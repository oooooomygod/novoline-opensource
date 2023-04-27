/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.RenderManager;
import net.ResourceLocation;
import net.ayy_1;
import net.jo_0;
import net.na_2;
import net.q1_0;

/*
 * Renamed from net.jz
 */
public class jz_2
extends jo_0<na_2> {
    private static ResourceLocation m = new ResourceLocation(ayy_1.a);

    public jz_2(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager, q1_02, f);
    }

    @Override
    protected ResourceLocation a(na_2 na_22) {
        return m;
    }
}

