/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.EntityPlayer;
import deobf.MCInvoker;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.qT
 */
public class qt_1
extends q1_0 {
    private Minecraft i;
    private ResourceLocation m;
    private static Map q;
    private static long n;
    private a5Y l;
    private boolean h;
    private static String[] o;
    private a5Y k;
    private static String[] p;
    private static String j;

    private float a(float f, float f2, float f3) {
        qt_1.b();
        float f4 = (f + (f2 - f) * f3) % 360.0f;
        if (f4 < 0.0f) {
            f4 += 360.0f;
        }
        return f4;
    }

    public qt_1(short s, int n, short s3) {
        long l4 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ qt_1.n;
        this.i = MCInvoker.f();
        this.m = new ResourceLocation((String)((Object)qt_1.a("r", (int)17394, (long)(0x542225C268383BB6L ^ l4))));
        this.a((String)((Object)qt_1.a("r", (int)24960, (long)(0x7A684A762F899CAL ^ l4))), 0, 0);
        this.a((String)((Object)qt_1.a("r", (int)10633, (long)(0x71A82B23AB1451C1L ^ l4))), -10, 8);
        this.a((String)((Object)qt_1.a("r", (int)20205, (long)(0x58919F499D7EB6ABL ^ l4))), 0, 5);
        qt_1.b();
        this.a((String)((Object)qt_1.a("r", (int)29349, (long)(0x48C89F5FCF778AE9L ^ l4))), -10, 18);
        this.k = new a5Y(this, (String)((Object)qt_1.a("r", (int)1315, (long)(0x65F2F42426AF7D6AL ^ l4))));
        up_0.a(this.k, 30, 30);
        up_0.a(this.k, -2.0f, 0.0f, 0.0f);
        up_0.a(this.k, (String)((Object)qt_1.a("r", (int)30461, (long)(0x7AB26F576A718EB8L ^ l4))), -10.0f, -1.0f, -1.0f, 10, 2, 2);
        up_0.a(this.k, (String)((Object)qt_1.a("r", (int)26768, (long)(0x57073E1C29DC10DEL ^ l4))), -10.0f, 0.0f, 0.5f, 10, 0, 10);
        this.l = new a5Y(this, (String)((Object)qt_1.a("r", (int)25516, (long)(0x4F5F4FB8B81E9BE1L ^ l4))));
        up_0.a(this.l, 30, 30);
        up_0.a(this.l, -10.0f, 0.0f, 0.0f);
        up_0.a(this.l, (String)((Object)qt_1.a("r", (int)10384, (long)(0x3B68E1104D42D0DFL ^ l4))), -10.0f, -0.5f, -0.5f, 10, 1, 1);
        up_0.a(this.l, (String)((Object)qt_1.a("r", (int)233, (long)(0x6FC25A89776DF8A2L ^ l4))), -10.0f, 0.0f, 0.5f, 10, 0, 10);
        up_0.a(this.k, this.l);
        ListInvoker.b(new ListInvoker[4]);
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    public static String b() {
        return j;
    }

    static {
        n = a1c.a(6027414857245419647L, 8930420334767215256L, MethodHandles.lookup().lookupClass()).a(89400956780342L);
        q = new HashMap(13);
        long l4 = n ^ 0x743A13C5EFB8L;
        qt_1.b(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        int n = 2;
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l4 >>> 56);
        int n2 = 1;
        while (true) {
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l4 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    public void a(EntityPlayer entityPlayer, float f, int n, Color color) {
        double d = (double)n / 100.0;
        double d2 = this.a(entityPlayer.ay, entityPlayer.aD, f);
        qt_1.b();
        GL11.glPushMatrix();
        GL11.glScaled((double)(-d), (double)(-d), (double)d);
        GL11.glRotated((double)(180.0 + d2), (double)0.0, (double)1.0, (double)0.0);
        GL11.glTranslated((double)0.0, (double)(-(this.h ? 1.45 : 1.25) / d), (double)0.0);
        GL11.glTranslated((double)0.0, (double)0.0, (double)(0.2 / d));
        if (a6w_0.N(entityPlayer)) {
            GL11.glTranslated((double)0.0, (double)(0.125 / d), (double)0.0);
        }
        a1V.a(color);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.i), this.m);
        int n2 = 0;
        GL11.glEnable((int)2884);
        float f2 = (float)(SystemInvoker.f() % 1000L) / 1000.0f * (float)Math.PI * 2.0f;
        this.k.t = (float)MathInvoker.o(-80.0) - (float)MathInvoker.m(f2) * 0.2f;
        this.k.m = (float)MathInvoker.o(20.0) + (float)MathInvoker.i(f2) * 0.4f;
        this.k.n = (float)MathInvoker.o(20.0);
        this.l.n = -((float)(MathInvoker.i(f2 + 2.0f) + 0.5)) * 0.75f;
        up_0.b(this.k, 0.0625f);
        GL11.glScalef((float)-1.0f, (float)1.0f, (float)1.0f);
        GL11.glCullFace((int)1028);
        ++n2;
        GL11.glCullFace((int)1029);
        GL11.glDisable((int)2884);
        GL11.glColor3f((float)255.0f, (float)255.0f, (float)255.0f);
        GL11.glPopMatrix();
        if (ListInvoker.b() != null) {
            qt_1.b("UzNwG");
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/qT" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x349D;
        if (p[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])q.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                q.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/qT", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return p[n2];
    }

    public static void b(String string) {
        j = string;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = qt_1.a(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qt_1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

