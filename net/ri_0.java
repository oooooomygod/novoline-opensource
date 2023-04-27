/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.SessionInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.block.Block;
import net.minecraft.stats.Achievement;
import net.minecraft.init.Blocks;
import deobf.GuiScreen;
import deobf.MCInvoker;
import net.minecraft.renderer.texture.TextureMap;
import net.minecraft.network.packts.C16PacketClientStatus;
import net.minecraft.network.packts.C16PacketClientStatus$EnumState;
import java.io.IOException;
import java.util.Random;

/*
 * Renamed from net.Ri
 */
public class ri_0
extends GuiScreen
implements a4i_0 {
    protected GuiScreen x;
    private static int K;
    private int G;
    protected double H;
    protected float L = 1.0f;
    private static int M;
    private StatFileWriter y;
    protected double J;
    protected double z;
    private static int E;
    protected int C;
    protected double w;
    private boolean B = true;
    private static ResourceLocation v;
    protected int A = 256;
    protected double F;
    protected int N;
    protected int D = 202;
    protected double I;
    private static int O;

    @Override
    public void a() {
        if (this.B) {
            this.B = false;
        }
    }

    public ri_0(GuiScreen guiScreen, StatFileWriter statFileWriter) {
        this.x = guiScreen;
        this.y = statFileWriter;
        int n = 141;
        int n2 = 141;
        this.z = this.F = (double)(apf_0.m.o * 24 - n / 2 - 12);
        this.I = this.F;
        this.w = this.J = (double)(apf_0.m.q * 24 - n2 / 2);
        this.H = this.J;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(int n, int n2, float f) {
        if (this.B) {
            this.h();
            this.b(this.q, I18n.format(aP3.a, new Object[0]), this.n / 2, this.f / 2, 0xFFFFFF);
            this.b(this.q, a[(int)(MCInvoker.a() / 150L % (long)a.length)], this.n / 2, this.f / 2 + FontRendererInvoker.d(this.q) * 2, 0xFFFFFF);
        } else {
            int n3;
            if (MouseInvoker.c(0)) {
                n3 = (this.n - this.A) / 2;
                int n4 = (this.f - this.D) / 2;
                int n5 = n3 + 8;
                int n6 = n4 + 17;
                if ((this.G == 0 || this.G == 1) && n >= n5 && n < n5 + 224 && n2 >= n6 && n2 < n6 + 155) {
                    if (this.G == 0) {
                        this.G = 1;
                    } else {
                        this.z -= (double)((float)(n - this.N) * this.L);
                        this.w -= (double)((float)(n2 - this.C) * this.L);
                        this.F = this.I = this.z;
                        this.J = this.H = this.w;
                    }
                    this.N = n;
                    this.C = n2;
                }
            } else {
                this.G = 0;
            }
            n3 = MouseInvoker.m();
            float f2 = this.L;
            this.L += 0.25f;
            this.L = MathHelper.b(this.L, 1.0f, 2.0f);
            if (this.L != f2) {
                float f3 = f2 - this.L;
                float f4 = f2 * (float)this.A;
                float f5 = f2 * (float)this.D;
                float f6 = this.L * (float)this.A;
                float f7 = this.L * (float)this.D;
                this.z -= (double)((f6 - f4) * 0.5f);
                this.w -= (double)((f7 - f5) * 0.5f);
                this.F = this.I = this.z;
                this.J = this.H = this.w;
            }
            if (this.F < (double)E) {
                this.F = E;
            }
            if (this.J < (double)O) {
                this.J = O;
            }
            if (this.F >= (double)K) {
                this.F = K - 1;
            }
            if (this.J >= (double)M) {
                this.J = M - 1;
            }
            this.h();
            this.b(n, n2, f);
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.disableDepth();
            this.b();
            GlStateManagerInvoker.D();
            GlStateManagerInvoker.enableDepth();
        }
    }

    protected void b(int n, int n2, float f) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = MathHelper.floor_double(this.I + (this.z - this.I) * (double)f);
        int n9 = MathHelper.floor_double(this.H + (this.w - this.H) * (double)f);
        if (n8 < E) {
            n8 = E;
        }
        if (n9 < O) {
            n9 = O;
        }
        if (n8 >= K) {
            n8 = K - 1;
        }
        if (n9 >= M) {
            n9 = M - 1;
        }
        int n10 = (this.n - this.A) / 2;
        int n11 = (this.f - this.D) / 2;
        int n12 = n10 + 16;
        int n13 = n11 + 17;
        zLevel = 0.0f;
        GlStateManagerInvoker.depthFunc(518);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate(n12, n13, -200.0f);
        GlStateManagerInvoker.c(1.0f / this.L, 1.0f / this.L, 0.0f);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.enableColorMaterial();
        int n14 = n8 + 288 >> 4;
        int n15 = n9 + 288 >> 4;
        int n16 = (n8 + 288) % 16;
        int n17 = (n9 + 288) % 16;
        Random random = new Random();
        float f2 = 16.0f / this.L;
        float f3 = 16.0f / this.L;
        int n18 = 0;
        while ((float)n18 * f2 - (float)n17 < 155.0f) {
            float f4 = 0.6f - (float)(n15 + n18) / 25.0f * 0.3f;
            GlStateManagerInvoker.color(f4, f4, f4, 1.0f);
            n7 = 0;
            while ((float)n7 * f3 - (float)n16 < 224.0f) {
                a5_0.a(random, (long)(SessionInvoker.getPlayerID(MCInvoker.y(this.t)).hashCode() + n14 + n7 + (n15 + n18) * 16));
                n6 = a5_0.a(random, 1 + n15 + n18) + (n15 + n18) / 2;
                KM kM = this.a(Blocks.sand);
                if (n6 <= 37 && n15 + n18 != 35) {
                    kM = n6 == 22 ? (a5_0.a(random, 2) == 0 ? this.a(Blocks.C) : this.a(Blocks.b5)) : (n6 == 10 ? this.a(Blocks.iron_ore) : (n6 == 8 ? this.a(Blocks.coal_ore) : (n6 > 4 ? this.a(Blocks.stone) : this.a(Blocks.dirt))));
                } else {
                    Block block = Blocks.bedrock;
                    kM = this.a(block);
                }
                TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), TextureMap.r);
                this.a(n7 * 16 - n16, n18 * 16 - n17, kM, 16, 16);
                ++n7;
            }
            ++n18;
        }
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.depthFunc(515);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), v);
        for (n18 = 0; n18 < ListInvoker.size(apf_0.G); ++n18) {
            Achievement achievement = (Achievement)ListInvoker.get(apf_0.G, n18);
            if (achievement.n == null) continue;
            n7 = achievement.o * 24 - n8 + 11;
            n6 = achievement.q * 24 - n9 + 11;
            int n19 = achievement.n.o * 24 - n8 + 11;
            int n20 = achievement.n.q * 24 - n9 + 11;
            n5 = aQC.c(this.y, achievement) ? 1 : 0;
            n4 = aQC.a(this.y, achievement);
            int n21 = aQC.b(this.y, achievement);
            if (n21 > 4) continue;
            n3 = -16777216;
            n3 = -6250336;
            this.b(n7, n19, n6, n3);
            this.a(n19, n6, n20, n3);
            if (n7 > n19) {
                this.c(n7 - 11 - 7, n6 - 5, 114, 234, 7, 11);
                continue;
            }
            if (n7 < n19) {
                this.c(n7 + 11, n6 - 5, 107, 234, 7, 11);
                continue;
            }
            if (n6 > n20) {
                this.c(n7 - 5, n6 - 11 - 7, 96, 234, 11, 7);
                continue;
            }
            if (n6 >= n20) continue;
            this.c(n7 - 5, n6 + 11, 96, 241, 11, 7);
        }
        Achievement achievement = null;
        float f5 = (float)(n - n12) * this.L;
        float f6 = (float)(n2 - n13) * this.L;
        ne_0.f();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.enableColorMaterial();
        for (n6 = 0; n6 < ListInvoker.size(apf_0.G); ++n6) {
            float f7;
            Achievement achievement2 = (Achievement)ListInvoker.get(apf_0.G, n6);
            int n22 = achievement2.o * 24 - n8;
            n5 = achievement2.q * 24 - n9;
            if (n22 < -24 || n5 < -24 || !((float)n22 <= 224.0f * this.L) || !((float)n5 <= 155.0f * this.L)) continue;
            n4 = aQC.b(this.y, achievement2);
            if (aQC.c(this.y, achievement2)) {
                f7 = 0.75f;
                GlStateManagerInvoker.color(f7, f7, f7, 1.0f);
            } else if (aQC.a(this.y, achievement2)) {
                f7 = 1.0f;
                GlStateManagerInvoker.color(f7, f7, f7, 1.0f);
            } else if (n4 < 3) {
                f7 = 0.3f;
                GlStateManagerInvoker.color(f7, f7, f7, 1.0f);
            } else if (n4 == 3) {
                f7 = 0.2f;
                GlStateManagerInvoker.color(f7, f7, f7, 1.0f);
            } else {
                if (n4 != 4) continue;
                f7 = 0.1f;
                GlStateManagerInvoker.color(f7, f7, f7, 1.0f);
            }
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), v);
            if (K6.d(achievement2)) {
                this.c(n22 - 2, n5 - 2, 26, 202, 26, 26);
            } else {
                this.c(n22 - 2, n5 - 2, 0, 202, 26, 26);
            }
            if (!aQC.a(this.y, achievement2)) {
                f7 = 0.1f;
                GlStateManagerInvoker.color(f7, f7, f7, 1.0f);
                DU.a(this.i, false);
            }
            GlStateManagerInvoker.D();
            GlStateManagerInvoker.b();
            DU.b(this.i, achievement2.theItemStack, n22 + 3, n5 + 3);
            GlStateManagerInvoker.b(770, 771);
            GlStateManagerInvoker.disableLighting();
            if (!aQC.a(this.y, achievement2)) {
                DU.a(this.i, true);
            }
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            if (!(f5 >= (float)n22) || !(f5 <= (float)(n22 + 22)) || !(f6 >= (float)n5) || !(f6 <= (float)(n5 + 22))) continue;
            achievement = achievement2;
        }
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), v);
        this.c(n10, n11, 0, 0, this.A, this.D);
        zLevel = 0.0f;
        GlStateManagerInvoker.depthFunc(515);
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.enableTexture2D();
        super.a(n, n2, f);
        String string = aBO.d(K6.c(achievement));
        String string2 = K6.e(achievement);
        int n23 = n + 12;
        n5 = n2 - 4;
        n4 = aQC.b(this.y, achievement);
        if (aQC.a(this.y, achievement)) {
            int n24 = MathInvoker.max(FontRendererInvoker.a(this.q, string), 120);
            n3 = FontRendererInvoker.c(this.q, string2, n24);
            if (aQC.c(this.y, achievement)) {
                n3 += 12;
            }
            this.b(n23 - 3, n5 - 3, n23 + n24 + 3, n5 + n3 + 3 + 12, -1073741824, -1073741824);
            FontRendererInvoker.a(this.q, string2, n23, n5 + 12, n24, -6250336);
            if (aQC.c(this.y, achievement)) {
                FontRendererInvoker.drawStringWithShadow(this.q, I18n.format(aP3.d, new Object[0]), n23, n5 + n3 + 4, -7302913);
            }
        } else if (n4 == 3) {
            string = I18n.format(aP3.g, new Object[0]);
            int n25 = MathInvoker.max(FontRendererInvoker.a(this.q, string), 120);
            String string3 = aIW.f(new aoz_1(aP3.h, K6.c(achievement.n)));
            int n26 = FontRendererInvoker.c(this.q, string3, n25);
            this.b(n23 - 3, n5 - 3, n23 + n25 + 3, n5 + n26 + 12 + 3, -1073741824, -1073741824);
            FontRendererInvoker.a(this.q, string3, n23, n5 + 12, n25, -9416624);
        } else if (n4 < 3) {
            int n27 = MathInvoker.max(FontRendererInvoker.a(this.q, string), 120);
            String string4 = aIW.f(new aoz_1(aP3.e, K6.c(achievement.n)));
            int n28 = FontRendererInvoker.c(this.q, string4, n27);
            this.b(n23 - 3, n5 - 3, n23 + n27 + 3, n5 + n28 + 12 + 3, -1073741824, -1073741824);
            FontRendererInvoker.a(this.q, string4, n23, n5 + 12, n27, -9416624);
        } else {
            string = null;
        }
        FontRendererInvoker.drawStringWithShadow(this.q, string, n23, n5, aQC.a(this.y, achievement) ? (K6.d(achievement) ? -128 : -1) : (K6.d(achievement) ? -8355776 : -8355712));
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.D();
        ne_0.e();
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (!this.B && qG.m == 1) {
            MCInvoker.displayGuiScreen(this.t, this.x);
        }
    }

    static {
        E = apf_0.A * 24 - 112;
        O = apf_0.F * 24 - 112;
        K = apf_0.q * 24 - 77;
        M = apf_0.r * 24 - 77;
        v = new ResourceLocation(aP3.c);
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (n == GameSettingsInvoker.getKeyCode(this.t.gameSettings.a0)) {
            MCInvoker.displayGuiScreen(this.t, null);
            MCInvoker.r(this.t);
        } else {
            super.a(c, n);
        }
    }

    private KM a(Block block) {
        return ap__0.a(xd_0.a(MCInvoker.Y(MCInvoker.f())), BlocksInvoker.t(block));
    }

    @Override
    public void g() {
        if (!this.B) {
            this.I = this.z;
            this.H = this.w;
            double d = this.F - this.z;
            double d2 = this.J - this.w;
            if (d * d + d2 * d2 < 4.0) {
                this.z += d;
                this.w += d2;
            } else {
                this.z += d * 0.85;
                this.w += d2 * 0.85;
            }
        }
    }

    protected void b() {
        int n = (this.n - this.A) / 2;
        int n2 = (this.f - this.D) / 2;
        FontRendererInvoker.a(this.q, I18n.format(aP3.b, new Object[0]), n + 15, n2 + 5, 0x404040);
    }

    @Override
    public void l() {
        aDM.a(MCInvoker.aa(this.t), new C16PacketClientStatus(C16PacketClientStatus$EnumState.REQUEST_STATS));
        ListInvoker.clear(this.l);
        ListInvoker.add(this.l, new qe_0(1, this.n / 2 + 24, this.f / 2 + 74, 80, 20, I18n.format(aP3.f, new Object[0])));
    }

    @Override
    public boolean d() {
        return !this.B;
    }
}

