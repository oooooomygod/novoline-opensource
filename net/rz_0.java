/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.Charsets
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.SessionInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.GuiScreen;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.network.packts.C16PacketClientStatus;
import net.minecraft.network.packts.C16PacketClientStatus$EnumState;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.Rz
 */
public class rz_0
extends GuiScreen {
    private List<String> z;
    private int y;
    private float w = 0.5f;
    private static Logger x = LogManagerInvoker.c();
    private static ResourceLocation v = new ResourceLocation(avi_0.a);
    private static ResourceLocation B = new ResourceLocation(avi_0.o);
    private int A;

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public void a(int n, int n2, float f) {
        int n3;
        this.b(n, n2, f);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        int n4 = this.n / 2 - 137;
        int n5 = this.f + 50;
        float f2 = -((float)this.y + f) * this.w;
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate(0.0f, f2, 0.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), v);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.c(n4, n5, 0, 0, 155, 44);
        this.c(n4 + 155, n5, 0, 45, 155, 44);
        int n6 = n5 + 200;
        for (n3 = 0; n3 < ListInvoker.size(this.z); ++n3) {
            float f3;
            if (n3 == ListInvoker.size(this.z) - 1 && (f3 = (float)n6 + f2 - (float)(this.f / 2 - 6)) < 0.0f) {
                GlStateManagerInvoker.translate(0.0f, -f3, 0.0f);
            }
            if ((float)n6 + f2 + 12.0f + 8.0f > 0.0f && (float)n6 + f2 < (float)this.f) {
                String string = (String)ListInvoker.get(this.z, n3);
                if (StringInvoker.e(string, avi_0.j)) {
                    FontRendererInvoker.drawStringWithShadow(this.q, StringInvoker.a(string, 3), n4 + (274 - FontRendererInvoker.a(this.q, StringInvoker.a(string, 3))) / 2, n6, 0xFFFFFF);
                } else {
                    a5_0.a(this.q.p, (long)n3 * 4238972211L + (long)(this.y / 4));
                    FontRendererInvoker.drawStringWithShadow(this.q, string, n4, n6, 0xFFFFFF);
                }
            }
            n6 += 12;
        }
        GlStateManagerInvoker.popMatrix();
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), B);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(0, 769);
        n3 = this.n;
        int n7 = this.f;
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, n7, zLevel), 0.0, 1.0), 1.0f, 1.0f, 1.0f, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n7, zLevel), 1.0, 1.0), 1.0f, 1.0f, 1.0f, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, 0.0, zLevel), 1.0, 0.0), 1.0f, 1.0f, 1.0f, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, zLevel), 0.0, 0.0), 1.0f, 1.0f, 1.0f, 1.0f));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.disableBlend();
        super.a(n, n2, f);
    }

    @Override
    public void l() {
        if (this.z == null) {
            this.z = my_0.c();
            try {
                String string;
                String string2 = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), avi_0.i), (Object)anw_0.WHITE), (Object)anw_0.OBFUSCATED), (Object)anw_0.GREEN), (Object)anw_0.AQUA).toString();
                InputStream inputStream = dw_0.b(j6_0.b(MCInvoker.x(this.t), new ResourceLocation(avi_0.h)));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
                Random random = new Random(8124371L);
                while ((string = auq_0.c(bufferedReader)) != null) {
                    string = StringInvoker.a(string, avi_0.l, SessionInvoker.getUsername(MCInvoker.y(this.t)));
                    while (StringInvoker.a(string, (CharSequence)string2)) {
                        int n = StringInvoker.b(string, string2);
                        String string3 = StringInvoker.b(string, 0, n);
                        String string4 = StringInvoker.a(string, n + StringInvoker.c(string2));
                        string = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string3), (Object)anw_0.WHITE), (Object)anw_0.OBFUSCATED), StringInvoker.b(avi_0.d, 0, a5_0.a(random, 4) + 3)), string4).toString();
                    }
                    ListInvoker.addAll(this.z, FontRendererInvoker.b(this.t.fontRendererObj, string, 274));
                    ListInvoker.add(this.z, avi_0.g);
                }
                aZ6.b(inputStream);
                int n = 0;
                while (true) {
                    ListInvoker.add(this.z, avi_0.b);
                    ++n;
                }
            }
            catch (Exception exception) {
                LoggerInvoker.a(x, avi_0.e, exception);
            }
        }
    }

    private void b(int n, int n2, float f) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), Gui.a);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
        int n3 = this.n;
        float f2 = 0.0f - ((float)this.y + f) * 0.5f * this.w;
        float f3 = (float)this.f - ((float)this.y + f) * 0.5f * this.w;
        float f4 = ((float)this.y + f - 0.0f) * 0.02f;
        float f5 = (float)(this.A + this.f + this.f + 24) / this.w;
        float f6 = (f5 - 20.0f - ((float)this.y + f)) * 0.005f;
        if (f6 < f4) {
            f4 = f6;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        f4 *= f4;
        f4 = f4 * 96.0f / 255.0f;
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, this.f, zLevel), 0.0, f2 * 0.015625f), f4, f4, f4, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, this.f, zLevel), (float)n3 * 0.015625f, f2 * 0.015625f), f4, f4, f4, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, 0.0, zLevel), (float)n3 * 0.015625f, f3 * 0.015625f), f4, f4, f4, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, zLevel), 0.0, f3 * 0.015625f), f4, f4, f4, 1.0f));
        TessellatorInvoker.draw(tessellator);
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (n == 1) {
            this.a();
        }
    }

    @Override
    public void g() {
        MusicTicker musicTicker = MCInvoker.U(this.t);
        SoundHandler soundHandler = MCInvoker.l(this.t);
        if (this.y == 0) {
            aP9.a(musicTicker);
            aP9.a(musicTicker, if_0.CREDITS);
            SoundHandlerInvoker.d(soundHandler);
        }
        SoundHandlerInvoker.a(soundHandler);
        ++this.y;
        float f = (float)(this.A + this.f + this.f + 24) / this.w;
        if ((float)this.y > f) {
            this.a();
        }
    }

    private void a() {
        aDM.a(this.t.player.connection, new C16PacketClientStatus(C16PacketClientStatus$EnumState.PERFORM_RESPAWN));
        MCInvoker.displayGuiScreen(this.t, null);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

