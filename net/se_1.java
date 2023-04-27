/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import com.google.gson.JsonParseException;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.IResourcePack;
import deobf.MCInvoker;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.sE
 */
public class se_1
extends sg_1 {
    private ResourceLocation h;
    private static Logger i = LogManagerInvoker.c();
    private IResourcePack g;

    @Override
    protected boolean c() {
        return false;
    }

    @Override
    protected int e() {
        return 1;
    }

    @Override
    protected boolean g() {
        return false;
    }

    @Override
    protected boolean b() {
        return false;
    }

    @Override
    protected boolean h() {
        return false;
    }

    public se_1(RB rB) {
        super(rB);
        DynamicTexture dynamicTexture;
        this.g = MCInvoker.D((Minecraft)this.c).b;
        try {
            dynamicTexture = new DynamicTexture(avv_0.a(this.g));
        }
        catch (IOException iOException) {
            dynamicTexture = aIZ.d;
        }
        this.h = TextureManagerInvoker.getDynamicTextureLocation(MCInvoker.E(this.c), aWN.e, dynamicTexture);
    }

    @Override
    protected boolean a() {
        return false;
    }

    @Override
    protected String d() {
        try {
            aqd_0 aqd_02 = (aqd_0)avv_0.a(this.g, MCInvoker.D((Minecraft)this.c).c, aWN.a);
            return aBO.a(WS.b(aqd_02));
        }
        catch (JsonParseException | IOException throwable) {
            LoggerInvoker.a(i, aWN.c, throwable);
            return aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), aWN.d).toString();
        }
    }

    @Override
    protected String i() {
        return aWN.b;
    }

    @Override
    protected void f() {
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.c), this.h);
    }
}

