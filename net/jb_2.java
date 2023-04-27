/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.RenderManager;
import net.ResourceLocation;
import net.Y8;
import net.az5_0;
import net.jo_0;
import net.n9_0;
import net.rd_2;

/*
 * Renamed from net.jb
 */
public class jb_2<T extends n9_0>
extends jo_0<T> {
    private static ResourceLocation m = new ResourceLocation(Y8.a);

    protected ResourceLocation b(T t) {
        return m;
    }

    @Override
    protected float a(T t) {
        return 180.0f;
    }

    public jb_2(RenderManager renderManager) {
        super(renderManager, new rd_2(), 1.0f);
        this.b(new az5_0(this));
    }
}

