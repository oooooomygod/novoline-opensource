/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import java.net.URI;
import net.I18n;
import net.QG;
import net.ResourceLocation;
import net.VT;
import net.ara_2;
import net.awu_1;
import net.pv_1;
import org.apache.logging.log4j.Logger;

public class RG
extends GuiScreen {
    private static Logger w = LogManagerInvoker.c();
    private static ResourceLocation v = new ResourceLocation(pv_1.i);

    @Override
    public void h() {
        super.h();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), v);
        int n = (this.n - 248) / 2;
        int n2 = (this.f - 166) / 2;
        this.c(n, n2, 0, 0, 248, 166);
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        int n3 = (this.n - 248) / 2 + 10;
        int n4 = (this.f - 166) / 2 + 8;
        FontRendererInvoker.a(this.q, I18n.format(pv_1.e, new Object[0]), n3, n4, 0x1F1F1F);
        GameSettings gameSettings = this.t.gameSettings;
        FontRendererInvoker.a(this.q, I18n.format(pv_1.m, new Object[]{awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.cd)), awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.ac)), awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.L)), awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.ab))}), n3, n4 += 12, 0x4F4F4F);
        FontRendererInvoker.a(this.q, I18n.format(pv_1.n, new Object[0]), n3, n4 + 12, 0x4F4F4F);
        FontRendererInvoker.a(this.q, I18n.format(pv_1.j, new Object[]{awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.bo))}), n3, n4 + 24, 0x4F4F4F);
        FontRendererInvoker.a(this.q, I18n.format(pv_1.b, new Object[]{awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.a0))}), n3, n4 + 36, 0x4F4F4F);
        FontRendererInvoker.a(this.q, I18n.format(pv_1.f, new Object[0]), n3, n4 + 68, 218, 0x1F1F1F);
        super.a(n, n2, f);
    }

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        ListInvoker.add(this.l, new QG(1, this.n / 2 - 116, this.f / 2 + 62 + -16, 114, 20, I18n.format(pv_1.l, new Object[0])));
        ListInvoker.add(this.l, new QG(2, this.n / 2 + 2, this.f / 2 + 62 + -16, 114, 20, I18n.format(pv_1.h, new Object[0])));
    }

    @Override
    public void g() {
        super.g();
    }

    @Override
    protected void a(QG qG) throws IOException {
        switch (qG.m) {
            case 1: {
                qG.g = false;
                try {
                    Class clazz = ara_2.a(pv_1.c);
                    Object object = VT.a(ara_2.a(clazz, pv_1.d, new Class[0]), null, new Object[0]);
                    VT.a(ara_2.a(clazz, pv_1.k, new Class[]{URI.class}), object, new Object[]{new URI(pv_1.g)});
                }
                catch (Throwable throwable) {
                    LoggerInvoker.a(w, pv_1.a, throwable);
                }
                break;
            }
            case 2: {
                MCInvoker.displayGuiScreen(this.t, null);
                MCInvoker.r(this.t);
            }
        }
    }
}

