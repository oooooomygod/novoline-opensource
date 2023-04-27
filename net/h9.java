/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.renderer.texture.TextureMap;

public class h9 {
    private static int[] b;

    public static int e(TextureMap textureMap) {
        return textureMap.e();
    }

    public static void a(TextureMap textureMap, aI_ aI_2, adi_0 adi_02) {
        textureMap.a(aI_2, adi_02);
    }

    public static KM a(TextureMap textureMap, String string) {
        return textureMap.d(string);
    }

    public static KM a(TextureMap textureMap, ResourceLocation resourceLocation) {
        return textureMap.b(resourceLocation);
    }

    public static KM a(TextureMap textureMap, double d, double d2) {
        return textureMap.a(d, d2);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void a(TextureMap textureMap, int n) {
        textureMap.b(n);
    }

    public static boolean d(TextureMap textureMap) {
        return textureMap.i();
    }

    public static int c(TextureMap textureMap) {
        return textureMap.b();
    }

    public static ResourceLocation a(TextureMap textureMap, ResourceLocation resourceLocation, int n) {
        return textureMap.a(resourceLocation, n);
    }

    public static aG6 b(TextureMap textureMap) {
        return textureMap.b();
    }

    public static int[] b() {
        return b;
    }

    static {
        if (h9.b() != null) {
            h9.b(new int[1]);
        }
    }

    public static KM a(TextureMap textureMap) {
        return textureMap.d();
    }

    public static KM b(TextureMap textureMap, String string) {
        return textureMap.c(string);
    }

    public static void a(TextureMap textureMap, boolean bl, boolean bl2) {
        textureMap.b(bl, bl2);
    }
}

