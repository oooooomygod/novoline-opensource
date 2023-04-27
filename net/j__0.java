/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.RenderManager;
import net.ResourceLocation;
import net.XE;
import net.avr_1;
import net.jo_0;
import net.nh_1;
import net.q1_0;

/*
 * Renamed from net.j_
 */
public class j__0
extends jo_0<nh_1> {
    private static ResourceLocation m = new ResourceLocation(XE.a);

    @Override
    protected ResourceLocation a(nh_1 nh_12) {
        return m;
    }

    public j__0(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager, q1_02, f);
        this.b(new avr_1(this));
    }
}

