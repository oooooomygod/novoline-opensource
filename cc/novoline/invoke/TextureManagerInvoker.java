/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.renderer.texture.DynamicTexture;
import deobf.ITextureObject;
import net.ITickableTextureObject;
import net.ResourceLocation;
import net.TextureManager;

public class TextureManagerInvoker {
    private static int b;

    public static void a(TextureManager textureManager, ResourceLocation resourceLocation) {
        textureManager.d(resourceLocation);
    }

    public static void b(int n) {
        b = n;
    }

    public static boolean a(TextureManager textureManager, ResourceLocation resourceLocation, ITickableTextureObject iTickableTextureObject) {
        return textureManager.a(resourceLocation, iTickableTextureObject);
    }

    public static ResourceLocation getDynamicTextureLocation(TextureManager textureManager, String string, DynamicTexture dynamicTexture) {
        return textureManager.a(string, dynamicTexture);
    }

    public static ITextureObject b(TextureManager textureManager, ResourceLocation resourceLocation) {
        return textureManager.a(resourceLocation);
    }

    public static boolean a(TextureManager textureManager, ResourceLocation resourceLocation, ITextureObject iTextureObject) {
        return textureManager.a(resourceLocation, iTextureObject);
    }

    public static void a(TextureManager textureManager) {
        textureManager.b();
    }

    public static int b() {
        return b;
    }

    public static int a() {
        TextureManagerInvoker.b();
        return 109;
    }

    public static void b(TextureManager textureManager) {
        textureManager.a();
    }

    static {
        if (TextureManagerInvoker.b() != 0) {
            TextureManagerInvoker.b(60);
        }
    }

    public static void bindTexture(TextureManager textureManager, ResourceLocation resourceLocation) {
        textureManager.b(resourceLocation);
    }
}

