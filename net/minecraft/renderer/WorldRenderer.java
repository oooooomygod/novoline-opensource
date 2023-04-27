/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.renderer;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.modules.visual.XRay;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.BitSet;

import deobf.DefaultVertexFormats;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import net.Cn;
import net.HD;
import net.KM;
import net.MathHelper;
import net.N4;
import net.P8;
import net.RenderGlobal;
import net.a5w_0;
import net.a7r_0;
import net.a8q_0;
import net.aF9;
import net.aHB;
import net.aHC;
import net.aHU;
import net.aL0;
import net.aLI;
import net.aM_;
import net.aPX;
import net.aav_0;
import net.abg_1;
import net.adb_0;
import net.adn_0;
import net.adt_2;
import net.VertexFormat;
import net.VertexFormatElement;
import net.axx_1;
import net.ev_0;
import net.h9;
import net.hb_2;
import net.mp_2;
import net.pc_1;
import net.qg_2;
import net.tf_0;
import net.ys_2;
import net.zv_2;
import org.lwjgl.opengl.GL11;

public class WorldRenderer {
    private VertexFormat n;
    public int d;
    private a5w_0 e = null;
    private static String b = "CL_00000942";
    public int g;
    public IntBuffer s;
    private int j;
    private double u;
    private boolean o;
    private boolean[] m = new boolean[256];
    public FloatBuffer k;
    private VertexFormatElement i;
    private boolean r;
    private ShortBuffer a;
    private double t;
    private ByteBuffer p;
    private KM[] l = null;
    private double f;
    private KM h = null;
    private KM[] q = null;
    public abg_1 c;

    public void q() {
        if (!this.o) {
            throw new IllegalStateException(aLI.b);
        }
        this.o = false;
        a8q_0.c(this.p, 0);
        a8q_0.b(this.p, this.a() * 4);
    }

    public void b(float f, float f2, float f3) {
        int n = 0;
        while (true) {
            this.a(f, f2, f3, n + 1);
            ++n;
        }
    }

    public void b(int n) {
        int n2 = 0;
        while (true) {
            this.c(n, n2 + 1);
            ++n2;
        }
    }

    public void d() {
        this.a(zv_2.d(this.n));
    }

    public int a() {
        return this.g * zv_2.d(this.n);
    }

    private void e() {
        ++this.j;
        this.j %= zv_2.h(this.n);
        this.i = zv_2.a(this.n, this.j);
        if (ev_0.b(this.i) == aPX.PADDING) {
            this.e();
        }
    }

    public void b(double d, double d2, double d3) {
        int n = zv_2.d(this.n);
        int n2 = (this.g - 4) * n;
        int n3 = 0;
        while (true) {
            int n4 = n2 + n3 * n;
            int n5 = n4 + 1;
            int n6 = n5 + 1;
            HD.a(this.s, n4, axx_1.e((float)(d + this.t) + axx_1.a(HD.b(this.s, n4))));
            HD.a(this.s, n5, axx_1.e((float)(d2 + this.u) + axx_1.a(HD.b(this.s, n5))));
            HD.a(this.s, n6, axx_1.e((float)(d3 + this.f) + axx_1.a(HD.b(this.s, n6))));
            ++n3;
        }
    }

