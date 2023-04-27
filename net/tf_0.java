/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.LWJGLException
 *  org.lwjgl.Sys
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.DisplayMode
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.PixelFormat
 */
package net;

import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.RPacketManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.ThreadInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.GameSettings;
import deobf.IResourcePack;
import deobf.MCInvoker;
import net.minecraft.resources.ResourcePackRepository;
import net.minecraft.renderer.texture.TextureMap;
import net.minecraft.multiplayer.WorldClient;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

/*
 * Renamed from net.tF
 */
public class tf_0 {
    public static String[] k;
    private static DisplayMode[] n;
    private static int d;
    public static String D;
    public static String r = "H8";
    public static String c = "OptiFine";
    private static GameSettings v;
    public static String m;
    private static int A;
    public static Float i;
    private static boolean u;
    public static String w = "1.8.8";
    private static int B;
    private static boolean C;
    public static String p;
    private static String l;
    public static boolean e;
    private static Logger E;
    private static DisplayMode s;
    public static boolean x;
    public static boolean f;
    public static int t;
    public static String o = "HD_U";
    private static Thread g;
    private static boolean h;
    private static boolean z;
    private static Minecraft b;
    public static sq_0 a;
    public static sq_0 q;
    private static DefaultResourcePack F;
    public static boolean j;
    public static String y = "OptiFine_1.8.8_HD_U_H8";

    public static boolean O() {
        return tf_0.v.B;
    }

    public static DefaultResourcePack z() {
        ResourcePackRepository resourcePackRepository;
        Minecraft minecraft;
        aP2.b();
        if (F == null && (F = (DefaultResourcePack)aDb.a(minecraft = MCInvoker.f(), ail_0.s)) == null && (resourcePackRepository = MCInvoker.D(minecraft)) != null) {
            F = (DefaultResourcePack)resourcePackRepository.b;
        }
        return F;
    }

    public static boolean u() {
        aP2.b();
        return tf_0.v.bf == 2;
    }

    private static sq_0 aN() {
        aP2.b();
        return aXQ.a().OpenGL44 ? new sq_0(4, 4) : (aXQ.a().OpenGL43 ? new sq_0(4, 3) : (aXQ.a().OpenGL42 ? new sq_0(4, 2) : (aXQ.a().OpenGL41 ? new sq_0(4, 1) : (aXQ.a().OpenGL40 ? new sq_0(4, 0) : (aXQ.a().OpenGL33 ? new sq_0(3, 3) : (aXQ.a().OpenGL32 ? new sq_0(3, 2) : (aXQ.a().OpenGL31 ? new sq_0(3, 1) : (aXQ.a().OpenGL30 ? new sq_0(3, 0) : (aXQ.a().OpenGL21 ? new sq_0(2, 1) : (aXQ.a().OpenGL20 ? new sq_0(2, 0) : (aXQ.a().OpenGL15 ? new sq_0(1, 5) : (aXQ.a().OpenGL14 ? new sq_0(1, 4) : (aXQ.a().OpenGL13 ? new sq_0(1, 3) : (aXQ.a().OpenGL12 ? new sq_0(1, 2) : (aXQ.a().OpenGL11 ? new sq_0(1, 1) : new sq_0(1, 0))))))))))))))));
    }

    public static boolean j() {
        return tf_0.v.bG;
    }

    public static int q() {
        switch (tf_0.v.aa) {
            case 2: {
                if (tf_0.a6()) {
                    return 9985;
                }
                return 9986;
            }
            case 3: {
                if (tf_0.a6()) {
                    return 9987;
                }
                return 9986;
            }
        }
        return 9986;
    }

    public static boolean am() {
        return tf_0.v.e;
    }

    public static DisplayMode[] E() {
        aP2.b();
        if (n == null) {
            Object[] objectArray;
            ArrayList arrayList;
            block4: {
                DisplayMode[] displayModeArray = DisplayInvoker.a();
                Set<Dimension> set = tf_0.a(displayModeArray);
                arrayList = new ArrayList();
                objectArray = aS0.f(set);
                if (!dz_0.c((Iterator)objectArray)) break block4;
                Dimension dimension = (Dimension)dz_0.b((Iterator)objectArray);
                DisplayMode[] displayModeArray2 = tf_0.a(displayModeArray, dimension);
                DisplayMode displayMode = tf_0.a(displayModeArray2, s);
                ListInvoker.add(arrayList, displayMode);
            }
            try {
                objectArray = (DisplayMode[])ListInvoker.toArray(arrayList, new DisplayMode[0]);
                a7r_0.a(objectArray, new ka_2());
                return objectArray;
            }
            catch (Exception exception) {
                ch_2.a(exception);
                n = new DisplayMode[]{s};
            }
        }
        return n;
    }

    public static boolean ab() {
        return tf_0.v.bS;
    }

    public static String b() {
        return fy_0.aA;
    }

    public static boolean t() {
        aP2.b();
        float f = tf_0.ak();
        return f > axx_1.a(i) + 1.0E-5f;
    }

    public static String a(String string) {
        aP2.b();
        return string == null ? fy_0.g : string;
    }

    public static void f(String string) {
        E.error(aL0.a(aL0.a(new StringBuilder(), fy_0.aH), string).toString());
    }

    public static boolean L() {
        return tf_0.v.K;
    }

    public static ModelManager bj() {
        return MCInvoker.A((Minecraft)tf_0.b).h;
    }

    public static void h(String string) {
        LoggerInvoker.info(E, aL0.a(aL0.a(new StringBuilder(), fy_0.Y), string).toString());
    }

    public static boolean av() {
        return tf_0.v.j;
    }

    public static boolean a8() {
        return tf_0.v.bT;
    }

    public static int a(int n, int n2, int n3) {
        return n < n2 ? n2 : MathInvoker.b(n, n3);
    }

