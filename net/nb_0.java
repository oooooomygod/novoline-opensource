/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import net.minecraft.renderer.texture.DynamicTexture;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.Nb
 */
class nb_0
implements FontRenderer {
    private DynamicTexture q;
    private VK[] n;
    private static String r = "0123456789abcdefklmnor";
    private static float i = 0.0f;
    private static short h = 256;
    private DynamicTexture l;
    private int p = -1;
    private DynamicTexture c;
    private static char k = '\u00a7';
    private boolean a;
    private DynamicTexture g;
    private VK[] e;
    private Font o;
    private static int[] j;
    private static float d = 512.0f;
    private VK[] f = new VK[256];
    private VK[] m;
    private boolean b;

    @Override
    public double a() {
        return (double)(this.p - 8) * 0.5;
    }

    static FontRenderer a(Font font, boolean bl, boolean bl2) {
        return new nb_0(font, bl, bl2);
    }

    @Override
    public int a(CharSequence charSequence) {
        SimpleFontManager.b();
        return 0;
    }

    private static void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f5 / 512.0f;
        float f10 = f6 / 512.0f;
        float f11 = f7 / 512.0f;
        float f12 = f8 / 512.0f;
        GL11.glTexCoord2f((float)(f9 + f11), (float)f10);
        GL11.glVertex2d((double)(f + f3), (double)f2);
        GL11.glTexCoord2f((float)f9, (float)f10);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glTexCoord2f((float)f9, (float)(f10 + f12));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)f9, (float)(f10 + f12));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f9 + f11), (float)(f10 + f12));
        GL11.glVertex2d((double)(f + f3), (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f9 + f11), (float)f10);
        GL11.glVertex2d((double)(f + f3), (double)f2);
    }

    private DynamicTexture a(Font font, boolean bl, boolean bl2, VK[] vKArray) {
        return new DynamicTexture(this.b(font, bl, bl2, vKArray));
    }

    private static int[] b() {
        int[] nArray = new int[32];
        int n = 0;
        while (true) {
            int n2 = (n >> 3 & 1) * 85;
            int n3 = (n >> 2 & 1) * 170 + n2;
            int n4 = (n >> 1 & 1) * 170 + n2;
            int n5 = (n & 1) * 170 + n2;
            nArray[n] = (n3 & 0xFF) << 16 | (n4 & 0xFF) << 8 | n5 & 0xFF;
            ++n;
        }
    }

    private static void a(VK[] vKArray, char c, float f, float f2) {
        nb_0.a(f, f2, VK.d(vKArray[c]), VK.c(vKArray[c]), VK.a(vKArray[c]), VK.b(vKArray[c]), VK.d(vKArray[c]), VK.c(vKArray[c]));
    }

    private static void a(double d, double d2, double d3, double d4, float f) {
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GL11.glEnable((int)3553);
    }

    @Override
    public double a(char c) {
        return (double)(VK.d(this.f[c]) - 8) * 0.5;
    }

    @Override
    public int b() {
        return (this.p - 8) / 2;
    }

    private void a() {
        this.g = this.a(this.o, this.b, this.a, this.f);
        this.c = this.a(wq_0.a(this.o, 1), this.b, this.a, this.e);
        this.q = this.a(wq_0.a(this.o, 2), this.b, this.a, this.m);
        this.l = this.a(wq_0.a(this.o, 3), this.b, this.a, this.n);
    }

    @Override
    public void b(CharSequence charSequence, double d, double d2, int n, boolean bl, boolean bl2) {
        this.a(charSequence, d, d2, n, bl, false, 0.0f, bl2);
    }

    @Override
    public void b(CharSequence charSequence, double d, double d2, int n, float f) {
        this.a(charSequence, d, d2, n, false, true, f, false);
    }

    @Override
    public boolean d() {
        return this.a;
    }

    private BufferedImage b(Font font, boolean bl, boolean bl2, VK[] vKArray) {
        BufferedImage bufferedImage = new BufferedImage(512, 512, 2);
        Graphics2D graphics2D = (Graphics2D)jj_0.c(bufferedImage);
        SimpleFontManager.b();
        adz_0.a(graphics2D, font);
        adz_0.a(graphics2D, new Color(255, 255, 255, 0));
        adz_0.a(graphics2D, 0, 0, 512, 512);
        adz_0.a(graphics2D, Color.WHITE);
        adz_0.a(graphics2D, RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        adz_0.a(graphics2D, RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        adz_0.a(graphics2D, RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        if (this.a) {
            adz_0.a(graphics2D, RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        }
        adz_0.a(graphics2D, RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        FontMetrics fontMetrics = adz_0.a(graphics2D);
        int n = 0;
        int n2 = 0;
        int n3 = 1;
        int n4 = 0;
        if (n4 < vKArray.length) {
            char c = (char)n4;
            VK vK = new VK(null);
            Rectangle2D rectangle2D = agj_0.a(fontMetrics, StringInvoker.a(c), graphics2D);
            VK.d(vK, a5O.a((Rectangle2D)rectangle2D).width + 8);
            VK.c(vK, a5O.a((Rectangle2D)rectangle2D).height);
            if (n2 + VK.d(vK) >= 512) {
                n2 = 0;
                n3 += n;
                n = 0;
            }
            if (VK.c(vK) > n) {
                n = VK.c(vK);
            }
            VK.b(vK, n2);
            VK.a(vK, n3);
            if (VK.c(vK) > this.p) {
                this.p = VK.c(vK);
            }
            vKArray[n4] = vK;
            adz_0.a(graphics2D, StringInvoker.a(c), n2 + 2, n3 + agj_0.a(fontMetrics));
            n2 += VK.d(vK);
            ++n4;
        }
        return bufferedImage;
    }

    private nb_0(Font font, boolean bl, boolean bl2) {
        this.e = new VK[256];
        this.m = new VK[256];
        this.n = new VK[256];
        this.o = font;
        this.b = bl;
        this.a = bl2;
        this.a();
    }

    @Override
    public void b(CharSequence charSequence, double d, double d2, int n, boolean bl) {
        this.a(charSequence, d, d2, n, bl, false, 0.0f, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u001cfS_\fIa\u001boX\rZ\u001f3I1\n\u0000U\u00128^".toCharArray();
        int n2 = 0;
        int n3 = 96;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x4C));
            n3 = n3;
        }
    }

    @Override
    public String c() {
        return wq_0.a(this.o);
    }

    @Override
    public String a(CharSequence charSequence, int n, boolean bl) {
        SimpleFontManager.b();
        StringBuilder stringBuilder = new StringBuilder();
        float f = 0.0f;
        int n2 = bl ? avf_1.a(charSequence) - 1 : 0;
        int n3 = bl ? -1 : 1;
        boolean bl2 = false;
        boolean bl3 = false;
        int n4 = n2;
        if (n4 < avf_1.a(charSequence) && f < (float)n) {
            char c = avf_1.a(charSequence, n4);
            float f2 = this.a(StringInvoker.a(c));
            if (f2 < 0.0f) {
                bl2 = true;
            }
            if ((f += f2) > (float)n) {
                // empty if block
            }
            if (bl) {
                aL0.a(stringBuilder, 0, c);
            }
            aL0.a(stringBuilder, c);
            n4 += n3;
        }
        return stringBuilder.toString();
    }

    public static FontRenderer a(Font font) {
        return nb_0.a(font, true, true);
    }

    @Override
    public boolean e() {
        return this.b;
    }

    private void a(CharSequence charSequence, double d, double d2, int n, boolean bl, boolean bl2, float f, boolean bl3) {
        SimpleFontManager.b();
    }

    @Override
    public void a(CharSequence charSequence, double d, double d2, int n, float f, boolean bl) {
        SimpleFontManager.b();
        this.a(charSequence, d, d2, n, false, true, f, bl);
        if (ListInvoker.b() != null) {
            SimpleFontManager.b(new int[4]);
        }
    }
}

