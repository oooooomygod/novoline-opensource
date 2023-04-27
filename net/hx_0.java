/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.events.events.Render2DEvent;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.Entity;
import deobf.Framebuffer;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.Hx
 */
public class hx_0 {
    public int b;
    Framebuffer k;
    private static String[] m;
    private Minecraft e;
    public int c;
    public int f;
    private static long l;
    private int i;
    private HashMap<String, Integer> a;
    private static String[] n;
    Framebuffer d;
    private static Map o;
    private int h;
    private int g;
    private long j;

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = hx_0.a(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private void a(Framebuffer framebuffer, ScaledResolution scaledResolution) {
        GL11.glBindTexture((int)3553, (int)framebuffer.e);
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)ScaledResolutionInvoker.i(scaledResolution));
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)ScaledResolutionInvoker.getScaledWidth(scaledResolution), (double)ScaledResolutionInvoker.i(scaledResolution));
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)ScaledResolutionInvoker.getScaledWidth(scaledResolution), (double)0.0);
        GL11.glEnd();
    }

    public void a() {
        this.k = this.a(this.k);
        this.d = this.a(this.d);
    }

    private int a(String string, int n) {
        int n2 = adk_2.d(n);
        adk_2.a(n2, string);
        adk_2.c(n2);
        return n2;
    }

    private void a(Chams chams) {
        aY_.d(P8.b((Integer)ds_2.a(this.a, a3y_0.a)), 0);
        aY_.d(P8.b((Integer)ds_2.a(this.a, a3y_0.c)), 8);
        aY_.a(P8.b((Integer)ds_2.a(this.a, a3y_0.e)), 1.0f / (float)this.e.displayWidth, 1.0f / (float)this.e.displayHeight);
        int[] nArray = new int[]{aUL.a(X.l(chams)), aUL.d(X.l(chams)), aUL.b(X.l(chams))};
        float[] fArray = aol_1.a(nArray[0], nArray[1], nArray[2], null);
        int n = aol_1.a(fArray[0], fArray[1], 0.015f);
        Color color = new Color(n);
        aY_.a(P8.b((Integer)ds_2.a(this.a, a3y_0.d)), (float)aol_1.c(color), (float)aol_1.g(color), (float)aol_1.f(color));
        int n2 = aY_.a(this.g, a3y_0.b);
        aY_.a(n2, (float)(SystemInvoker.f() - this.j) / 1000.0f);
        int n3 = aY_.a(this.g, a3y_0.f);
        aY_.a(n3, (float)(this.e.displayWidth * 2), (float)(this.e.displayHeight * 2));
    }

    public void a(Chams chams, Render2DEvent render2DEvent) {
        HUD.t();
        GL11.glDisable((int)3042);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.G();
        GlStateManagerInvoker.enableDepth();
        GL11.glEnable((int)2929);
        if (this.b != this.e.gameSettings.z || this.f != this.e.displayWidth || this.c != this.e.displayHeight) {
            this.a();
        }
        FramebufferInvoker.a(this.d);
        FramebufferInvoker.a(this.k);
        FramebufferInvoker.bindFramebuffer(this.k, true);
        EntityRendererInvoker.a(this.e.entityRenderer, this.e.timer.renderPartialTicks, 0);
        Iterator iterator = ListInvoker.iterator((List)aMF.a(aMF.b(ListInvoker.stream(BlockInvoker.e(this.e.world)), chams::b), aB0.a()));
        if (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            FT.b(MCInvoker.j(this.e), entity, this.e.timer.renderPartialTicks);
        }
        EntityRendererInvoker.b(this.e.entityRenderer);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        OpenGlHelper.c(770, 771, 1, 0);
        FramebufferInvoker.bindFramebuffer(this.d, true);
        OpenGlHelper.h(this.g);
        this.a(chams);
        this.a(this.k, uc_0.a(render2DEvent));
        OpenGlHelper.a(apl_1.ab + 7);
        this.a(this.k, uc_0.a(render2DEvent));
        OpenGlHelper.a(apl_1.S);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.e), true);
        this.a(this.d, uc_0.a(render2DEvent));
        OpenGlHelper.h(0);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.v();
        GL11.glEnable((int)3008);
        this.b = this.e.gameSettings.z;
        this.f = this.e.displayWidth;
        this.c = this.e.displayHeight;
    }

    public hx_0(char c, short s, int n) {
        long l4 = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n << 32 >>> 32) ^ l;
        this.e = MCInvoker.f();
        this.g = adk_2.a();
        this.a = new HashMap();
        this.j = SystemInvoker.f();
        this.h = this.a((String)((Object)hx_0.a("v", (int)24036, (long)(0x47E826979786ECD0L ^ l4))), 35633);
        this.i = this.a((String)((Object)hx_0.a("v", (int)17082, (long)(0x7324752009A738FL ^ l4))), 35632);
        OpenGlHelper.c(this.g, this.h);
        OpenGlHelper.c(this.g, this.i);
        OpenGlHelper.d(this.g);
        ds_2.a(this.a, hx_0.a("v", (int)29793, (long)(0x38AA1E028704C55EL ^ l4)), P8.d(aY_.a(this.g, (CharSequence)((Object)hx_0.a("v", (int)4036, (long)(0x291969E0D714BEF3L ^ l4))))));
        ds_2.a(this.a, hx_0.a("v", (int)8005, (long)(0x675E078BB4FE2E76L ^ l4)), P8.d(aY_.a(this.g, (CharSequence)((Object)hx_0.a("v", (int)10773, (long)(0x5F7E2C64A1E01B27L ^ l4))))));
        ds_2.a(this.a, hx_0.a("v", (int)31883, (long)(0x1B0605CB9E29CDBAL ^ l4)), P8.d(aY_.a(this.g, (CharSequence)((Object)hx_0.a("v", (int)5398, (long)(0x287206931EC3A428L ^ l4))))));
        ds_2.a(this.a, hx_0.a("v", (int)5127, (long)(0x456BE6381929A531L ^ l4)), P8.d(aY_.a(this.g, (CharSequence)((Object)hx_0.a("v", (int)8244, (long)(0x1528A6B9EB7C9104L ^ l4))))));
    }

    static {
        l = a1c.a(2407578985603786012L, 3416479299057409418L, MethodHandles.lookup().lookupClass()).a(70704403832755L);
        o = new HashMap(13);
        long l4 = l ^ 0x7FC469D9720FL;
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/Hx" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x6C3B;
        if (hx_0.n[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])o.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                o.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/Hx", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return hx_0.n[n2];
    }

    private Framebuffer a(Framebuffer framebuffer) {
        HUD.j();
        if (framebuffer != null) {
            FramebufferInvoker.f(framebuffer);
        }
        framebuffer = new Framebuffer(this.e.displayWidth, this.e.displayHeight, false);
        return framebuffer;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hx_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

