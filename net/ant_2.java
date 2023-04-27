/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.client.entity.AbstractClientPlayer;
import java.awt.image.BufferedImage;

/*
 * Renamed from net.ant
 */
class ant_2
implements a9F {
    avc_2 b;
    ResourceLocation a;
    AbstractClientPlayer c;

    ant_2(AbstractClientPlayer abstractClientPlayer, ResourceLocation resourceLocation) {
        this.c = abstractClientPlayer;
        this.a = resourceLocation;
        this.b = new avc_2();
    }

    @Override
    public BufferedImage a(BufferedImage bufferedImage) {
        return af2_0.a(bufferedImage);
    }

    @Override
    public void a() {
        aUi.a(this.c, this.a);
    }
}