    public static boolean a(String string, boolean bl) {
        aP2.b();
        if (string == null) {
            return bl;
        }
        try {
            string = StringInvoker.h(string);
            return auk_2.b(string);
        }
        catch (NumberFormatException numberFormatException) {
            return bl;
        }
    }

    public static boolean y() {
        aP2.b();
        return tf_0.v.aZ == 0 ? tf_0.v.a4 : tf_0.v.aZ == 2;
    }

    private static DisplayMode a(DisplayMode[] displayModeArray, DisplayMode displayMode) {
        aP2.b();
        DisplayMode[] displayModeArray2 = displayModeArray;
        int n = displayModeArray2.length;
        int n2 = 0;
        if (n2 < n) {
            DisplayMode displayMode2 = displayModeArray2[n2];
            if (aSN.a(displayMode2) == aSN.a(displayMode) && aSN.d(displayMode2) == aSN.d(displayMode)) {
                return displayMode2;
            }
            ++n2;
        }
        if (displayModeArray.length <= 0) {
            return null;
        }
        a7r_0.a((Object[])displayModeArray, new ka_2());
        return displayModeArray[displayModeArray.length - 1];
    }

    public static void at() {
        d = als_2.c(als_2.a());
    }

    public static void f() {
        aP2.b();
        FramebufferInvoker.a(MCInvoker.c(b), tf_0.b.displayWidth, tf_0.b.displayHeight);
        if (tf_0.b.entityRenderer != null) {
            EntityRendererInvoker.a(tf_0.b.entityRenderer, tf_0.b.displayWidth, tf_0.b.displayHeight);
        }
    }

