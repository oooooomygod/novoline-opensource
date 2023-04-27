/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import com.mojang.authlib.GameProfile;
import deobf.IChatComponent;
import deobf.MCInvoker;
import net.minecraft.network.packts.C18PacketSpectate;
import net.ChatComponentText;

/*
 * Renamed from net.f6
 */
public class f6_0
implements dp_1 {
    private GameProfile b;
    private ResourceLocation a;

    @Override
    public void a(aee_2 aee_22) {
        aDM.a(MCInvoker.aa(MCInvoker.f()), new C18PacketSpectate(a4Z.a(this.b)));
    }

    public f6_0(GameProfile gameProfile) {
        this.b = gameProfile;
        this.a = aUi.a(a4Z.d(gameProfile));
        aUi.a(this.a, a4Z.d(gameProfile));
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void a(float f, int n) {
        TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), this.a);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, (float)n / 255.0f);
        wh_1.a(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        wh_1.a(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
    }

    @Override
    public IChatComponent b() {
        return new ChatComponentText(a4Z.d(this.b));
    }
}

