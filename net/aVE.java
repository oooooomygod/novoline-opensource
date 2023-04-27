/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ItemBlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityRenderer;
import deobf.GameSettings;
import deobf.ITextureObject;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import deobf.TileEntity;
import deobf.Vec3;
import net.minecraft.renderer.WorldRenderer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL11;

public class aVE {
    static File ak;
    public static aN8 cH;
    public static int aY = 17;
    public static int q = 6;
    public static int cv = 12;
    public static String a;
    public static int[] c9;
    static double cz;
    public static boolean ch;
    private static String dR;
    public static int bo = 16;
    public static boolean y;
    static FloatBuffer a7;
    static float an;
    public static float x;
    public static boolean dI;
    static boolean i;
    static float aD;
    public static float l;
    static String E;
    public static int bn = 28;
    private static Pattern dr;
    private static int[] dM;
    private static int j = 0;
    private static Pattern F;
    private static float[] O;
    public static float c8;
    public static float ax;
    static int ef;
    static int cg;
    public static int c = 8;
    static int cY;
    static boolean ac;
    public static int da = 32;
    public static boolean cS;
    public static int d7 = 4;
    static boolean aw;
    public static int c1;
    public static int dQ = 25;
    static int d5;
    public static int at;
    public static int dH = 2;
    static FloatBuffer bY;
    private static World bL;
    private static String[] Z;
    public static aN8 dj;
    public static boolean cd;
    static float dv;
    static int cs;
    static boolean ao;
    public static aN8 dq;
    private static k5_0[] L;
    static int[] cL;
    static float[] bG;
    public static int bf = 19;
    static int dF;
    public static boolean r;
    static IntBuffer dB;
    public static boolean bm;
    static float b_;
    static int ed;
    static FloatBuffer cW;
    static float bR;
    public static aN8 dg;
    static FloatBuffer cp;
    public static int f = 22;
    private static aep_0 cl;
    private static String[] bO;
    static float cK;
    public static int a1 = 33;
    static long bT;
    static float N;
    static boolean[][] cF;
    public static boolean[] a8;
    public static boolean c2;
    public static int a0 = 13;
    public static int d4 = 23;
    static String aS;
    public static boolean aF;
    static int dS;
    public static boolean ea;
    public static boolean b6;
    private static int aX = 1;
    static a0D[] bX;
    private static int cJ;
    static float a3;
    public static aN8 b8;
    static IntBuffer dN;
    static float X;
    static EntityRenderer d8;
    private static int dO = 2196;
    public static String am;
    private static int bc;
    public static boolean[] cB;
    public static boolean aQ;
    static int cx;
    static FloatBuffer bK;
    public static int df = 30;
    static File bD;
    public static xb_0 d_;
    public static int dW = 3;
    static W2 cA;
    static float[] bW;
    static int bx;
    public static int c_ = 18;
    public static Properties as;
    static float[] dx;
    static long ck;
    static double d6;
    static int d1;
    public static int g = 24;
    public static aN8 dU;
    private static boolean dA;
    static int[] d9;
    static float a2;
    static long bs;
    public static float bF;
    static int bU;
    private static int cG;
    static FloatBuffer eh;
    static boolean bw;
    public static int ba;
    static IntBuffer[] H;
    static float al;
    static float bg;
    static float bb;
    public static aN8 dZ;
    static FloatBuffer aP;
    static boolean aE;
    static FloatBuffer aI;
    public static boolean dd;
    static float[] z;
    private static int[] cu;
    private static int[] cX;
    static int bQ;
    static float[] dV;
    private static k5_0[] dh;
    public static int aC = 8;
    static float[] aT;
    public static float eb;
    public static int cm = 20;
    public static boolean aR;
    public static int m;
    static float ai;
    private static boolean bl;
    public static boolean[] b4;
    public static aN8 cn;
    public static boolean T;
    static double A;
    static FloatBuffer by;
    public static boolean[] a5;
    public static Properties be;
    static int W = 2;
    static int G;
    static float n;
    static IntBuffer dX;
    public static int bk = 11;
    static boolean d2;
    public static int av = 26;
    public static String[] a_;
    public static String cq;
    static Map<String, a0D[]> cN;
    static IntBuffer di;
    private static String[] cE;
    private static boolean cf = true;
    public static int cy = 2;
    public static int d0;
    public static int aV;
    public static boolean b;
    public static int[] aM;
    private static int C;
    static float aU;
    public static int af;
    public static aN8 cU;
    static float[] az;
    private static String[] dt;
    public static float b3;
    private static Pattern ca;
    static float[] v;
    static int bi;
    static IntBuffer a6;
    private static int cr;
    static int d3 = 8;
    static int P;
    private static List<Integer> p;
    static float[] cV;
    public static boolean ct = true;
    public static boolean a4;
    static float bu;
    public static float bV;
    public static int[] cQ;
    public static boolean ab;
    private static Pattern c4;
    static float[] cb;
    public static aN8 ds;
    private static String dy;
    static float bj;
    public static int K = 5;
    static IntBuffer cw;
    private static String[] bC;
    static int[] c7;
    public static boolean bE;
    static String bh;
    static File de;
    public static boolean aa;
    public static float bA;
    public static aN8 cZ;
    private static String dw;
    public static float b0;
    static float[] V;
    static IntBuffer d;
    public static int c3 = 7;
    static int bt;
    static int ec = 3;
    static int ap;
    static long c0;
    public static boolean e;
    static File cT;
    public static String[] bZ;
    public static float dk;
    public static aN8 dG;
    public static boolean[] dY;
    private static boolean b9;
    private static ListInvoker[] bd;
    public static ContextCapabilities ad;
    static int cj = 8;
    static int bB;
    private static ByteBuffer dz;
    public static float aj;
    public static int aH = 3;
    public static float ah;
    public static aN8 a9;
    public static int[] aG;
    static boolean bI;
    private static int[] D;
    public static int dm;
    public static int ar;
    static float dD;
    static Map<Block, Integer> k;
    private static int u;
    public static float cR;
    public static boolean dK;
    static float dT;
    static long aK;
    static float[] bJ;
    static long cD;
    public static int aO;
    public static int bq = 27;
    public static boolean bp;
    public static int M;
    public static int dC = 29;
    static IntBuffer aW;
    public static int cM;
    static float aL;
    public static boolean br;
    public static int cC;
    static int[] cc;
    static double cO;
    public static float U;
    private static boolean[] bH;
    public static int R;
    public static ani_0 dL;
    public static int c6 = 21;
    public static int s;
    static IntBuffer[] ce;
    public static int dl = 15;
    public static int db;
    static aH1[] bN;
    static double dn;
    public static aN8 bP;
    static IntBuffer c5;
    static IntBuffer aA;
    static int du;
    static float bM;
    static IntBuffer eg;
    public static boolean aq;
    static float aN;
    private static int[] I;
    public static int b1 = 10;
    static FloatBuffer S;
    public static boolean t;
    static int ag = 8;
    static float Q;
    static float[] ay;
    public static int h = 9;
    static Minecraft cP;
    static IntBuffer Y;
    static float[] ae;
    public static XK B;
    public static int b2 = 31;
    static FloatBuffer dE;
    static double bv;
    public static int o;
    static int ee;
    public static boolean ci;
    static FloatBuffer aJ;
    static float[] b7;
    public static int aZ = 14;
    private static Map<String, String> b5;
    public static int dc = 0;
    public static boolean bS;
    static float[] cI;
    public static int bz;
    public static float aB;
    public static ITextureObject dp;
    public static int au;
    public static int dJ = 1;
    public static String dP;
    static IntBuffer w;
    public static xb_0 J;
    static String co;

    public static void F() {
        a0D.k();
        if (aq) {
            aVE.l(3);
        }
    }