    public WorldRenderer a(int n, int n2, int n3, int n4) {
        if (!this.r) {
            int n5 = this.g * zv_2.a(this.n) + zv_2.c(this.n, this.j);
            switch (aHC.a[ev_0.c(this.i).ordinal()]) {
                case 1: {
                    a8q_0.a(this.p, n5, (float)n / 255.0f);
                    a8q_0.a(this.p, n5 + 4, (float)n2 / 255.0f);
                    a8q_0.a(this.p, n5 + 8, (float)n3 / 255.0f);
                    a8q_0.a(this.p, n5 + 12, (float)n4 / 255.0f);
                    break;
                }
                case 2: 
                case 3: {
                    a8q_0.a(this.p, n5, (float)n);
                    a8q_0.a(this.p, n5 + 4, (float)n2);
                    a8q_0.a(this.p, n5 + 8, (float)n3);
                    a8q_0.a(this.p, n5 + 12, (float)n4);
                    break;
                }
                case 4: 
                case 5: {
                    a8q_0.a(this.p, n5, (short)n);
                    a8q_0.a(this.p, n5 + 2, (short)n2);
                    a8q_0.a(this.p, n5 + 4, (short)n3);
                    a8q_0.a(this.p, n5 + 6, (short)n4);
                    break;
                }
                case 6: 
                case 7: {
                    if (adn_0.a() == ByteOrder.LITTLE_ENDIAN) {
                        a8q_0.a(this.p, n5, (byte)n);
                        a8q_0.a(this.p, n5 + 1, (byte)n2);
                        a8q_0.a(this.p, n5 + 2, (byte)n3);
                        a8q_0.a(this.p, n5 + 3, (byte)n4);
                        break;
                    }
                    a8q_0.a(this.p, n5, (byte)n4);
                    a8q_0.a(this.p, n5 + 1, (byte)n3);
                    a8q_0.a(this.p, n5 + 2, (byte)n2);
                    a8q_0.a(this.p, n5 + 3, (byte)n);
                }
            }
            this.e();
        }
        return this;
    }

    public void a(int n, int n2, int n3, int n4, int n5) {
        if (adn_0.a() == ByteOrder.LITTLE_ENDIAN) {
            HD.a(this.s, n, n5 << 24 | n4 << 16 | n3 << 8 | n2);
        } else {
            HD.a(this.s, n, n2 << 24 | n3 << 16 | n4 << 8 | n5);
        }
    }

    public int c(int n) {
        return ((this.g - n) * zv_2.a(this.n) + zv_2.e(this.n)) / 4;
    }

    public boolean k() {
        return this.r;
    }

    public VertexFormat m() {
        return this.n;
    }

    public void a(a5w_0 a5w_02) {
        this.e = a5w_02;
        if (this.q != null) {
            this.l = this.q;
        }
        this.q = null;
        this.h = null;
    }

    public WorldRenderer c(float f, float f2, float f3) {
        int n = this.g * zv_2.a(this.n) + zv_2.c(this.n, this.j);
        switch (aHC.a[ev_0.c(this.i).ordinal()]) {
            case 1: {
                a8q_0.a(this.p, n, f);
                a8q_0.a(this.p, n + 4, f2);
                a8q_0.a(this.p, n + 8, f3);
                break;
            }
            case 2: 
            case 3: {
                a8q_0.a(this.p, n, (int)f);
                a8q_0.a(this.p, n + 4, (int)f2);
                a8q_0.a(this.p, n + 8, (int)f3);
                break;
            }
            case 4: 
            case 5: {
                a8q_0.a(this.p, n, (short)((int)(f * 32767.0f) & 0xFFFF));
                a8q_0.a(this.p, n + 2, (short)((int)(f2 * 32767.0f) & 0xFFFF));
                a8q_0.a(this.p, n + 4, (short)((int)(f3 * 32767.0f) & 0xFFFF));
                break;
            }
            case 6: 
            case 7: {
                a8q_0.a(this.p, n, (byte)((int)(f * 127.0f) & 0xFF));
                a8q_0.a(this.p, n + 1, (byte)((int)(f2 * 127.0f) & 0xFF));
                a8q_0.a(this.p, n + 2, (byte)((int)(f3 * 127.0f) & 0xFF));
            }
        }
        this.e();
        return this;
    }

    public int o() {
        return this.g;
    }

    private void b(int n, int n2) {
        int n3 = n2 - n;
        int n4 = n * 4;
        int n5 = n3 * 4;
        GL11.glDrawArrays((int)this.d, (int)n4, (int)n5);
    }

    public void h() {
        this.r = true;
    }

