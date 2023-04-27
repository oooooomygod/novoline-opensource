/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.PE;
import net.RenderManager;
import net.ResourceLocation;
import net.ayg_0;
import net.jf_1;
import net.mr_1;
import net.n__0;
import net.ru_1;

/*
 * Renamed from net.jZ
 */
public class jz_1
extends jf_1<n__0> {
    private static ResourceLocation p = new ResourceLocation(PE.a);

    @Override
    protected ResourceLocation a(n__0 n__02) {
        return p;
    }

    public jz_1(RenderManager renderManager) {
        super(renderManager, new ru_1(), 0.5f, 1.0f);
        this.b(new mr_1(this));
        this.b(new ayg_0(this, this));
    }
}