    private static boolean a(int n, String string) {
        IntBuffer intBuffer = a9w_0.b(1);
        a0D.r();
        adk_2.a(n, 35716, intBuffer);
        int n2 = HD.g(intBuffer);
        if (n2 > 1) {
            ByteBuffer byteBuffer = a9w_0.d(n2);
            HD.c(intBuffer);
            adk_2.a(n, intBuffer, byteBuffer);
            byte[] byArray = new byte[n2];
            a8q_0.b(byteBuffer, byArray);
            if (byArray[n2 - 1] == 0) {
                byArray[n2 - 1] = 10;
            }
            String string2 = new String(byArray);
            V6.c(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ail_1.i7), string), ail_1.b1), string2).toString());
            return false;
        }
        return true;
    }

    public static String a(axm_2 axm_22) {
        a0D.r();
        switch (axm_22) {
            case ANTIALIASING: {
                return P8.g(c1);
            }
            case NORMAL_MAP: {
                return auk_2.a(ci);
            }
            case SPECULAR_MAP: {
                return auk_2.a(r);
            }
            case RENDER_RES_MUL: {
                return axx_1.d(aB);
            }
            case SHADOW_RES_MUL: {
                return axx_1.d(bA);
            }
            case HAND_DEPTH_MUL: {
                return axx_1.d(bV);
            }
            case CLOUD_SHADOW: {
                return auk_2.a(bE);
            }
            case OLD_HAND_LIGHT: {
                return aLR.f(cn);
            }
            case OLD_LIGHTING: {
                return aLR.f(dg);
            }
            case SHADER_PACK: {
                return aS;
            }
            case TWEAK_BLOCK_DAMAGE: {
                return auk_2.a(ea);
            }
            case SHADOW_CLIP_FRUSTRUM: {
                return auk_2.a(bS);
            }
            case TEX_MIN_FIL_B: {
                return P8.g(db);
            }
            case TEX_MIN_FIL_N: {
                return P8.g(dm);
            }
            case TEX_MIN_FIL_S: {
                return P8.g(ar);
            }
            case TEX_MAG_FIL_B: {
                return P8.g(aV);
            }
            case TEX_MAG_FIL_N: {
                return P8.g(aV);
            }
            case TEX_MAG_FIL_S: {
                return P8.g(aV);
            }
        }
        throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), ail_1.hP), (Object)axm_22).toString());
    }

    public static void ay() {
        a0D.r();
        dd = false;
        aVE.a(cw);
        aVE.l(aE ? 3 : 2);
        aVE.d();
    }

    private static void a(W2 w2, Properties properties) throws IOException {
        a0D.k();
        String string = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), bh), ail_1.j), dk_0.a(w2)), ail_1.g).toString();
        File file = new File(MCInvoker.f().mcDataDir, string);
        if (dk_1.a(properties)) {
            zq_2.f(file);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        dk_1.a(properties, fileOutputStream, (String)null);
        a2u_0.b(fileOutputStream);
        a2u_0.a(fileOutputStream);
    }

    public static void q() {
        a0D.r();
        c1 += 2;
        c1 = c1 / 2 * 2;
        if (c1 > 4) {
            c1 = 0;
        }
        c1 = ys_2.a(c1, 0, 4);
    }

    private static int g(String string) {
        a0D.k();
        return !string.equals(ail_1.g5) && !string.equals(ail_1.ft) ? (!string.equals(ail_1.jb) && !string.equals(ail_1.gE) ? (!string.equals(ail_1.c9) && !string.equals(ail_1.fl) ? (!string.equals(ail_1.h5) && !string.equals(ail_1.aS) ? (!string.equals(ail_1.bN) && !string.equals(ail_1.ci) ? (!string.equals(ail_1.dT) && !string.equals(ail_1.T) ? (!string.equals(ail_1.du) && !string.equals(ail_1.df) ? (!string.equals(ail_1.d1) && !string.equals(ail_1.ce) ? -1 : 7) : 6) : 5) : 4) : 3) : 2) : 1) : 0;
    }

    private static boolean a(ItemStack itemStack) {
        a0D.r();
        if (itemStack == null) {
            return false;
        }
        Item item = act_2.k(itemStack);
        if (item == null) {
            return false;
        }
        if (!(item instanceof ItemBlock)) {
            return false;
        }
        ItemBlock itemBlock = (ItemBlock)item;
        Block block = ItemBlockInvoker.a(itemBlock);
        if (block == null) {
            return false;
        }
        a5w_0 a5w_02 = BlocksInvoker.m(block);
        return a5w_02 == a5w_0.TRANSLUCENT;
    }

    public static void b() {
        a0D.r();
        aVE.i(ail_1.en);
        aVE.l(ail_1.eK);
        if (!ch) {
            aVE.l(7);
        }
        aVE.i(ail_1.hk);
        aVE.l(ail_1.iN);
    }

    public static void aq() {
        a0D.r();
        if (aq && cL[18] != cL[0]) {
            aVE.l(18);
            GlStateManagerInvoker.enableAlpha();
            GlStateManagerInvoker.alphaFunc(516, 0.0f);
            GlStateManagerInvoker.b(770, 771);
        }
    }

    public static void aD() {
        a0D.k();
        if (dd) {
            aVE.l(4);
        }
        if (ba == 2 || ba == 3) {
            aVE.l(1);
        }
    }

    public static void v() {
        a0D.k();
        if (aq) {
            aVE.i(ail_1.a6);
            aVE.l(aE ? 3 : 2);
            ahf_1.a(u3_0.a(dp));
        }
    }

    public static void a(Block block) {
        aVE.aG[++aVE.m * 2] = a82.c(Block.m, block) & 0xFFFF | BlocksInvoker.y(block) << 16;
        aVE.aG[aVE.m * 2 + 1] = 0;
    }

    public static void X() {
        aVE.l(2);
    }

    public static void ah() {
        aVE.A();
    }

    public static void Q() {
        aVE.i(ail_1.h1);
        aVE.l(ail_1.cj);
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
        GlStateManagerInvoker.b(770, 771);
        aVE.i(ail_1.x);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        bd = listInvokerArray;
    }

    public static void at() {
        a0D.r();
        if (dd) {
            aVE.l(5);
        }
        if (ba == 1) {
            aVE.l(aE ? 3 : 2);
        }
    }

    public static void a(String string, float f, float f2, float f3) {
        a0D.k();
        int n = cL[ba];
        if (n != 0) {
            int n2 = adk_2.b(n, string);
            adk_2.a(n2, f, f2, f3);
            aVE.c(cE[ba], string);
        }
    }

    public static void z() {
        a0D.k();
        if (aq) {
            ahf_1.a(dp);
            if (!ch) {
                aVE.a(di);
            }
        }
    }

    private static void w() {
        a0D.r();
        if (cl == null) {
            cl = new aep_0(bc, bc);
        }
    }

    private static IntBuffer[] b(int n, int n2) {
        IntBuffer[] intBufferArray = new IntBuffer[n];
        for (int i = 0; i < n; ++i) {
            intBufferArray[i] = aVE.g(n2);
        }
        return intBufferArray;
    }

    public static void c() {
        a0D.k();
        aE = false;
        if (ba == 3) {
            aVE.l(2);
        }
    }

    public static int e(int n) {
        M = n;
        return n;
    }

    public static boolean aO() {
        return false;
    }

    public static a0D[] k(String string) {
        a0D.k();
        Object[] objectArray = (a0D[])bX.clone();
        if (cN == null) {
            if (bN != null) {
                a0a_0 a0a_02 = new a0a_0(bN, (a0D[])objectArray);
                objectArray = (a0D[])ys_2.a(objectArray, a0a_02, 0);
            }
            objectArray = aVE.b((a0D[])objectArray);
            return objectArray;
        }
        String string2 = string != null ? aL0.a(aL0.a(new StringBuilder(), ail_1.b6), string).toString() : ail_1.ji;
        a0D[] a0DArray = (a0D[])MapInvoker.c(cN, string2);
        if (a0DArray == null) {
            return new a0D[0];
        }
        ArrayList arrayList = new ArrayList();
        int n = 0;
        a0D[] a0DArray2 = a0DArray;
        int n2 = a0DArray2.length;
        if (n < n2) {
            a0D a0D2 = a0DArray2[n];
            if (a0D2 == null) {
                ListInvoker.add(arrayList, null);
            }
            if (a0D2 instanceof a0R) {
                Object[] objectArray2 = aVE.a(cN, (a0D[])objectArray);
                ListInvoker.addAll(arrayList, a7r_0.a(objectArray2));
            }
            ListInvoker.add(arrayList, a0D2);
            ++n;
        }
        a0DArray2 = (a0D[])ListInvoker.toArray(arrayList, new a0D[ListInvoker.size(arrayList)]);
        return a0DArray2;
    }

    public static void a(String string, int n, int n2) {
        a0D.r();
        int n3 = cL[ba];
        if (n3 != 0) {
            int n4 = adk_2.b(n3, string);
            adk_2.a(n4, n, n2);
            aVE.c(cE[ba], string);
        }
    }

    public static void i() {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex3f((float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex3f((float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex3f((float)1.0f, (float)1.0f, (float)0.0f);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glEnd();
    }

    public static void c(int n) {
        a0D.k();
        GL11.glEnable((int)n);
        if (n == 3553) {
            aVE.at();
        }
        if (n == 2912) {
            aVE.s();
        }
    }

    static {
        aF = false;
        br = false;
        b6 = false;
        T = false;
        cC = 0;
        i = false;
        u = 0;
        cr = 0;
        o = 0;
        R = 0;
        aq = false;
        dd = false;
        t = false;
        dI = false;
        ch = false;
        a4 = false;
        c2 = false;
        ay = new float[4];
        ae = new float[4];
        dx = new float[4];
        cb = new float[4];
        V = new float[4];
        v = new float[]{0.0f, 100.0f, 0.0f, 0.0f};
        aT = new float[]{0.0f, 100.0f, 0.0f, 0.0f};
        az = new float[]{0.0f, -100.0f, 0.0f, 0.0f};
        O = new float[16];
        bT = 0L;
        bs = 0L;
        cD = 0L;
        bR = 0.0f;
        bb = 0.0f;
        ai = 0.0f;
        bt = 0;
        ck = 0L;
        aK = 0L;
        c0 = 0L;
        cx = 0;
        Q = 0.0f;
        n = 0.0f;
        ee = 0;
        al = 0.0f;
        aU = 0.0f;
        ax = 600.0f;
        dk = 200.0f;
        b3 = 10.0f;
        bw = false;
        du = 0;
        cY = 0;
        bM = 0.0f;
        X = 0.0f;
        bu = 0.0f;
        aL = 0.0f;
        a2 = 0.0f;
        bj = 1.0f;
        ac = false;
        cs = 1;
        bg = 0.0f;
        aN = 0.0f;
        d2 = false;
        aE = false;
        ao = true;
        af = 10;
        aO = 11;
        at = 12;
        bm = false;
        bp = false;
        b = false;
        dK = false;
        e = false;
        cd = false;
        ab = false;
        d0 = 0;
        s = 0;
        B = new XK(ail_1.e_);
        J = new xb_0(ail_1.ac);
        d_ = new xb_0(ail_1.ga);
        dF = 0;
        y = false;
        ed = 1024;
        bB = 1024;
        P = 1024;
        aVE.b(new ListInvoker[4]);
        bQ = 1024;
        dv = 90.0f;
        aD = 160.0f;
        aw = true;
        an = -1.0f;
        bi = 0;
        cS = false;
        bI = false;
        ef = 0;
        G = 0;
        dS = 0;
        bx = 0;
        ap = 0;
        bU = 0;
        d1 = 0;
        d5 = 0;
        D = new int[8];
        bH = new boolean[8];
        ba = 0;
        cE = new String[]{ail_1.bD, ail_1.bL, ail_1.cr, ail_1.a, ail_1.hv, ail_1.cy, ail_1.d2, ail_1.eX, ail_1.iD, ail_1.hZ, ail_1.h2, ail_1.b5, ail_1.G, ail_1.cl, ail_1.hS, ail_1.h0, ail_1.cG, ail_1.bf, ail_1.aU, ail_1.fY, ail_1.cd, ail_1.v, ail_1.by, ail_1.gr, ail_1.iy, ail_1.iC, ail_1.di, ail_1.iP, ail_1.jw, ail_1.bt, ail_1.iY, ail_1.c8, ail_1.m};
        dM = new int[]{0, 0, 1, 2, 1, 2, 2, 3, 7, 7, 7, 7, 7, 7, 2, 3, 3, 2, 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 30};
        cL = new int[33];
        cu = new int[33];
        cG = 0;
        bO = new String[33];
        dR = null;
        ce = new IntBuffer[33];
        eg = null;
        dt = new String[33];
        dy = null;
        dw = null;
        I = new int[33];
        cJ = 0;
        C = 0;
        as = null;
        be = null;
        dp = null;
        aa = false;
        a8 = new boolean[2];
        dY = new boolean[2];
        a5 = new boolean[2];
        b4 = new boolean[8];
        cB = new boolean[8];
        ea = true;
        bE = true;
        bV = 0.125f;
        aB = 1.0f;
        bA = 1.0f;
        db = 0;
        dm = 0;
        ar = 0;
        aV = 0;
        cM = 0;
        au = 0;
        bS = true;
        ci = false;
        r = false;
        dg = new aN8(ail_1.dj, ail_1.cM, 0);
        cn = new aN8(ail_1.e8, ail_1.jk, 0);
        c1 = 0;
        a_ = new String[]{ail_1.cv, ail_1.aK, ail_1.d8};
        bZ = new String[]{ail_1.eL, ail_1.cA};
        cQ = new int[]{9728, 9984, 9986};
        aM = new int[]{9728, 9729};
        cA = null;
        aQ = false;
        cq = ail_1.ec;
        E = ail_1.dL;
        bh = ail_1.io;
        co = ail_1.R;
        bX = null;
        bN = null;
        cN = null;
        dL = new ani_0(ail_1.gW, ail_1.hb, 0);
        dG = new aN8(ail_1.hC, ail_1.an, 0);
        ds = new aN8(ail_1.eU, ail_1.cU, 0);
        a9 = new aN8(ail_1.dy, ail_1.gG, 0);
        bP = new aN8(ail_1.jf, ail_1.bI, 0);
        b8 = new aN8(ail_1.hh, ail_1.b_, 0);
        dj = new aN8(ail_1.y, ail_1.go, 0);
        cZ = new aN8(ail_1.gH, ail_1.jh, 0);
        dU = new aN8(ail_1.f0, ail_1.i4, 0);
        cU = new aN8(ail_1.iM, ail_1.fg, 0);
        dq = new aN8(ail_1.fL, ail_1.ev, 0);
        dZ = new aN8(ail_1.hi, ail_1.fv, 0);
        cH = new aN8(ail_1.a7, ail_1.dV, 0);
        b5 = new HashMap<String, String>();
        bL = null;
        p = new ArrayList<Integer>();
        L = null;
        dh = null;
        bC = new String[]{ail_1.aY, ail_1.fM};
        bl = SystemInvoker.a(ail_1.iq, ail_1.ef).equals(ail_1.hV);
        U = 0.5f;
        l = 0.6f;
        b0 = 0.8f;
        cR = -1.0f;
        eb = 0.0f;
        aj = 0.0f;
        M = 0;
        ah = 2.0f;
        bz = 16;
        c9 = new int[2];
        b9 = false;
        bc = 256;
        c7 = new int[16];
        cc = new int[8];
        d9 = new int[]{0, 1, 2, 3, 7, 8, 9, 10};
        cF = new boolean[33][8];
        dz = (ByteBuffer)a8q_0.b(a9w_0.d(2196), 0);
        z = new float[16];
        cV = new float[16];
        cI = new float[16];
        bJ = new float[16];
        dV = new float[16];
        bG = new float[16];
        b7 = new float[16];
        bW = new float[16];
        by = aVE.j(16);
        bK = aVE.j(16);
        S = aVE.j(16);
        aJ = aVE.j(16);
        dE = aVE.j(16);
        cp = aVE.j(16);
        bY = aVE.j(16);
        cW = aVE.j(16);
        a7 = aVE.j(16);
        aI = aVE.j(16);
        aP = aVE.j(16);
        eh = aVE.j(16);
        aW = aVE.g(16);
        dX = aVE.g(3);
        dB = aVE.g(8);
        Y = aVE.g(2);
        cw = aVE.g(8);
        c5 = aVE.g(8);
        a6 = aVE.g(8);
        aA = aVE.g(8);
        w = aVE.g(8);
        d = aVE.g(8);
        dN = aVE.g(8);
        di = aVE.g(8);
        H = aVE.b(33, 8);
        c4 = ow_1.c(ail_1.iI);
        F = ow_1.c(ail_1.d0);
        ca = ow_1.c(ail_1.Y);
        Z = new String[]{ail_1.hX, ail_1.at, ail_1.cm, ail_1.ak, ail_1.dc, ail_1.gM, ail_1.da, ail_1.je, ail_1.hu, ail_1.am, ail_1.cg, ail_1.ai, ail_1.i6, ail_1.A, ail_1.ez, ail_1.ic, ail_1.hn, ail_1.ar, ail_1.bv, ail_1.co, ail_1.a4, ail_1.ho, ail_1.gg, ail_1.iw, ail_1.eE, ail_1.a5, ail_1.ax, ail_1.bw, ail_1.dO, ail_1.eh, ail_1.d_, ail_1.eA};
        cX = new int[]{33321, 33323, 32849, 32856, 36756, 36757, 36758, 36759, 33322, 33324, 32852, 32859, 36760, 36761, 36762, 36763, 33326, 33328, 34837, 34836, 33333, 33339, 36227, 36226, 33334, 33340, 36209, 36208, 10768, 32855, 32857, 35898};
        dr = ow_1.c(ail_1.as);
        aG = new int[32];
        m = 0;
        bD = new File(MCInvoker.f().mcDataDir, ail_1.eT);
        ak = new File(MCInvoker.f().mcDataDir, bh);
        cT = new File(MCInvoker.f().mcDataDir, co);
        HD.c(a6, 0);
        iw_0.a(HD.a(HD.d(di, 36064), 0), 1);
    }

    public static void a(TileEntity tileEntity) {
        a0D.k();
        if (aq && !ch && u__0.a(d_)) {
            Block block = NBTInvoker.h(tileEntity);
            int n = BlocksInvoker.v(block);
            u__0.a(d_, n);
        }
    }

    public static void aI() {
        aVE.l(1);
    }

    private static int b(int n, String string) {
        a0D.r();
        if (n == 0) {
            if (string.equals(ail_1.ap)) {
                return 0;
            }
            if (string.equals(ail_1.ep)) {
                return 1;
            }
            if (string.equals(ail_1.eZ)) {
                return 2;
            }
            if (string.equals(ail_1.ih)) {
                return 3;
            }
            if (string.equals(ail_1.cX) || string.equals(ail_1.h9)) {
                return 4;
            }
            if (string.equals(ail_1.h_)) {
                return bI ? 5 : 4;
            }
            if (string.equals(ail_1.hL)) {
                return 5;
            }
            if (string.equals(ail_1.hA)) {
                return 6;
            }
            if (string.equals(ail_1.bm)) {
                return 7;
            }
            if (string.equals(ail_1.dq)) {
                return 8;
            }
            if (string.equals(ail_1.cz)) {
                return 9;
            }
            if (string.equals(ail_1.fG)) {
                return 10;
            }
            if (string.equals(ail_1.hG)) {
                return 12;
            }
            if (string.equals(ail_1.bF) || string.equals(ail_1.ck)) {
                return 13;
            }
            if (string.equals(ail_1.ee)) {
                return 14;
            }
            if (string.equals(ail_1.hY)) {
                return 15;
            }
        }
        if (n == 1) {
            if (string.equals(ail_1.aI) || string.equals(ail_1.g6)) {
                return 0;
            }
            if (string.equals(ail_1.bq) || string.equals(ail_1.fU)) {
                return 1;
            }
            if (string.equals(ail_1.ei) || string.equals(ail_1.eb)) {
                return 2;
            }
            if (string.equals(ail_1.br) || string.equals(ail_1.fj)) {
                return 3;
            }
            if (string.equals(ail_1.a9) || string.equals(ail_1.iU)) {
                return 4;
            }
            if (string.equals(ail_1.h8)) {
                return bI ? 5 : 4;
            }
            if (string.equals(ail_1.eW)) {
                return 5;
            }
            if (string.equals(ail_1.cF) || string.equals(ail_1.eJ)) {
                return 6;
            }
            if (string.equals(ail_1.e) || string.equals(ail_1.hN)) {
                return 7;
            }
            if (string.equals(ail_1.fV) || string.equals(ail_1.g1)) {
                return 8;
            }
            if (string.equals(ail_1.av) || string.equals(ail_1.ds)) {
                return 9;
            }
            if (string.equals(ail_1.ct) || string.equals(ail_1.bB)) {
                return 10;
            }
            if (string.equals(ail_1.eQ)) {
                return 11;
            }
            if (string.equals(ail_1.l)) {
                return 12;
            }
            if (string.equals(ail_1.eO) || string.equals(ail_1.bc)) {
                return 13;
            }
            if (string.equals(ail_1.aD)) {
                return 14;
            }
            if (string.equals(ail_1.aj)) {
                return 15;
            }
        }
        return -1;
    }

    private static FloatBuffer j(int n) {
        ByteBuffer byteBuffer = dz;
        int n2 = a8q_0.a(byteBuffer);
        iw_0.a(a8q_0.c(byteBuffer, n2), n2 + n * 4);
        return a8q_0.g(byteBuffer);
    }

    public static int c(String string, String string2) {
        a0D.r();
        int n = GL11.glGetError();
        if (n != 0) {
            ea_1.a(System.err, ail_1.iS, new Object[]{P8.d(n), afs_2.a(n), string, string2});
        }
        return n;
    }

    public static void aE() {
        a0D.k();
        if (aVE.aC()) {
            U = 0.5f;
            l = 0.6f;
            b0 = 0.8f;
        }
        U = 1.0f;
        l = 1.0f;
        b0 = 1.0f;
    }

    public static void g() {
        GL11.glMatrixMode((int)5888);
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)5888);
        aVE.l(19);
        aVE.i(ail_1.be);
        aVE.l(ail_1.gt);
    }

    public static void aN() {
        a0D.k();
        if (aq) {
            if (ch) {
                // empty if block
            }
            aVE.l(aE ? 3 : 2);
        }
    }

    public static void Y() {
        ao = true;
        aVE.a(-3, 0);
        aVE.l(6);
    }

    public static void h(int n) {
        GL11.glEnable((int)n);
        aVE.at();
    }

    public static boolean a(GameSettings gameSettings) {
        a0D.r();
        if (!aQ) {
            return true;
        }
        aVE.i(ail_1.gL);
        return ch ? bE : gameSettings.by > 0;
    }

    public static void b(float f, float f2, float f3, float f4) {
        GlStateManagerInvoker.c(f, f2, f3, f4);
        dD = f;
        cK = f2;
        dT = f3;
    }

    private static IntBuffer g(int n) {
        ByteBuffer byteBuffer = dz;
        int n2 = a8q_0.a(byteBuffer);
        iw_0.a(a8q_0.c(byteBuffer, n2), n2 + n * 4);
        return a8q_0.e(byteBuffer);
    }

    public static int ax() {
        return aG[m * 2];
    }

    public static void k() {
        a0D.k();
        aE = true;
        if (ba == 2) {
            aVE.l(3);
        }
    }

    public static int i(String string) {
        a0D.r();
        int n = GL11.glGetError();
        if (n != 0) {
            boolean bl = false;
            if (n == 1286) {
                int n2 = l__0.c(36160);
                ea_1.a(System.err, ail_1.hH, new Object[]{P8.d(n), afs_2.a(n), P8.d(n2), string});
            }
            ea_1.a(System.err, ail_1.b4, new Object[]{P8.d(n), afs_2.a(n), string});
        }
        return n;
    }

    public static void R() {
        a0D.k();
        if (!ch && ac) {
            aHB.a(eh);
            GL11.glReadPixels((int)(o / 2), (int)(R / 2), (int)1, (int)1, (int)6402, (int)5126, (FloatBuffer)eh);
            aL = aHB.b(eh, 0);
            float f = (float)c0 * 0.01f;
            float f2 = (float)MathInvoker.l(MathInvoker.c(0.5) * (double)f / (double)bj);
            a2 = a2 * f2 + aL * (1.0f - f2);
        }
    }

    public static void m(String string) {
        aS = string;
        dk_1.a(be, lo_2.b(axm_2.SHADER_PACK), string);
        aVE.af();
    }

    private static void a(File file) {
        File[] fileArray;
        int n;
        int n2;
        File[] fileArray2;
        a0D.k();
        if (zq_2.m(file) && zq_2.r(file) && (fileArray2 = zq_2.h(file)) != null && (n2 = 0) < (n = (fileArray = fileArray2).length)) {
            File file2 = fileArray[n2];
            if (zq_2.r(file2)) {
                aVE.a(file2);
            }
            zq_2.f(file2);
            ++n2;
        }
    }

    public static void ad() {
        y = true;
    }

    private static void a(a0D[] a0DArray, W2 w2) {
        a0D[] a0DArray2;
        int n;
        int n2;
        a0D.r();
        Properties properties = new Properties();
        if (bX != null && (n2 = 0) < (n = (a0DArray2 = a0DArray).length)) {
            a0D a0D2 = a0DArray2[n2];
            if (mk_0.h(a0D2) && mk_0.n(a0D2)) {
                dk_1.a(properties, mk_0.i(a0D2), mk_0.a(a0D2));
            }
            ++n2;
        }
        try {
            aVE.a(w2, properties);
        }
        catch (IOException iOException) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), ail_1.fS), dk_0.a(cA)).toString());
            a4E.b(iOException);
        }
    }

    public static void t() {
        cr = 0;
    }

    public static void ae() {
        a0D.r();
        if (!ch) {
            int n;
            aVE.i(ail_1.bE);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glMatrixMode((int)5889);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0, (double)1.0, (double)0.0, (double)1.0, (double)0.0, (double)1.0);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GlStateManager.m();
            GlStateManagerInvoker.C();
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.enableDepth();
            GlStateManagerInvoker.depthFunc(519);
            GlStateManagerInvoker.c(false);
            GlStateManagerInvoker.disableLighting();
            if (bx >= 1) {
                GlStateManagerInvoker.d(33988);
                GlStateManagerInvoker.k(HD.b(Y, 0));
                if (bx >= 2) {
                    GlStateManagerInvoker.d(33989);
                    GlStateManagerInvoker.k(HD.b(Y, 1));
                }
            }
            if ((n = 0) < ef) {
                GlStateManagerInvoker.d(33984 + d9[n]);
                GlStateManagerInvoker.k(c7[n]);
                ++n;
            }
            GlStateManagerInvoker.d(33990);
            GlStateManagerInvoker.k(HD.b(dX, 0));
            if (G >= 2) {
                GlStateManagerInvoker.d(33995);
                GlStateManagerInvoker.k(HD.b(dX, 1));
                if (G >= 3) {
                    GlStateManagerInvoker.d(33996);
                    GlStateManagerInvoker.k(HD.b(dX, 2));
                }
            }
            if ((n = 0) < dS) {
                GlStateManagerInvoker.d(33997 + n);
                GlStateManagerInvoker.k(HD.b(dB, n));
                ++n;
            }
            if (b9) {
                GlStateManagerInvoker.d(33984 + aVE.cl.b);
                GlStateManagerInvoker.k(XN.a(cl));
                GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
                GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            }
            aVE.a(dh);
            GlStateManagerInvoker.d(33984);
            n = 1;
            int n2 = 0;
            if (n2 < ef) {
                l__0.a(36160, 36064 + n2, 3553, c7[8 + n2], 0);
                ++n2;
            }
            l__0.a(36160, 36096, 3553, HD.b(dX, 0), 0);
            aY_.a(cw);
            aVE.i(ail_1.cb);
            n2 = 0;
            if (cL[21 + n2] != 0) {
                aVE.l(21 + n2);
                aVE.i(cE[21 + n2]);
                if (C != 0) {
                    aVE.av();
                }
                aVE.i();
                int n3 = 0;
                if (n3 < ef) {
                    if (cF[21 + n2][n3]) {
                        int n4 = cc[n3];
                        int n5 = aVE.cc[n3] = 8 - n4;
                        GlStateManagerInvoker.d(33984 + d9[n3]);
                        GlStateManagerInvoker.k(c7[n5 + n3]);
                        l__0.a(36160, 36064 + n3, 3553, c7[n4 + n3], 0);
                    }
                    ++n3;
                }
                GlStateManagerInvoker.d(33984);
            }
            ++n2;
            aVE.i(ail_1.aa);
            dI = false;
            FramebufferInvoker.bindFramebuffer(MCInvoker.c(cP), true);
            OpenGlHelper.a(apl_1.t, apl_1.ae, 3553, MCInvoker.c((Minecraft)aVE.cP).e, 0);
            GL11.glViewport((int)0, (int)0, (int)aVE.cP.displayWidth, (int)aVE.cP.displayHeight);
            if (EntityRenderer.c) {
                n2 = EntityRenderer.as != 0 ? 1 : 0;
                GlStateManagerInvoker.a(n2 != 0, true, true, true);
            }
            GlStateManagerInvoker.c(true);
            GL11.glClearColor((float)dD, (float)cK, (float)dT, (float)1.0f);
            GL11.glClear((int)16640);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GlStateManager.m();
            GlStateManagerInvoker.C();
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.enableDepth();
            GlStateManagerInvoker.depthFunc(519);
            GlStateManagerInvoker.c(false);
            aVE.i(ail_1.gv);
            aVE.l(29);
            aVE.i(ail_1.aN);
            if (C != 0) {
                aVE.av();
            }
            aVE.i();
            aVE.i(ail_1.hf);
            t = true;
            GlStateManagerInvoker.D();
            GlStateManager.m();
            GlStateManagerInvoker.enableAlpha();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.depthFunc(515);
            GlStateManagerInvoker.c(true);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            aVE.l(0);
        }
    }

    public static a0D[] a(a0D[] a0DArray) {
        ArrayList arrayList = new ArrayList();
        a0D.r();
        a0D[] a0DArray2 = a0DArray;
        int n = a0DArray2.length;
        int n2 = 0;
        if (n2 < n) {
            a0D a0D2 = a0DArray2[n2];
            if (mk_0.n(a0D2) && mk_0.h(a0D2)) {
                ListInvoker.add(arrayList, a0D2);
            }
            ++n2;
        }
        a0DArray2 = (a0D[])ListInvoker.toArray(arrayList, new a0D[ListInvoker.size(arrayList)]);
        return a0DArray2;
    }

    private static void aH() {
        a0D.r();
        ListInvoker.clear(p);
        int n = -128;
        String string = aL0.c(aL0.a(new StringBuilder(), ail_1.gi), n).toString();
        if (dk_0.a(cA, string)) {
            ListInvoker.add(p, P8.d(n));
        }
        ++n;
        if (!ListInvoker.isEmpty(p)) {
            Integer[] integerArray = (Integer[])ListInvoker.toArray(p, new Integer[ListInvoker.size(p)]);
            ys_2.a(aL0.a(aL0.a(new StringBuilder(), ail_1.gh), ys_2.a((Object[])integerArray)).toString());
        }
    }

    public static void a(float f, float f2, float f3, float f4) {
        a0D.k();
        if (aq && !ch) {
            WX.a(B, f, f2, f3, f4);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static void a(World world) {
        a0D.r();
        if (bL != world) {
            World world2 = bL;
            bL = world;
            if (world2 != null && world != null) {
                int n = qq_2.j(world2.d);
                int n2 = qq_2.j(world.d);
                boolean bl = ListInvoker.contains(p, P8.d(n));
                boolean bl2 = ListInvoker.contains(p, P8.d(n2));
                if (bl || bl2) {
                    aVE.f();
                }
            }
        }
    }

    public static void N() {
        a0D.r();
        if (aq) {
            if (!ch) {
                aVE.l(12);
                GlStateManagerInvoker.enableBlend();
            }
            GlStateManagerInvoker.c(true);
        }
    }

    private static void a(k5_0[] k5_0Array) {
        k5_0[] k5_0Array2;
        int n;
        int n2;
        a0D.k();
        if (k5_0Array != null && (n2 = 0) < (n = (k5_0Array2 = k5_0Array).length)) {
            k5_0 k5_02 = k5_0Array2[n2];
            GlStateManagerInvoker.d(33984 + pz_2.a(k5_02));
            ITextureObject iTextureObject = pz_2.b(k5_02);
            GlStateManagerInvoker.k(u3_0.c(iTextureObject));
            ++n2;
        }
    }

    public static void a(Vec3 vec3) {
        b_ = (float)vec3.xCoord;
        N = (float)vec3.yCoord;
        a3 = (float)vec3.zCoord;
        aVE.a(ail_1.i_, b_, N, a3);
    }

    public static void a(int n) {
        a0D.r();
        GL11.glDisable((int)n);
        if (n == 3553) {
            aVE.aD();
        }
        if (n == 2912) {
            aVE.o();
        }
    }

    public static void a(String string, boolean bl, FloatBuffer floatBuffer) {
        int n = cL[ba];
        int n2 = adk_2.b(n, string);
        adk_2.a(n2, bl, floatBuffer);
        aVE.c(cE[ba], string);
    }

    public static void n(int n) {
        GL11.glDisable((int)n);
        aVE.aD();
    }

    public static void H() {
        aVE.M();
        GL11.glColor3f((float)bF, (float)c8, (float)x);
        aVE.aw();
        GL11.glColor3f((float)b_, (float)N, (float)a3);
    }

    public static void a(String string, int n) {
        a0D.k();
        int n2 = cL[ba];
        if (n2 != 0) {
            int n3 = adk_2.b(n2, string);
            adk_2.e(n3, n);
            aVE.c(cE[ba], string);
        }
    }

    public static boolean D() {
        a0D.r();
        return !aLR.c(dU);
    }

    public static void aA() {
        aVE.l(3);
    }

    private static void J() {
        a0D.k();
        if (d1 != 0) {
            l__0.a(d1);
            GlStateManagerInvoker.a(dX);
            GlStateManagerInvoker.a(aW);
        }
        d1 = l__0.a();
        GL11.glGenTextures((IntBuffer)((IntBuffer)iw_0.a(HD.h(dX), G)));
        GL11.glGenTextures((IntBuffer)((IntBuffer)iw_0.a(HD.h(aW), 16)));
        HD.a(dX, 0);
        HD.a(aW, 0);
        HD.a(HD.a(aW, c7), 0);
        l__0.a(36160, d1);
        aY_.c(0);
        GL11.glReadBuffer((int)0);
        int n = 0;
        if (n < G) {
            GlStateManagerInvoker.k(HD.b(dX, n));
            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
            GL11.glTexParameteri((int)3553, (int)34891, (int)6409);
            GL11.glTexImage2D((int)3553, (int)0, (int)6402, (int)o, (int)R, (int)0, (int)6402, (int)5126, (FloatBuffer)null);
            ++n;
        }
        l__0.a(36160, 36096, 3553, HD.b(dX, 0), 0);
        aY_.a(cw);
        GL11.glReadBuffer((int)0);
        aVE.i(ail_1.ib);
        n = 0;
        if (n < ef) {
            GlStateManagerInvoker.k(c7[n]);
            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexImage2D((int)3553, (int)0, (int)D[n], (int)o, (int)R, (int)0, (int)32993, (int)33639, (ByteBuffer)null);
            l__0.a(36160, 36064 + n, 3553, c7[n], 0);
            aVE.i(ail_1.el);
            ++n;
        }
        if ((n = 0) < ef) {
            GlStateManagerInvoker.k(c7[8 + n]);
            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexImage2D((int)3553, (int)0, (int)D[n], (int)o, (int)R, (int)0, (int)32993, (int)33639, (ByteBuffer)null);
            aVE.i(ail_1.jd);
            ++n;
        }
        if ((n = l__0.c(36160)) == 36058) {
            aVE.f(ail_1.bl);
            int n2 = 0;
            if (n2 < ef) {
                GlStateManagerInvoker.k(HD.b(aW, n2));
                GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)o, (int)R, (int)0, (int)32993, (int)33639, (ByteBuffer)null);
                l__0.a(36160, 36064 + n2, 3553, HD.b(aW, n2), 0);
                aVE.i(ail_1.fD);
                ++n2;
            }
            if ((n = l__0.c(36160)) == 36053) {
                V6.c(ail_1.fA);
            }
        }
        GlStateManagerInvoker.k(0);
        if (n != 36053) {
            aVE.f(aL0.a(aL0.c(aL0.a(new StringBuilder(), ail_1.ij), n), ail_1.bY).toString());
        }
        V6.c(ail_1.jv);
    }

    public static void b(TileEntity tileEntity) {
        a0D.r();
        if (aq) {
            aVE.i(ail_1.ae);
            aVE.l(13);
            aVE.a(tileEntity);
        }
    }

    public static void a(Minecraft minecraft) {
        aVE.C();
        cP = minecraft;
        a0D.r();
        minecraft = MCInvoker.f();
        ad = aXQ.a();
        dP = GL11.glGetString((int)7938);
        a = GL11.glGetString((int)7936);
        am = GL11.glGetString((int)7937);
        V6.c(ail_1.fH);
        V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.hD), dP).toString());
        V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.gP), a).toString());
        V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.cq), am).toString());
        V6.c(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ail_1.fQ), aVE.ad.OpenGL20 ? ail_1.dt : ail_1.dd), aVE.ad.OpenGL21 ? ail_1.dS : ail_1.bg), aVE.ad.OpenGL30 ? ail_1.gy : ail_1.ey), aVE.ad.OpenGL32 ? ail_1.gY : ail_1.hU), aVE.ad.OpenGL40 ? ail_1.aw : ail_1.u).toString());
        V6.c(aL0.c(aL0.a(new StringBuilder(), ail_1.bO), GL11.glGetInteger((int)34852)).toString());
        V6.c(aL0.c(aL0.a(new StringBuilder(), ail_1.fp), GL11.glGetInteger((int)36063)).toString());
        V6.c(aL0.c(aL0.a(new StringBuilder(), ail_1.gK), GL11.glGetInteger((int)34930)).toString());
        b6 = aVE.ad.OpenGL30;
        aVE.r();
    }

    public static void ak() {
        FloatBuffer floatBuffer = aP;
        a0D.r();
        aHB.a(floatBuffer);
        GL11.glGetFloat((int)2982, (FloatBuffer)floatBuffer);
        aHB.a(floatBuffer, O, 0, 16);
        a0L.a(ay, O, aT);
        a0L.a(ae, O, az);
        SystemInvoker.a(ai == bb ? ay : ae, 0, dx, 0, 3);
        aVE.a(ail_1.fw, ay[0], ay[1], ay[2]);
        aVE.a(ail_1.fm, ae[0], ae[1], ae[2]);
        aVE.a(ail_1.fd, dx[0], dx[1], dx[2]);
        aVE.i(ail_1.gu);
    }

    public static boolean P() {
        a0D.r();
        return !aLR.e(cn) ? aLR.d(cn) : aLR.e(ds) || aLR.d(ds);
    }

    public static void af() {
        boolean bl;
        boolean bl2;
        block13: {
            String string;
            bl2 = aQ;
            a0D.r();
            bl = aVE.aC();
            aQ = false;
            if (cA != null) {
                dk_0.b(cA);
                cA = null;
                MapInvoker.d(b5);
                ListInvoker.clear(p);
                bX = null;
                bN = null;
                cN = null;
                q0_0.d(dL);
                aLR.a(ds);
                aLR.a(a9);
                aLR.a(dG);
                aVE.aG();
            }
            boolean bl3 = false;
            if (ys_2.L()) {
                V6.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ail_1.d7), ys_2.ab()), ail_1.ah).toString());
                bl3 = true;
            }
            if (ys_2.r()) {
                V6.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ail_1.jn), ys_2.G()), ail_1.fZ).toString());
                bl3 = true;
            }
            if (!StringInvoker.g(string = dk_1.b(be, lo_2.b(axm_2.SHADER_PACK), E)) && !string.equals(cq)) {
                File file;
                block12: {
                    if (string.equals(E)) {
                        cA = new a9S();
                        aQ = true;
                    }
                    file = new File(ak, string);
                    if (!zq_2.r(file)) break block12;
                    cA = new dz_2(string, file);
                    aQ = true;
                }
                if (!zq_2.d(file)) break block13;
                if (!StringInvoker.c(StringInvoker.i(string), ail_1.gx)) break block13;
                try {
                    cA = new aqu_0(string, file);
                    aQ = true;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
        if (cA != null) {
            V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.i), aVE.am()).toString());
        }
        V6.c(ail_1.js);
        cA = new ali_2();
        aVE.A();
        aVE.aH();
        bX = aVE.h();
        aVE.K();
        boolean bl4 = aQ != bl2;
        boolean bl5 = aVE.aC() != bl;
    }

    private static void a(axm_2 axm_22, String string) {
        a0D.r();
        if (string == null) {
            string = lo_2.a(axm_22);
        }
        switch (axm_22) {
            case ANTIALIASING: {
                c1 = ys_2.a(string, 0);
            }
            case NORMAL_MAP: {
                ci = ys_2.a(string, true);
            }
            case SPECULAR_MAP: {
                r = ys_2.a(string, true);
            }
            case RENDER_RES_MUL: {
                aB = ys_2.a(string, 1.0f);
            }
            case SHADOW_RES_MUL: {
                bA = ys_2.a(string, 1.0f);
            }
            case HAND_DEPTH_MUL: {
                bV = ys_2.a(string, 0.125f);
            }
            case CLOUD_SHADOW: {
                bE = ys_2.a(string, true);
            }
            case OLD_HAND_LIGHT: {
                aLR.a(cn, string);
            }
            case OLD_LIGHTING: {
                aLR.a(dg, string);
            }
            case SHADER_PACK: {
                aS = string;
            }
            case TWEAK_BLOCK_DAMAGE: {
                ea = ys_2.a(string, true);
            }
            case SHADOW_CLIP_FRUSTRUM: {
                bS = ys_2.a(string, true);
            }
            case TEX_MIN_FIL_B: {
                db = ys_2.a(string, 0);
            }
            case TEX_MIN_FIL_N: {
                dm = ys_2.a(string, 0);
            }
            case TEX_MIN_FIL_S: {
                ar = ys_2.a(string, 0);
            }
            case TEX_MAG_FIL_B: {
                aV = ys_2.a(string, 0);
            }
            case TEX_MAG_FIL_N: {
                aV = ys_2.a(string, 0);
            }
            case TEX_MAG_FIL_S: {
                aV = ys_2.a(string, 0);
            }
        }
        throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), ail_1.cw), (Object)axm_22).toString());
    }

    private static Properties a(W2 w2) throws IOException {
        a0D.k();
        Properties properties = new Properties();
        String string = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), bh), ail_1.aq), dk_0.a(w2)), ail_1.a1).toString();
        File file = new File(MCInvoker.f().mcDataDir, string);
        if (zq_2.m(file) && zq_2.d(file) && zq_2.e(file)) {
            FileInputStream fileInputStream = new FileInputStream(file);
            dk_1.a(properties, fileInputStream);
            aML.a(fileInputStream);
            return properties;
        }
        return properties;
    }

    private static ByteBuffer b(int n) {
        ByteBuffer byteBuffer = dz;
        int n2 = a8q_0.a(byteBuffer);
        iw_0.a(a8q_0.c(byteBuffer, n2), n2 + n);
        return a8q_0.c(byteBuffer);
    }

    private static int j(String string) {
        a0D.k();
        string = StringInvoker.h(string);
        int n = 0;
        if (n < Z.length) {
            String string2 = Z[n];
            if (string.equals(string2)) {
                return cX[n];
            }
            ++n;
        }
        return 0;
    }

    public static int l(String string) {
        a0D.k();
        int n = l__0.c(36160);
        if (n != 36053) {
            ea_1.a(System.err, ail_1.dQ, new Object[]{P8.d(n), string});
        }
        return n;
    }

    public static void S() {
        a0D.k();
        if (G >= 2) {
            GlStateManagerInvoker.d(33995);
            aVE.i(ail_1.ew);
            GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)o, (int)R);
            aVE.i(ail_1.n);
            GlStateManagerInvoker.d(33984);
        }
        ahf_1.a(u3_0.a(dp));
    }

    public static void av() {
        a0D.r();
        if (b6) {
            int n = 0;
            if (n < ef) {
                if ((C & 1 << n) != 0) {
                    GlStateManagerInvoker.d(33984 + d9[n]);
                    GL11.glTexParameteri((int)3553, (int)10241, (int)9987);
                    a4t_0.a(3553);
                }
                ++n;
            }
            GlStateManagerInvoker.d(33984);
        }
    }

    public static a0D c(String string) {
        return aNK.a(string, bX);
    }

    public static int ar() {
        return aG[m * 2 + 1];
    }

    public static void c(int n, int n2) {
        a0D.r();
        GL11.glFogi((int)n, (int)n2);
        if (n == 2917) {
            M = n2;
            if (ao) {
                aVE.a(ail_1.fE, M);
            }
        }
    }

    public static void aK() {
        int n;
        a0D.r();
        if (ch) {
            aVE.i(ail_1.ja);
            l__0.a(36160, 36096, 3553, HD.b(Y, 0), 0);
            GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            aY_.a(ce[30]);
            aVE.l(ail_1.fy);
            GL11.glClear((int)16640);
            aVE.i(ail_1.g3);
        }
        aVE.i(ail_1.aB);
        if (bH[0]) {
            aY_.c(36064);
            GL11.glClear((int)16384);
        }
        if (bH[1]) {
            aY_.c(36065);
            GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glClear((int)16384);
        }
        if ((n = 2) < ef) {
            if (bH[n]) {
                aY_.c(36064 + n);
                GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
                GL11.glClear((int)16384);
            }
            ++n;
        }
        aVE.a(cw);
        aVE.l(ail_1.dM);
        aVE.i(ail_1.gD);
    }

    public static void aL() {
        ++cC;
        i = true;
        V6.c(ail_1.cc);
        jv_0.m(aVE.cP.renderGlobal);
    }

    public static boolean L() {
        a0D.k();
        return !aLR.c(bP);
    }

    public static void l(int n) {
        a0D.k();
        aVE.i(ail_1.eq);
        if (ch) {
            n = 30;
            if (cL[30] == 0) {
                aa = false;
                return;
            }
        }
        if (ba != n) {
            ba = n;
            adk_2.e(cL[n]);
            if (cL[n] == 0) {
                aa = false;
            }
            if (aVE.c(ail_1.hj, cE[n]) != 0) {
                aVE.cL[n] = 0;
            }
            IntBuffer intBuffer = ce[n];
            if (dI) {
                aVE.a(intBuffer);
                aVE.a(cE[n], ail_1.dJ, bO[n]);
            }
            C = I[n];
            WX.a(B, cL[ba]);
            u__0.b(J, cL[ba]);
            u__0.b(d_, cL[ba]);
            switch (n) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 16: 
                case 18: 
                case 19: 
                case 20: {
                    aa = true;
                    aVE.a(ail_1.hq, 0);
                    aVE.a(ail_1.ch, 1);
                    aVE.a(ail_1.hy, 2);
                    aVE.a(ail_1.aX, 3);
                    aVE.a(ail_1.bU, bI ? 5 : 4);
                    aVE.a(ail_1.aT, 4);
                    aVE.a(ail_1.ad, 4);
                    aVE.a(ail_1.cx, 5);
                    aVE.a(ail_1.D, 6);
                    if (L != null) {
                        aVE.a(ail_1.iX, 7);
                        aVE.a(ail_1.c0, 8);
                        aVE.a(ail_1.f4, 9);
                        aVE.a(ail_1.gw, 10);
                    }
                    aVE.a(ail_1.dC, 12);
                    aVE.a(ail_1.bK, 13);
                    aVE.a(ail_1.cW, 13);
                    aVE.a(ail_1.jo, 14);
                    aVE.a(ail_1.fq, 15);
                }
                default: {
                    aa = false;
                }
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: {
                    aa = false;
                    aVE.a(ail_1.dz, 0);
                    aVE.a(ail_1.f2, 1);
                    aVE.a(ail_1.bp, 2);
                    aVE.a(ail_1.bP, 3);
                    aVE.a(ail_1.hr, 7);
                    aVE.a(ail_1.cC, 8);
                    aVE.a(ail_1.h3, 9);
                    aVE.a(ail_1.b0, 10);
                    aVE.a(ail_1.gl, 0);
                    aVE.a(ail_1.he, 1);
                    aVE.a(ail_1.iW, 2);
                    aVE.a(ail_1.ex, 3);
                    aVE.a(ail_1.id, 7);
                    aVE.a(ail_1.jq, 8);
                    aVE.a(ail_1.d5, 9);
                    aVE.a(ail_1.in, 10);
                    aVE.a(ail_1.ao, bI ? 5 : 4);
                    aVE.a(ail_1.bQ, 4);
                    aVE.a(ail_1.c2, 4);
                    aVE.a(ail_1.e9, 5);
                    aVE.a(ail_1.iR, 6);
                    aVE.a(ail_1.hg, 6);
                    aVE.a(ail_1.gs, 11);
                    aVE.a(ail_1.I, 12);
                    aVE.a(ail_1.eY, 13);
                    aVE.a(ail_1.r, 13);
                    aVE.a(ail_1.gb, 14);
                    aVE.a(ail_1.iH, 15);
                }
                case 30: 
                case 31: 
                case 32: 
            }
            aVE.a(ail_1.hQ, 0);
            aVE.a(ail_1.O, 0);
            aVE.a(ail_1.ir, 1);
            aVE.a(ail_1.fk, 2);
            aVE.a(ail_1.hT, 3);
            aVE.a(ail_1.f3, bI ? 5 : 4);
            aVE.a(ail_1.aA, 4);
            aVE.a(ail_1.aJ, 4);
            aVE.a(ail_1.gd, 5);
            if (L != null) {
                aVE.a(ail_1.fh, 7);
                aVE.a(ail_1.aL, 8);
                aVE.a(ail_1.jm, 9);
                aVE.a(ail_1.c7, 10);
            }
            aVE.a(ail_1.e2, 13);
            aVE.a(ail_1.ab, 13);
            aVE.a(ail_1.fO, 14);
            aVE.a(ail_1.b3, 15);
            ItemStack itemStack = aVE.cP.player != null ? PlayerInvoker.h(aVE.cP.player) : null;
            Item item = itemStack != null ? act_2.k(itemStack) : null;
            int n2 = -1;
            Block block = null;
            if (item != null) {
                n2 = aLP.a(Item.k, item);
                block = (Block)a82.a(Block.m, n2);
            }
            int n3 = block != null ? BlocksInvoker.G(block) : 0;
            aVE.a(ail_1.gF, n2);
            aVE.a(ail_1.fK, n3);
            aVE.a(ail_1.af, ao ? M : 0);
            aVE.a(ail_1.dW, bF, c8, x);
            aVE.a(ail_1.hc, b_, N, a3);
            aVE.a(ail_1.fa, (int)(bT % 24000L));
            aVE.a(ail_1.t, (int)(bT / 24000L));
            aVE.a(ail_1.cV, bt);
            aVE.a(ail_1.a8, cx);
            aVE.a(ail_1.iZ, Q);
            aVE.a(ail_1.i3, aVE.n);
            aVE.a(ail_1.V, bb);
            aVE.a(ail_1.fB, ai);
            aVE.a(ail_1.f7, al);
            aVE.a(ail_1.fx, (float)o / (float)R);
            aVE.a(ail_1.iJ, (float)o);
            aVE.a(ail_1.ca, (float)R);
            aVE.a(ail_1.eB, 0.05f);
            aVE.a(ail_1.hx, (float)(aVE.cP.gameSettings.bp * 16));
            aVE.a(ail_1.e4, ay[0], ay[1], ay[2]);
            aVE.a(ail_1.gn, ae[0], ae[1], ae[2]);
            aVE.a(ail_1.aQ, dx[0], dx[1], dx[2]);
            aVE.a(ail_1.cP, cb[0], cb[1], cb[2]);
            aVE.a(ail_1.ha, (float)A, (float)bv, (float)cO);
            aVE.a(ail_1.dD, (float)d6, (float)dn, (float)cz);
            aVE.a(ail_1.h7, false, S);
            aVE.a(ail_1.fi, false, aJ);
            aVE.a(ail_1.c3, false, a7);
            aVE.a(ail_1.eS, false, by);
            aVE.a(ail_1.jg, false, bK);
            aVE.a(ail_1.bj, false, aI);
            if (bx > 0) {
                aVE.a(ail_1.jp, false, dE);
                aVE.a(ail_1.M, false, cp);
                aVE.a(ail_1.gj, false, bY);
                aVE.a(ail_1.dZ, false, cW);
            }
            aVE.a(ail_1.cf, aU);
            aVE.a(ail_1.fT, bu);
            aVE.a(ail_1.cZ, cY & 0xFFFF, cY >> 16);
            aVE.a(ail_1.d4, MathInvoker.a(bM), MathInvoker.a(X));
            aVE.a(ail_1.aW, c9[0], c9[1]);
            aVE.a(ail_1.dI, bz);
            aVE.a(ail_1.gz, du);
            aVE.a(ail_1.gk, bg);
            aVE.a(ail_1.dk, aN);
            aVE.a(ail_1.cp, aVE.cP.gameSettings.aE);
            aVE.a(ail_1.fF, aVE.cP.gameSettings.g ? 1 : 0);
            aVE.a(ail_1.ig, a2);
            aVE.a(ail_1.bX, d0, s);
            aVE.c(ail_1.iz, cE[n]);
        }
    }

    public static void C() {
        try {
            ara_2.a(ail_1.bT);
        }
        catch (Throwable throwable) {
            return;
        }
        throw new RuntimeException(ail_1.az);
    }

    public static void E() {
        aVE.l(16);
    }

    public static void W() {
        a0D.k();
        if (aq) {
            aVE.l(16);
            aVE.ao();
        }
    }

    public static void a(String string, float f) {
        a0D.r();
        int n = cL[ba];
        if (n != 0) {
            int n2 = adk_2.b(n, string);
            adk_2.a(n2, f);
            aVE.c(cE[ba], string);
        }
    }

    public static void a(String string, IntBuffer intBuffer) {
        StringBuilder stringBuilder = new StringBuilder(128);
        aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(stringBuilder, string), ail_1.fX), HD.b(intBuffer)), ail_1.cJ), HD.f(intBuffer)), ail_1.ay), HD.a(intBuffer)), ail_1.cI);
        a0D.r();
        int n = HD.f(intBuffer);
        int n2 = 0;
        if (n2 < n) {
            aL0.c(aL0.a(stringBuilder, ail_1.hI), HD.b(intBuffer, n2));
            ++n2;
        }
        aL0.a(stringBuilder, ail_1.iu);
        V6.c(stringBuilder.toString());
    }

    public static boolean u() {
        return dA;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int e(String var0) {
        block102: {
            block141: {
                block140: {
                    block139: {
                        block138: {
                            block137: {
                                block135: {
                                    block136: {
                                        block134: {
                                            block133: {
                                                block132: {
                                                    block131: {
                                                        block130: {
                                                            block129: {
                                                                block128: {
                                                                    block127: {
                                                                        block126: {
                                                                            block125: {
                                                                                block124: {
                                                                                    block123: {
                                                                                        block122: {
                                                                                            block121: {
                                                                                                block120: {
                                                                                                    block119: {
                                                                                                        block118: {
                                                                                                            block117: {
                                                                                                                block116: {
                                                                                                                    block115: {
                                                                                                                        block114: {
                                                                                                                            block113: {
                                                                                                                                block112: {
                                                                                                                                    block111: {
                                                                                                                                        block110: {
                                                                                                                                            block109: {
                                                                                                                                                block108: {
                                                                                                                                                    block107: {
                                                                                                                                                        block106: {
                                                                                                                                                            block105: {
                                                                                                                                                                block104: {
                                                                                                                                                                    block103: {
                                                                                                                                                                        a0D.k();
                                                                                                                                                                        var2_1 = adk_2.d(35632);
                                                                                                                                                                        if (var2_1 == 0) {
                                                                                                                                                                            return 0;
                                                                                                                                                                        }
                                                                                                                                                                        var3_2 = new StringBuilder(131072);
                                                                                                                                                                        var4_3 = null;
                                                                                                                                                                        try {
                                                                                                                                                                            var4_3 = new BufferedReader(new InputStreamReader(dk_0.b(aVE.cA, var0)));
                                                                                                                                                                        }
                                                                                                                                                                        catch (Exception var5_4) {
                                                                                                                                                                            try {
                                                                                                                                                                                var4_3 = new BufferedReader(new FileReader(new File(var0)));
                                                                                                                                                                            }
                                                                                                                                                                            catch (Exception var6_6) {
                                                                                                                                                                                adk_2.a(var2_1);
                                                                                                                                                                                return 0;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        var5_5 = aVE.a(aVE.bX);
                                                                                                                                                                        var6_7 = new ArrayList<String>();
                                                                                                                                                                        if (var4_3 == null) break block102;
                                                                                                                                                                        try {
                                                                                                                                                                            var4_3 = YV.a(var4_3, var0, aVE.cA, 0, var6_7, 0);
                                                                                                                                                                            var7_8 = auq_0.c(var4_3);
                                                                                                                                                                            auq_0.a(var4_3);
                                                                                                                                                                        }
                                                                                                                                                                        catch (Exception var7_9) {
                                                                                                                                                                            V6.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ail_1.d3), var0), ail_1.dl).toString());
                                                                                                                                                                            ch_2.a(var7_9);
                                                                                                                                                                            adk_2.a(var2_1);
                                                                                                                                                                            return 0;
                                                                                                                                                                        }
                                                                                                                                                                        var7_8 = aVE.a(var7_8, var5_5);
                                                                                                                                                                        aL0.a(aL0.a(var3_2, var7_8), '\n');
                                                                                                                                                                        if (StringInvoker.k(var7_8, ail_1.bR)) break block102;
                                                                                                                                                                        if (!StringInvoker.k(var7_8, ail_1.er)) break block103;
                                                                                                                                                                        if (aVE.bx >= 1) break block102;
                                                                                                                                                                        aVE.bx = 1;
                                                                                                                                                                    }
                                                                                                                                                                    if (!StringInvoker.k(var7_8, ail_1.ix)) break block104;
                                                                                                                                                                    aVE.bI = true;
                                                                                                                                                                    if (aVE.bx >= 2) break block102;
                                                                                                                                                                    aVE.bx = 2;
                                                                                                                                                                }
                                                                                                                                                                if (!StringInvoker.k(var7_8, ail_1.e7)) break block105;
                                                                                                                                                                if (aVE.bx >= 1) break block102;
                                                                                                                                                                aVE.bx = 1;
                                                                                                                                                            }
                                                                                                                                                            if (!StringInvoker.k(var7_8, ail_1.b7)) break block106;
                                                                                                                                                            if (aVE.bx >= 2) break block102;
                                                                                                                                                            aVE.bx = 2;
                                                                                                                                                        }
                                                                                                                                                        if (!StringInvoker.k(var7_8, ail_1.iF)) break block107;
                                                                                                                                                        if (aVE.dS >= 1) break block102;
                                                                                                                                                        aVE.dS = 1;
                                                                                                                                                    }
                                                                                                                                                    if (!StringInvoker.k(var7_8, ail_1.iB)) break block108;
                                                                                                                                                    if (aVE.dS >= 1) break block102;
                                                                                                                                                    aVE.dS = 1;
                                                                                                                                                }
                                                                                                                                                if (!StringInvoker.k(var7_8, ail_1.ik)) break block109;
                                                                                                                                                if (aVE.dS >= 2) break block102;
                                                                                                                                                aVE.dS = 2;
                                                                                                                                            }
                                                                                                                                            if (!StringInvoker.k(var7_8, ail_1.fs)) break block110;
                                                                                                                                            if (aVE.G >= 1) break block102;
                                                                                                                                            aVE.G = 1;
                                                                                                                                        }
                                                                                                                                        if (!StringInvoker.k(var7_8, ail_1.cH)) break block111;
                                                                                                                                        if (aVE.G >= 2) break block102;
                                                                                                                                        aVE.G = 2;
                                                                                                                                    }
                                                                                                                                    if (!StringInvoker.k(var7_8, ail_1.fb)) break block112;
                                                                                                                                    if (aVE.G >= 3) break block102;
                                                                                                                                    aVE.G = 3;
                                                                                                                                }
                                                                                                                                if (!StringInvoker.k(var7_8, ail_1.F)) ** GOTO lbl92
                                                                                                                                if (aVE.D[1] != 6408) break block102;
                                                                                                                                aVE.D[1] = 34836;
lbl92:
                                                                                                                                // 2 sources

                                                                                                                                if (aVE.ef >= 5) break block113;
                                                                                                                                if (!StringInvoker.k(var7_8, ail_1.aG)) break block113;
                                                                                                                                aVE.ef = 5;
                                                                                                                            }
                                                                                                                            if (aVE.ef < 6) {
                                                                                                                                if (!StringInvoker.k(var7_8, ail_1.p)) break block114;
                                                                                                                                aVE.ef = 6;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (aVE.ef < 7) {
                                                                                                                            if (!StringInvoker.k(var7_8, ail_1.jl)) break block115;
                                                                                                                            aVE.ef = 7;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (aVE.ef < 8) {
                                                                                                                        if (!StringInvoker.k(var7_8, ail_1.H)) break block116;
                                                                                                                        aVE.ef = 8;
                                                                                                                    }
                                                                                                                }
                                                                                                                if (aVE.ef < 5) {
                                                                                                                    if (!StringInvoker.k(var7_8, ail_1.gc)) break block117;
                                                                                                                    aVE.ef = 5;
                                                                                                                }
                                                                                                            }
                                                                                                            if (aVE.ef < 6) {
                                                                                                                if (!StringInvoker.k(var7_8, ail_1.fr)) break block118;
                                                                                                                aVE.ef = 6;
                                                                                                            }
                                                                                                        }
                                                                                                        if (aVE.ef < 7) {
                                                                                                            if (!StringInvoker.k(var7_8, ail_1.ag)) break block119;
                                                                                                            aVE.ef = 7;
                                                                                                        }
                                                                                                    }
                                                                                                    if (aVE.ef < 8) {
                                                                                                        if (!StringInvoker.k(var7_8, ail_1.g2)) break block120;
                                                                                                        aVE.ef = 8;
                                                                                                    }
                                                                                                }
                                                                                                if (!StringInvoker.k(var7_8, ail_1.fP)) break block121;
                                                                                                aVE.ac = true;
                                                                                            }
                                                                                            if (!StringInvoker.k(var7_8, ail_1.aF)) ** GOTO lbl143
                                                                                            var8_10 /* !! */  = StringInvoker.a(var7_8, ail_1.c4, 4);
                                                                                            V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.bV), var8_10 /* !! */ [2]).toString());
                                                                                            aVE.P = aVE.bQ = P8.a(var8_10 /* !! */ [2]);
                                                                                            aVE.ed = aVE.bB = MathInvoker.a((float)aVE.P * aVE.bA);
lbl143:
                                                                                            // 2 sources

                                                                                            if (!StringInvoker.k(var7_8, ail_1.W)) ** GOTO lbl149
                                                                                            var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.c6);
                                                                                            V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.aZ), var8_10 /* !! */ [1]).toString());
                                                                                            aVE.P = aVE.bQ = P8.a(var8_10 /* !! */ [1]);
                                                                                            aVE.ed = aVE.bB = MathInvoker.a((float)aVE.P * aVE.bA);
lbl149:
                                                                                            // 2 sources

                                                                                            if (!StringInvoker.k(var7_8, ail_1.iA)) ** GOTO lbl155
                                                                                            var8_10 /* !! */  = StringInvoker.a(var7_8, ail_1.bA, 4);
                                                                                            V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.ju), var8_10 /* !! */ [2]).toString());
                                                                                            aVE.dv = axx_1.a(var8_10 /* !! */ [2]);
                                                                                            aVE.aw = false;
lbl155:
                                                                                            // 2 sources

                                                                                            if (!StringInvoker.k(var7_8, ail_1.cu)) ** GOTO lbl161
                                                                                            var8_10 /* !! */  = StringInvoker.a(var7_8, ail_1.a3, 4);
                                                                                            V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.gU), var8_10 /* !! */ [2]).toString());
                                                                                            aVE.aD = axx_1.a(var8_10 /* !! */ [2]);
                                                                                            aVE.aw = true;
lbl161:
                                                                                            // 2 sources

                                                                                            if (!StringInvoker.k(var7_8, ail_1.eV)) ** GOTO lbl167
                                                                                            var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.ej);
                                                                                            V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.dH), var8_10 /* !! */ [1]).toString());
                                                                                            aVE.aD = axx_1.a(var8_10 /* !! */ [1]);
                                                                                            aVE.aw = true;
lbl167:
                                                                                            // 2 sources

                                                                                            if (!StringInvoker.k(var7_8, ail_1.dn)) ** GOTO lbl172
                                                                                            var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.gS);
                                                                                            V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.dU), var8_10 /* !! */ [1]).toString());
                                                                                            aVE.an = axx_1.a(var8_10 /* !! */ [1]);
lbl172:
                                                                                            // 2 sources

                                                                                            if (!StringInvoker.k(var7_8, ail_1.U)) ** GOTO lbl177
                                                                                            var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.iQ);
                                                                                            V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.hK), var8_10 /* !! */ [1]).toString());
                                                                                            aVE.ah = axx_1.a(var8_10 /* !! */ [1]);
