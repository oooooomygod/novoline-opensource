/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.ArabicShapingException
 *  com.ibm.icu.text.Bidi
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.gui;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import net.minecraft.renderer.WorldRenderer;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import net.GlStateManager;
import net.IResourceManagerReloadListener;
import net.P8;
import net.ResourceLocation;
import net.TextureManager;
import net.a5_0;
import net.a7r_0;
import net.aI_;
import net.aL0;
import net.aRB;
import net.aZ6;
import net.aiv_2;
import net.ajT;
import net.axv_2;
import net.dw_0;
import net.dz_0;
import net.j6_0;
import net.jj_0;
import net.jv_1;
import net.nx_0;
import net.ys_2;
import org.lwjgl.opengl.GL11;

public class FontRenderer
implements IResourceManagerReloadListener {
    private boolean g;
    public int[] x;
    private byte[] k;
    private static String i = "CL_00000660";
    private TextureManager f;
    public Random p;
    private ResourceLocation y;
    private boolean w;
    private float[] u = new float[256];
    private float b;
    private float v;
    private static ResourceLocation[] c;
    private boolean z;
    public boolean a = true;
    private int e;
    private ResourceLocation A = null;
    private boolean B;
    public int r = 9;
    public float m = 1.0f;
    private float d;
    public GameSettings n;
    private boolean q;
    private boolean l;
    private float j;
    private float h;
    private boolean s;
    public ResourceLocation t;
    private float o;

    protected void a(float f, float f2, float f3, float f4, boolean bl) {
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.alphaFunc(516, 0.0f);
        GlStateManagerInvoker.color(f, f2, f3, f4);
    }

    private void a(String string, boolean bl, boolean bl2) {
        for (int i = 0; i < StringInvoker.c(string); ++i) {
            WorldRenderer worldRenderer;
            Tessellator tessellator;
            char c;
            int n;
            int n2;
            char c2 = StringInvoker.b(string, i);
            if (c2 == '\u00a7' && i + 1 < StringInvoker.c(string)) {
                n2 = StringInvoker.d(aRB.n, StringInvoker.b(StringInvoker.i(string), i + 1));
                if (n2 < 16) {
                    this.z = false;
                    this.w = false;
                    this.B = false;
                    this.q = false;
                    this.l = false;
                    if (n2 > 15) {
                        n2 = 15;
                    }
                    this.e = n = this.x[n2 += 16];
                    this.a((float)(n >> 16) / 255.0f, (float)(n >> 8 & 0xFF) / 255.0f, (float)(n & 0xFF) / 255.0f, this.b, bl2);
                } else if (n2 == 16) {
                    this.z = true;
                } else if (n2 == 17) {
                    this.w = true;
                } else if (n2 == 18) {
                    this.B = true;
                } else if (n2 == 19) {
                    this.q = true;
                } else if (n2 == 20) {
                    this.l = true;
                } else if (n2 == 21) {
                    this.z = false;
                    this.w = false;
                    this.B = false;
                    this.q = false;
                    this.l = false;
                    this.a(this.v, this.o, this.j, this.b, bl2);
                }
                ++i;
                continue;
            }
            n2 = StringInvoker.d(aRB.h, c2);
            if (this.z && n2 != -1) {
                n = this.e(c2);
                while (n != this.e(c = StringInvoker.b(aRB.c, n2 = a5_0.a(this.p, StringInvoker.c(aRB.g))))) {
                }
                c2 = c;
            }
            float f = n2 != -1 && !this.g ? this.m : 0.5f;
            c = n2 == -1 || this.g ? (char)'\u0001' : '\u0000';
            this.d -= f;
            this.h -= f;
            float f2 = this.a(c2, this.l);
            this.d += f;
            this.h += f;
            if (this.w) {
                this.d += f;
                this.d -= f;
                this.h -= f;
                this.a(c2, this.l);
                this.d -= f;
                this.d += f;
                this.h += f;
                f2 += f;
            }
            if (this.B) {
                tessellator = TessellatorInvoker.getInstance();
                worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
                GlStateManagerInvoker.disableTexture2D();
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.k);
                WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, this.d, this.h + (float)(this.r / 2), 0.0));
                WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, this.d + f2, this.h + (float)(this.r / 2), 0.0));
                WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, this.d + f2, this.h + (float)(this.r / 2) - 1.0f, 0.0));
                WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, this.d, this.h + (float)(this.r / 2) - 1.0f, 0.0));
                TessellatorInvoker.draw(tessellator);
                GlStateManagerInvoker.enableTexture2D();
            }
            if (this.q) {
                tessellator = TessellatorInvoker.getInstance();
                worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
                GlStateManagerInvoker.disableTexture2D();
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.k);
                int n3 = this.q ? -1 : 0;
                WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, this.d + (float)n3, this.h + (float)this.r, 0.0));
                WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, this.d + f2, this.h + (float)this.r, 0.0));
                WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, this.d + f2, this.h + (float)this.r - 1.0f, 0.0));
                WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, this.d + (float)n3, this.h + (float)this.r - 1.0f, 0.0));
                TessellatorInvoker.draw(tessellator);
                GlStateManagerInvoker.enableTexture2D();
            }
            this.d += f2;
        }
        this.A = null;
    }

    public boolean e() {
        return this.s;
    }

    private double a(char c) {
        if (c == '\u00a7') {
            return -1.0;
        }
        if (c == ' ') {
            return this.u[32];
        }
        int n = StringInvoker.d(aRB.i, c);
        if (n != -1 && !this.g) {
            return this.u[n];
        }
        if (this.k[c] != 0) {
            int n2 = this.k[c] >>> 4;
            int n3 = this.k[c] & 0xF;
            return (float)((double)(++n3 - (n2 &= 0xF)) * 0.5 + 1.0);
        }
        return 0.0;
    }

    /*
     * Loose catch block
     */
    private void d() {
        InputStream inputStream = null;
        inputStream = this.b(new ResourceLocation(aRB.m));
        aZ6.a(inputStream, this.k);
        IOUtilsInvoker.closeQuietly(inputStream);
        return;
        {
            catch (IOException iOException) {
                try {
                    throw new RuntimeException(iOException);
                }
                catch (Throwable throwable) {
                    IOUtilsInvoker.closeQuietly(inputStream);
                    throw throwable;
                }
            }
        }
    }

    public int a(String string) {
        return 0;
    }

    public int b(String string, float f, float f2, int n, boolean bl) {
        this.c();
        this.g();
        int n2 = this.a(string, f + 1.0f, f2 + 1.0f, n, true, false);
        n2 = MathInvoker.max(n2, this.a(string, f, f2, n, false, false));
        return n2;
    }

    public boolean f() {
        return this.g;
    }

    public double a() {
        return this.r;
    }

    private void a(String string, int n, int n2, int n3, int n4, boolean bl) {
        if (this.s) {
            int n5 = this.a(this.c(string));
            n = n + n3 - n5;
        }
        this.a(string, (float)n, (float)n2, n4, bl, false);
    }

    public void b(String string, double d, double d2, int n, boolean bl) {
        this.b(string, (float)d, (float)d2, n, bl);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void b(boolean bl) {
        this.s = bl;
    }

    private ResourceLocation b(int n) {
        if (c[n] == null) {
            FontRenderer.c[n] = new ResourceLocation(StringInvoker.a(aRB.o, new Object[]{P8.d(n)}));
            FontRenderer.c[n] = nx_0.b(c[n]);
        }
        return c[n];
    }

    @Override
    public void b(aI_ aI_2) {
        this.y = nx_0.b(this.t);
        a7r_0.b(c, null);
        this.b();
        this.d();
    }

    public static String b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = -1;
        int n2 = StringInvoker.c(string);
        while ((n = StringInvoker.a(string, 167, n + 1)) != -1) {
            if (n >= n2 - 1) continue;
            char c = StringInvoker.b(string, n + 1);
            if (FontRenderer.c(c)) {
                stringBuilder = new StringBuilder(aL0.a(aL0.a(new StringBuilder(), aRB.k), c).toString());
                continue;
            }
            if (!FontRenderer.d(c)) continue;
            aL0.a(aL0.a(stringBuilder, aRB.b), c);
        }
        return stringBuilder.toString();
    }

    public String a(String string, int n, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        float f = 0.0f;
        int n2 = StringInvoker.c(string) - 1;
        int n3 = -1;
        for (int i = n2; i < StringInvoker.c(string) && f < (float)n; i += n3) {
            char c = StringInvoker.b(string, i);
            this.a(c);
            if (c == 'l' || c == 'L' || c == 'r' || c == 'R') {
                // empty if block
            }
            if (f > (float)n) break;
            aL0.a(stringBuilder, 0, c);
        }
        return stringBuilder.toString();
    }

    protected void c() {
        GlStateManager.p();
    }

    private int c(String string, int n) {
        int n2;
        int n3 = StringInvoker.c(string);
        float f = 0.0f;
        int n4 = -1;
        for (n2 = 0; n2 < n3; ++n2) {
            char c = StringInvoker.b(string, n2);
            switch (c) {
                case '\n': {
                    --n2;
                    break;
                }
                case ' ': {
                    n4 = n2;
                }
                default: {
                    f = (float)((double)f + this.a(c));
                    f += 1.0f;
                    break;
                }
                case '\u00a7': {
                    char c2;
                    if (n2 < n3 - 1 && (c2 = StringInvoker.b(string, ++n2)) != 'l' && c2 != 'L' && c2 != 'r' && c2 != 'R' && !FontRenderer.c(c2)) break;
                }
            }
            if (c == '\n') {
                n4 = ++n2;
                break;
            }
            if (f > (float)n) break;
        }
        if (n2 != n3) {
            // empty if block
        }
        return n2;
    }

    public void a(String string, double d, double d2, int n, boolean bl) {
        this.a(string, (float)d, (float)d2, n, bl);
    }

    private float b(char c, boolean bl) {
        if (this.k[c] == 0) {
            return 0.0f;
        }
        int n = c / 256;
        this.a(n);
        int n2 = this.k[c] >>> 4;
        int n3 = this.k[c] & 0xF;
        float f = n2 &= 0xF;
        float f2 = n3 + 1;
        float f3 = (float)(c % 16 * 16) + f;
        float f4 = (c & 0xFF) / 16 * 16;
        float f5 = f2 - f - 0.02f;
        float f6 = 1.0f;
        GL11.glBegin((int)5);
        GL11.glTexCoord2f((float)(f3 / 256.0f), (float)(f4 / 256.0f));
        GL11.glVertex3f((float)(this.d + f6), (float)this.h, (float)0.0f);
        GL11.glTexCoord2f((float)(f3 / 256.0f), (float)((f4 + 15.98f) / 256.0f));
        GL11.glVertex3f((float)(this.d - f6), (float)(this.h + 7.99f), (float)0.0f);
        GL11.glTexCoord2f((float)((f3 + f5) / 256.0f), (float)(f4 / 256.0f));
        GL11.glVertex3f((float)(this.d + f5 / 2.0f + f6), (float)this.h, (float)0.0f);
        GL11.glTexCoord2f((float)((f3 + f5) / 256.0f), (float)((f4 + 15.98f) / 256.0f));
        GL11.glVertex3f((float)(this.d + f5 / 2.0f - f6), (float)(this.h + 7.99f), (float)0.0f);
        GL11.glEnd();
        return (f2 - f) / 2.0f + 1.0f;
    }

    public FontRenderer(GameSettings gameSettings, ResourceLocation resourceLocation, TextureManager textureManager, boolean bl) {
        this.p = new Random();
        this.k = new byte[65536];
        this.x = new int[32];
        this.n = gameSettings;
        this.t = resourceLocation;
        this.y = resourceLocation;
        this.f = textureManager;
        this.g = bl;
        this.y = nx_0.b(this.t);
        this.a(this.y);
        int n = 0;
        while (true) {
            int n2 = (n >> 3 & 1) * 85;
            int n3 = (n >> 2 & 1) * 170 + n2;
            int n4 = (n >> 1 & 1) * 170 + n2;
            int n5 = (n & 1) * 170 + n2;
            if (gameSettings.bV) {
                int n6 = (n3 * 30 + n4 * 59 + n5 * 11) / 100;
                int n7 = (n3 * 30 + n4 * 70) / 100;
                int n8 = (n3 * 30 + n5 * 70) / 100;
                n3 = n6;
                n4 = n7;
                n5 = n8;
            }
            this.x[n] = (n3 & 0xFF) << 16 | (n4 & 0xFF) << 8 | n5 & 0xFF;
            ++n;
        }
    }

    private int a(String string, float f, float f2, int n, boolean bl, boolean bl2) {
        return 0;
    }

    public int a(String string, float f, float f2, int n) {
        return !this.a ? 0 : this.b(string, f, f2, n, false);
    }

    private String d(String string) {
        while (StringInvoker.c(string, aRB.a)) {
            string = StringInvoker.b(string, 0, StringInvoker.c(string) - 1);
        }
        return string;
    }

    private void g() {
        this.z = false;
        this.w = false;
        this.l = false;
        this.q = false;
        this.B = false;
    }

    private void a(int n) {
        ResourceLocation resourceLocation = this.b(n);
        if (this.A != resourceLocation) {
            this.a(resourceLocation);
            this.A = resourceLocation;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "m?#=+\\b\u001eEJ=".toCharArray();
        int n2 = 0;
        int n3 = 94;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x70));
            n3 = n3;
        }
    }

    private void b() {
        BufferedImage bufferedImage;
        try {
            bufferedImage = aiv_2.a(this.b(this.y));
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        Properties properties = nx_0.a(this.y);
        int n = jj_0.f(bufferedImage);
        int n2 = bufferedImage.getHeight();
        int n3 = n / 16;
        int n4 = n2 / 16;
        float f = (float)n / 128.0f;
        float f2 = ys_2.a(f, 1.0f, 2.0f);
        this.m = 1.0f / f2;
        float f3 = nx_0.a(properties, aRB.j, -1.0f);
        if (f3 >= 0.0f) {
            this.m = f3;
        }
        int[] nArray = new int[n * n2];
        jj_0.a(bufferedImage, 0, 0, n, n2, nArray, 0, n);
        int n5 = 0;
        while (true) {
            int n6;
            int n7;
            int n8;
            int n9 = n5 % 16;
            int n10 = n5 / 16;
            int n11 = 0;
            n11 = n3 - 1;
            int n12 = n9 * n3 + n11;
            for (int i = 0; i < n4 && (n8 = (n7 = nArray[n12 + (n6 = (n10 * n4 + i) * n)]) >> 24 & 0xFF) <= 16; ++i) {
            }
            this.u[n5] = (float)(n11 + 1) / f + 1.0f;
            ++n5;
        }
    }

    public List d(String string, int n) {
        return a7r_0.a(StringInvoker.g(this.b(string, n), aRB.e));
    }

    public void c(String string, double d, double d2, int n, boolean bl) {
        this.b(string, (float)(d - (double)(this.a(string) / 2)), (float)d2, n, bl);
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public int b(char c) {
        int n = StringInvoker.d(aRB.l, c);
        if (n < this.x.length) {
            int n2 = this.x[n];
            if (ys_2.aF()) {
                n2 = ajT.b(n, n2);
            }
            return n2;
        }
        return 0xFFFFFF;
    }

    public int e(String string, int n) {
        return this.r * ListInvoker.size(this.d(string, n));
    }

    public int a(String string, float f, float f2, int n, boolean bl) {
        this.c();
        this.g();
        int n2 = this.a(string, f + 1.0f, f2 + 1.0f, n, true, true);
        n2 = MathInvoker.max(n2, this.a(string, f, f2, n, false, true));
        return n2;
    }

    public void a(String string, int n, int n2, int n3, int n4) {
        this.g();
        this.e = n4;
        string = this.d(string);
        this.a(string, n, n2, n3, false);
    }

    String b(String string, int n) {
        int n2 = this.c(string, n);
        if (StringInvoker.c(string) <= n2) {
            return string;
        }
        String string2 = StringInvoker.b(string, 0, n2);
        char c = StringInvoker.b(string, n2);
        boolean bl = c == ' ' || c == '\n';
        String string3 = aL0.a(aL0.a(new StringBuilder(), FontRenderer.b(string2)), StringInvoker.a(string, n2 + 1)).toString();
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), string2), aRB.f), this.b(string3, n)).toString();
    }

    private void a(String string, int n, int n2, int n3, boolean bl) {
        Iterator iterator = ListInvoker.iterator(this.d(string, n3));
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            this.a((String)object, n, n2, n3, this.e, bl);
            n2 += this.r;
        }
    }

    protected InputStream b(ResourceLocation resourceLocation) throws IOException {
        return dw_0.b(j6_0.b(MCInvoker.x(MCInvoker.f()), resourceLocation));
    }

    public String a(String string, int n) {
        return this.a(string, n, false);
    }

    protected void a(ResourceLocation resourceLocation) {
        this.f.b(resourceLocation);
    }

    public int e(char c) {
        return (int)MathInvoker.f(this.a(c));
    }

    public int h() {
        return this.r;
    }

    private static boolean d(char c) {
        return c >= 'k' && c <= 'o' || c >= 'K' && c <= 'O' || c == 'r' || c == 'R';
    }

    private float a(char c, boolean bl) {
        if (c == ' ') {
            return !this.g ? this.u[c] : 4.0f;
        }
        int n = StringInvoker.d(aRB.d, c);
        return n != -1 && !this.g ? this.a(n, bl) : this.b(c, bl);
    }

    public int b(String string, float f, float f2, int n) {
        return this.b(string, f, f2, n, true);
    }

    private static boolean c(char c) {
        return c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F';
    }

    private float a(int n, boolean bl) {
        int n2 = n % 16 * 8;
        int n3 = n / 16 * 8;
        boolean bl2 = true;
        if (this.A != this.y) {
            this.a(this.y);
            this.A = this.y;
        }
        float f = this.u[n];
        float f2 = 7.99f;
        GL11.glBegin((int)5);
        GL11.glTexCoord2f((float)((float)n2 / 128.0f), (float)((float)n3 / 128.0f));
        GL11.glVertex3f((float)(this.d + (float)bl2), (float)this.h, (float)0.0f);
        GL11.glTexCoord2f((float)((float)n2 / 128.0f), (float)(((float)n3 + 7.99f) / 128.0f));
        GL11.glVertex3f((float)(this.d - (float)bl2), (float)(this.h + 7.99f), (float)0.0f);
        GL11.glTexCoord2f((float)(((float)n2 + f2 - 1.0f) / 128.0f), (float)((float)n3 / 128.0f));
        GL11.glVertex3f((float)(this.d + f2 - 1.0f + (float)bl2), (float)this.h, (float)0.0f);
        GL11.glTexCoord2f((float)(((float)n2 + f2 - 1.0f) / 128.0f), (float)(((float)n3 + 7.99f) / 128.0f));
        GL11.glVertex3f((float)(this.d + f2 - 1.0f - (float)bl2), (float)(this.h + 7.99f), (float)0.0f);
        GL11.glEnd();
        return f;
    }

    private String c(String string) {
        try {
            Bidi bidi = new Bidi(axv_2.a(new ArabicShaping(8), string), 127);
            jv_1.a(bidi, 0);
            return jv_1.b(bidi, 2);
        }
        catch (ArabicShapingException arabicShapingException) {
            return string;
        }
    }
}

