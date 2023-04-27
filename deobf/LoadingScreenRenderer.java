/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.ThreadInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import net.minecraft.client.Minecraft;
import net.Gui;
import net.IProgressUpdate;
import net.ScaledResolution;
import net.ajQ;
import net.hw_2;
import net.minecraft.renderer.WorldRenderer;

public class LoadingScreenRenderer
implements IProgressUpdate {
    private ScaledResolution e;
    private String d;
    private boolean b;
    private long c;
    private Framebuffer g;
    private String f = ajQ.b;
    private Minecraft a;

    @Override
    public void a(int n) {
        if (!this.a.Q) {
            if (!this.b) {
                throw new hw_2();
            }
        } else {
            long l4 = MCInvoker.a();
            if (l4 - this.c >= 100L) {
                this.c = l4;
                ScaledResolution scaledResolution = new ScaledResolution(this.a);
                int n2 = ScaledResolutionInvoker.getScaleFactor(scaledResolution);
                int n3 = ScaledResolutionInvoker.getScaledWidth(scaledResolution);
                int n4 = ScaledResolutionInvoker.i(scaledResolution);
                if (OpenGlHelper.g()) {
                    FramebufferInvoker.a(this.g);
                } else {
                    GlStateManagerInvoker.clear(256);
                }
                FramebufferInvoker.bindFramebuffer(this.g, false);
                GlStateManagerInvoker.matrixMode(5889);
                GlStateManagerInvoker.loadIdentity();
                GlStateManagerInvoker.ortho(0.0, ScaledResolutionInvoker.e(scaledResolution), ScaledResolutionInvoker.d(scaledResolution), 0.0, 100.0, 300.0);
                GlStateManagerInvoker.matrixMode(5888);
                GlStateManagerInvoker.loadIdentity();
                GlStateManagerInvoker.translate(0.0f, 0.0f, -200.0f);
                if (!OpenGlHelper.g()) {
                    GlStateManagerInvoker.clear(16640);
                }
                Tessellator tessellator = TessellatorInvoker.getInstance();
                WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
                TextureManagerInvoker.bindTexture(MCInvoker.E(this.a), Gui.a);
                float f = 32.0f;
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, n4, 0.0), 0.0, (float)n4 / f), 64, 64, 64, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n4, 0.0), (float)n3 / f, (float)n4 / f), 64, 64, 64, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, 0.0, 0.0), (float)n3 / f, 0.0), 64, 64, 64, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, 0.0), 0.0, 0.0), 64, 64, 64, 255));
                TessellatorInvoker.draw(tessellator);
                int n5 = 100;
                int n6 = 2;
                int n7 = n3 / 2 - n5 / 2;
                int n8 = n4 / 2 + 16;
                GlStateManagerInvoker.disableTexture2D();
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n7, n8, 0.0), 128, 128, 128, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n7, n8 + n6, 0.0), 128, 128, 128, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n7 + n5, n8 + n6, 0.0), 128, 128, 128, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n7 + n5, n8, 0.0), 128, 128, 128, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n7, n8, 0.0), 128, 255, 128, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n7, n8 + n6, 0.0), 128, 255, 128, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n7 + n, n8 + n6, 0.0), 128, 255, 128, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n7 + n, n8, 0.0), 128, 255, 128, 255));
                TessellatorInvoker.draw(tessellator);
                GlStateManagerInvoker.enableTexture2D();
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(770, 771, 1, 0);
                FontRendererInvoker.drawStringWithShadow(this.a.fontRendererObj, this.d, (n3 - FontRendererInvoker.a(this.a.fontRendererObj, this.d)) / 2, n4 / 2 - 4 - 16, 0xFFFFFF);
                FontRendererInvoker.drawStringWithShadow(this.a.fontRendererObj, this.f, (n3 - FontRendererInvoker.a(this.a.fontRendererObj, this.f)) / 2, n4 / 2 - 4 + 8, 0xFFFFFF);
                FramebufferInvoker.unbindFramebuffer(this.g);
                if (OpenGlHelper.g()) {
                    FramebufferInvoker.framebufferRender(this.g, n3 * n2, n4 * n2);
                }
                MCInvoker.b(this.a);
                try {
                    ThreadInvoker.yield();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    private void d(String string) {
        this.d = string;
        if (this.a.Q) {
            GlStateManagerInvoker.clear(256);
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.loadIdentity();
            if (OpenGlHelper.g()) {
                int n = ScaledResolutionInvoker.getScaleFactor(this.e);
                GlStateManagerInvoker.ortho(0.0, ScaledResolutionInvoker.getScaledWidth(this.e) * n, ScaledResolutionInvoker.i(this.e) * n, 0.0, 100.0, 300.0);
            } else {
                ScaledResolution scaledResolution = new ScaledResolution(this.a);
                GlStateManagerInvoker.ortho(0.0, ScaledResolutionInvoker.e(scaledResolution), ScaledResolutionInvoker.d(scaledResolution), 0.0, 100.0, 300.0);
            }
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.translate(0.0f, 0.0f, -200.0f);
        } else if (!this.b) {
            throw new hw_2();
        }
    }

    @Override
    public void a(String string) {
        this.b = false;
        this.d(string);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public LoadingScreenRenderer(Minecraft minecraft) {
        this.d = ajQ.a;
        this.c = MCInvoker.a();
        this.a = minecraft;
        this.e = new ScaledResolution(minecraft);
        this.g = new Framebuffer(minecraft.displayWidth, minecraft.displayHeight, false);
        FramebufferInvoker.a(this.g, 9728);
    }

    @Override
    public void b() {
    }

    @Override
    public void c(String string) {
        this.b = true;
        this.d(string);
    }

    @Override
    public void b(String string) {
        if (!this.a.Q) {
            if (!this.b) {
                throw new hw_2();
            }
        } else {
            this.c = 0L;
            this.f = string;
            this.a(-1);
            this.c = 0L;
        }
    }
}