lbl177:
                                                                                            // 2 sources

                                                                                            if (!StringInvoker.k(var7_8, ail_1.fz)) break block122;
                                                                                            V6.c(ail_1.w);
                                                                                            a7r_0.a(aVE.dY, true);
                                                                                        }
                                                                                        if (!StringInvoker.k(var7_8, ail_1.hF)) break block123;
                                                                                        V6.c(ail_1.cR);
                                                                                        a7r_0.a(aVE.b4, true);
                                                                                    }
                                                                                    if (!StringInvoker.k(var7_8, ail_1.hm)) break block124;
                                                                                    V6.c(ail_1.i5);
                                                                                    a7r_0.a(aVE.a8, true);
                                                                                }
                                                                                if (!StringInvoker.k(var7_8, ail_1.hl)) break block125;
                                                                                V6.c(ail_1.fR);
                                                                                aVE.a8[0] = true;
                                                                            }
                                                                            if (!StringInvoker.k(var7_8, ail_1.c_)) break block126;
                                                                            V6.c(ail_1.hO);
                                                                            aVE.a8[1] = true;
                                                                        }
                                                                        if (!StringInvoker.k(var7_8, ail_1.eo)) break block127;
                                                                        V6.c(ail_1.jj);
                                                                        aVE.dY[0] = true;
                                                                    }
                                                                    if (!StringInvoker.k(var7_8, ail_1.iL)) break block128;
                                                                    V6.c(ail_1.gm);
                                                                    aVE.dY[1] = true;
                                                                }
                                                                if (!StringInvoker.k(var7_8, ail_1.dA)) break block129;
                                                                V6.c(ail_1.ba);
                                                                aVE.b4[0] = true;
                                                            }
                                                            if (!StringInvoker.k(var7_8, ail_1.dw)) break block130;
                                                            V6.c(ail_1.f6);
                                                            aVE.b4[1] = true;
                                                        }
                                                        if (!StringInvoker.k(var7_8, ail_1.eC)) break block131;
                                                        V6.c(ail_1.gq);
                                                        aVE.a5[0] = true;
                                                    }
                                                    if (!StringInvoker.k(var7_8, ail_1.gT)) break block132;
                                                    V6.c(ail_1.f1);
                                                    aVE.a5[1] = true;
                                                }
                                                if (!StringInvoker.k(var7_8, ail_1.fI)) break block133;
                                                V6.c(ail_1.iV);
                                                aVE.cB[0] = true;
                                            }
                                            if (!StringInvoker.k(var7_8, ail_1.hw)) break block134;
                                            V6.c(ail_1.eR);
                                            aVE.cB[1] = true;
                                        }
                                        if (!StringInvoker.k(var7_8, ail_1.gR)) ** GOTO lbl260
                                        var8_10 /* !! */  = StringInvoker.a(var7_8, ail_1.iG, 4);
                                        V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.de), var8_10 /* !! */ [2]).toString());
                                        aVE.ax = axx_1.a(var8_10 /* !! */ [2]);
