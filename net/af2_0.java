/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;
import deobf.ITextureObject;
import deobf.MCInvoker;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Iterator;

/*
 * Renamed from net.af2
 */
public class af2_0 {
    public static void a(AbstractClientPlayer abstractClientPlayer) {
        String string = aUi.g(abstractClientPlayer);
        if (!StringInvoker.g(string)) {
            Object object;
            Object object2;
            String string2 = aL0.a(aL0.a(aL0.a(new StringBuilder(), _W.a), string), _W.c).toString();
            Object object3 = ListInvoker.iterator(aGR.a(NovolineInvoker.n(NovolineInvoker.getInstance())));
            while (dz_0.c((Iterator)object3)) {
                object2 = (UX)dz_0.b((Iterator)object3);
                if (!aqp_1.b((UX)object2).equals(string)) continue;
                string2 = aL0.c(aL0.a(new StringBuilder(), _W.d), aqp_1.a((UX)object2)).toString();
                ea_1.a(System.out, aqp_1.b((UX)object2));
                break;
            }
            object3 = ao8_0.a(string2);
            object2 = new ResourceLocation(aL0.a(aL0.a(new StringBuilder(), _W.b), (String)object3).toString());
            TextureManager textureManager = MCInvoker.E(MCInvoker.f());
            ITextureObject iTextureObject = TextureManagerInvoker.b(textureManager, (ResourceLocation)object2);
            if (iTextureObject instanceof J5) {
                object = (J5)iTextureObject;
                if (((J5)object).j != null) {
                    if (auk_2.a(((J5)object).j)) {
                        aUi.a(abstractClientPlayer, (ResourceLocation)object2);
                    }
                    return;
                }
            }
            object = new ant_2(abstractClientPlayer, (ResourceLocation)object2);
            J5 j5 = new J5(null, string2, null, (a9F)object);
            j5.s = true;
            TextureManagerInvoker.a(textureManager, (ResourceLocation)object2, j5);
        }
    }

    public static BufferedImage a(BufferedImage bufferedImage) {
        aP2.b();
        int n = 64;
        int n2 = 32;
        int n3 = jj_0.f(bufferedImage);
        int n4 = jj_0.d(bufferedImage);
        if (n < n3 || n2 < n4) {
            n *= 2;
            n2 *= 2;
        }
        BufferedImage bufferedImage2 = new BufferedImage(n, n2, 2);
        Graphics graphics = jj_0.c(bufferedImage2);
        abg_0.a(graphics, bufferedImage, 0, 0, null);
        abg_0.a(graphics);
        return bufferedImage2;
    }
}

