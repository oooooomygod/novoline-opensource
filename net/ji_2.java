/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.I1;
import net.RenderManager;
import net.ResourceLocation;
import net.jo_0;
import net.ni_2;
import net.rl_1;

/*
 * Renamed from net.ji
 */
public class ji_2
extends jo_0<ni_2> {
    private static ResourceLocation m = new ResourceLocation(I1.a);

    protected float b(ni_2 ni_22) {
        return 180.0f;
    }

    @Override
    protected ResourceLocation a(ni_2 ni_22) {
        return m;
    }

    public ji_2(RenderManager renderManager) {
        super(renderManager, new rl_1(), 0.3f);
    }
}