lbl260:
                                        // 2 sources

                                        if (!StringInvoker.k(var7_8, ail_1.b8)) ** GOTO lbl265
                                        var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.eN);
                                        V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.fJ), var8_10 /* !! */ [1]).toString());
                                        aVE.ax = axx_1.a(var8_10 /* !! */ [1]);
lbl265:
                                        // 2 sources

                                        if (!StringInvoker.k(var7_8, ail_1.cB)) ** GOTO lbl270
                                        var8_10 /* !! */  = StringInvoker.a(var7_8, ail_1.L, 4);
                                        V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.dR), var8_10 /* !! */ [2]).toString());
                                        aVE.dk = axx_1.a(var8_10 /* !! */ [2]);
lbl270:
                                        // 2 sources

                                        if (!StringInvoker.k(var7_8, ail_1.fu)) ** GOTO lbl275
                                        var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.hB);
                                        V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.hR), var8_10 /* !! */ [1]).toString());
                                        aVE.dk = axx_1.a(var8_10 /* !! */ [1]);
lbl275:
                                        // 2 sources

                                        if (!StringInvoker.k(var7_8, ail_1.em)) ** GOTO lbl280
                                        var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.eF);
                                        V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.S), var8_10 /* !! */ [1]).toString());
                                        aVE.b3 = axx_1.a(var8_10 /* !! */ [1]);
