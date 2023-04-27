/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.RenderManager;
import net.ResourceLocation;
import net.a9t_0;
import net.jo_0;
import net.nt_2;
import net.r7_0;

/*
 * Renamed from net.jq
 */
public class jq_2
extends jo_0<nt_2> {
    private static ResourceLocation m = new ResourceLocation(a9t_0.a);

    @Override
    protected ResourceLocation a(nt_2 nt_22) {
        return m;
    }

    public jq_2(RenderManager renderManager) {
        super(renderManager, new r7_0(), 0.5f);
    }
}

