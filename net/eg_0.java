/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.FontRenderer;
import deobf.TileEntity;
import net.ResourceLocation;
import net.TextureManager;
import net.World;
import net.aA1;
import net.hq_0;

/*
 * Renamed from net.eG
 */
public abstract class eg_0<T extends TileEntity> {
    protected hq_0 b;
    protected static ResourceLocation[] a = new ResourceLocation[]{new ResourceLocation(aA1.i), new ResourceLocation(aA1.d), new ResourceLocation(aA1.g), new ResourceLocation(aA1.b), new ResourceLocation(aA1.c), new ResourceLocation(aA1.a), new ResourceLocation(aA1.e), new ResourceLocation(aA1.h), new ResourceLocation(aA1.j), new ResourceLocation(aA1.f)};

    public boolean a() {
        return false;
    }

    protected World b() {
        return this.b.g;
    }

    public FontRenderer c() {
        return this.b.a();
    }

    protected void a(ResourceLocation resourceLocation) {
        TextureManager textureManager = this.b.i;
        textureManager.b(resourceLocation);
    }

    public void a(hq_0 hq_02) {
        this.b = hq_02;
    }

    public abstract void a(T var1, double var2, double var4, double var6, float var8, int var9);
}