lbl280:
                                        // 2 sources

                                        if (!StringInvoker.k(var7_8, ail_1.bu)) ** GOTO lbl285
                                        var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.cL);
                                        V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.k), var8_10 /* !! */ [1]).toString());
                                        aVE.bj = axx_1.a(var8_10 /* !! */ [1]);
lbl285:
                                        // 2 sources

                                        if (!StringInvoker.k(var7_8, ail_1.ek)) ** GOTO lbl290
                                        var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.au);
                                        V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.iO), var8_10 /* !! */ [1]).toString());
                                        aVE.eb = axx_1.a(var8_10 /* !! */ [1]);
lbl290:
                                        // 2 sources

                                        if (!StringInvoker.k(var7_8, ail_1.gA)) ** GOTO lbl295
                                        var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.N);
                                        V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.bk), var8_10 /* !! */ [1]).toString());
                                        aVE.cR = ys_2.a(axx_1.a(var8_10 /* !! */ [1]), 0.0f, 1.0f);
lbl295:
                                        // 2 sources

                                        if (!StringInvoker.k(var7_8, ail_1.b9)) break block135;
                                        var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.ie);
                                        var9_11 = P8.a(var8_10 /* !! */ [1]);
                                        if (var9_11 <= 1) break block136;
                                        V6.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ail_1.o), var9_11), ail_1.c1).toString());
                                        aVE.cs = var9_11;
                                    }
                                    aVE.cs = 1;
                                }
                                if (!StringInvoker.k(var7_8, ail_1.aC)) ** GOTO lbl314
                                var8_10 /* !! */  = StringInvoker.g(var7_8, ail_1.it);
                                V6.c(ail_1.dr);
                                V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.cO), var8_10 /* !! */ [1]).toString());
                                aVE.bc = P8.a(var8_10 /* !! */ [1]);
                                aVE.b9 = true;
lbl314:
                                // 2 sources

                                if (!StringInvoker.k(var7_8, ail_1.hM)) break block137;
                                var8_10 /* !! */  = ow_1.a(aVE.c4, var7_8);
                                wk_2.a((Matcher)var8_10 /* !! */ );
                                var9_12 = wk_2.b((Matcher)var8_10 /* !! */ , 1);
                                var10_15 = wk_2.b((Matcher)var8_10 /* !! */ , 2);
                                var11_18 = aVE.g(var9_12);
                                var12_19 = aVE.j(var10_15);
                                if (var11_18 < 0 || var12_19 == 0) break block137;
                                aVE.D[var11_18] = var12_19;
                                V6.b(ail_1.dN, new Object[]{var9_12, var10_15});
                            }
                            if (!StringInvoker.k(var7_8, ail_1.cK)) ** GOTO lbl341
                            if (!StringInvoker.k(var0, ail_1.iv)) break block102;
                            var8_10 /* !! */  = ow_1.a(aVE.F, var7_8);
                            wk_2.a((Matcher)var8_10 /* !! */ );
                            var9_13 = wk_2.b((Matcher)var8_10 /* !! */ , 1);
                            var10_16 = aVE.g(var9_13);
                            aVE.bH[var10_16] = false;
                            V6.b(ail_1.bM, new Object[]{var9_13});
lbl341:
                            // 2 sources

                            if (!StringInvoker.k(var7_8, ail_1.ea)) break block138;
                            V6.c(ail_1.fC);
                            aVE.D[7] = 34836;
                        }
                        if (!StringInvoker.k(var7_8, ail_1.fn)) break block139;
                        V6.c(ail_1.is);
                        aVE.D[7] = 34837;
                    }
                    if (!StringInvoker.k(var7_8, ail_1.jc)) break block140;
                    V6.c(ail_1.fc);
                    aVE.D[7] = 32852;
                }
                if (!StringInvoker.k(var7_8, ail_1.Z)) ** GOTO lbl375
                if (StringInvoker.k(var0, ail_1.bH)) break block141;
                if (!StringInvoker.k(var0, ail_1.bb)) break block102;
            }
            var8_10 /* !! */  = ow_1.a(aVE.ca, var7_8);
            wk_2.a((Matcher)var8_10 /* !! */ );
            var9_14 = wk_2.b((Matcher)var8_10 /* !! */ , 1);
            var10_17 = aVE.g(var9_14);
            if (var10_17 < 0) ** GOTO lbl375
            aVE.cJ |= 1 << var10_17;
            V6.b(ail_1.cS, new Object[]{var9_14});
