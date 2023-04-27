/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import deobf.SkinManager;
import java.awt.image.BufferedImage;
import net.ResourceLocation;
import net.a9F;
import net.aom_1;
import net.azz_2;

/*
 * Renamed from net.aft
 */
class aft_1
implements a9F {
    ResourceLocation a;
    a9F b;
    MinecraftProfileTexture.Type c;
    azz_2 d;
    SkinManager f;
    MinecraftProfileTexture e;

    aft_1(SkinManager skinManager, a9F a9F2, azz_2 azz_22, MinecraftProfileTexture.Type type, ResourceLocation resourceLocation, MinecraftProfileTexture minecraftProfileTexture) {
        this.f = skinManager;
        this.b = a9F2;
        this.d = azz_22;
        this.c = type;
        this.a = resourceLocation;
        this.e = minecraftProfileTexture;
    }

    @Override
    public BufferedImage a(BufferedImage bufferedImage) {
        return this.b != null ? this.b.a(bufferedImage) : bufferedImage;
    }

    @Override
    public void a() {
        if (this.b != null) {
            this.b.a();
        }
        if (this.d != null) {
            aom_1.a(this.d, this.c, this.a, this.e);
        }
    }
}

