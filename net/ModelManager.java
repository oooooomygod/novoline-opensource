/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.renderer.texture.TextureMap;

public class ModelManager
implements IResourceManagerReloadListener {
    private TextureMap d;
    private JE c;
    private NZ<aRJ, JE> b;
    private atF a;

    public JE a(aRJ aRJ2) {
        return this.c;
    }

    public ModelManager(TextureMap textureMap) {
        this.d = textureMap;
        this.a = new atF(this);
    }

    public TextureMap a() {
        return this.d;
    }

    public JE b() {
        return this.c;
    }

    @Override
    public void b(aI_ aI_2) {
        apy_1 apy_12 = new apy_1(aI_2, this.d, this.a);
        this.b = wl_0.a(apy_12);
        this.c = (JE)axp_0.a(this.b, apy_1.d);
        ap__0.c(this.a);
    }

    public atF c() {
        return this.a;
    }
}