    public static String bh() {
        sq_0 sq_02 = tf_0.bc();
        return aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), fy_0.aD), z9_0.a(sq_02)), fy_0.u), z9_0.d(sq_02)), fy_0.k), z9_0.c(sq_02)).toString();
    }

    public static boolean G() {
        return x;
    }

    public static boolean a(ResourceLocation resourceLocation) {
        tf_0.c(resourceLocation);
        return true;
    }

    public static boolean s() {
        aP2.b();
        return tf_0.v.bf == 1;
    }

    public static String aE() {
        aP2.b();
        if (MCInvoker.D(b) == null) {
            return fy_0.aw;
        }
        IResourcePack[] iResourcePackArray = tf_0.B();
        if (iResourcePackArray.length <= 0) {
            return RPacketManagerInvoker.a(tf_0.z());
        }
        Object[] objectArray = new String[iResourcePackArray.length];
        int n = 0;
        if (n < iResourcePackArray.length) {
            objectArray[n] = avv_0.b(iResourcePackArray[n]);
            ++n;
        }
        return tf_0.a(objectArray);
    }

    public static boolean al() {
        aP2.b();
        return tf_0.aU().V > 0;
    }

    public static Object[] a(Object[] objectArray, Object object, int n) {
        ArrayList arrayList = new ArrayList(a7r_0.a(objectArray));
        ListInvoker.add(arrayList, n, object);
        Object[] objectArray2 = (Object[])JI.a(ara_2.i(objectArray.getClass()), ListInvoker.size(arrayList));
        return ListInvoker.toArray(arrayList, objectArray2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sq_0 a(String string, sq_0 sq_02) {
        aP2.b();
        if (string == null) {
            return sq_02;
        }
        try {
            Pattern pattern = ow_1.c(fy_0.P);
            Matcher matcher = ow_1.a(pattern, string);
            if (!wk_2.a(matcher)) {
                return sq_02;
            }
            int n = P8.a(wk_2.b(matcher, 1));
            int n2 = P8.a(wk_2.b(matcher, 2));
            int n3 = wk_2.b(matcher, 4) != null ? P8.a(wk_2.b(matcher, 4)) : 0;
            String string2 = wk_2.b(matcher, 5);
            return new sq_0(n, n2, n3, string2);
        }
        catch (Exception exception) {
            ch_2.a(exception);
            return sq_02;
        }
    }

    public static int aY() {
        return tf_0.v.an;
    }

    private static DisplayMode[] a(DisplayMode[] displayModeArray, Dimension dimension) {
        ArrayList arrayList = new ArrayList();
        aP2.b();
        DisplayMode[] displayModeArray2 = displayModeArray;
        int n = displayModeArray2.length;
        int n2 = 0;
        if (n2 < n) {
            DisplayMode displayMode = displayModeArray2[n2];
            if ((double)aSN.c(displayMode) == anv_0.a(dimension) && (double)aSN.b(displayMode) == anv_0.b(dimension)) {
                ListInvoker.add(arrayList, displayMode);
            }
            ++n2;
        }
        return (DisplayMode[])ListInvoker.toArray(arrayList, new DisplayMode[0]);
    }

    public static int aM() {
        return tf_0.v.F;
    }

    public static DynamicTexture a(DynamicTexture dynamicTexture) {
        InputStream inputStream;
        block3: {
            aP2.b();
            try {
                ResourceLocation resourceLocation = new ResourceLocation(fy_0.K);
                inputStream = tf_0.e(resourceLocation);
                if (inputStream != null) break block3;
                return dynamicTexture;
            }
            catch (Exception exception) {
                tf_0.e(aL0.a(aL0.a(aL0.a(new StringBuilder(), ara_2.b(exception.getClass())), fy_0.ab), ch_2.b(exception)).toString());
                return dynamicTexture;
            }
        }
        aI8.a(inputStream);
        return dynamicTexture;
    }

    public static boolean aQ() {
        aP2.b();
        return tf_0.v.y == 3;
    }

    private static String[] d(String string) {
        aP2.b();
        if (string != null && StringInvoker.c(string) > 0) {
            Pattern pattern = ow_1.c(fy_0.aX);
            Matcher matcher = ow_1.a(pattern, string);
            if (!wk_2.a(matcher)) {
                return new String[]{fy_0.w, fy_0.D, fy_0.ag};
            }
            String string2 = tf_0.a(wk_2.b(matcher, 1));
            String string3 = tf_0.a(wk_2.b(matcher, 2));
            String string4 = tf_0.a(wk_2.b(matcher, 3));
            return new String[]{string2, string3, string4};
        }
        return new String[]{fy_0.I, fy_0.S, fy_0.aM};
    }

    public static boolean bg() {
        return tf_0.v.a5;
    }

    public static boolean ay() {
        return tf_0.v.as;
    }

    public static TextureMap c() {
        return MCInvoker.f(tf_0.N());
    }

    public static InputStream a(aI_ aI_2, ResourceLocation resourceLocation) throws IOException {
        aP2.b();
        abh_2 abh_22 = aI_2.b(resourceLocation);
        return abh_22 == null ? null : dw_0.b(abh_22);
    }

    public static boolean K() {
        return tf_0.v.v;
    }

    public static boolean ag() {
        return tf_0.v.cb;
    }

    public static int[] a(int[] nArray, int[] nArray2) {
        aP2.b();
        if (nArray != null && nArray2 != null) {
            int n = nArray.length;
            int n2 = n + nArray2.length;
            int[] nArray3 = new int[n2];
            SystemInvoker.a(nArray, 0, nArray3, 0, n);
            SystemInvoker.a(nArray2, 0, nArray3, n, nArray2.length);
            return nArray3;
        }
        throw new NullPointerException(fy_0.ai);
    }

    public static double a(double d, double d2, double d3) {
        aP2.b();
        return d < d2 ? d2 : MathInvoker.a(d, d3);
    }

    public static boolean n() {
        return tf_0.v.o;
    }

    public static boolean ba() {
        return tf_0.v.au;
    }

    private static String g(String string) {
        aP2.b();
        int n = StringInvoker.d(string, 40);
        if (n < 0) {
            return fy_0.Z;
        }
        StringInvoker.a(string, 32, n);
        return fy_0.ax;
    }

    public static String[] b(String string, String string2) {
        aP2.b();
        StringTokenizer stringTokenizer = new StringTokenizer(string, string2);
        ArrayList arrayList = new ArrayList();
        if (aL5.a(stringTokenizer)) {
            String string3 = aL5.b(stringTokenizer);
            ListInvoker.add(arrayList, string3);
        }
        return (String[])ListInvoker.toArray(arrayList, new String[0]);
    }

    public static String c(InputStream inputStream) throws IOException {
        return tf_0.a(inputStream, fy_0.aK);
    }

    public static void e(String string) {
        E.warn(aL0.a(aL0.a(new StringBuilder(), fy_0.aE), string).toString());
    }

    public static sq_0 bc() {
        aP2.b();
        if (q == null) {
            String string = GL11.glGetString((int)7938);
            q = tf_0.a(string, null);
            if (q == null) {
                q = tf_0.aN();
            }
            if (q == null) {
                q = new sq_0(1, 0);
            }
        }
        return q;
    }

    public static float ak() {
        return axx_1.a(i);
    }

    public static boolean D() {
        aP2.b();
        return tf_0.v.bz != 0 ? tf_0.v.bz == 3 : (tf_0.a0() && !q0_0.c(aVE.dL) ? q0_0.b(aVE.dL) : A == 3);
    }

    public static boolean X() {
        aP2.b();
        return tf_0.C() <= 1;
    }

    public static boolean a5() {
        return tf_0.v.aH;
    }

    public static int C() {
        return d;
    }

    public static String a(int[] nArray) {
        aP2.b();
        return fy_0.as;
    }

    public static boolean aa() {
        aP2.b();
        return tf_0.X() && tf_0.v.s;
    }

    public static String[] b(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return tf_0.d(fileInputStream);
    }

    public static String V() {
        aP2.b();
        StringBuilder stringBuilder = new StringBuilder(32);
        if (tf_0.af()) {
            aL0.a(stringBuilder, fy_0.aO);
            aL0.c(stringBuilder, xh_1.a());
            aL0.a(stringBuilder, fy_0.q);
        }
        aL0.a(stringBuilder, fy_0.h);
        String string = a3c_0.q();
        if (string != null) {
            aL0.a(stringBuilder, fy_0.o);
            aL0.a(stringBuilder, string);
        }
        return stringBuilder.toString();
    }

    public static int[] a(int[] nArray, int n) {
        return tf_0.a(nArray, new int[]{n});
    }

    private static String aD() {
        InputStream inputStream;
        block3: {
            aP2.b();
            try {
                inputStream = ara_2.b(tf_0.class, fy_0.aI);
                if (inputStream != null) break block3;
                return null;
            }
            catch (Exception exception) {
                tf_0.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), fy_0.au), ara_2.b(exception.getClass())), fy_0.m), ch_2.b(exception)).toString());
                return null;
            }
        }
        return tf_0.d(inputStream)[0];
    }

    public static boolean aq() {
        aP2.b();
        return tf_0.v.bP != 2;
    }

    public static boolean ae() {
        return tf_0.v.D;
    }

    public static boolean bk() {
        return z;
    }

    public static RenderGlobal ap() {
        return tf_0.b.renderGlobal;
    }

    public static boolean U() {
        aP2.b();
        return tf_0.Z() && (!tf_0.a0() || a3c_0.v());
    }

    public static boolean an() {
        aP2.b();
        return tf_0.v.y == 1;
    }

    public static boolean Z() {
        return tf_0.v.be;
    }

    public static boolean aO() {
        return tf_0.v.u;
    }

    public static Object[] a(Object[] objectArray, Object[] objectArray2) {
        aP2.b();
        if (objectArray == null) {
            throw new NullPointerException(fy_0.aB);
        }
        if (objectArray2.length == 0) {
            return objectArray;
        }
        int n = objectArray.length;
        int n2 = n + objectArray2.length;
        Object[] objectArray3 = (Object[])JI.a(ara_2.i(objectArray.getClass()), n2);
        SystemInvoker.a(objectArray, 0, objectArray3, 0, n);
        SystemInvoker.a(objectArray2, 0, objectArray3, n, objectArray2.length);
        return objectArray3;
    }

    public static String[] d(InputStream inputStream) throws IOException {
        aP2.b();
        ArrayList arrayList = new ArrayList();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.US_ASCII);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        auq_0.c(bufferedReader);
        return (String[])ListInvoker.toArray(arrayList, new String[0]);
    }

    public static boolean M() {
        return tf_0.v.b8;
    }

    public static String a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return tf_0.a(fileInputStream, fy_0.ao);
    }

    public static float ah() {
        return tf_0.v.bJ;
    }

    private static void h() {
        aVM aVM2 = new aVM();
        aVM2.start();
    }

    public static boolean bd() {
        aP2.b();
        return tf_0.v.bf == 0;
    }

    public static void a(long l4) {
        try {
            Thread.sleep(l4);
        }
        catch (InterruptedException interruptedException) {
            azq_0.a(interruptedException);
        }
    }

    public static int a(String string, String string2) {
        int n;
        String[] stringArray = tf_0.d(string);
        String[] stringArray2 = tf_0.d(string2);
        aP2.b();
        String string3 = stringArray[0];
        String string4 = stringArray2[0];
        if (!string3.equals(string4)) {
            return StringInvoker.i(string3, string4);
        }
        int n2 = tf_0.a(stringArray[1], -1);
        if (n2 != (n = tf_0.a(stringArray2[1], -1))) {
            return n2 - n;
        }
        String string5 = stringArray[2];
        String string6 = stringArray2[2];
        if (!string5.equals(string6)) {
            if (StringInvoker.g(string5)) {
                return 1;
            }
            if (StringInvoker.g(string6)) {
                return -1;
            }
        }
        return StringInvoker.i(string5, string6);
    }

    public static int a(int n) {
        n = n ^ 0x3D ^ n >> 16;
        n += n << 3;
        n ^= n >> 4;
        n *= 668265261;
        n ^= n >> 15;
        return n;
    }

    public static boolean aG() {
        aP2.b();
        return tf_0.v.bz != 0 ? tf_0.v.bz == 2 : (tf_0.a0() && !q0_0.c(aVE.dL) ? q0_0.a(aVE.dL) : (A != 0 ? A == 2 : tf_0.v.a4));
    }

    private static String[] W() {
        Object object;
        block7: {
            aP2.b();
            object = tf_0.bc();
            if (z9_0.a((sq_0)object) < 3) break block7;
            int n = GL11.glGetInteger((int)33309);
            if (n <= 0) break block7;
            try {
                String[] stringArray = new String[n];
                int n2 = 0;
                if (n2 < n) {
                    stringArray[n2] = a4t_0.a(7939, n2);
                    ++n2;
                }
                return stringArray;
            }
            catch (Exception exception) {
                ch_2.a(exception);
            }
        }
        try {
            object = GL11.glGetString((int)7939);
            return StringInvoker.g((String)object, fy_0.aZ);
        }
        catch (Exception exception) {
            ch_2.a(exception);
            return new String[0];
        }
    }

    public static Dimension a() {
        aP2.b();
        if (s == null) {
            return null;
        }
        if (v == null) {
            return new Dimension(aSN.c(s), aSN.b(s));
        }
        String string = tf_0.v.U;
        if (string.equals(fy_0.t)) {
            return new Dimension(aSN.c(s), aSN.b(s));
        }
        String[] stringArray = tf_0.b(string, fy_0.R);
        return stringArray.length < 2 ? new Dimension(aSN.c(s), aSN.b(s)) : new Dimension(tf_0.a(stringArray[0], -1), tf_0.a(stringArray[1], -1));
    }

    public static Minecraft N() {
        return b;
    }

    public static float a(float f, float f2, float f3) {
        aP2.b();
        return f < f2 ? f2 : MathInvoker.a(f, f3);
    }

    public static boolean aJ() {
        return tf_0.v.ae;
    }

    public static boolean ai() {
        aP2.b();
        return tf_0.v.f == 2;
    }

    public static boolean k() {
        aP2.b();
        return tf_0.af() && (!tf_0.a0() || aVE.ac());
    }

    public static boolean a4() {
        aP2.b();
        return tf_0.v.f != 3;
    }

    public static DisplayMode ax() {
        aP2.b();
        DisplayMode[] displayModeArray = tf_0.E();
        if (displayModeArray != null && displayModeArray.length >= 1) {
            DisplayMode displayMode = displayModeArray[displayModeArray.length - 1];
            return aSN.c(s) > aSN.c(displayMode) ? s : (aSN.c(s) == aSN.c(displayMode) && aSN.b(s) > aSN.b(displayMode) ? s : displayMode);
        }
        return s;
    }

    public static void aW() {
        int n = MCInvoker.O(MCInvoker.f());
        String string = tf_0.g(tf_0.b.debug);
        int n2 = jv_0.e(tf_0.b.renderGlobal);
        int n3 = jv_0.l(tf_0.b.renderGlobal);
        int n4 = jv_0.k(tf_0.b.renderGlobal);
        String string2 = aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), fy_0.ah), n), fy_0.M), n2), fy_0.at), n3), fy_0.ac), n4), fy_0.aQ), string).toString();
        FontRendererInvoker.a(tf_0.b.fontRendererObj, string2, 2.0f, 2.0f, -2039584);
    }

    public static void a(InputStream inputStream) throws IOException {
        aP2.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[1024];
        aZ6.a(inputStream, byArray);
        aZ6.b(inputStream);
        a0o_0.a(byteArrayOutputStream);
    }

    public static boolean b(Object object, Object[] objectArray) {
        Object[] objectArray2;
        int n;
        int n2;
        aP2.b();
        if (objectArray != null && (n2 = 0) < (n = (objectArray2 = objectArray).length)) {
            Object object2 = objectArray2[n2];
            if (tf_0.a(object, object2)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static TextureManager bf() {
        return b.af();
    }

    public static String i() {
        return l;
    }

    public static boolean ac() {
        return tf_0.v.ad;
    }

    private static void ao() {
        tf_0.b(fy_0.d);
        tf_0.b(tf_0.b());
        aP2.b();
        tf_0.b(aL0.a(aL0.a(new StringBuilder(), fy_0.ar), tf_0.aD()).toString());
        tf_0.b(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), fy_0.aG), SystemInvoker.c(fy_0.n)), fy_0.G), SystemInvoker.c(fy_0.W)), fy_0.ap), SystemInvoker.c(fy_0.z)).toString());
        tf_0.b(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), fy_0.ak), SystemInvoker.c(fy_0.X)), fy_0.e), SystemInvoker.c(fy_0.aU)).toString());
        tf_0.b(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), fy_0.aR), SystemInvoker.c(fy_0.aa)), fy_0.aT), SystemInvoker.c(fy_0.an)), fy_0.am), SystemInvoker.c(fy_0.a0)).toString());
        tf_0.b(aL0.a(aL0.a(new StringBuilder(), fy_0.az), Sys.getVersion()).toString());
        D = GL11.glGetString((int)7938);
        m = GL11.glGetString((int)7937);
        p = GL11.glGetString((int)7936);
        tf_0.b(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), fy_0.C), m), fy_0.c), D), fy_0.av), p).toString());
        tf_0.b(aL0.a(aL0.a(new StringBuilder(), fy_0.l), tf_0.bh()).toString());
        if (!aXQ.a().OpenGL12) {
            tf_0.b(fy_0.H);
        }
        if (!(f = aXQ.a().GL_NV_fog_distance)) {
            tf_0.b(fy_0.a);
        }
        if (!(x = aXQ.a().GL_ARB_occlusion_query)) {
            tf_0.b(fy_0.ae);
        }
        int n = aH3.c();
        tf_0.h(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), fy_0.aL), n), fy_0.f), n).toString());
    }

    public static boolean Q() {
        aP2.b();
        return tf_0.v.cc == 2;
    }

    public static boolean P() {
        aP2.b();
        return tf_0.w() > 1;
    }

    public static boolean aF() {
        return tf_0.v.C;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[5];
        int n = 0;
        String string = "\u001cv2O\u0003\bb(~\b}\u000e\u0003H\u0002e`";
        int n2 = "\u001cv2O\u0003\bb(~\b}\u000e\u0003H\u0002e`".length();
        int n3 = 5;
        int n4 = -1;
        while (true) {
            int n5 = 79;
            int n6 = ++n4;
            String string2 = string.substring(n6, n6 + n3);
            int n7 = -1;
            boolean bl = true;
            do {
                char[] cArray;
                block7: {
                    int n8;
                    char[] cArray2;
                    int n9;
                    int n10;
                    block6: {
                        if (!bl || (bl = false) || !true) {
                            string = "\tC\u0015c\u0016eh#lP$h\">\u0019{%U\u0005SN~\u0004\u000ew>_";
                            n2 = "\tC\u0015c\u0016eh#lP$h\">\u0019{%U\u0005SN~\u0004\u000ew>_".length();
                            n3 = 22;
                            n4 = -1;
                            n5 = 36;
                            int n11 = ++n4;
                            string2 = string.substring(n11, n11 + n3);
                            n7 = 0;
                        }
                        char[] cArray3 = string2.toCharArray();
                        int n12 = cArray3.length;
                        n10 = 0;
                        n9 = n5;
                        cArray2 = cArray3;
                        n8 = n12;
                        if (n12 <= 1) break block6;
                        cArray = cArray2;
                        n8 = n8;
                        if (n8 <= n10) break block7;
                    }
                    do {
                        cArray2 = cArray2;
                        int n13 = n10;
                        int cfr_ignored_1 = n10 % 7;
                        cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x62));
                        ++n10;
                        n9 = n9;
                        cArray = cArray2;
                        n8 = n8;
                    } while (n8 > n10);
                }
                stringArray[n++] = new String(cArray).intern();
            } while ((n4 += n3) >= n2);
            n3 = string.charAt(n4);
        }
    }

    public static void a9() {
        tf_0.o();
        B = tf_0.v.V;
        tf_0.as();
        tf_0.bl();
        g = ThreadInvoker.a();
        tf_0.e();
        a3c_0.a(MCInvoker.f());
    }

    public static void a(File file, String string) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] byArray = StringInvoker.a(string, StandardCharsets.US_ASCII);
        a2u_0.a(fileOutputStream, byArray);
        a2u_0.a(fileOutputStream);
    }

    public static aI_ H() {
        return b.p();
    }

    public static boolean a_() {
        return tf_0.v.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void b(String string, int n) {
        aP2.b();
        try {
            ThreadGroup threadGroup = ThreadInvoker.c(ThreadInvoker.a());
            if (threadGroup == null) {
                return;
            }
            int n2 = (E1.a(threadGroup) + 10) * 2;
            Thread[] threadArray = new Thread[n2];
            E1.a(threadGroup, threadArray, false);
            Thread[] threadArray2 = threadArray;
            int n3 = threadArray2.length;
            int n4 = 0;
            if (n4 >= n3) return;
            Thread thread = threadArray2[n4];
            if (StringInvoker.e(ThreadInvoker.b(thread), string)) {
                ThreadInvoker.a(thread, n);
            }
            ++n4;
            return;
        }
        catch (Throwable throwable) {
            tf_0.e(aL0.a(aL0.a(aL0.a(new StringBuilder(), ara_2.b(throwable.getClass())), fy_0.p), aWR.d(throwable)).toString());
        }
    }

    public static Object[] a(Object[] objectArray, Object object) {
        aP2.b();
        if (objectArray == null) {
            throw new NullPointerException(fy_0.al);
        }
        int n = objectArray.length;
        int n2 = n + 1;
        Object[] objectArray2 = (Object[])JI.a(ara_2.i(objectArray.getClass()), n2);
        SystemInvoker.a(objectArray, 0, objectArray2, 0, n);
        objectArray2[n] = object;
        return objectArray2;
    }

    public static void b(String string) {
        tf_0.h(string);
    }

    public static IResourcePack c(ResourceLocation resourceLocation) {
        aP2.b();
        ResourcePackRepository resourcePackRepository = MCInvoker.D(b);
        IResourcePack iResourcePack = mf_1.e(resourcePackRepository);
        if (iResourcePack != null && avv_0.b(iResourcePack, resourceLocation)) {
            return iResourcePack;
        }
        List list = (List)aDb.a(resourcePackRepository, ail_0.aP);
        if (list != null) {
            int n = ListInvoker.size(list) - 1;
            ResourcePackRepositoryEntry resourcePackRepositoryEntry2 = (ResourcePackRepositoryEntry)ListInvoker.get(list, n);
            IResourcePack iResourcePack2 = ad6_0.a(resourcePackRepositoryEntry2);
            if (avv_0.b(iResourcePack2, resourceLocation)) {
                return iResourcePack2;
            }
            --n;
        }
        return RPacketManagerInvoker.b(tf_0.z(), resourceLocation) ? tf_0.z() : null;
    }

    public static boolean au() {
        aP2.b();
        return tf_0.v.bh != 2;
    }

    public static String a(InputStream inputStream, String string) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        aP2.b();
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder stringBuilder = new StringBuilder();
        auq_0.c(bufferedReader);
        return stringBuilder.toString();
    }

    public static int a(BlockPos blockPos, int n) {
        int n2 = tf_0.a(n + 37);
        n2 = tf_0.a(n2 + amv_2.j(blockPos));
        n2 = tf_0.a(n2 + amv_2.i(blockPos));
        n2 = tf_0.a(n2 + amv_2.h(blockPos));
        return n2;
    }

    public static void a(boolean bl) {
        z = bl;
    }

    public static String[] aR() {
        aP2.b();
        if (k == null) {
            k = tf_0.W();
        }
        return k;
    }

    public static InputStream e(ResourceLocation resourceLocation) throws IOException {
        return tf_0.a(b.p(), resourceLocation);
    }

    public static boolean ad() {
        return tf_0.v.bZ;
    }

    public static boolean a3() {
        return tf_0.v.aT;
    }

    public static boolean a0() {
        return aVE.aQ;
    }

    public static boolean aS() {
        aP2.b();
        return tf_0.v.bv == 0 ? tf_0.v.a4 : tf_0.v.bv == 2;
    }

    public static int R() {
        String[] stringArray;
        aP2.b();
        String[] stringArray2 = stringArray = new String[]{fy_0.aF, fy_0.aW, fy_0.N};
        int n = stringArray2.length;
        int n2 = 0;
        if (n2 < n) {
            String string = stringArray2[n2];
            String string2 = SystemInvoker.c(string);
            if (StringInvoker.a(string2, (CharSequence)fy_0.aN)) {
                return 64;
            }
            ++n2;
        }
        return 32;
    }

    public static boolean a(Object object, Object[] objectArray) {
        Object[] objectArray2;
        int n;
        int n2;
        aP2.b();
        if (objectArray != null && (n2 = 0) < (n = (objectArray2 = objectArray).length)) {
            Object object2 = objectArray2[n2];
            if (object == object2) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static void aA() {
        aP2.b();
        A = 0;
        aI_ aI_2 = tf_0.H();
        if (aI_2 != null) {
            try {
                dw_0.b(aI_2.b(new ResourceLocation(fy_0.s)));
                return;
            }
            catch (Exception exception) {}
        }
    }

    public static int a(String string, int n) {
        aP2.b();
        if (string == null) {
            return n;
        }
        try {
            string = StringInvoker.h(string);
            return P8.a(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    public static boolean az() {
        return false;
    }

    public static boolean a(Object object, Object object2) {
        return Objects.equals(object, object2);
    }

    public static boolean d() {
        return tf_0.v.aV;
    }

    public static float v() {
        aP2.b();
        return tf_0.a0() && aVE.cR >= 0.0f ? aVE.cR : tf_0.v.al;
    }

    public static boolean a2() {
        aP2.b();
        return (!tf_0.a0() || a3c_0.O()) && (tf_0.v.aK == 0 ? tf_0.v.a4 : tf_0.v.aK == 2);
    }

    public static void o() {
        aP2.b();
        if (!C && DisplayInvoker.i()) {
            C = true;
            tf_0.ao();
            tf_0.h();
        }
    }

    public static boolean Y() {
        aP2.b();
        return tf_0.v.q == 0 ? tf_0.v.a4 : tf_0.v.q == 2;
    }

    public static boolean A() {
        aP2.b();
        return tf_0.v.bv == 3;
    }

    public static sq_0 F() {
        String string;
        aP2.b();
        if (a == null && (a = tf_0.a(string = GL11.glGetString((int)35724), null)) == null) {
            a = new sq_0(1, 10);
        }
        return a;
    }

    public static WorldServer m() {
        aP2.b();
        WorldClient cfr_ignored_0 = tf_0.b.world;
        return null;
    }

    public static int aB() {
        SystemInvoker.d(fy_0.Q);
        return 64;
    }

    public static boolean aw() {
        return tf_0.v.bO;
    }

    public static void e() {
        tf_0.at();
        aP2.b();
        if (tf_0.X()) {
            if (tf_0.a5()) {
                ThreadInvoker.a(g, 10);
                tf_0.b(fy_0.j, 1);
            }
            ThreadInvoker.a(g, 5);
            tf_0.b(fy_0.r, 5);
        }
        ThreadInvoker.a(g, 10);
        tf_0.b(fy_0.af, 5);
    }

    public static boolean b(int n, int n2, int n3) {
        aP2.b();
        return n >= n2 && n <= n3;
    }

    public static boolean aC() {
        aP2.b();
        return tf_0.v.aA == 1;
    }

    public static boolean T() {
        return tf_0.v.ay;
    }

    public static boolean bi() {
        aP2.b();
        return tf_0.v.F > 0;
    }

    public static boolean aH() {
        aP2.b();
        return tf_0.v.bh == 1;
    }

    public static boolean aX() {
        return tf_0.v.b4;
    }

    public static boolean r() {
        return ThreadInvoker.a() == g;
    }

    public static boolean g() {
        return f;
    }

    public static String a(Object[] objectArray) {
        return fy_0.aP;
    }

    public static int w() {
        return tf_0.v.aN;
    }

    public static boolean aP() {
        return tf_0.v.bC;
    }

    public static boolean l() {
        return tf_0.v.P;
    }

    public static boolean aZ() {
        return tf_0.v.R;
    }

    public static boolean b(ResourceLocation resourceLocation) {
        IResourcePack iResourcePack = tf_0.c(resourceLocation);
        return iResourcePack == tf_0.z();
    }

    public static boolean aL() {
        aP2.b();
        return tf_0.v.cc != 3;
    }

    public static float a(float f) {
        aP2.b();
        return f < 0.0f ? 0.0f : MathInvoker.a(f, 1.0f);
    }

    public static void i(String string) {
        l = string;
    }

    public static void c(String string) {
        aP2.b();
        int n = GL11.glGetError();
        if (n != 0) {
            String string2 = afs_2.a(n);
            tf_0.f(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), fy_0.i), n), fy_0.U), string2), fy_0.ay), string).toString());
        }
    }

    public static float a(String string, float f) {
        aP2.b();
        if (string == null) {
            return f;
        }
        try {
            string = StringInvoker.h(string);
            return axx_1.a(string);
        }
        catch (NumberFormatException numberFormatException) {
            return f;
        }
    }

    public static boolean aI() {
        aP2.b();
        return tf_0.v.aL == 0 ? !tf_0.v.a4 : tf_0.v.aL == 4;
    }

    public static void c(String string, String string2) {
        sv_0 sv_02 = new sv_0(tf_0.b.currentScreen, string, string2);
        MCInvoker.displayGuiScreen(b, sv_02);
    }

    public static IResourcePack[] B() {
        ResourcePackRepository resourcePackRepository = MCInvoker.D(b);
        List list = mf_1.f(resourcePackRepository);
        aP2.b();
        ArrayList arrayList = new ArrayList();
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            ListInvoker.add(arrayList, ad6_0.a((ResourcePackRepositoryEntry)object));
        }
        if (mf_1.e(resourcePackRepository) != null) {
            ListInvoker.add(arrayList, mf_1.e(resourcePackRepository));
        }
        return (IResourcePack[])ListInvoker.toArray(arrayList, new IResourcePack[0]);
    }

    public static DisplayMode a(Dimension dimension) {
        aP2.b();
        DisplayMode[] displayModeArray = tf_0.E();
        DisplayMode[] displayModeArray2 = displayModeArray;
        int n = displayModeArray2.length;
        int n2 = 0;
        if (n2 < n) {
            DisplayMode displayMode = displayModeArray2[n2];
            if (aSN.c(displayMode) == dimension.width && aSN.b(displayMode) == dimension.height) {
                return displayMode;
            }
            ++n2;
        }
        return s;
    }

    public static int bb() {
        return B;
    }

    private static ByteBuffer b(InputStream inputStream) throws IOException {
        aP2.b();
        BufferedImage bufferedImage = aI8.a(inputStream);
        int[] nArray = jj_0.a(bufferedImage, 0, 0, jj_0.f(bufferedImage), jj_0.d(bufferedImage), null, 0, jj_0.f(bufferedImage));
        ByteBuffer byteBuffer = a8q_0.b(4 * nArray.length);
        int[] nArray2 = nArray;
        int n = nArray2.length;
        int n2 = 0;
        if (n2 < n) {
            int n3 = nArray2[n2];
            a8q_0.a(byteBuffer, n3 << 8 | n3 >> 24 & 0xFF);
            ++n2;
        }
        a8q_0.f(byteBuffer);
        return byteBuffer;
    }

    public static boolean af() {
        aP2.b();
        return tf_0.v.aA != 3;
    }

    public static String[] aj() {
        aP2.b();
        DisplayMode[] displayModeArray = tf_0.E();
        String[] stringArray = new String[displayModeArray.length];
        int n = 0;
        if (n < displayModeArray.length) {
            String string;
            DisplayMode displayMode = displayModeArray[n];
            stringArray[n] = string = aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), fy_0.y), aSN.c(displayMode)), fy_0.L), aSN.b(displayMode)).toString();
            ++n;
        }
        return stringArray;
    }

    public static int a1() {
        aP2.b();
        if (v == null) {
            return 10;
        }
        return tf_0.v.bp;
    }

    /*
     * Loose catch block
     */
    public static void as() {
        block14: {
            aP2.b();
            int n = tf_0.bb();
            DisplayMode displayMode = DisplayInvoker.e();
            tf_0.h(aL0.c(aL0.a(new StringBuilder(), fy_0.E), n).toString());
            try {
                DisplayInvoker.h();
                DisplayInvoker.a(displayMode);
                DisplayInvoker.a(a3F.b(a3F.a(new PixelFormat(), 24), n));
                DisplayInvoker.a(false);
                DisplayInvoker.a(true);
            }
            catch (LWJGLException lWJGLException) {
                tf_0.e(aL0.a(aL0.c(aL0.a(new StringBuilder(), fy_0.V), n), fy_0.ad).toString());
                aQI.a(lWJGLException);
                try {
                    DisplayInvoker.a(displayMode);
                    DisplayInvoker.a(a3F.a(new PixelFormat(), 24));
                    DisplayInvoker.a(false);
                    DisplayInvoker.a(true);
                }
                catch (LWJGLException lWJGLException2) {
                    aQI.a(lWJGLException2);
                    try {
                        DisplayInvoker.a(displayMode);
                        DisplayInvoker.k();
                        DisplayInvoker.a(false);
                        DisplayInvoker.a(true);
                    }
                    catch (LWJGLException lWJGLException3) {
                        aQI.a(lWJGLException3);
                    }
                }
            }
            if (!Minecraft.R && tf_0.z() != null) {
                InputStream inputStream;
                InputStream inputStream2;
                block13: {
                    inputStream2 = null;
                    inputStream = null;
                    inputStream2 = RPacketManagerInvoker.c(tf_0.z(), new ResourceLocation(fy_0.F));
                    inputStream = RPacketManagerInvoker.c(tf_0.z(), new ResourceLocation(fy_0.O));
                    if (inputStream2 == null || inputStream == null) break block13;
                    ByteBuffer[] byteBufferArray = new ByteBuffer[2];
                    byteBufferArray[0] = tf_0.b(inputStream2);
                    byteBufferArray[1] = tf_0.b(inputStream);
                    DisplayInvoker.a(byteBufferArray);
                }
                IOUtilsInvoker.closeQuietly(inputStream2);
                IOUtilsInvoker.closeQuietly(inputStream);
                break block14;
                {
                    catch (IOException iOException) {
                        try {
                            tf_0.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), fy_0.aS), ara_2.b(iOException.getClass())), fy_0.A), a4E.a(iOException)).toString());
                        }
                        catch (Throwable throwable) {
                            IOUtilsInvoker.closeQuietly(inputStream2);
                            IOUtilsInvoker.closeQuietly(inputStream);
                            throw throwable;
                        }
                        IOUtilsInvoker.closeQuietly(inputStream2);
                        IOUtilsInvoker.closeQuietly(inputStream);
                    }
                }
            }
        }
    }

    public static boolean aT() {
        aP2.b();
        return tf_0.v.bP == 1;
    }

    public static DisplayMode S() {
        return s;
    }

    private static Set<Dimension> a(DisplayMode[] displayModeArray) {
        aP2.b();
        HashSet<Dimension> hashSet = new HashSet<Dimension>();
        DisplayMode[] displayModeArray2 = displayModeArray;
        int n = displayModeArray2.length;
        int n2 = 0;
        if (n2 < n) {
            DisplayMode displayMode = displayModeArray2[n2];
            Dimension dimension = new Dimension(aSN.c(displayMode), aSN.b(displayMode));
            aS0.b(hashSet, dimension);
            ++n2;
        }
        return hashSet;
    }

    public static void bl() {
        block6: {
            aP2.b();
            if (!MCInvoker.u(b)) break block6;
            if (h) {
                return;
            }
            h = true;
            u = false;
            DisplayMode displayMode = DisplayInvoker.e();
            tf_0.a();
            return;
        }
        if (u) {
            return;
        }
        u = true;
        h = false;
        try {
            awu_1.b(tf_0.b.gameSettings);
            DisplayInvoker.m();
            GlStateManagerInvoker.enableTexture2D();
            DisplayInvoker.a(false);
            DisplayInvoker.a(true);
        }
        catch (Exception exception) {
            ch_2.a(exception);
            tf_0.v.U = fy_0.b;
            awu_1.d(v);
        }
    }

    public static boolean b(aI_ aI_2, ResourceLocation resourceLocation) {
        try {
            aI_2.b(resourceLocation);
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static GameSettings aU() {
        return v;
    }

    public static boolean x() {
        aP2.b();
        return tf_0.g() && tf_0.v.y == 2;
    }

    public static boolean I() {
        aP2.b();
        return tf_0.Z() && (!tf_0.a0() || a3c_0.w());
    }

    public static boolean J() {
        return tf_0.bb() > 0;
    }

    public static boolean aV() {
        aP2.b();
        return tf_0.v.aL == 0 ? tf_0.v.a4 : tf_0.v.aL != 1;
    }

    public static int p() {
        aP2.b();
        if (t < 0) {
            String[] stringArray = tf_0.b(fy_0.aJ, fy_0.J);
            int n = 0;
            if (stringArray.length > 0) {
                n += 10000 * tf_0.a(stringArray[0], 0);
            }
            if (stringArray.length > 1) {
                n += 100 * tf_0.a(stringArray[1], 0);
            }
            if (stringArray.length > 2) {
                n += tf_0.a(stringArray[2], 0);
            }
            t = n;
        }
        return t;
    }

    public static boolean ar() {
        return tf_0.v.aB;
    }

    public static void a(GameSettings gameSettings) {
        aP2.b();
        if (v == null) {
            v = gameSettings;
            s = Display.getDesktopDisplayMode();
            tf_0.at();
            K3.a(fy_0.aj, Boolean.TRUE);
        }
    }

    public static boolean be() {
        aP2.b();
        return tf_0.v.aL == 4;
    }

    public static abh_2 d(ResourceLocation resourceLocation) throws IOException {
        return b.p().b(resourceLocation);
    }

    public static boolean a6() {
        return tf_0.w() > 1 || tf_0.bb() > 0;
    }

    public static boolean aK() {
        return tf_0.v.bk;
    }

    public static boolean a7() {
        return tf_0.v.aC;
    }
}

