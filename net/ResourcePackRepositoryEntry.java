/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.IResourcePack;
import net.minecraft.resources.ResourcePackRepository;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public class ResourcePackRepositoryEntry {
    private BufferedImage a;
    private IResourcePack f;
    ResourcePackRepository d;
    private File c;
    private ResourceLocation b;
    private aqd_0 e;

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String c() {
        return avv_0.b(this.f);
    }

    public boolean equals(Object object) {
        return this == object || object instanceof ResourcePackRepositoryEntry && this.toString().equals(object.toString());
    }

    private ResourcePackRepositoryEntry(ResourcePackRepository resourcePackRepository, File file) {
        this.d = resourcePackRepository;
        this.c = file;
    }

    ResourcePackRepositoryEntry(ResourcePackRepository resourcePackRepository, File file, alj_0 alj_02) {
        this(resourcePackRepository, file);
    }

    public int b() {
        return WS.a(this.e);
    }

    public void a(TextureManager textureManager) {
        if (this.b == null) {
            this.b = TextureManagerInvoker.getDynamicTextureLocation(textureManager, KP.e, new DynamicTexture(this.a));
        }
        TextureManagerInvoker.bindTexture(textureManager, this.b);
    }

    public void a() {
        if (this.f instanceof Closeable) {
            IOUtilsInvoker.a((Closeable)((Object)this.f));
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public String toString() {
        return StringInvoker.a(KP.a, new Object[]{zq_2.q(this.c), zq_2.r(this.c) ? KP.b : KP.c, lx_2.b(zq_2.k(this.c))});
    }

    public IResourcePack e() {
        return this.f;
    }

    public void d() throws IOException {
        this.f = zq_2.r(this.c) ? new aug_1(this.c) : new aui_0(this.c);
        this.e = (aqd_0)avv_0.a(this.f, this.d.c, KP.d);
        try {
            this.a = avv_0.a(this.f);
        }
        catch (IOException iOException) {}
        if (this.a == null) {
            this.a = avv_0.a(this.d.b);
        }
        this.a();
    }

    public String f() {
        return this.e == null ? aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), KP.f).toString() : aBO.a(WS.b(this.e));
    }
}

