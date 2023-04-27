/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.ITextureObject;
import java.awt.image.BufferedImage;

/*
 * Renamed from net.ahf
 */
public class ahf_1 {
    public static int a(int n, BufferedImage bufferedImage, boolean bl, boolean bl2, aI_ aI_2, ResourceLocation resourceLocation, aG6 aG62) {
        a3c_0.ae();
        int n2 = OL.a(n, bufferedImage, bl, bl2, aI_2, resourceLocation, aG62);
        ListInvoker.b(new ListInvoker[2]);
        return n2;
    }

    public static aG6 a(AbstractTexture abstractTexture) {
        return OL.a(abstractTexture);
    }

    public static void a(TextureManager textureManager, ResourceLocation resourceLocation) {
        OL.a(textureManager, resourceLocation);
    }

    public static void a(AbstractTexture abstractTexture, int n) {
        OL.a(abstractTexture, n);
    }

    public static void a(int n, int n2, int n3, DynamicTexture dynamicTexture) {
        OL.a(n, n2, n3, dynamicTexture);
    }

    public static void a(aG6 aG62, int[] nArray, int n, int n2, boolean bl, boolean bl2) {
        OL.a(aG62, nArray, n, n2, bl, bl2);
    }

    public static void a(int n, int[] nArray, int n2, int n3, DynamicTexture dynamicTexture) {
        OL.a(n, nArray, n2, n3, dynamicTexture);
    }

    public static ITextureObject a() {
        return OL.a();
    }

    public static void a(ITextureObject iTextureObject) {
        OL.a(iTextureObject);
    }

    public static void a(aG6 aG62) {
        OL.a(aG62);
    }

    public static int[] a(int n, int n2) {
        return OL.c(n, n2);
    }

    public static void a(int[][] nArray, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        a3c_0.ae();
        OL.b(nArray, n, n2, n3, n4, bl, bl2);
        if (ListInvoker.b() != null) {
            a3c_0.b("SHa6uc");
        }
    }
}

