/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.JumpEvent;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;

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
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import cc.novoline.modules.EnumModuleType;
import deobf.MCInvoker;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.minecraft.client.Minecraft;
import net.FloatProperty;
import net.MathHelper;
import net.ModuleManager;
import net.P8;
import net.StringProperty;
import net.a1V;
import net.a1c;
import net.a9V;
import net.aNE;
import net.aQR;
import net.aUL;
import net.aol_1;
import net.asp_2;
import net.auk_2;
import net.axx_1;
import net.dz_0;
import net.eu_0;
import net.hb_2;
import net.lt_1;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class JumpCircle
extends AbstractModule {
    private List<lt_1> I;
    private boolean J;
    @Property(value="radius")
    private FloatProperty H;
    @Property(value="color")
    private eu_0 K;
    private static String[] N;
    private static String[] O;
    @Property(value="color-mode")
    private StringProperty L;
    private static Map P;
    private static long M;

    static Minecraft c(JumpCircle jumpCircle) {
        return jumpCircle.mc;
    }

    public JumpCircle(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, char c, String string2, long l4) {
        long l5 = ((long)c << 48 | l4 << 16 >>> 16) ^ M;
        long l6 = l5 ^ 0x3E8C7C38D64BL;
        int n = (int)(l6 >>> 48);
        int n2 = (int)(l6 << 16 >>> 48);
        int n3 = (int)(l6 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
        this.I = new CopyOnWriteArrayList<lt_1>();
        this.L = StringPropertyInvoker.b(asp_2.a((String)((Object)JumpCircle.b("i", (int)13366, (long)(0x42B2606ACE3248A7L ^ l5)))), new String[]{JumpCircle.b("i", (int)11839, (long)(0x7A4CCF0BE85552A7L ^ l5)), JumpCircle.b("i", (int)16632, (long)(0x741D3E0A2119BC61L ^ l5))});
        this.K = asp_2.b(P8.d(aol_1.b(new Color(200, 200, 200))));
        this.H = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(1.0f)), axx_1.a(0.5f)), axx_1.a(2.0f));
        ManagerInvoker.put(new Setting((String)((Object)JumpCircle.b("i", (int)8485, (long)(0x4093399D0A13DDB9L ^ l5))), (String)((Object)JumpCircle.b("i", (int)29359, (long)(0x28A30231B8508E30L ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.L));
        ManagerInvoker.put(new Setting((String)((Object)JumpCircle.b("i", (int)5815, (long)(0x5E282143BC666A29L ^ l5))), (String)((Object)JumpCircle.b("i", (int)25651, (long)(0x386685A1145518AEL ^ l5))), SettingType.COLOR_PICKER, (AbstractModule)this, this.K, null, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)JumpCircle.b("i", (int)6707, (long)(0x75BAF049651EE6A9L ^ l5))), (String)((Object)JumpCircle.b("i", (int)16172, (long)(0x1B6937BD5991C3B7L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.H, 0.1));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCr" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    static Minecraft a(JumpCircle jumpCircle) {
        return jumpCircle.mc;
    }

    static Minecraft b(JumpCircle jumpCircle) {
        return jumpCircle.mc;
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        HUD.j();
        GL11.glDisable((int)3553);
        GlStateManagerInvoker.disableDepth();
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2896);
        GL11.glDepthMask((boolean)false);
        GL11.glHint((int)3154, (int)4354);
        GL11.glLineWidth((float)5.0f);
        GL11.glShadeModel((int)7425);
        Iterator iterator = ListInvoker.iterator(this.I);
        if (dz_0.c(iterator)) {
            lt_1 lt_12 = (lt_1)dz_0.b(iterator);
            double d = lt_12.b();
            double d2 = lt_12.a();
            double d3 = aNE.e(lt_1.a(lt_12)) - MCInvoker.j((Minecraft)this.mc).s;
            double d4 = aNE.a(lt_1.a(lt_12)) - MCInvoker.j((Minecraft)this.mc).h;
            double d5 = aNE.d(lt_1.a(lt_12)) - MCInvoker.j((Minecraft)this.mc).m;
            GL11.glBegin((int)5);
            int n = 0;
            double d6 = d * MathInvoker.m((double)n * Math.PI / 180.0);
            double d7 = d * MathInvoker.i((double)n * Math.PI / 180.0);
            double d8 = (d - MathInvoker.a(0.2, d)) * MathInvoker.m((double)n * Math.PI / 180.0);
            double d9 = (d - MathInvoker.a(0.2, d)) * MathInvoker.i((double)n * Math.PI / 180.0);
            a1V.a(new Color(aol_1.c(this.c()), aol_1.g(this.c()), aol_1.f(this.c()), (int)d2));
            GL11.glVertex3d((double)(d3 + d6), (double)d4, (double)(d5 + d7));
            a1V.a(new Color(aol_1.c(this.c()), aol_1.g(this.c()), aol_1.f(this.c()), 0));
            GL11.glVertex3d((double)(d3 + d8), (double)d4, (double)(d5 + d9));
            ++n;
            GL11.glEnd();
            GL11.glBegin((int)5);
            n = 0;
            d6 = d * 1.2 * MathInvoker.m((double)n * Math.PI / 180.0);
            d7 = d * 1.2 * MathInvoker.i((double)n * Math.PI / 180.0);
            d8 = d * MathInvoker.m((double)n * Math.PI / 180.0);
            d9 = d * MathInvoker.i((double)n * Math.PI / 180.0);
            a1V.a(new Color(aol_1.c(this.c()), aol_1.g(this.c()), aol_1.f(this.c()), 0));
            GL11.glVertex3d((double)(d3 + d6), (double)d4, (double)(d5 + d7));
            a1V.a(new Color(aol_1.c(this.c()), aol_1.g(this.c()), aol_1.f(this.c()), (int)d2 / 2));
            GL11.glVertex3d((double)(d3 + d8), (double)d4, (double)(d5 + d9));
            ++n;
            GL11.glEnd();
            if ((double)lt_12.b() >= (double)axx_1.a((Float)a9V.a(this.H)) - 0.05) {
                lt_12.a(MathHelper.b(lt_12.a() - 1.0f, 0.0f, 255.0f));
            }
            lt_12.b(MathHelper.b((float)((double)lt_12.b() + 0.005), 0.0f, axx_1.a((Float)a9V.a(this.H))));
            if (lt_1.b(lt_12) <= 0.0f) {
                ListInvoker.remove(this.I, lt_12);
            }
        }
        GL11.glDepthMask((boolean)true);
        GlStateManagerInvoker.enableDepth();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x7A83;
        if (O[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])P.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                P.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCr", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return O[n2];
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.L, aQR.b));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = JumpCircle.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public void b() {
        HUD.j();
        if (this.x()) {
            ListInvoker.add(this.I, new lt_1(this));
        }
    }

    @EventTarget
    public void a(JumpEvent jumpEvent) {
        this.b();
    }

    static {
        M = a1c.a(4536798311623797798L, 8487371698507928438L, MethodHandles.lookup().lookupClass()).a(263248157565178L);
        P = new HashMap(13);
        long l4 = M ^ 0x5449963A6E8AL;
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

    private static String b(byte[] byArray) {
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

    private Color c() {
        HUD.t();
        return StringPropertyInvoker.isMode(this.L, aQR.a) ? aUL.c(this.K) : new Color(hb_2.a(0L));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(JumpCircle.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

