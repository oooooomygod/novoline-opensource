/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.client.entity.AbstractClientPlayer;
import java.awt.image.BufferedImage;
import java.lang.ref.WeakReference;

/*
 * Renamed from net.hm
 */
public class hm_2
implements a9F {
    public WeakReference a;
    public ResourceLocation c;
    public avc_2 b;

    @Override
    public void a() {
    }

    public BufferedImage b(BufferedImage bufferedImage) {
        return xv_2.a(bufferedImage);
    }

    public void b() {
        aP2.b();
        AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)e7_0.a(this.a);
        if (abstractClientPlayer != null) {
            aUi.a(abstractClientPlayer, this.c);
        }
    }

    public hm_2(AbstractClientPlayer abstractClientPlayer, ResourceLocation resourceLocation) {
        this.a = new WeakReference<AbstractClientPlayer>(abstractClientPlayer);
        this.c = resourceLocation;
        this.b = new avc_2();
    }

    @Override
    public BufferedImage a(BufferedImage bufferedImage) {
        return null;
    }
}