    /*
     * WARNING - void declaration
     */
    public void b() {
        if (this.q != null) {
            void var2_5;
            int n = h9.e(MCInvoker.f(ys_2.at()));
            if (this.m.length <= n) {
                this.m = new boolean[n + 1];
            }
            a7r_0.a(this.m, false);
            int n2 = -1;
            int n3 = this.g / 4;
            for (int i = 0; i < n3; ++i) {
                KM kM = this.q[i];
                int n4 = qg_2.o(kM);
                if (this.m[n4]) continue;
                if (kM == aHU.Q) {
                    n2 = i;
                    continue;
                }
                i = this.a(kM, i) - 1;
                ++var2_5;
                if (this.e == a5w_0.TRANSLUCENT) continue;
                this.m[n4] = true;
            }
            this.a(aHU.Q, n2);
            ++var2_5;
        }
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public int i() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "!h?\u0019,N'R\u001dT\u001b".toCharArray();
        int n2 = 0;
        int n3 = 51;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x51));
            n3 = n3;
        }
    }

    public void l() {
        this.a(7, DefaultVertexFormats.a);
    }

    public Cn f() {
        HD.d(this.s);
        int n = this.a();
        HD.c(this.s, n);
        int[] nArray = new int[n];
        HD.a(this.s, nArray);
        HD.c(this.s, HD.a(this.s));
        HD.a(this.s, n);
        KM[] kMArray = null;
        if (this.q != null) {
            int n2 = this.g / 4;
            kMArray = new KM[n2];
            SystemInvoker.a(this.q, 0, kMArray, 0, n2);
        }
        return new Cn(nArray, new VertexFormat(this.n), kMArray);
    }

    public WorldRenderer a(double d, double d2) {
        if (this.h != null && this.q != null) {
            d = qg_2.a(this.h, (float)d);
            d2 = qg_2.d(this.h, (float)d2);
            this.q[this.g / 4] = this.h;
        }
        int n = this.g * zv_2.a(this.n) + zv_2.c(this.n, this.j);
        switch (aHC.a[ev_0.c(this.i).ordinal()]) {
            case 1: {
                a8q_0.a(this.p, n, (float)d);
                a8q_0.a(this.p, n + 4, (float)d2);
                break;
            }
            case 2: 
            case 3: {
                a8q_0.a(this.p, n, (int)d);
                a8q_0.a(this.p, n + 4, (int)d2);
                break;
            }
            case 4: 
            case 5: {
                a8q_0.a(this.p, n, (short)d2);
                a8q_0.a(this.p, n + 2, (short)d);
                break;
            }
            case 6: 
            case 7: {
                a8q_0.a(this.p, n, (byte)d2);
                a8q_0.a(this.p, n + 1, (byte)d);
            }
        }
        this.e();
        return this;
    }

    public boolean p() {
        return this.q != null;
    }

    public void a(int[] nArray) {
        if (ys_2.aC()) {
            aav_0.a(this, nArray);
        }
        this.a(nArray.length);
        HD.a(this.s, this.a());
        HD.b(this.s, nArray);
        this.g += nArray.length / zv_2.d(this.n);
        if (ys_2.aC()) {
            aav_0.f(this);
        }
    }

    public WorldRenderer c(double d, double d2, double d3) {
        if (ys_2.aC()) {
            aav_0.g(this);
        }
        int n = this.g * zv_2.a(this.n) + zv_2.c(this.n, this.j);
        switch (aHC.a[ev_0.c(this.i).ordinal()]) {
            case 1: {
                a8q_0.a(this.p, n, (float)(d + this.t));
                a8q_0.a(this.p, n + 4, (float)(d2 + this.u));
                a8q_0.a(this.p, n + 8, (float)(d3 + this.f));
                break;
            }
            case 2: 
            case 3: {
                a8q_0.a(this.p, n, axx_1.e((float)(d + this.t)));
                a8q_0.a(this.p, n + 4, axx_1.e((float)(d2 + this.u)));
                a8q_0.a(this.p, n + 8, axx_1.e((float)(d3 + this.f)));
                break;
            }
            case 4: 
            case 5: {
                a8q_0.a(this.p, n, (short)(d + this.t));
                a8q_0.a(this.p, n + 2, (short)(d2 + this.u));
                a8q_0.a(this.p, n + 4, (short)(d3 + this.f));
                break;
            }
            case 6: 
            case 7: {
                a8q_0.a(this.p, n, (byte)(d + this.t));
                a8q_0.a(this.p, n + 1, (byte)(d2 + this.u));
                a8q_0.a(this.p, n + 2, (byte)(d3 + this.f));
            }
        }
        this.e();
        return this;
    }

    public WorldRenderer a(int n, int n2) {
        int n3 = this.g * zv_2.a(this.n) + zv_2.c(this.n, this.j);
        switch (aHC.a[ev_0.c(this.i).ordinal()]) {
            case 1: {
                a8q_0.a(this.p, n3, (float)n);
                a8q_0.a(this.p, n3 + 4, (float)n2);
                break;
            }
            case 2: 
            case 3: {
                a8q_0.a(this.p, n3, n);
                a8q_0.a(this.p, n3 + 4, n2);
                break;
            }
            case 4: 
            case 5: {
                a8q_0.a(this.p, n3, (short)n2);
                a8q_0.a(this.p, n3 + 2, (short)n);
                break;
            }
            case 6: 
            case 7: {
                a8q_0.a(this.p, n3, (byte)n2);
                a8q_0.a(this.p, n3 + 1, (byte)n);
            }
        }
        this.e();
        return this;
    }

    public void b(float f, float f2, float f3, int n) {
        int n2 = this.c(n);
        int n3 = -1;
        XRay xRay = (XRay)ModuleInvoker.isEnable(ModuleRegistry.XRAY);
        if (!this.r) {
            n3 = HD.b(this.s, n2);
            if (adn_0.a() == ByteOrder.LITTLE_ENDIAN) {
                int n4 = (int)((float)(n3 & 0xFF) * f);
                int n5 = (int)((float)(n3 >> 8 & 0xFF) * f2);
                int n6 = (int)((float)(n3 >> 16 & 0xFF) * f3);
                n3 &= 0xFF000000;
                n3 = n3 | n6 << 16 | n5 << 8 | n4;
                if (pc_1.g(xRay)) {
                    n3 = hb_2.a(n4, n5, n6, P8.b((Integer)adt_2.a(pc_1.a(xRay))));
                }
                if (!RenderGlobal.y) {
                    n3 = hb_2.a(n4, n5, n6, 0);
                }
            } else {
                int n7 = (int)((float)(n3 >> 24 & 0xFF) * f);
                int n8 = (int)((float)(n3 >> 16 & 0xFF) * f2);
                int n9 = (int)((float)(n3 >> 8 & 0xFF) * f3);
                n3 &= 0xFF;
                n3 = n3 | n7 << 24 | n8 << 16 | n9 << 8;
                if (pc_1.g(xRay)) {
                    n3 = hb_2.a(n7, n8, n9, P8.b((Integer)adt_2.a(pc_1.a(xRay))));
                }
                if (!RenderGlobal.y) {
                    n3 = hb_2.a(n7, n8, n9, 0);
                }
            }
        }
        HD.a(this.s, n2, n3);
    }

    public WorldRenderer(int n) {
        if (ys_2.aC()) {
            n *= 2;
        }
        this.p = N4.e(n * 4);
        this.s = a8q_0.e(this.p);
        this.a = a8q_0.h(this.p);
        this.k = a8q_0.g(this.p);
        aav_0.c(this);
    }

    public void d(float f, float f2, float f3) {
        int n;
        int n2;
        int n3;
        int n4 = this.g / 4;
        float[] fArray = new float[n4];
        for (int i = 0; i < n4; ++i) {
            fArray[i] = WorldRenderer.a(this.k, (float)((double)f + this.t), (float)((double)f2 + this.u), (float)((double)f3 + this.f), zv_2.d(this.n), i * zv_2.a(this.n));
        }
        Object[] objectArray = new Integer[n4];
        for (int i = 0; i < objectArray.length; ++i) {
            objectArray[i] = P8.d(i);
        }
        a7r_0.a(objectArray, new aF9(this, fArray));
        BitSet bitSet = new BitSet();
        int n5 = zv_2.a(this.n);
        int[] nArray = new int[n5];
        int n6 = 0;
        while ((n6 = aM_.c(bitSet, n6)) < objectArray.length) {
            n3 = P8.b((Integer)objectArray[n6]);
            if (n3 != n6) {
                HD.c(this.s, n3 * n5 + n5);
                HD.a(this.s, n3 * n5);
                HD.a(this.s, nArray);
                n2 = n3;
                n = P8.b((Integer)objectArray[n3]);
                while (n2 != n6) {
                    HD.c(this.s, n * n5 + n5);
                    HD.a(this.s, n * n5);
                    IntBuffer intBuffer = HD.i(this.s);
                    HD.c(this.s, n2 * n5 + n5);
                    HD.a(this.s, n2 * n5);
                    HD.a(this.s, intBuffer);
                    aM_.b(bitSet, n2);
                    n2 = n;
                    n = P8.b((Integer)objectArray[n]);
                }
                HD.c(this.s, n6 * n5 + n5);
                HD.a(this.s, n6 * n5);
                HD.b(this.s, nArray);
            }
            aM_.b(bitSet, n6);
            ++n6;
        }
        HD.c(this.s, HD.a(this.s));
        HD.a(this.s, this.a());
        if (this.q != null) {
            KM[] kMArray = new KM[this.g / 4];
            n3 = zv_2.d(this.n) / 4 * 4;
            for (n2 = 0; n2 < objectArray.length; ++n2) {
                n = P8.b((Integer)objectArray[n2]);
                kMArray[n2] = this.q[n];
            }
            SystemInvoker.a(kMArray, 0, this.q, 0, kMArray.length);
        }
    }

    private int g() {
        return HD.a(this.s) * 4 / (zv_2.d(this.n) * 4);
    }

    public ByteBuffer j() {
        return this.p;
    }

    public void b(int n, int n2, int n3, int n4) {
        int n5 = (this.g - 4) * zv_2.d(this.n) + zv_2.b(this.n, 1) / 4;
        int n6 = zv_2.a(this.n) >> 2;
        HD.a(this.s, n5, n);
        HD.a(this.s, n5 + n6, n2);
        HD.a(this.s, n5 + n6 * 2, n3);
        HD.a(this.s, n5 + n6 * 3, n4);
    }

    private static float a(FloatBuffer floatBuffer, float f, float f2, float f3, int n, int n2) {
        float f4 = aHB.b(floatBuffer, n2);
        float f5 = aHB.b(floatBuffer, n2 + 1);
        float f6 = aHB.b(floatBuffer, n2 + 2);
        float f7 = aHB.b(floatBuffer, n2 + n);
        float f8 = aHB.b(floatBuffer, n2 + n + 1);
        float f9 = aHB.b(floatBuffer, n2 + n + 2);
        float f10 = aHB.b(floatBuffer, n2 + n * 2);
        float f11 = aHB.b(floatBuffer, n2 + n * 2 + 1);
        float f12 = aHB.b(floatBuffer, n2 + n * 2 + 2);
        float f13 = aHB.b(floatBuffer, n2 + n * 3);
        float f14 = aHB.b(floatBuffer, n2 + n * 3 + 1);
        float f15 = aHB.b(floatBuffer, n2 + n * 3 + 2);
        float f16 = (f4 + f7 + f10 + f13) * 0.25f - f;
        float f17 = (f5 + f8 + f11 + f14) * 0.25f - f2;
        float f18 = (f6 + f9 + f12 + f15) * 0.25f - f3;
        return f16 * f16 + f17 * f17 + f18 * f18;
    }

    public void a(float f, float f2, float f3, int n) {
        int n2 = this.c(n);
        int n3 = MathHelper.a((int)(f * 255.0f), 0, 255);
        int n4 = MathHelper.a((int)(f2 * 255.0f), 0, 255);
        int n5 = MathHelper.a((int)(f3 * 255.0f), 0, 255);
        this.a(n2, n3, n4, n5, 255);
    }

    public void a(double d, double d2, double d3) {
        this.t = d;
        this.u = d2;
        this.f = d3;
    }

    private int a(KM kM, int n) {
        GL11.glBindTexture((int)3553, (int)kM.u);
        int n2 = -1;
        int n3 = -1;
        int n4 = this.g / 4;
        for (int i = n; i < n4; ++i) {
            KM kM2 = this.q[i];
            if (kM2 == kM) {
                n3 = i;
                continue;
            }
            this.b(n3, i);
            if (this.e == a5w_0.TRANSLUCENT) {
                return i;
            }
            n3 = -1;
            n2 = i;
        }
        this.b(n3, n4);
        n2 = n4;
        return n2;
    }

    public void c() {
        ++this.g;
        this.a(zv_2.d(this.n));
        this.j = 0;
        this.i = zv_2.a(this.n, this.j);
        if (ys_2.aC()) {
            aav_0.a(this);
        }
    }

    public void b(KM kM) {
        if (this.q != null) {
            this.h = kM;
        }
    }

    public void a(Cn cn) {
        HD.h(this.s);
        this.a(adb_0.a(cn).length);
        HD.b(this.s, adb_0.a(cn));
        this.g = cn.c();
        this.n = new VertexFormat(cn.a());
        if (Cn.a(cn) != null) {
            if (this.q == null) {
                this.q = this.l;
            }
            if (this.q == null || this.q.length < this.g()) {
                this.q = new KM[this.g()];
            }
            KM[] kMArray = Cn.a(cn);
            SystemInvoker.a(kMArray, 0, this.q, 0, kMArray.length);
        } else {
            if (this.q != null) {
                this.l = this.q;
            }
            this.q = null;
        }
    }

    private void a(int n) {
        if (ys_2.aC()) {
            n *= 2;
        }
        if (n > HD.e(this.s)) {
            int n2 = a8q_0.b(this.p);
            int n3 = n2 % 0x200000;
            int n4 = n3 + (((HD.b(this.s) + n) * 4 - n3) / 0x200000 + 1) * 0x200000;
            LoggerInvoker.warn(LogManagerInvoker.c(), aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), aLI.c), n2), aLI.a), n4), aLI.d).toString());
            int n5 = HD.b(this.s);
            ByteBuffer byteBuffer = N4.e(n4);
            a8q_0.c(this.p, 0);
            a8q_0.a(byteBuffer, this.p);
            a8q_0.d(byteBuffer);
            this.p = byteBuffer;
            this.k = a8q_0.g(this.p);
            this.s = a8q_0.e(this.p);
            HD.a(this.s, n5);
            this.a = a8q_0.h(this.p);
            mp_2.a(this.a, n5 << 1);
            if (this.q != null) {
                KM[] kMArray = this.q;
                int n6 = this.g();
                this.q = new KM[n6];
                SystemInvoker.a(kMArray, 0, this.q, 0, MathInvoker.b(kMArray.length, this.q.length));
                this.l = null;
            }
        }
    }

    public void n() {
        this.g = 0;
        this.i = null;
        this.j = 0;
        this.h = null;
    }

    public WorldRenderer a(float f, float f2, float f3, float f4) {
        return this.a((int)(f * 255.0f), (int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f4 * 255.0f));
    }

    public void a(KM kM) {
        if (this.q != null) {
            int n = this.g / 4;
            this.q[n - 1] = kM;
        }
    }

    private void c(int n, int n2) {
        int n3 = this.c(n2);
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n >> 24 & 0xFF;
        this.a(n3, n4, n5, n6, n7);
    }

    public void a(int n, VertexFormat aqn_02) {
        if (this.o) {
            throw new IllegalStateException(aLI.e);
        }
        this.o = true;
        this.n();
        this.d = n;
        this.n = aqn_02;
        this.i = zv_2.a(aqn_02, this.j);
        this.r = false;
        a8q_0.b(this.p, a8q_0.b(this.p));
        if (ys_2.aC()) {
            aav_0.b(this);
        }
        if (tf_0.a6()) {
            if (this.e != null) {
                if (this.q == null) {
                    this.q = this.l;
                }
                if (this.q == null || this.q.length < this.g()) {
                    this.q = new KM[this.g()];
                }
            }
        } else {
            if (this.q != null) {
                this.l = this.q;
            }
            this.q = null;
        }
    }

    public void a(float f, float f2, float f3) {
        int n = (byte)(f * 127.0f) & 0xFF;
        int n2 = (byte)(f2 * 127.0f) & 0xFF;
        int n3 = (byte)(f3 * 127.0f) & 0xFF;
        int n4 = n | n2 << 8 | n3 << 16;
        int n5 = zv_2.a(this.n) >> 2;
        int n6 = (this.g - 4) * n5 + zv_2.c(this.n) / 4;
        HD.a(this.s, n6, n4);
        HD.a(this.s, n6 + n5, n4);
        HD.a(this.s, n6 + n5 * 2, n4);
        HD.a(this.s, n6 + n5 * 3, n4);
    }
}

