/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.EntityLivingBase;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class DMGParticles
extends AbstractModule {
    private static String[] L;
    private static String[] M;
    private static Map N;
    private static long K;
    private List<aqr_2> I;
    private HashMap<EntityLivingBase, Float> J;
    @Property(value="font")
    private StringProperty H;

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        ListInvoker.forEach(this.I, this::lambda$onUpdate$0);
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x3784;
        if (M[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])N.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                N.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCy", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return M[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = DMGParticles.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public static double a(double d, int n) {
        throw new IllegalArgumentException();
    }

    @EventTarget
    public void a(X5 x5) {
        float f;
        float f2;
        HUD.j();
        EntityLivingBase entityLivingBase = (EntityLivingBase)pk_0.a(x5);
        if (entityLivingBase == this.mc.player) {
            return;
        }
        if (!ds_2.b(this.J, entityLivingBase)) {
            ds_2.a(this.J, entityLivingBase, axx_1.a(atn_0.c(entityLivingBase)));
        }
        if ((f2 = axx_1.a((Float)ds_2.a(this.J, entityLivingBase))) != (f = atn_0.c(entityLivingBase))) {
            boolean bl = f > f2;
            boolean bl2 = entityLivingBase.hurtResistantTime < 18 || this.mc.player.motionY < 0.0 && !this.mc.player.onGround;
            String string = aIQ.b;
            String string2 = f2 - f < 0.0f ? aL0.a(aL0.a(new StringBuilder(), string), DMGParticles.a((f2 - f) * -1.0f, 1)).toString() : aL0.a(aL0.a(new StringBuilder(), string), DMGParticles.a(f2 - f, 1)).toString();
            un_0 un_02 = new un_0(entityLivingBase);
            aa7_0.b(un_02, atn_0.i((EntityLivingBase)entityLivingBase).a + (atn_0.i((EntityLivingBase)entityLivingBase).c - atn_0.i((EntityLivingBase)entityLivingBase).a) / 2.0);
            aa7_0.c(un_02, aa7_0.c(un_02) - 0.5 + (double)a5_0.a(new Random(SystemInvoker.f()), 5) * 0.1);
            aa7_0.a(un_02, aa7_0.a(un_02) - 0.5 + (double)a5_0.a(new Random(SystemInvoker.f() + 1L), 5) * 0.1);
            ListInvoker.add(this.I, new aqr_2(un_02, string2));
            ds_2.c(this.J, entityLivingBase);
            ds_2.a(this.J, entityLivingBase, axx_1.a(atn_0.c(entityLivingBase)));
        }
    }

    private void lambda$onUpdate$0(aqr_2 aqr_22) {
        HUD.j();
        ++aqr_22.b;
        if (aqr_22.b <= 10) {
            aa7_0.b(aqr_22.a, aa7_0.b(aqr_22.a) + (double)aqr_22.b * 0.005);
        }
        if (aqr_22.b > 20) {
            ListInvoker.remove(this.I, aqr_22);
        }
    }

    public DMGParticles(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, int n, String string, long l4, String string2) {
        long l5 = ((long)n << 32 | l4 << 32 >>> 32) ^ K;
        long l6 = l5 ^ 0x2A49E48D155AL;
        int n2 = (int)(l6 >>> 48);
        int n3 = (int)(l6 << 16 >>> 48);
        int n4 = (int)(l6 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.J = new HashMap();
        this.I = new ArrayList<aqr_2>();
        this.H = StringPropertyInvoker.b(asp_2.a((String)((Object)DMGParticles.b("v", (int)25523, (long)(0x28259C4B1AB913FL ^ l5)))), new String[]{DMGParticles.b("v", (int)6692, (long)(0x4331B95C4E4568AFL ^ l5)), DMGParticles.b("v", (int)29687, (long)(0x6F1B74846BE9817AL ^ l5))});
        ManagerInvoker.put(new Setting((String)((Object)DMGParticles.b("v", (int)30435, (long)(0x3E75D6755F5B846DL ^ l5))), (String)((Object)DMGParticles.b("v", (int)13910, (long)(0x79801947757FC4D9L ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.H));
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

    static {
        K = a1c.a(1270068734785824715L, -2041560759135099473L, MethodHandles.lookup().lookupClass()).a(138688166820765L);
        N = new HashMap(13);
        long l4 = K ^ 0x7E192E5A31ECL;
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCy" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        HUD.j();
        Iterator iterator = ListInvoker.iterator(this.I);
        if (dz_0.c(iterator)) {
            aqr_2 aqr_22 = (aqr_2)dz_0.b(iterator);
            double d = aa7_0.c(aqr_22.a);
            double d2 = d - MCInvoker.j((Minecraft)this.mc).s;
            double d3 = aa7_0.b(aqr_22.a);
            double d4 = d3 - MCInvoker.j((Minecraft)this.mc).h;
            double d5 = aa7_0.a(aqr_22.a);
            double d6 = d5 - MCInvoker.j((Minecraft)this.mc).m;
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.u();
            GlStateManagerInvoker.a(1.0f, -1500000.0f);
            GlStateManagerInvoker.translate((float)d2, (float)d4, (float)d6);
            GlStateManagerInvoker.b(-MCInvoker.j((Minecraft)this.mc).l, 0.0f, 1.0f, 0.0f);
            float f = awu_1.f(this.mc.gameSettings) == 2 ? -1.0f : 1.0f;
            GlStateManagerInvoker.b(MCInvoker.j((Minecraft)this.mc).b, f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(-0.03, -0.03, 0.03);
            a1V.f();
            a1V.c();
            GL11.glDepthMask((boolean)false);
            if (StringPropertyInvoker.isMode(this.H, aIQ.c)) {
                FontRendererInvoker.a(this.mc.fontRendererObj, aqr_22.c, (float)(-(FontRendererInvoker.a(this.mc.fontRendererObj, aqr_22.c) / 2)), (float)(-(FontRendererInvoker.d(this.mc.fontRendererObj) - 1)), 0, true);
            }
            a7l_0.b(aYW.a, aqr_22.c, -(FontRendererInvoker.a(this.mc.fontRendererObj, aqr_22.c) / 2), -(FontRendererInvoker.d(this.mc.fontRendererObj) - 1), 0, true);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDepthMask((boolean)true);
            GlStateManagerInvoker.a(1.0f, 1500000.0f);
            GlStateManagerInvoker.r();
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.popMatrix();
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DMGParticles.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