lbl375:
            // 3 sources

            if (!StringInvoker.k(var7_8, ail_1.eD)) break block102;
            var8_10 /* !! */  = StringInvoker.a(var7_8, ail_1.g_, 4);
            aVE.dR = var8_10 /* !! */ [2];
        }
        if (aVE.bl) {
            aVE.a(var0, var3_2.toString());
        }
        adk_2.a(var2_1, var3_2);
        adk_2.c(var2_1);
        if (aY_.b(var2_1, 35713) != 1) {
            V6.a(aL0.a(aL0.a(new StringBuilder(), ail_1.d6), var0).toString());
        }
        aVE.a(var2_1, var0, var6_7);
        return var2_1;
    }

    public static void ag() {
        a0D.k();
        if (aq) {
            aVE.l(aE ? 3 : 2);
        }
    }

    private static a0D[] b(a0D[] a0DArray) {
        ArrayList arrayList = new ArrayList();
        a0D[] a0DArray2 = a0DArray;
        a0D.r();
        int n = a0DArray2.length;
        int n2 = 0;
        if (n2 < n) {
            a0D a0D2 = a0DArray2[n2];
            if (mk_0.e(a0D2)) {
                ListInvoker.add(arrayList, a0D2);
            }
            ++n2;
        }
        a0DArray2 = (a0D[])ListInvoker.toArray(arrayList, new a0D[ListInvoker.size(arrayList)]);
        return a0DArray2;
    }

    public static boolean a(a5w_0 a5w_02) {
        a0D.r();
        switch (a5w_02) {
            case SOLID: {
                return aLR.d(cU);
            }
            case CUTOUT: {
                return aLR.d(dq);
            }
            case CUTOUT_MIPPED: {
                return aLR.d(dZ);
            }
            case TRANSLUCENT: {
                return aLR.d(cH);
            }
        }
        return false;
    }

    public static void aJ() {
        GL11.glRotatef((float)(eb * 1.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        aVE.i(ail_1.eG);
    }

    private static String a(String string, a0D[] a0DArray) {
        a0D[] a0DArray2;
        int n;
        int n2;
        a0D.k();
        if (a0DArray != null && a0DArray.length > 0 && (n2 = 0) < (n = (a0DArray2 = a0DArray).length)) {
            a0D a0D2 = a0DArray2[n2];
            mk_0.i(a0D2);
            if (mk_0.a(a0D2, string)) {
                string = mk_0.d(a0D2);
            }
            ++n2;
        }
        return string;
    }

    public static void m(int n) {
        GlStateManager.c(n);
        if (ao) {
            aVE.a(ail_1.eu, n);
        }
    }

    public static void ao() {
        a0D.r();
        if (i) {
            Object object;
            i = false;
            V6.c(ail_1.g7);
            Iterator iterator = ms_0.a(FT.b(MCInvoker.j(cP)).values());
            if (dz_0.c(iterator) && (object = dz_0.b(iterator)) instanceof jg_1) {
                jg_1 jg_12 = (jg_1)object;
                aVE.a(fl_0.a(jg_12));
            }
        }
    }

    public static void ap() {
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableBlend();
    }

    private static k5_0[] a(Properties properties, int n) {
        Object object;
        String string;
        String string2 = aL0.a(aL0.a(aL0.a(new StringBuilder(), ail_1.hW), bC[n]), ail_1.eI).toString();
        a0D.r();
        Set set = dk_1.c(properties);
        ArrayList arrayList = new ArrayList();
        k5_0[] k5_0Array = aS0.f(set);
        if (dz_0.c((Iterator)k5_0Array) && StringInvoker.e(string = (String)(object = dz_0.b((Iterator)k5_0Array)), string2)) {
            InputStream inputStream;
            String string3;
            int n2;
            String string4;
            block6: {
                String string5 = StringInvoker.a(string, StringInvoker.c(string2));
                string4 = StringInvoker.h(dk_1.a(properties, string));
                n2 = aVE.b(n, string5);
                V6.b(aL0.a(aL0.a(new StringBuilder(), ail_1.eM), string).toString());
                string3 = aL0.a(aL0.a(new StringBuilder(), ail_1.i1), MZ.a(string4, ail_1.gN)).toString();
                inputStream = dk_0.b(cA, string3);
                if (inputStream != null) break block6;
                V6.b(aL0.a(aL0.a(new StringBuilder(), ail_1.bC), string4).toString());
            }
            try {
                IOUtilsInvoker.closeQuietly(inputStream);
                JR jR = new JR(string3);
                tg_1.a(jR, MCInvoker.x(cP));
                k5_0 k5_02 = new k5_0(n2, string3, jR);
                ListInvoker.add(arrayList, k5_02);
            }
            catch (IOException iOException) {
                V6.b(aL0.a(aL0.a(new StringBuilder(), ail_1.cE), string4).toString());
                V6.b(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ail_1.bG), ara_2.b(iOException.getClass())), ail_1.b2), a4E.a(iOException)).toString());
            }
        }
        if (ListInvoker.size(arrayList) <= 0) {
            return null;
        }
        k5_0Array = (k5_0[])ListInvoker.toArray(arrayList, new k5_0[ListInvoker.size(arrayList)]);
        return k5_0Array;
    }

    private static void aG() {
        aVE.b(L);
        aVE.b(dh);
        L = null;
        dh = null;
    }

    public static void a(int n, int n2, int n3, int n4) {
        a0D.r();
        GlStateManagerInvoker.a(true, true, true, true);
        if (ch) {
            GL11.glViewport((int)0, (int)0, (int)ed, (int)bB);
        }
        GL11.glViewport((int)0, (int)0, (int)o, (int)R);
        l__0.a(36160, d1);
        dI = true;
        GlStateManagerInvoker.b();
        GlStateManagerInvoker.enableDepth();
        aVE.a(a6);
        aVE.l(2);
        aVE.i(ail_1.bs);
    }

    private static boolean a(int n, String string, List<String> list) {
        a9w_0.b(1);
        a0D.k();
        int n2 = aY_.b(n, 35716);
        if (n2 <= 1) {
            return true;
        }
        int n3 = 0;
        if (n3 < ListInvoker.size(list)) {
            String string2 = (String)ListInvoker.get(list, n3);
            V6.c(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), ail_1.dG), n3 + 1), ail_1.e0), string2).toString());
            ++n3;
        }
        String string3 = aY_.c(n, n2);
        V6.c(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ail_1.iE), string), ail_1.s), string3).toString());
        return false;
    }

    private static void A() {
        block6: {
            a0D.k();
            b5 = new HashMap<String, String>();
            if (aQ) {
                ArrayList arrayList = new ArrayList();
                String string = ail_1.dB;
                String string2 = ail_1.B;
                String string3 = ail_1.gO;
                ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(new StringBuilder(), string), string2), string3).toString());
                if (!ys_2.ax().gameSettings.equals(string2)) {
                    ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(new StringBuilder(), string), ys_2.ax().gameSettings), string3).toString());
                }
                Iterator iterator = ListInvoker.iterator(arrayList);
                if (!dz_0.c(iterator)) break block6;
                String string4 = (String)dz_0.b(iterator);
                InputStream inputStream = dk_0.b(cA, string4);
                try {
                    Properties properties = new Properties();
                    IN.a(inputStream, properties);
                    aZ6.b(inputStream);
                    Iterator iterator2 = aS0.f(dk_1.c(properties));
                    if (dz_0.c(iterator2)) {
                        Object object = dz_0.b(iterator2);
                        String string5 = dk_1.a(properties, (String)object);
                        MapInvoker.c(b5, (String)object, string5);
                    }
                }
                catch (IOException iOException) {
                    a4E.b(iOException);
                }
            }
        }
    }

    public static boolean ac() {
        a0D.k();
        return aLR.e(a9) || aLR.d(a9);
    }

    public static void n() {
        a0D.k();
        aVE.o();
        aVE.d();
        aVE.l(aE ? 3 : 2);
    }

    private static int a(int n, String string, String string2) {
        aVE.i(ail_1.e1);
        a0D.k();
        int n2 = adk_2.a();
        aVE.i(ail_1.gQ);
        if (n2 != 0) {
            e = false;
            cd = false;
            ab = false;
            int n3 = aVE.d(string);
            int n4 = aVE.e(string2);
            aVE.i(ail_1.gC);
            if (n3 == 0 && n4 == 0) {
                adk_2.a(n2);
                n2 = 0;
            }
            if (n3 != 0) {
                adk_2.d(n2, n3);
                aVE.i(ail_1.dh);
            }
            if (n4 != 0) {
                adk_2.d(n2, n4);
                aVE.i(ail_1.h6);
            }
            if (e) {
                oc_0.a(n2, af, ail_1.K);
                aVE.i(ail_1.dm);
            }
            if (cd) {
                oc_0.a(n2, aO, ail_1.f5);
                aVE.i(ail_1.ht);
            }
            if (ab) {
                oc_0.a(n2, at, ail_1.hd);
                aVE.i(ail_1.hz);
            }
            adk_2.b(n2);
            if (aY_.a(n2, 35714) != 1) {
                V6.a(aL0.c(aL0.a(new StringBuilder(), ail_1.a_), n2).toString());
            }
            aVE.a(n2, aL0.a(aL0.a(aL0.a(new StringBuilder(), string), ail_1.dv), string2).toString());
            if (n3 != 0) {
                adk_2.a(n2, n3);
                adk_2.a(n3);
            }
            if (n4 != 0) {
                adk_2.a(n2, n4);
                adk_2.a(n4);
            }
            aVE.cL[n] = n2;
            aVE.l(n);
            adk_2.f(n2);
            aVE.l(0);
            aVE.a(n2, aL0.a(aL0.a(aL0.a(new StringBuilder(), string), ail_1.cY), string2).toString());
            int n5 = aY_.a(n2, 35715);
            if (n5 != 1) {
                String string3 = ail_1.ed;
                aVE.f(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ail_1.db), string3), cE[n]), string3).toString());
                adk_2.a(n2);
                n2 = 0;
            }
        }
        return n2;
    }

    private static void K() {
        q0_0.d(dL);
        a0D.k();
        aLR.a(ds);
        aLR.a(a9);
        aLR.a(dG);
        aLR.a(bP);
        aLR.a(b8);
        aLR.a(dj);
        aLR.a(cZ);
        aLR.a(dU);
        aLR.a(cU);
        aLR.a(dq);
        aLR.a(dZ);
        aLR.a(cH);
        mz_2.a();
        if (cA != null) {
            mz_2.a(cA);
            String string = ail_1.dY;
            try {
                dk_0.b(cA, string);
                return;
            }
            catch (IOException iOException) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), ail_1.cD), string).toString());
            }
        }
    }

    public static boolean T() {
        a0D.k();
        return !aLR.c(cZ);
    }

    public static void i(int n) {
        GL11.glEnable((int)n);
        aVE.s();
    }

    public static void l() {
        dd = true;
        ao = true;
        aVE.a(cw);
        aVE.l(5);
        aVE.a(-2, 0);
    }

    private static String a(boolean bl) {
        return ail_1.eg;
    }

    public static int k(int n) {
        aVE.aG[aVE.m * 2 + 1] = aG[m * 2 + 1] & 0xFFFF0000 | n & 0xFFFF;
        return n;
    }

    public static void o() {
        ao = false;
        aVE.a(ail_1.ip, 0);
    }

    private static void az() {
        a0D.k();
        if (bx != 0) {
            int n;
            if (d5 != 0) {
                l__0.a(d5);
                GlStateManagerInvoker.a(Y);
                GlStateManagerInvoker.a(dB);
            }
            d5 = l__0.a();
            l__0.a(36160, d5);
            GL11.glDrawBuffer((int)0);
            GL11.glReadBuffer((int)0);
            GL11.glGenTextures((IntBuffer)((IntBuffer)iw_0.a(HD.h(Y), bx)));
            GL11.glGenTextures((IntBuffer)((IntBuffer)iw_0.a(HD.h(dB), dS)));
            HD.a(Y, 0);
            HD.a(dB, 0);
            int n2 = 0;
            if (n2 < bx) {
                GlStateManagerInvoker.k(HD.b(Y, n2));
                GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
                GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
                n = a5[n2] ? 9728 : 9729;
                GL11.glTexParameteri((int)3553, (int)10241, (int)n);
                GL11.glTexParameteri((int)3553, (int)10240, (int)n);
                if (a8[n2]) {
                    GL11.glTexParameteri((int)3553, (int)34892, (int)34894);
                }
                GL11.glTexImage2D((int)3553, (int)0, (int)6402, (int)ed, (int)bB, (int)0, (int)6402, (int)5126, (FloatBuffer)null);
                ++n2;
            }
            l__0.a(36160, 36096, 3553, HD.b(Y, 0), 0);
            aVE.i(ail_1.es);
            n2 = 0;
            if (n2 < dS) {
                GlStateManagerInvoker.k(HD.b(dB, n2));
                GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
                GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
                n = cB[n2] ? 9728 : 9729;
                GL11.glTexParameteri((int)3553, (int)10241, (int)n);
                GL11.glTexParameteri((int)3553, (int)10240, (int)n);
                GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)ed, (int)bB, (int)0, (int)32993, (int)33639, (ByteBuffer)null);
                l__0.a(36160, 36064 + n2, 3553, HD.b(dB, n2), 0);
                aVE.i(ail_1.e3);
                ++n2;
            }
            GlStateManagerInvoker.k(0);
            if (dS > 0) {
                aY_.a(c5);
            }
            if ((n2 = l__0.c(36160)) != 36053) {
                aVE.f(aL0.a(aL0.c(aL0.a(new StringBuilder(), ail_1.a0), n2), ail_1.bo).toString());
            }
            V6.c(ail_1.X);
        }
    }

    public static boolean p() {
        a0D.k();
        return !aLR.c(dj);
    }

    public static void O() {
        a0D.r();
        if ((double)bV != 1.0) {
            GL11.glScaled((double)1.0, (double)1.0, (double)bV);
        }
    }

    public static void aB() {
        a0D.r();
        if (aq && !ch) {
            aVE.a(ce[16]);
        }
    }

    public static void a(q1_0 q1_02) {
        Object object;
        Iterator iterator;
        a0D.k();
        if (q1_02 != null && dz_0.c(iterator = ListInvoker.iterator(q1_02.a)) && (object = dz_0.b(iterator)) instanceof a5Y) {
            aVE.a((a5Y)object);
        }
    }

    public static void B() {
        a0D.r();
        aVE.i(ail_1.cs);
        aVE.l(ail_1.c);
        if (!ch) {
            aVE.l(7);
        }
        aVE.i(ail_1.bx);
        aVE.l(ail_1.gB);
    }

    private static void Z() {
        y = false;
        ed = MathInvoker.a((float)P * bA);
        bB = MathInvoker.a((float)bQ * bA);
        aVE.az();
    }

    private static void b(k5_0[] k5_0Array) {
        k5_0[] k5_0Array2;
        int n;
        int n2;
        a0D.r();
        if (k5_0Array != null && (n2 = 0) < (n = (k5_0Array2 = k5_0Array).length)) {
            k5_0 k5_02 = k5_0Array2[n2];
            ITextureObject iTextureObject = pz_2.b(k5_02);
            aiv_2.a(u3_0.c(iTextureObject));
            ++n2;
        }
    }

    public static float as() {
        a0D.k();
        return an < 0.0f ? -1.0f : aD * an;
    }

    private static void aa() {
        Object object;
        block13: {
            Object object2;
            Object object3;
            a0D.k();
            k = new IdentityHashMap<Block, Integer>(300);
            if (MapInvoker.e(k) && dz_0.c((Iterator)(object = aS0.f(a82.c(Block.m))))) {
                object3 = (ResourceLocation)dz_0.b((Iterator)object);
                object2 = (Block)a82.a(Block.m, object3);
                int n = a82.c(Block.m, object2);
                MapInvoker.c(k, object2, P8.d(n));
            }
            object = null;
            try {
                object = new BufferedReader(new InputStreamReader(dk_0.b(cA, ail_1.cQ)));
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (object != null) {
                block14: {
                    String string;
                    block15: {
                        object3 = auq_0.c((BufferedReader)object);
                        if (object3 == null) break block13;
                        object2 = ow_1.a(dr, (CharSequence)object3);
                        if (!wk_2.a((Matcher)object2)) break block14;
                        string = wk_2.b((Matcher)object2, 1);
                        String string2 = wk_2.b((Matcher)object2, 2);
                        int n = P8.a(string2);
                        Block block = BlocksInvoker.a(string);
                        if (block == null) break block15;
                        MapInvoker.c(k, block, P8.d(n));
                    }
                    V6.a(ail_1.hs, new Object[]{string});
                }
                try {
                    V6.a(ail_1.dx, new Object[]{object3});
                }
                catch (Exception exception) {
                    V6.b(ail_1.gp);
                }
            }
        }
        if (object != null) {
            try {
                auq_0.a((BufferedReader)object);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static void b(ItemStack itemStack) {
        c2 = aVE.a(itemStack);
    }

    public static void a(float f) {
        float f2;
        float f3;
        float f4;
        Entity entity = MCInvoker.v(cP);
        double d = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
        double d2 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
        double d3 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
        d6 = d;
        dn = d2;
        cz = d3;
        a0D.r();
        GL11.glGetFloat((int)2983, (FloatBuffer)((FloatBuffer)aHB.a(by, 0)));
        a0L.a((FloatBuffer)aHB.a(bK, 0), (FloatBuffer)aHB.a(by, 0), cV, z);
        aHB.a(by, 0);
        aHB.a(bK, 0);
        GL11.glGetFloat((int)2982, (FloatBuffer)((FloatBuffer)aHB.a(S, 0)));
        a0L.a((FloatBuffer)aHB.a(aJ, 0), (FloatBuffer)aHB.a(S, 0), bJ, cI);
        aHB.a(S, 0);
        aHB.a(aJ, 0);
        GL11.glViewport((int)0, (int)0, (int)ed, (int)bB);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        if (aw) {
            GL11.glOrtho((double)(-aD), (double)aD, (double)(-aD), (double)aD, (double)0.05f, (double)256.0);
        }
        afs_2.a(dv, (float)ed / (float)bB, 0.05f, 256.0f);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-100.0f);
        GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        bR = BlockInvoker.d(aVE.cP.world, f);
        bb = bR < 0.75f ? bR + 0.25f : bR - 0.75f;
        float f5 = bR * -360.0f;
        float f6 = f4 = aj > 0.0f ? f5 % aj - aj * 0.5f : 0.0f;
        if ((double)bb <= 0.5) {
            GL11.glRotatef((float)(f5 - f4), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)eb, (float)1.0f, (float)0.0f, (float)0.0f);
            ai = bb;
        }
        GL11.glRotatef((float)(f5 + 180.0f - f4), (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glRotatef((float)eb, (float)1.0f, (float)0.0f, (float)0.0f);
        ai = bb - 0.5f;
        if (aw) {
            f3 = ah;
            f2 = f3 / 2.0f;
            GL11.glTranslatef((float)((float)d % f3 - f2), (float)((float)d2 % f3 - f2), (float)((float)d3 % f3 - f2));
        }
        f3 = bb * ((float)Math.PI * 2);
        f2 = MathHelper.b(f3);
        float f7 = MathHelper.h(f3);
        float f8 = eb * ((float)Math.PI * 2);
        float f9 = f2;
        float f10 = f7 * MathHelper.b(f8);
        float f11 = f7 * MathHelper.h(f8);
        if ((double)bb > 0.5) {
            f9 = -f2;
            f10 = -f10;
            f11 = -f11;
        }
        aVE.V[0] = f9;
        aVE.V[1] = f10;
        aVE.V[2] = f11;
        aVE.V[3] = 0.0f;
        GL11.glGetFloat((int)2983, (FloatBuffer)((FloatBuffer)aHB.a(dE, 0)));
        a0L.a((FloatBuffer)aHB.a(cp, 0), (FloatBuffer)aHB.a(dE, 0), bG, dV);
        aHB.a(dE, 0);
        aHB.a(cp, 0);
        GL11.glGetFloat((int)2982, (FloatBuffer)((FloatBuffer)aHB.a(bY, 0)));
        a0L.a((FloatBuffer)aHB.a(cW, 0), (FloatBuffer)aHB.a(bY, 0), bW, b7);
        aHB.a(bY, 0);
        aHB.a(cW, 0);
        aVE.a(ail_1.cN, false, by);
        aVE.a(ail_1.dF, false, bK);
        aVE.a(ail_1.cn, false, a7);
        aVE.a(ail_1.cT, false, S);
        aVE.a(ail_1.aM, false, aJ);
        aVE.a(ail_1.al, false, aI);
        aVE.a(ail_1.eH, false, dE);
        aVE.a(ail_1.h, false, cp);
        aVE.a(ail_1.dP, false, bY);
        aVE.a(ail_1.aE, false, cW);
        awu_1.a(aVE.cP.gameSettings, 1);
        aVE.i(ail_1.h4);
    }

    public static void a(int n, int n2) {
        aVE.aG[++aVE.m * 2] = n & 0xFFFF | n2 << 16;
        aVE.aG[aVE.m * 2 + 1] = 0;
    }

    public static String am() {
        a0D.k();
        return cA == null ? null : (cA instanceof ali_2 ? null : dk_0.a(cA));
    }

    public static void a(IntBuffer intBuffer) {
        a0D.r();
        if (intBuffer == null) {
            intBuffer = a6;
        }
        if (eg != intBuffer) {
            eg = intBuffer;
            aY_.a(intBuffer);
        }
    }

    public static ListInvoker[] e() {
        return bd;
    }

    public static void ab() {
        aVE.a(bX, cA);
    }

    public static void f() {
        a0D.k();
        if (br) {
            aVE.i(ail_1.g8);
            int n = 0;
            if (cu[n] != 0) {
                adk_2.a(cu[n]);
                aVE.i(ail_1.bz);
            }
            aVE.cu[n] = 0;
            aVE.cL[n] = 0;
            aVE.bO[n] = null;
            aVE.ce[n] = null;
            aVE.I[n] = 0;
            ++n;
            if (d1 != 0) {
                l__0.a(d1);
                d1 = 0;
                aVE.i(ail_1.iT);
            }
            if (d5 != 0) {
                l__0.a(d5);
                d5 = 0;
                aVE.i(ail_1.hE);
            }
            if (dX != null) {
                GlStateManagerInvoker.a(dX);
                aVE.b(dX);
                aVE.i(ail_1.i2);
            }
            if (aW != null) {
                GlStateManagerInvoker.a(aW);
                aVE.b(aW);
                aVE.i(ail_1.et);
            }
            if (Y != null) {
                GlStateManagerInvoker.a(Y);
                aVE.b(Y);
                aVE.i(ail_1.C);
            }
            if (dB != null) {
                GlStateManagerInvoker.a(dB);
                aVE.b(dB);
                aVE.i(ail_1.P);
            }
            if (cw != null) {
                aVE.b(cw);
            }
            if (cl != null) {
                XN.b(cl);
                cl = null;
            }
            V6.c(ail_1.ff);
            dF = 0;
            cS = false;
            br = false;
            aVE.i(ail_1.dp);
        }
    }

    public static void y() {
        a0D.r();
        if (aq) {
            aVE.i(ail_1.bn);
            aVE.l(13);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void r() {
        axm_2[] axm_2Array;
        axm_2[] axm_2Array2;
        int n;
        int n2;
        block9: {
            a0D.k();
            V6.c(ail_1.gZ);
            try {
                if (zq_2.m(ak)) break block9;
                zq_2.p(ak);
            }
            catch (Exception exception) {
                V6.a(aL0.a(aL0.a(new StringBuilder(), ail_1.jt), ak).toString());
            }
        }
        be = new a5F();
        dk_1.a(be, lo_2.b(axm_2.SHADER_PACK), ail_1.bW);
        if (zq_2.m(cT)) {
            try {
                FileReader fileReader = new FileReader(cT);
                dk_1.a(be, fileReader);
                CZ.a(fileReader);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (!zq_2.m(cT)) {
            try {
                aVE.j();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if ((n2 = 0) < (n = (axm_2Array2 = (axm_2Array = axm_2.values())).length)) {
            axm_2 axm_22 = axm_2Array2[n2];
            String string = lo_2.b(axm_22);
            String string2 = lo_2.a(axm_22);
            String string3 = dk_1.b(be, string, string2);
            aVE.a(axm_22, string3);
            ++n2;
        }
        aVE.af();
    }

    public static void M() {
        FloatBuffer floatBuffer = aP;
        aHB.a(floatBuffer);
        GL11.glGetFloat((int)2982, (FloatBuffer)floatBuffer);
        aHB.a(floatBuffer, O, 0, 16);
        a0L.a(cb, O, v);
        aVE.a(ail_1.eP, cb[0], cb[1], cb[2]);
    }

    public static void b(Entity entity) {
        a0D.r();
        if (aq && !ch && u__0.a(J)) {
            int n = ub_1.b(entity);
            u__0.a(J, n);
        }
    }

    public static void aM() {
        a0D.k();
        if (ch) {
            aVE.i(ail_1.ge);
        }
        if (!t) {
            aVE.ae();
        }
        aq = false;
        GlStateManagerInvoker.a(true, true, true, true);
        aVE.l(0);
        ne_0.e();
        aVE.i(ail_1.b);
    }

    private static int d(String string) {
        a0D.r();
        int n = adk_2.d(35633);
        if (n == 0) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder(131072);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(dk_0.b(cA, string)));
        }
        catch (Exception exception) {
            try {
                bufferedReader = new BufferedReader(new FileReader(new File(string)));
            }
            catch (Exception exception2) {
                adk_2.a(n);
                return 0;
            }
        }
        a0D[] a0DArray = aVE.a(bX);
        ArrayList<String> arrayList = new ArrayList<String>();
        if (bufferedReader != null) {
            String string2;
            block17: {
                block16: {
                    block15: {
                        try {
                            bufferedReader = YV.a(bufferedReader, string, cA, 0, arrayList, 0);
                            string2 = auq_0.c(bufferedReader);
                            auq_0.a(bufferedReader);
                        }
                        catch (Exception exception) {
                            V6.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ail_1.im), string), ail_1.f).toString());
                            ch_2.a(exception);
                            adk_2.a(n);
                            return 0;
                        }
                        string2 = aVE.a(string2, a0DArray);
                        aL0.a(aL0.a(stringBuilder, string2), '\n');
                        if (!StringInvoker.k(string2, ail_1.bZ)) break block15;
                        bm = true;
                        e = true;
                    }
                    if (!StringInvoker.k(string2, ail_1.aH)) break block16;
                    bp = true;
                    cd = true;
                }
                if (!StringInvoker.k(string2, ail_1.iK)) break block17;
                b = true;
            }
            if (StringInvoker.k(string2, ail_1.hJ)) {
                dK = true;
                ab = true;
            }
        }
        if (bl) {
            aVE.a(string, stringBuilder.toString());
        }
        adk_2.a(n, stringBuilder);
        adk_2.c(n);
        if (aY_.b(n, 35713) != 1) {
            V6.a(aL0.a(aL0.a(new StringBuilder(), ail_1.g9), string).toString());
        }
        aVE.a(n, string, arrayList);
        return n;
    }

    public static boolean aF() {
        a0D.r();
        return !aLR.c(b8);
    }

    public static void j() {
        axm_2[] axm_2Array;
        Object object;
        int n;
        int n2;
        a0D.k();
        V6.c(ail_1.bJ);
        if (be == null) {
            be = new a5F();
        }
        if ((n2 = 0) < (n = ((axm_2[])(object = (axm_2Array = axm_2.values()))).length)) {
            axm_2 axm_22 = object[n2];
            String string = lo_2.b(axm_22);
            String string2 = aVE.a(axm_22);
            dk_1.a(be, string, string2);
            ++n2;
        }
        try {
            object = new FileWriter(cT);
            dk_1.a(be, (Writer)object, (String)null);
            l2.a((FileWriter)object);
        }
        catch (Exception exception) {
            V6.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ail_1.bi), ara_2.b(exception.getClass())), ail_1.gJ), ch_2.b(exception)).toString());
        }
    }

    public static int a(String string, String string2, String string3) {
        a0D.r();
        int n = GL11.glGetError();
        if (n != 0) {
            ea_1.a(System.err, ail_1.dX, new Object[]{P8.d(n), afs_2.a(n), string, string2, string3});
        }
        return n;
    }

    private static void f(String string) {
        V6.a(string);
        kp_1.a(GW.f(aVE.cP.ingameGUI), new ChatComponentText(string));
    }

    private static void h(String string) {
        kp_1.a(GW.f(aVE.cP.ingameGUI), new ChatComponentText(string));
    }

    public static void x() {
        a0D.k();
        if (!ch) {
            if (G >= 3) {
                GlStateManagerInvoker.d(33996);
                GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)o, (int)R);
                GlStateManagerInvoker.d(33984);
            }
            GlStateManagerInvoker.enableDepth();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771);
            GlStateManagerInvoker.enableAlpha();
            aVE.l(20);
        }
    }

    public static int d(int n) {
        aVE.aG[aVE.m * 2] = aG[m * 2] & 0xFFFF | n << 16;
        return n;
    }

    public static void V() {
        a0D.r();
        if (!aF) {
            aF = true;
        }
        if (!br) {
            int n;
            String string;
            int n2;
            aVE.i(ail_1.aO);
            if (aVE.am() != null) {
                // empty if block
            }
            if (!aVE.ad.OpenGL20) {
                aVE.f(ail_1.g4);
            }
            if (!aVE.ad.GL_EXT_framebuffer_object) {
                aVE.f(ail_1.e6);
            }
            iw_0.a(HD.a(cw, 0), 8);
            iw_0.a(HD.a(aW, 0), 16);
            iw_0.a(HD.a(dX, 0), 3);
            iw_0.a(HD.a(c5, 0), 8);
            iw_0.a(HD.a(Y, 0), 2);
            iw_0.a(HD.a(dB, 0), 8);
            ef = 4;
            G = 1;
            dS = 0;
            bx = 0;
            ap = 1;
            bU = 1;
            a7r_0.a(D, 6408);
            a7r_0.a(bH, true);
            a7r_0.a(a8, false);
            a7r_0.a(dY, false);
            a7r_0.a(a5, false);
            a7r_0.a(b4, false);
            a7r_0.a(cB, false);
            ac = false;
            b9 = false;
            eb = 0.0f;
            ah = 2.0f;
            an = -1.0f;
            cR = -1.0f;
            bm = false;
            bp = false;
            b = false;
            dK = false;
            bI = false;
            d2 = false;
            aVE.aE();
            aH1 aH12 = aNK.a(bN, bX, false);
            String string2 = ail_1.aV;
            if (bL != null && ListInvoker.contains(p, P8.d(n2 = qq_2.j(aVE.bL.d)))) {
                string2 = aL0.a(aL0.c(aL0.a(new StringBuilder(), ail_1.f8), n2), ail_1.d9).toString();
            }
            if (bl) {
                aVE.a(new File(ak, ail_1.gI));
            }
            if ((string = cE[n2 = 0]).equals(ail_1.dE)) {
                aVE.cu[n2] = 0;
                aVE.cL[n2] = 0;
                aVE.bO[n2] = null;
                aVE.dt[n2] = null;
                aVE.I[n2] = 0;
            }
            dR = null;
            dy = null;
            cJ = 0;
            String string3 = aL0.a(aL0.a(new StringBuilder(), string2), string).toString();
            if (aH12 != null && aLA.c(aH12, string3)) {
                V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.gf), string3).toString());
                string = ail_1.gX;
                string3 = aL0.a(aL0.a(new StringBuilder(), string2), string).toString();
            }
            Object object = aL0.a(aL0.a(new StringBuilder(), ail_1.bh), string3).toString();
            int n3 = aVE.a(n2, aL0.a(aL0.a(new StringBuilder(), (String)object), ail_1.a2).toString(), aL0.a(aL0.a(new StringBuilder(), (String)object), ail_1.bd).toString());
            V6.c(aL0.a(aL0.a(new StringBuilder(), ail_1.dg), string3).toString());
            aVE.cL[n2] = aVE.cu[n2] = n3;
            aVE.bO[n2] = dR;
            aVE.dt[n2] = dy;
            aVE.I[n2] = n3 != 0 ? cJ : 0;
            ++n2;
            n2 = GL11.glGetInteger((int)34852);
            new HashMap();
            int n4 = 0;
            a7r_0.a(cF[n4], false);
            if (cL[n4] == 0) {
                aVE.ce[n4] = di;
            }
            string3 = bO[n4];
            object = H[n4];
            n3 = StringInvoker.c(string3);
            if (n3 > bU) {
                bU = n3;
            }
            if (n3 > n2) {
                n3 = n2;
            }
            aVE.ce[n4] = object;
            HD.c((IntBuffer)object, n3);
            int n5 = 0;
            if (n5 < n3) {
                int n6;
                int n7 = 0;
                if (StringInvoker.c(string3) > n5 && (n6 = StringInvoker.b(string3, n5) - 48) >= 0 && n6 <= 7) {
                    aVE.cF[n4][n6] = true;
                    n7 = n6 + 36064;
                    if (n6 > ap) {
                        ap = n6;
                    }
                    if (n6 > ef) {
                        ef = n6;
                        if (n6 >= 0 && n6 <= 1) {
                            n7 = n6 + 36064;
                            if (n6 > dS) {
                                dS = n6;
                            }
                        }
                    }
                }
                HD.a((IntBuffer)object, n5, n7);
                ++n5;
            }
            aVE.ce[n4] = cw;
            bU = ef;
            a7r_0.a(cF[n4], 0, ef, true);
            aVE.ce[n4] = c5;
            ++n4;
            ap = ef;
            dF = bx > 0 ? 1 : 0;
            cS = bx > 0;
            V6.c(aL0.c(aL0.a(new StringBuilder(), ail_1.jx), ef).toString());
            V6.c(aL0.c(aL0.a(new StringBuilder(), ail_1.il), G).toString());
            V6.c(aL0.c(aL0.a(new StringBuilder(), ail_1.fo), dS).toString());
            V6.c(aL0.c(aL0.a(new StringBuilder(), ail_1.hp), bx).toString());
            V6.c(aL0.c(aL0.a(new StringBuilder(), ail_1.i9), ap).toString());
            V6.c(aL0.c(aL0.a(new StringBuilder(), ail_1.J), bU).toString());
            iw_0.a(HD.a(cw, 0), bU);
            iw_0.a(HD.a(aW, 0), ef * 2);
            n4 = 0;
            if (n4 < bU) {
                HD.a(cw, n4, 36064 + n4);
                ++n4;
            }
            if (bU > n2) {
                aVE.f(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ail_1.fe), bU), ail_1.z), n2).toString());
            }
            iw_0.a(HD.a(c5, 0), dS);
            n4 = 0;
            if (n4 < dS) {
                HD.a(c5, n4, 36064 + n4);
                ++n4;
            }
            if (cL[n = (n4 = 0)] == 0 && dM[n] != n) {
                n = dM[n];
            }
            ++n4;
            aVE.U();
            aVE.Z();
            if (b9) {
                aVE.w();
            }
            if (dp == null) {
                dp = ahf_1.a();
            }
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.b(-90.0f, 0.0f, 1.0f, 0.0f);
            aVE.aJ();
            aVE.ak();
            GlStateManagerInvoker.popMatrix();
            br = true;
            aVE.aa();
            aVE.aL();
            aVE.i(ail_1.dK);
        }
    }

    public static void a(Minecraft minecraft, float f, long l4) {
        block20: {
            a0D.r();
            aVE.i(ail_1.d);
            aVE.a(aVE.cP.world);
            cP = minecraft;
            ProfilerInvoker.startSection(aVE.cP.mcProfiler, ail_1.g0);
            d8 = aVE.cP.entityRenderer;
            if (!br) {
                try {
                    aVE.V();
                }
                catch (IllegalStateException illegalStateException) {
                    if (!ys_2.b(dl_0.b(illegalStateException)).equals(ail_1.f_)) break block20;
                    aVE.f(aL0.a(aL0.a(new StringBuilder(), ail_1.E), dl_0.b(illegalStateException)).toString());
                    dl_0.a(illegalStateException);
                    aVE.m(cq);
                    return;
                }
            }
        }
        if (aVE.cP.displayWidth != u || aVE.cP.displayHeight != cr) {
            aVE.U();
        }
        if (y) {
            aVE.Z();
        }
        if ((cD = ((bT = BlockInvoker.f(aVE.cP.world)) - bs) % 24000L) < 0L) {
            cD += 24000L;
        }
        bs = bT;
        bt = BlockInvoker.g(aVE.cP.world);
        if (++cx >= 720720) {
            cx = 0;
        }
        ck = SystemInvoker.f();
        if (aK == 0L) {
            aK = ck;
        }
        c0 = ck - aK;
        aK = ck;
        Q = (float)c0 / 1000.0f;
        n += Q;
        n %= 3600.0f;
        al = BlockInvoker.i(minecraft.world, f);
        float f2 = (float)c0 * 0.01f;
        float f3 = (float)MathInvoker.l(MathInvoker.c(0.5) * (double)f2 / (double)(aU < al ? dk : ax));
        aU = aU * f3 + al * (1.0f - f3);
        Entity entity = MCInvoker.v(cP);
        aR = entity instanceof EntityLivingBase && atn_0.p((EntityLivingBase)entity);
        bu = (float)entity.posY * f + (float)entity.lastTickPosY * (1.0f - f);
        cY = ayj_0.b(entity, f);
        f3 = (float)c0 * 0.01f;
        float f4 = (float)MathInvoker.l(MathInvoker.c(0.5) * (double)f3 / (double)b3);
        bM = bM * f4 + (float)(cY & 0xFFFF) * (1.0f - f4);
        X = X * f4 + (float)(cY >> 16) * (1.0f - f4);
        int n = du = awu_1.f(aVE.cP.gameSettings) == 0 && !aR && PlayerInvoker.a(aVE.cP.player, Material.M) ? 1 : 0;
        if (aVE.cP.player != null) {
            bg = 0.0f;
            if (PlayerInvoker.b(aVE.cP.player, Potion.nightVision)) {
                bg = EntityRendererInvoker.a(ys_2.at().entityRenderer, aVE.cP.player, f);
            }
            aN = 0.0f;
            if (PlayerInvoker.b(aVE.cP.player, Potion.blindness)) {
                int n2 = a3M.c(PlayerInvoker.a(aVE.cP.player, Potion.blindness));
                aN = ys_2.a((float)n2 / 20.0f, 0.0f, 1.0f);
            }
        }
        Vec3 vec3 = BlockInvoker.a(aVE.cP.world, entity, f);
        vec3 = ajT.a(vec3, bL, entity, f);
        b_ = (float)vec3.xCoord;
        N = (float)vec3.yCoord;
        a3 = (float)vec3.zCoord;
        aq = true;
        t = false;
        dA = false;
        if (bx >= 1) {
            GlStateManagerInvoker.d(33988);
            GlStateManagerInvoker.k(HD.b(Y, 0));
            if (bx >= 2) {
                GlStateManagerInvoker.d(33989);
                GlStateManagerInvoker.k(HD.b(Y, 1));
            }
        }
        GlStateManagerInvoker.d(33984);
        int n3 = 0;
        if (n3 < ef) {
            GlStateManagerInvoker.k(c7[n3]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            GlStateManagerInvoker.k(c7[8 + n3]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            ++n3;
        }
        GlStateManagerInvoker.k(0);
        n3 = 0;
        if (4 + n3 < ef) {
            GlStateManagerInvoker.d(33991 + n3);
            GlStateManagerInvoker.k(HD.b(aW, 4 + n3));
            ++n3;
        }
        GlStateManagerInvoker.d(33990);
        GlStateManagerInvoker.k(HD.b(dX, 0));
        if (G >= 2) {
            GlStateManagerInvoker.d(33995);
            GlStateManagerInvoker.k(HD.b(dX, 1));
            if (G >= 3) {
                GlStateManagerInvoker.d(33996);
                GlStateManagerInvoker.k(HD.b(dX, 2));
            }
        }
        if ((n3 = 0) < dS) {
            GlStateManagerInvoker.d(33997 + n3);
            GlStateManagerInvoker.k(HD.b(dB, n3));
            ++n3;
        }
        if (b9) {
            GlStateManagerInvoker.d(33984 + aVE.cl.b);
            GlStateManagerInvoker.k(XN.a(cl));
            GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        }
        aVE.a(L);
        GlStateManagerInvoker.d(33984);
        A = d6;
        bv = dn;
        cO = cz;
        aHB.a(a7, 0);
        aHB.a(by, 0);
        aHB.a(a7, by);
        aHB.a(a7, 0);
        aHB.a(by, 0);
        aHB.a(aI, 0);
        aHB.a(S, 0);
        aHB.a(aI, S);
        aHB.a(aI, 0);
        aHB.a(S, 0);
        aVE.i(ail_1.aP);
        axw_2.a(d8, 0, f, l4);
        ProfilerInvoker.endSection(aVE.cP.mcProfiler);
        l__0.a(36160, d1);
        n3 = 0;
        if (n3 < ef) {
            aVE.cc[n3] = 0;
            l__0.a(36160, 36064 + n3, 3553, c7[n3], 0);
            ++n3;
        }
        aVE.i(ail_1.e5);
    }

    static String p(int n) {
        String string = P8.g(n);
        return aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(new StringBuilder(), P8.a(StringInvoker.b(string, 1, 3))), ail_1.fN), P8.a(StringInvoker.b(string, 3, 5))), ail_1.aR), P8.a(StringInvoker.a(string, 5))).toString();
    }

    public static void m() {
        aVE.l(3);
    }

    public static InputStream a(String string) {
        a0D.k();
        return cA == null ? null : dk_0.b(cA, string);
    }

    private static void U() {
        u = aVE.cP.displayWidth;
        cr = aVE.cP.displayHeight;
        o = MathInvoker.a((float)u * aB);
        R = MathInvoker.a((float)cr * aB);
        aVE.J();
    }

    public static void f(int n) {
        aVE.aG[++aVE.m * 2] = n & 0xFFFF;
        aVE.aG[aVE.m * 2 + 1] = 0;
    }

    public static void a(a5Y a5Y2) {
        int n;
        int n2;
        a0D.r();
        a5Y2.e();
        if (a5Y2.b != null && (n2 = 0) < (n = ListInvoker.size(a5Y2.b))) {
            aVE.a((a5Y)ListInvoker.get(a5Y2.b, n2));
            ++n2;
        }
    }

    public static void I() {
        GlStateManagerInvoker.disableBlend();
        aVE.l(3);
    }

    public static void aw() {
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(TessellatorInvoker.getInstance());
        float f = aVE.cP.gameSettings.bp * 16;
        double d = (double)f * 0.9238;
        double d2 = (double)f * 0.3826;
        double d3 = -d2;
        double d4 = -d;
        double d5 = 16.0;
        double d6 = -dn;
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.k);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d6, d4));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d5, d4));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d4, d5, d3));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d4, d6, d3));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d4, d6, d3));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d4, d5, d3));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d4, d5, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d4, d6, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d4, d6, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d4, d5, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d5, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d6, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d6, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d5, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d2, d5, d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d2, d6, d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d2, d6, d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d2, d5, d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d5, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d6, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d6, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d5, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d5, d3));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d6, d3));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d6, d3));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d5, d3));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d2, d5, d4));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d2, d6, d4));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d2, d6, d4));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d2, d5, d4));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d5, d4));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d6, d4));
        TessellatorInvoker.draw(TessellatorInvoker.getInstance());
    }

    private static a0D[] h() {
        a0D[] a0DArray;
        block5: {
            int n;
            block6: {
                String string;
                a0D a0D2;
                a0D.k();
                try {
                    a0DArray = YV.a(cA, cE, p);
                    Properties properties = aVE.a(cA);
                    a0D[] a0DArray2 = a0DArray;
                    int n2 = a0DArray2.length;
                    n = 0;
                    if (n >= n2) break block5;
                    a0D2 = a0DArray2[n];
                    string = dk_1.a(properties, mk_0.i(a0D2));
                }
                catch (IOException iOException) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), ail_1.jr), dk_0.a(cA)).toString());
                    a4E.b(iOException);
                    return null;
                }
                mk_0.c(a0D2);
                if (mk_0.g(a0D2, string)) break block6;
                ys_2.d(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ail_1.gV), mk_0.i(a0D2)), ail_1.bS), string).toString());
            }
            ++n;
        }
        return a0DArray;
    }

    public static boolean b(String string) {
        a0D.k();
        if (string == null) {
            return false;
        }
        if (StringInvoker.c(string) <= 0) {
            return false;
        }
        int n = StringInvoker.j(string, ail_1.ii);
        if (n >= 0) {
            string = StringInvoker.a(string, n + 1);
        }
        return ListInvoker.contains(a7r_0.a(cE), string);
    }

    public static void aj() {
    }

    public static void a(float f, float f2, float f3) {
        bF = f;
        c8 = f2;
        x = f3;
    }

    public static void a() {
        a0D.r();
        if (aq) {
            aVE.l(1);
        }
    }

    public static boolean G() {
        return c2;
    }

    public static a0D[] an() {
        return bX;
    }

    public static boolean aC() {
        a0D.r();
        return !aLR.e(dg) ? aLR.d(dg) : aLR.e(dG) || aLR.d(dG);
    }

    private static void a(String string, String string2) {
        try {
            File file = new File(ak, aL0.a(aL0.a(new StringBuilder(), ail_1.ia), string).toString());
            zq_2.a(zq_2.b(file));
            ys_2.a(file, string2);
        }
        catch (IOException iOException) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), ail_1.q), string).toString());
            a4E.b(iOException);
        }
    }

    private static a0D[] a(Map<String, a0D[]> map, a0D[] a0DArray) {
        a0D[] a0DArray2;
        a0D[] a0DArray3;
        a0D[] a0DArray4;
        int n;
        int n2;
        a0D.k();
        HashSet hashSet = new HashSet();
        Object object = aS0.f(MapInvoker.c(map));
        if (dz_0.c((Iterator)object) && (n2 = 0) < (n = (a0DArray4 = (a0DArray3 = (a0D[])MapInvoker.c(map, a0DArray2 = (a0D[])dz_0.b((Iterator)object)))).length)) {
            a0D a0D2 = a0DArray4[n2];
            if (a0D2 != null) {
                aS0.b(hashSet, mk_0.i(a0D2));
            }
            ++n2;
        }
        object = new ArrayList();
        int n3 = 0;
        a0DArray2 = a0DArray;
        int n4 = a0DArray2.length;
        if (n3 < n4) {
            String string;
            a0D a0D3 = a0DArray2[n3];
            if (mk_0.e(a0D3) && !aS0.c(hashSet, string = mk_0.i(a0D3))) {
                ListInvoker.add((List)object, a0D3);
            }
            ++n3;
        }
        a0DArray2 = (a0D[])ListInvoker.toArray((List)object, new a0D[ListInvoker.size((List)object)]);
        return a0DArray2;
    }

    public static void a(int n, float f, long l4) {
        a0D.r();
        if (!ch) {
            l__0.a(36160, d1);
            GL11.glViewport((int)0, (int)0, (int)o, (int)R);
            eg = null;
            ahf_1.a(u3_0.a(dp));
            aVE.l(2);
            aVE.i(ail_1.i0);
        }
    }

    public static void d() {
        aVE.aG[aVE.m * 2] = 0;
        aVE.aG[aVE.m * 2 + 1] = 0;
        --m;
    }

    static void ai() {
    }

    static ArrayList al() {
        ArrayList arrayList;
        block10: {
            int n;
            block12: {
                String string;
                File file;
                block11: {
                    File[] fileArray;
                    block9: {
                        arrayList = new ArrayList();
                        a0D.r();
                        akr_1.a(arrayList, cq);
                        akr_1.a(arrayList, E);
                        if (zq_2.m(ak)) break block9;
                        zq_2.p(ak);
                    }
                    File[] fileArray2 = fileArray = zq_2.h(ak);
                    int n2 = fileArray2.length;
                    n = 0;
                    if (n >= n2) break block10;
                    file = fileArray2[n];
                    string = zq_2.q(file);
                    if (!zq_2.r(file)) break block11;
                    File file2 = new File(file, ail_1.c5);
                    if (!zq_2.m(file2)) break block11;
                    if (!zq_2.r(file2)) break block11;
                    akr_1.a(arrayList, string);
                }
                if (!zq_2.d(file)) break block12;
                if (!StringInvoker.c(StringInvoker.i(string), ail_1.Q)) break block12;
                try {
                    akr_1.a(arrayList, string);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            ++n;
        }
        return arrayList;
    }

    public static void s() {
        ao = true;
        aVE.a(ail_1.fW, M);
    }

    public static void a(Entity entity) {
        a0D.r();
        if (aq) {
            aVE.l(16);
            aVE.b(entity);
        }
    }

    public static void b(boolean bl) {
        dA = bl;
    }

    public static void au() {
        ProfilerInvoker.endSection(aVE.cP.mcProfiler);
    }

    public static void b(float f) {
        Entity entity = MCInvoker.v(cP);
        double d = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
        double d2 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
        double d3 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
        d6 = d;
        dn = d2;
        cz = d3;
        GL11.glGetFloat((int)2983, (FloatBuffer)((FloatBuffer)aHB.a(by, 0)));
        a0L.a((FloatBuffer)aHB.a(bK, 0), (FloatBuffer)aHB.a(by, 0), cV, z);
        aHB.a(by, 0);
        aHB.a(bK, 0);
        GL11.glGetFloat((int)2982, (FloatBuffer)((FloatBuffer)aHB.a(S, 0)));
        a0L.a((FloatBuffer)aHB.a(aJ, 0), (FloatBuffer)aHB.a(S, 0), bJ, cI);
        aHB.a(S, 0);
        aHB.a(aJ, 0);
        aVE.i(ail_1.i8);
    }

    public static String b(String string, String string2) {
        a0D.r();
        String string3 = (String)MapInvoker.c(b5, string);
        return string3 == null ? string2 : string3;
    }

    public static void o(int n) {
        GL11.glDisable((int)n);
        aVE.o();
    }

    private static IntBuffer b(IntBuffer intBuffer) {
        a0D.r();
        int n = HD.f(intBuffer);
        int n2 = HD.b(intBuffer);
        if (n2 < n) {
            HD.a(intBuffer, n2, 0);
            ++n2;
        }
        return intBuffer;
    }
}

